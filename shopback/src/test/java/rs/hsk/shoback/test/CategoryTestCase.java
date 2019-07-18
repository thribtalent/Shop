package rs.hsk.shoback.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import rs.hsk.shopback.dao.CategoryDAO;
import rs.hsk.shopback.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("rs.hsk.shopback");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}

	@Test
	/*public void testAddCategory() {

		category = new Category();

		category.setName("Calender");
		category.setDescription("This is  category");
		category.setImageURL("pilo.png");

		assertEquals("Error while adding category", true, categoryDAO.add(category));

	}*/
	public void testUpdateCategory() {

		category = categoryDAO.get(3);
		category.setName("Pilow");
		assertEquals("Successfully updated a single category in the table!", true, categoryDAO.update(category));
	}
}