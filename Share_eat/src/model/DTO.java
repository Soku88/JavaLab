package model;

public class DTO {
	private int i_user;
	private String user_nm;
	private String pw;
	private String confirm_pw;
	private String d_birth;
	private String gender;
	private String email;
	private String addr;
	private String p_number;
	
//	getter & setter
	public int getI_user() {
		return i_user;
	}
	public void setI_user(int i_user) {
		this.i_user = i_user;
	}
	public String getUser_nm() {
		return user_nm;
	}
	public void setUser_nm(String user_nm) {
		this.user_nm = user_nm;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getConfirm_pw() {
		return confirm_pw;
	}
	public void setConfirm_pw(String confirm_pw) {
		this.confirm_pw = confirm_pw;
	}
	public String getD_birth() {
		return d_birth;
	}
	public void setD_birth(String d_birth) {
		this.d_birth = d_birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getP_number() {
		return p_number;
	}
	public void setP_number(String p_number) {
		this.p_number = p_number;
	}

}
