package rs.hsk.shopback.dao;

import java.util.List;

import rs.hsk.shopback.dto.Category;

public interface CategoryDAO {
	
	
	Category get(int id);
	List<Category>list();
	boolean add(Category category);
	boolean update(Category category);
	boolean delete(Category category);
	
}
