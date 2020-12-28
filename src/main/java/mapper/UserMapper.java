package mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import pojo.Students;
@Mapper
public interface UserMapper {
	
	@Select("select * from students where Sid=#{arg0}")
	public Students selectStudentByUserId(String userId);
}
