package sample.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import sample.model.Posts;

public interface PostsRepository extends CrudRepository<Posts, Integer>{
	List<Posts> findBytuadeContaining(String name);
}
