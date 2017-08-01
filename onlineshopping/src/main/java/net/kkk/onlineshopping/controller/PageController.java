package net.kkk.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Home");
		mv.addObject("userClicksHome",true);
		return mv;
	}
	@RequestMapping(value = "about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","About US");
		mv.addObject("userClicksAbout",true);
		return mv;
	}
	@RequestMapping(value = "contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Contact US");
		mv.addObject("userClicksContact",true);
		return mv;
	}
	
	@RequestMapping(value = ("/test/{greeting}"))
	public ModelAndView test(@PathVariable("greeting")String greeting) {
	  ModelAndView mv = new ModelAndView("page");
	  mv.addObject("title","TestHome");
	  mv.addObject("userClicksHome",false);
	  return mv;
	}
}
