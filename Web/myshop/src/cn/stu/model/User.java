package cn.stu.model;

/*
 * �û�
 */
public class User {
	public static final int MANAGER = 0;
	public static final int USER = 1;
	private int id;//�û�ID
	private String password;//�û�����
	private String name;//�û�����
	private int kind;//�û����
	private String tel;//�û��绰
	private String email;//�û�����
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKind() {
		return kind;
	}
	public void setKind(int kind) {
		this.kind = kind;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static int getManager() {
		return MANAGER;
	}
	public static int getUser() {
		return USER;
	}
}
