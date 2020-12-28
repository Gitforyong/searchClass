package pojo;

public class Users {
	private Integer id;
	private String stu_id;
	private String pwd;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStu_id() {
		return stu_id;
	}
	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", stu_id=" + stu_id + ", pwd=" + pwd + "]";
	}
	public Users(Integer id, String stu_id, String pwd) {
		super();
		this.id = id;
		this.stu_id = stu_id;
		this.pwd = pwd;
	}
	public Users() {
		super();
	}
	
}
