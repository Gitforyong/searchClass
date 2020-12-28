package pojo;

public class ClassroomFreetime {
	private Integer c_f_id;
	private Integer c_weeks;
	private Integer c_week;
	private Integer c_begin;
	private Integer c_end;
	private String c_location;
	public Integer getC_f_id() {
		return c_f_id;
	}
	public void setC_f_id(Integer c_f_id) {
		this.c_f_id = c_f_id;
	}
	public Integer getC_weeks() {
		return c_weeks;
	}
	public void setC_weeks(Integer c_weeks) {
		this.c_weeks = c_weeks;
	}
	public Integer getC_week() {
		return c_week;
	}
	public void setC_week(Integer c_week) {
		this.c_week = c_week;
	}
	public Integer getC_begin() {
		return c_begin;
	}
	public void setC_begin(Integer c_begin) {
		this.c_begin = c_begin;
	}
	public Integer getC_end() {
		return c_end;
	}
	public void setC_end(Integer c_end) {
		this.c_end = c_end;
	}
	public String getC_location() {
		return c_location;
	}
	public void setC_location(String c_location) {
		this.c_location = c_location;
	}
	@Override
	public String toString() {
		return "ClassroomFreetime [c_f_id=" + c_f_id + ", c_weeks=" + c_weeks + ", c_week=" + c_week + ", c_begin="
				+ c_begin + ", c_end=" + c_end + ", c_location=" + c_location + "]";
	}
	public ClassroomFreetime(Integer c_f_id, Integer c_weeks, Integer c_week, Integer c_begin, Integer c_end,
			String c_location) {
		super();
		this.c_f_id = c_f_id;
		this.c_weeks = c_weeks;
		this.c_week = c_week;
		this.c_begin = c_begin;
		this.c_end = c_end;
		this.c_location = c_location;
	}
	public ClassroomFreetime() {
		super();
	}
	
}
