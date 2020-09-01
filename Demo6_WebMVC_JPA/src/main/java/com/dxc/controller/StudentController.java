package com.dxc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dxc.dao.StudentRepository;
import com.dxc.model.Student;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepository studentRepostiory;
	@RequestMapping(value= "addStudent", method = RequestMethod.POST)
	public String addStudent(Student student) {
		studentRepostiory.save(student); 
		
		return "home";	
		
	}
	
	@RequestMapping("showStudentForm")
	public  String showStudentForm() {
		System.out.println("hiii anil");
		return "showStudentForm";
	}
	
	@RequestMapping("getStudent")
	public ModelAndView getStudent(@RequestParam("id") int id) {
		Student student = studentRepostiory.findById(id).orElse(new Student());
		
		ModelAndView mv = new ModelAndView("showStudent");
		mv.addObject("stud", student);
		return mv;
	}
	
	//getStudents
	
	

}
