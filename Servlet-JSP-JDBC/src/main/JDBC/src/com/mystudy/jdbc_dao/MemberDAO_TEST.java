package com.mystudy.jdbc_dao;

import java.util.List;

public class MemberDAO_TEST {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		List<MemberVO> list = dao.selectAll();
		for (MemberVO mvo : list) {
			System.out.println(mvo);
		}
		System.out.println("---- selectOne(id) ----");
		String id = "HONG5";
		MemberVO mvo = dao.selectOne(id);
		System.out.println(mvo);
		
		System.out.println("---- selectOne(VO) ----");
		MemberVO member = new MemberVO("HONG5", "", "");
		mvo = dao.selectOne(member);
		System.out.println(mvo);
		
//		System.out.println("---- insertOne(VO) ----");
//		member = new MemberVO("hong113", "홍길동", "hong1234", "010-1111-1111", "서울");
//		int cnt = dao.insertOne(member);
//		System.out.println("입력 건수 : " + cnt);
		
//		System.out.println("---- updateOne(VO) ----");
//		// 업데이트 쓸 땐 insertone(VO) 주석 처리 해줘야 함
//		member = new MemberVO("hong1", "홍길동111", "hong1111", "010-1111-2222", "부산");
//		System.out.println("수정 전 : " + dao.selectOne(member));
//		int cnt = dao.updateOne(member);
//		System.out.println("수정 건수 : " + cnt);
//		System.out.println("수정 후 : " + dao.selectOne(member));
		
//		System.out.println("---- delete(VO) ----");
//		member = new MemberVO("HONG5", "", "");
//		int cnt = dao.delete(member);
//		System.out.println(cnt);
		
		System.out.println("---- delete(KEY VALUE) ----");
	    id = "hong113";
		member = new MemberVO(id, "", "");
		int result = dao.deleteOne(id);
		System.out.println(result);
		
		
	}
}
