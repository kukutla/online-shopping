package net.kkk.shoppingbackend.dao;

import java.util.List;

import net.kkk.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
}
