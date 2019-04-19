package sample.dao;

import org.springframework.data.repository.CrudRepository;

import sample.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer>{

}
