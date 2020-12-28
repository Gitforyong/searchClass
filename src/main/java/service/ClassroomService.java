package service;

import java.util.List;

import pojo.Classroom;
import pojo.ClassroomFreetime;

public interface ClassroomService {
	public List<Integer> selectByCondition(ClassroomFreetime classroomFreetime);
}
