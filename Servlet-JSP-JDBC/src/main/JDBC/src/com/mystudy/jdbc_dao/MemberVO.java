package com.mystudy.jdbc_dao;

// VO : Value Object --> VO 생성
public class MemberVO {
	// 필드 : 컬럼명, 타입 동일하게 설정
	private String id;
	private String name;
	private String password;
	private String phone;
	private String address;
	
//	public MemberVO() {
//		기본 생성자 만들어도 되고 안 만들어도 되 여기선 생략
//	}
	
	// 생성자(id, name, password) --> PK (무조건 입력할 값의 생성자)
	public MemberVO(String id, String name, String password) {	
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public MemberVO(String id, String name, String password, String phone, String address) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", name=" + name + ", password=" + password + ", phone=" + phone + ", address="
				+ address + "]";
	}
	
	
	
	
}
