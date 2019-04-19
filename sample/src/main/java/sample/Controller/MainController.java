package sample.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sample.service.CategoryService;
import sample.service.PostsService;

@Controller
public class MainController {
	
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private PostsService postsService;
	
	@GetMapping("/")
	public String home(HttpServletRequest request) {
		request.setAttribute("cates", categoryService.findAll());
		
		//Load trang chủ
		request.setAttribute("cpost", postsService.findPosts((int)(Math.random()*16 + 1)));
		request.setAttribute("post1", postsService.findPosts((int)(Math.random()*16 + 1)));
		request.setAttribute("post2", postsService.findPosts((int)(Math.random()*16 + 1)));
		
		request.setAttribute("rpost", postsService.findSome());
		request.setAttribute("upost", postsService.findUnder());
		request.setAttribute("mpost", postsService.findMost());
		return "index";
	}
	
	@GetMapping("/home")
	public String AllCategory(HttpServletRequest request) {
		request.setAttribute("cates", categoryService.findAll());
		
		//Load trang chủ
		request.setAttribute("cpost", postsService.findPosts((int)(Math.random()*16 + 1)));
		request.setAttribute("post1", postsService.findPosts((int)(Math.random()*16 + 1)));
		request.setAttribute("post2", postsService.findPosts((int)(Math.random()*16 + 1)));
		
		request.setAttribute("rpost", postsService.findSome());
		request.setAttribute("upost", postsService.findUnder());
		request.setAttribute("mpost", postsService.findMost());
		return "index";
	}
	
	//Load trang danh mục
	@GetMapping("/category")
	public String category(@RequestParam int idchude, HttpServletRequest request) {

		switch (idchude) {
		case 1: request.setAttribute("catepost", postsService.findThoisu());	
		break;
		case 2: request.setAttribute("catepost", postsService.findQuocte());	
		break;
		case 3: request.setAttribute("catepost", postsService.findSuckhoe());	
		break;
		case 4: request.setAttribute("catepost", postsService.findGiaoduc());	
		break;
		case 5: request.setAttribute("catepost", postsService.findKhoahoc());	
		break;
		case 6: request.setAttribute("catepost", postsService.findDulich());	
		break;
		default:
			break;
		}

		request.setAttribute("cates", categoryService.findAll());

		request.setAttribute("rpost", postsService.findSome());

		request.setAttribute("mpost", postsService.findMost());

		return "category";
	}

	//Load trang chi tiết
	@GetMapping("/detail")
	public String SimplePost(@RequestParam int idbaiviet, HttpServletRequest request) {
		int n=idbaiviet;
		if(n>=18) {
			n=15;
		}

		request.setAttribute("detail", postsService.findPosts(idbaiviet));

		request.setAttribute("relate", postsService.findRelation(n));

		request.setAttribute("cates", categoryService.findAll());

		request.setAttribute("rpost", postsService.findSome());

		request.setAttribute("mpost", postsService.findMost());
		return "post";
	}
	
	@GetMapping("/search")
	public String Tim(@RequestParam String search, HttpServletRequest request) {
		request.setAttribute("cates", categoryService.findAll());
		request.setAttribute("rpost", postsService.findSome());
		request.setAttribute("mpost", postsService.findMost());
		request.setAttribute("search", postsService.findName(search));
		return "search";
	}
}
