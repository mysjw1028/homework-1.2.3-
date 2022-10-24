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
import site.metacoding.firstapp.web.dto.ProductReqDto;

@RequiredArgsConstructor
@Controller
public class ProductController {
	private final ProductDao productDao;

	@GetMapping("/product") // 1번 findAll -> 전체보여주기
	public String 전체보기(Model model) {
		List<Product> productList = productDao.findAll();
		model.addAttribute("product", productList);
		return "product/product";
	}

	@GetMapping("/product/{productId}") // 2번 findById -> 상세보기
	public String 상세보기(@PathVariable Integer productId, Model model) {
		model.addAttribute("product", productDao.findById(productId));
		return "product/detail";
	}

	// **********************POSTMAN으로 테스트****************//


	@PostMapping("/product/insert") // 3번 insert -> 데이터에 값넣기-> post로 넣기
	public void 추가하기(ProductReqDto  productReqDto) {
		productDao.insert(productReqDto);
	}//값은 들어갔지만 뷰에는 안나오노
	
	
	@PostMapping("/product/{productId}/edit") // 4번 update -> 수정하기 -> post로 값 수정
	public void 수정하기(@PathVariable Integer productId, Model model) {
		model.addAttribute("product", productDao.findById(productId));
	}

	@PostMapping("/product/{productId}/delete") // 5번 deleteById -> 삭제하기 -> post로 값 삭제
	public void 삭제하기(Product product) {
	}

}
