package pojo;

public class Classroom {
	private Integer c_id;
	private String c_name;
	private String c_location;
	private String c_type;
	private Integer c_seat;
	private String c_borrowType;
	private String c_department;
	public Classroom(Integer c_id, String c_name, String c_location, String c_type, Integer c_seat, String c_borrowType,
			String c_department) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_location = c_location;
		this.c_type = c_type;
		this.c_seat = c_seat;
		this.c_borrowType = c_borrowType;
		this.c_department = c_department;
	}
	public Integer getC_id() {
		return c_id;
	}
	public void setC_id(Integer c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_location() {
		return c_location;
	}
	public void setC_location(String c_location) {
		this.c_location = c_location;
	}
	public String getC_type() {
		return c_type;
	}
	public void setC_type(String c_type) {
		this.c_type = c_type;
	}
	public Integer getC_seat() {
		return c_seat;
	}
	public void setC_seat(Integer c_seat) {
		this.c_seat = c_seat;
	}
	public String getC_borrowType() {
		return c_borrowType;
	}
	public void setC_borrowType(String c_borrowType) {
		this.c_borrowType = c_borrowType;
	}
	public String getC_department() {
		return c_department;
	}
	public void setC_department(String c_department) {
		this.c_department = c_department;
	}
	@Override
	public String toString() {
		return "Classroom [c_id=" + c_id + ", c_name=" + c_name + ", c_location=" + c_location + ", c_type=" + c_type
				+ ", c_seat=" + c_seat + ", c_borrowType=" + c_borrowType + ", c_department=" + c_department
				+ "]";
	}

	public Classroom() {
		super();
	}
	
}
