package com.mystudy.jdbc_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.util.JDBC_Close;

// DAO, Dao : Data Access Object / Database Access Object
// 데이터베이스(DB)와 연동해서 CRUD를 구현하는 클래스
	
public class MemberDAO {
	private final String DRIVER = "oracle.jdbc.OracleDriver"; 
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe"; 
	private final String USER = "mystudy";
	private final String PASSWORD = "mystudypw"; 

	private Connection conn;	// null로 자동 셋팅 돼서 설정 안해줘도 됨
	private PreparedStatement prestmt;
	private ResultSet rs;
	
	public MemberDAO() {
		try {
			Class.forName(DRIVER);
			System.out.println(">> 드라이버 로딩 성공ㅎㅎ");
		} catch (ClassNotFoundException e) {
			System.out.println(">>[예외] 드라이버 로딩 실패ㅠㅠ");
			e.printStackTrace();
		}
	}
	
	// CRUD 메서드 작성
	// SELECT : 테이블 전체 데이터 조회 - selectAll (메서드이름) : List<MemberVO> (리턴)
	// SELECT : 1개 데이터 조회(ID) - selectOne (메서드이름) : MemberVO (리턴)
	// SELECT : 1개 데이터 조회(VO) - selectOne (메서드이름) : MemberVO (리턴)
	// INSERT : VO 객체를 받아서 입력 - insertOne : int
	// UPDATE : VO 객체를 받아서 수정 - updateOne : int
	// DELETE : VO 객체를 받아서 삭제 - deleteOne : int
	// INSERT : 키 값(id) 받아서 삭제 - deletetOne : int
	
	// SELECT : 테이블 전체 데이터 조회 - selectAll (메서드이름) : List<MemberVO> (리턴)
	public List<MemberVO> selectAll() {
		List<MemberVO> list = null;
		
		// DB 연결 - Connection 객체 생성(DB와 연결된)
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println(">> 객체 생성 성공ㅎㅎ");
			
			// SQL문 실행
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT ID, PASSWORD, NAME, PHONE, ADDRESS ");
			sb.append("	FROM MEMBER ");
			sb.append("ORDER BY ID ");
			
			prestmt = conn.prepareStatement(sb.toString());
			
			rs = prestmt.executeQuery();
			
			// SQL문 실행 결과에 대한 처리
			list = new ArrayList<MemberVO>();
			while (rs.next()) {
//				MemberVO mvo = new MemberVO(
//						rs.getString("ID"),	// 위에 생성자랑 순서 맞춰야함
//						rs.getString("NAME"),
//						rs.getString("PASSWORD"),
//						rs.getString("PHONE"),
//						rs.getString("ADDRESS") );
//				
//				list.add(mvo);	// list에 담기
				
				list.add(new MemberVO(
						rs.getString("ID"),	
						rs.getString("NAME"),
						rs.getString("PASSWORD"),
						rs.getString("PHONE"),
						rs.getString("ADDRESS") ) );
			}
			
		} catch (SQLException e) {
			System.out.println(">> 객체 생성 실패ㅠㅠㅎㅎ");
			e.printStackTrace();
		} finally {
			//5. 클로징 처리에 의한 자원 반납
			JDBC_Close.closeConnPrestmtRs(conn, prestmt, rs);
	
		}	

		return list;
		
	}
	// SELECT : 1개 데이터 조회(ID) - selectOne (메서드이름) : MemberVO (리턴)
	public MemberVO selectOne(String id) {
		MemberVO mvo = null;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println(">> 객체 생성 성공ㅎㅎ");
			
			// SQL문 실행
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT ID, PASSWORD, NAME, PHONE, ADDRESS ");
			sb.append("	FROM MEMBER ");
			sb.append("WHERE ID = ? ");
			
			prestmt = conn.prepareStatement(sb.toString());
			
			// ? 위치에 값 설정
			prestmt.setString(1, id);	// 메서드 파라미터 값 : id
			
			rs = prestmt.executeQuery();
			
			// SQL문 실행 결과에 대한 처리
			// 데이터가 많을 때 while / 
			// if는 있으면 첫 번째거 1개만 출력(pk때 사용 가능하겠다!)
			
			if (rs.next()) {
				// MemberVO 에 데이터 저장
				mvo = new MemberVO(rs.getString("ID"), 
						rs.getString("NAME"), 
						rs.getString("PASSWORD"), 
						rs.getString("PHONE"), 
						rs.getString("ADDRESS") );
			}
			
		} catch (SQLException e) {
			System.out.println(">> 객체 생성 실패ㅠㅠㅎㅎ");
			e.printStackTrace();
		} finally {
			//5. 클로징 처리에 의한 자원 반납
			JDBC_Close.closeConnPrestmtRs(conn, prestmt, rs);
		}	
		return mvo;
	}



	



// SELECT : 1개 데이터 조회(VO) - selectOne (메서드이름) : MemberVO (리턴)
	public MemberVO selectOne(MemberVO member) {
		return selectOne(member.getId());
	}
		
// INSERT : VO 객체를 받아서 입력 - insertOne : int
	
	public int insertOne(MemberVO member) {
		int result = 0; 
		
		try {
			//DB 연결 - Connection 객체 생성(DB와 연결된)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println(">> 객체 생성 성공ㅎㅎ");
			
			//SQL문 실행
			StringBuilder sb = new StringBuilder();
			sb.append("INSERT INTO MEMBER ");
			sb.append("       (ID, PASSWORD, NAME, PHONE, ADDRESS) ");
			sb.append("VALUES (?, ?, ?, ?, ?) ");
			prestmt = conn.prepareStatement(sb.toString());
			
			//? 바인드변수에 값 설정
			prestmt.setString(1, member.getId());
			prestmt.setString(2, member.getPassword());
			prestmt.setString(3, member.getName());
			prestmt.setString(4, member.getPhone());
			prestmt.setString(5, member.getAddress());
			
			//SQL문 실행(INSERT, UPDATE, DELETE - executeUpdate())
			result = prestmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnPrestmt(conn, prestmt);
		}
		
		return result;
	}
	
	//UPDATE : VO 객체를 받아서 수정 - updateOne : int
	public int updateOne(MemberVO member) {
		int result = 0;
		
		try {
			//DB 연결 - Connection 객체 생성(DB와 연결된)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			//SQL문 실행
			StringBuilder sb = new StringBuilder();
			sb.append("UPDATE MEMBER ");
			sb.append("   SET PASSWORD = ?, "); //1
			sb.append("       NAME = ?, ");     //2
			sb.append("       PHONE = ?, ");    //3
			sb.append("       ADDRESS = ? ");   //4
			sb.append(" WHERE ID = ? ");        //5
			prestmt = conn.prepareStatement(sb.toString());
			
			//? 바인드변수에 값 설정
			int i = 1;
			prestmt.setString(i++, member.getPassword());
			prestmt.setString(i++, member.getName());
			prestmt.setString(i++, member.getPhone());
			prestmt.setString(i++, member.getAddress());
			prestmt.setString(i++, member.getId());
			
			//SQL문 실행(INSERT, UPDATE, DELETE - executeUpdate())
			result = prestmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnPrestmt(conn, prestmt);
		}
		
		return result;
	}	
	
	//(실습)DELETE : VO 객체를 받아서 삭제 - deleteOne : int
	public int delete(MemberVO member) {
		int result = 0;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			StringBuilder sb = new StringBuilder();
			sb.append("DELETE FROM MEMBER WHERE ID = ? ");
			prestmt = conn.prepareStatement(sb.toString());
			prestmt.setString(1, member.getId());
			result = prestmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnPrestmt(conn, prestmt);
		}
		return result;
		
	}
	
	
	//(실습)DELETE : 키값(id) 받아서 삭제 - deleteOne : int	
	public int deleteOne(String id) {
		int result = 0;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			StringBuilder sb = new StringBuilder();
			sb.append("DELETE FROM MEMBER WHERE ID = ?");
			
			prestmt = conn.prepareStatement(sb.toString());
			prestmt.setString(1, id);
			result = prestmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnPrestmt(conn, prestmt);
		}
		return result;
		
	}
}


	


