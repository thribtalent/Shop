package rs.hsk.shopback.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import rs.hsk.shopback.dao.CategoryDAO;
import rs.hsk.shopback.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {
		Category category = new Category();

		// adding first category
		category.setId(1);
		category.setName("Mug's");
		category.setDescription("This is categor description");
		category.setImageURL("mugs.jpg");
		categories.add(category);

		category = new Category();
		// adding seconed category
		category.setId(2);
		category.setName("pilow's");
		category.setDescription("This is categor description");
		category.setImageURL("pilo.png");
		categories.add(category);

		category = new Category();
		// adding thired category
		category.setId(3);
		category.setName("Calenders");
		category.setDescription("This is categor description");
		category.setImageURL("cal.jpg");
		categories.add(category);
		
		// adding thired category
		category = new Category();
		category.setId(4);
		category.setName("watch's");
		category.setDescription("This is categor description");
		category.setImageURL("watch.jpg");
		categories.add(category);
		
		// adding thired category
				category = new Category();
				category.setId(4);
				category.setName("Photo Frame");
				category.setDescription("This is categor description");
				category.setImageURL("cal.jpg");
				categories.add(category);

	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
