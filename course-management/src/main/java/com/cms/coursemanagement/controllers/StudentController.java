package com.cms.coursemanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cms.coursemanagement.dao.StudentRepository;
import com.cms.coursemanagement.models.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
@Autowired
private StudentRepository studentrepository;
@RequestMapping(value="/",method=RequestMethod.GET)
 public String studentLogin() {
return "studentlogin";


}
@RequestMapping(value="/RegisterStudent",method = RequestMethod.GET)
public String  studentRegister(Model model) {
model.addAttribute("student",new Student());
return "studentregister";
}

@RequestMapping(value="/RegProcess",method = RequestMethod.POST)
 public String addEmployee(@ModelAttribute("student") Student st) {
 
 
 Student s= studentrepository.save(st);
 
 if(s!=null)
 {
 return "studentlogin";
 }
 else
 {
 return "index";
 }
}
}
