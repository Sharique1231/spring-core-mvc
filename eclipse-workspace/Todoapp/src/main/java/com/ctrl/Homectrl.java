package com.ctrl;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entities.Todo;

@Controller
public class Homectrl {
	@RequestMapping("/home")
	public String home(Model m)
	{   
		String str="home";
		m.addAttribute("name", str);
		return "home";
		//return page name(view)
	}
	@RequestMapping("/add")
	public String Addtodo(Model m) {
		Todo t=new Todo();
		m.addAttribute("name", "add");
		m.addAttribute("Todo", t);
		return "home";
		
	}
	@RequestMapping(value="/saveTodo",method = RequestMethod.POST)
	public String saveTodo(@ModelAttribute("Todo") Todo t, Model m)
	{
		
		System.out.println(t);
		t.setTodoDate(new Date());
		return "home";
	}
   
	
	
}
