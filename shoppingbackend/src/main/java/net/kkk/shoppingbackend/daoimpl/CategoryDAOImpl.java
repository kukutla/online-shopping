package net.kkk.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kkk.shoppingbackend.dao.CategoryDAO;
import net.kkk.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category>  categories = new ArrayList<>();
	
	static {
		//adding first category
				Category category = new Category();
				category.setId(1);
				category.setName("Television");
				category.setDescription("This description about Television!");
				category.setImageURL("CAT_TELEVISION.png");
				categories.add(category);
				//adding second category
				category = new Category();
				category.setId(2);
				category.setName("Mobile");
				category.setDescription("This description about Mobile!");
				category.setImageURL("CAT_Mobile.png");
				categories.add(category);
				
				//adding third category
				category = new Category();
				category.setId(3);
				category.setName("Laptop");
				category.setDescription("This description about Laptop!");
				category.setImageURL("CAT_Laptop.png");
				categories.add(category);
		
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub		
		return categories;
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		for(Category category : categories) {
			if(category.getId() == id) {
				return category;
			}
		}
		return null;
	}
}
