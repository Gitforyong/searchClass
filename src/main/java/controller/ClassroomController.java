package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pojo.ClassroomFreetime;
import service.impl.ClassroomServiceImpl;

@Controller
public class ClassroomController {
	
	@Autowired
	ClassroomServiceImpl classroomServiceImpl;
	
	@RequestMapping("/selectByCondition")
	public String selectByCondition(HttpServletRequest request,Model model) {
		Map<String,String> map = new HashMap<>();
		List<Integer> list = new ArrayList<Integer>();
		String c_weeks = request.getParameter("c_weeks");
		String c_week = request.getParameter("c_week");
		String c_begin = request.getParameter("c_begin");
		String c_end = request.getParameter("c_end");
		String c_location = request.getParameter("c_location");
		ClassroomFreetime classroomFreetime=new ClassroomFreetime();
		classroomFreetime.setC_weeks(Integer.valueOf(c_weeks));
		classroomFreetime.setC_week(Integer.valueOf(c_week));
		classroomFreetime.setC_begin(Integer.valueOf(c_begin));
		classroomFreetime.setC_end(Integer.valueOf(c_end));
		classroomFreetime.setC_location(c_location);
		map.put("c_weeks", c_weeks);
		map.put("c_week", c_week);
		map.put("c_begin", c_begin);
		map.put("c_end", c_end);
		map.put("c_location", c_location);
		list = classroomServiceImpl.selectByCondition(classroomFreetime);
		model.addAllAttributes(map);
		return "MeetRoomShows.jsp";
	}
}
