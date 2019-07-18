package rs.hsk.shop.controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//import rs.hsk.shopback.dao.CategoryDAO;

@Controller
public class AdminController {

	/*@Autowired
	private CategoryDAO categoryDAO;*/

	@RequestMapping(value = { "/admin"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("admin");
		mv.addObject("title", "Admin");
		// passing the list of category
		//mv.addObject("categories", categoryDAO.list());

		mv.addObject("userClickAdmin", true);
		return mv;
	}
	@RequestMapping(value = { "/admin1"})
	public ModelAndView admin1() {
		ModelAndView mv = new ModelAndView("admin");
		mv.addObject("title", "Admin1");
		// passing the list of category
		//mv.addObject("categories", categoryDAO.list());

		mv.addObject("userClickAdmin1", true);
		return mv;
	}
}
