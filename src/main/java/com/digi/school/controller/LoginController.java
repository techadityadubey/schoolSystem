package com.digi.school.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.digi.school.model.LoggedUser;

@Controller
public class LoginController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String view() {
		return "redirect:login";
	}

	/*
	 * @RequestMapping(value = "/login", method = RequestMethod.GET) public
	 * ModelAndView login() { ModelAndView mv = new ModelAndView();
	 * mv.setViewName("userLogin"); return mv; }
	 */

	/*
	 * @RequestMapping(value="/login", method = RequestMethod.POST) public
	 * ModelAndView authenticateUser(ModelMap model, RedirectAttributes
	 * redirectAttributes) { if
	 * (!(SecurityContextHolder.getContext().getAuthentication() instanceof
	 * AnonymousAuthenticationToken)) { LoggedUser user = (LoggedUser)
	 * SecurityContextHolder .getContext() .getAuthentication() .getPrincipal();
	 * model.addAttribute("user", user); return new ModelAndView("dashboard"); }
	 * redirectAttributes.addAttribute("Please enter valid credentials"); return new
	 * ModelAndView("login"); }
	 */

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, Model model) {

		String errorMessge = null;
		if (error != null) {
			errorMessge = "Username or Password is incorrect !!";
			System.out.println("error1");
		}
		if (logout != null) {
			errorMessge = "You have been successfully logged out !!";
			System.out.println("error2");
		}
		model.addAttribute("errorMessge", errorMessge);
		System.out.println("error3");

		return "login";
	}

	@RequestMapping(value = { "/adminPage" }, method = RequestMethod.GET)
	public ModelAndView adminPage(ModelMap model) {
		ModelAndView mv = new ModelAndView();
		LoggedUser user = (LoggedUser) SecurityContextHolder.getContext().getAuthentication();
		mv.addObject("user", user);
		mv.setViewName("adminPage");
		return mv;
	}

	@RequestMapping(value = { "/userPage" }, method = RequestMethod.GET)
	public ModelAndView userPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("userPage");
		return mv;
	}

	@RequestMapping(value = { "/dashboard" })
	public ModelAndView dashboard(ModelMap model) {
		return new ModelAndView("dashboard");
	}

	@RequestMapping(value = { "/abc" }, method = RequestMethod.GET)
	public ModelAndView abc() {
		return new ModelAndView("dashboard");
	}

	

	/*
	 * @RequestMapping(value = { "/author/manuscript" }, method = RequestMethod.GET)
	 * public String submitManuscript(ModelMap model, HttpServletRequest request) {
	 * return "submitmanuscript"; }
	 */

}
