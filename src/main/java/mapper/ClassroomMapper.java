package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import pojo.Classroom;
import pojo.ClassroomFreetime;

@Mapper
public interface ClassroomMapper {
	
	@Select("select c_f_id from classroomFreetime where c_weeks=#{classroomFreetime.c_weeks} and c_week=#{classroomFreetime.c_week} and c_begin=#{classroomFreetime.c_begin} and c_end=#{classroomFreetime.c_end} and c_location=''+#{classroomFreetime.c_location}+'';")
	public List<Integer> selectByCondition(@Param("classroomFreetime") ClassroomFreetime classroomFreetime);
}

