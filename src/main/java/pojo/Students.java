package pojo;

public class Students {
	private String sid;
	private String name;
	private String major;
	private String sex;
	private String department;
	private String grade;
	private String email;
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Students [sid=" + sid + ", name=" + name + ", major=" + major + ", sex=" + sex + ", department="
				+ department + ", grade=" + grade + ", email=" + email + "]";
	}
	public Students(String sid, String name, String major, String sex, String department, String grade, String email) {
		super();
		this.sid = sid;
		this.name = name;
		this.major = major;
		this.sex = sex;
		this.department = department;
		this.grade = grade;
		this.email = email;
	}
	public Students() {
		super();
	}
	
}
