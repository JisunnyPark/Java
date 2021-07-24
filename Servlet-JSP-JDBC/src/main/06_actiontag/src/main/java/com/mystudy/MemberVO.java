package com.mystudy;

import java.util.Arrays;

public class MemberVO {
	// 반드시 private!! 보안 접근 등... 이유 때문 / 변수 선언 순서는 상관없음
	private String id, pwd, name;
	private String gender;
	private String[] hobby;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", gender=" + gender + ", hobby="
				+ Arrays.toString(hobby) + "]";
	}
	
	
}
