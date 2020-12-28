package mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import pojo.Users;

@Mapper
public interface LoginMapper {
	
	@Select("select * from users where stu_id=#{arg0} and pwd=#{arg1}")
	public Users Login(String stu_id,String pwd);
}
