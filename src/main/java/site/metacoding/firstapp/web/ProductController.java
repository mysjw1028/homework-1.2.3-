package site.metacoding.firstapp.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.Product;
import site.metacoding.firstapp.domain.ProductDao;

@RequiredArgsConstructor
@Controller
public class ProductController {
	private final ProductDao productDao;

	@GetMapping("/product") // 1번 findAll -> 전체보여주기
	public String 전체보기(Model model) {
		List<Product> productList = productDao.findAll();
		model.addAttribute("product", productList);
		System.out.println(productList);//왜 []상태인걸까
		return "product/product";
	}

	@GetMapping("/product/{id}") // 1번 findById -> 상세보기
	public Product 상세보기(@PathVariable Integer productId) {
		return productDao.findById(productId);
	}

	//**********************POSTMAN으로 테스트****************//
	
	@PostMapping("/product/insert") // 3번 insert -> 데이터에 값넣기-> post로 넣기
	public void 추가하기(Product product) {
	}

	@PostMapping(" /product/{id}/edit") // 4번 update -> 수정하기 -> post로 값 수정
	public void 수정하기(Product product) {
	}

	@PostMapping("/product/{id}/delete") // 5번 deleteById -> 삭제하기 -> post로 값 삭제
	public void 삭제하기(Product product) {
	}

}
