package com.example.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import com.example.Entity.PersonForm;

@Controller
public class ApplicationController {

	private PersonForm imp;
	

	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView getLogin()
	{
		return new ModelAndView("form","imp",new PersonForm());
				
	}
	    
	    @RequestMapping(value="/check",method=RequestMethod.POST)
		public ModelAndView verify(@Valid@ModelAttribute("imp")PersonForm user,BindingResult br)
		
		{
			
			if(br.hasErrors())
			{
				return new ModelAndView("form");
			}
			return null;
			
	}
		}
