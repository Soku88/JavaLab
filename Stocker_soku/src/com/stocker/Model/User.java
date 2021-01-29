package com.stocker.Model;

public class User {
	private int id;
	private String nm;
	private String pw;
	private String email;
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		
		str.append("id : " + id + "\n");
		str.append("nm : " + nm + "\n");
		str.append("pw : " + pw + "\n");
		str.append("email : " + email + "\n");
			
		return str.toString();	
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	

}
