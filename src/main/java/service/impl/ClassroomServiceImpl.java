package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.ClassroomMapper;
import pojo.Classroom;
import pojo.ClassroomFreetime;
import service.ClassroomService;

@Service
public class ClassroomServiceImpl implements ClassroomService{
	
	@Autowired
	ClassroomMapper classroomMapper;
	
	@Override
	public List<Integer> selectByCondition(ClassroomFreetime classroomFreetime) {
		return classroomMapper.selectByCondition(classroomFreetime);
	}

}
