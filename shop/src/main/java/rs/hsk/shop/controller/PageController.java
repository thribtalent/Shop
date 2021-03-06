package rs.hsk.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import rs.hsk.shopback.dao.CategoryDAO;

@Controller
public class PageController {

	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping(value = { "/", "/home", "/index", "/page" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		// passing the list of category
		mv.addObject("categories", categoryDAO.list());

		mv.addObject("userClickHome", true);
		return mv;
	}

	@RequestMapping(value = { "/about" })
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About");
		// passing the list of category
		mv.addObject("categories", categoryDAO.list());

		mv.addObject("userClickAbout", true);
		return mv;

	}

	@RequestMapping(value = { "/service" })
	public ModelAndView service() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Service");
		mv.addObject("userClickService", true);
		return mv;

	}

	@RequestMapping(value = { "/contact" })
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact");
		mv.addObject("userClickContact", true);
		return mv;

	}

}
