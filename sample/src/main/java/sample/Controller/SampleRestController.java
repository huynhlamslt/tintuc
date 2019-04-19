package sample.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import sample.service.CategoryService;

@RestController
public class SampleRestController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("all-cates")
	public String allCategory() {
		return categoryService.findAll().toString();
	}
}
