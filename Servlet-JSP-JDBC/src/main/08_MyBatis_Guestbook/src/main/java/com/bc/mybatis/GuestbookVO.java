package com.bc.mybatis;

public class GuestbookVO {
	// 연산할 거 아니면 String으로 통일 가능하다
	private String idx, name, subject, content, email, pwd, regdate;

	public String getIdx() {
		return idx;
	}

	public void setIdx(String idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "GuestbookVO [idx=" + idx + ", name=" + name + ", subject=" + subject + ", content=" + content + ", email="
				+ email + ", pwd=" + pwd + ", regdate=" + regdate + "]";
	}
	
	
}