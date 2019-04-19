package sample.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import sample.dao.CategoryRepository;
import sample.model.Category;


@Service
@Transactional
public class CategoryService {
	
	private final CategoryRepository categoryRepository;
	
	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	public List<Category> findAll(){
		List<Category> cates = new ArrayList<>();
		for (Category cate: categoryRepository.findAll()) {
			cates.add(cate);
		}
		return cates;
	}
	
	public Category findCategory(int idchude) {
		return categoryRepository.findOne(idchude);
	}
	
	public void save(Category category) {
		categoryRepository.save(category);
	}
	
	public void delete(Category category) {
		categoryRepository.delete(category);
	}
}
