package site.metacoding.firstapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.BuyDao;
import site.metacoding.firstapp.domain.Product;
import site.metacoding.firstapp.domain.ProductDao;

import site.metacoding.firstapp.web.dto.request.buy.BuyDto;

@RequiredArgsConstructor
@Controller
public class BuyController {

	private final ProductDao productDao;
	private final BuyDao buyDao;

	@GetMapping("/buy/{productId}")
	public String buyTable(@PathVariable Integer productId, Model model) {
		model.addAttribute("product", productDao.findById(productId));
		return "users/buy";
	}

	@PostMapping("/buy")
	public String buy(BuyDto buyDto) {

		// 1. findById로 p1에 사려던 품목을 담김
		Product p1 = productDao.findById(buyDto.getProductId());
		System.out.println(buyDto.getProductId());
		// 2. buyCount에 기존 DB의 상품갯수 - 구매하려고 한 상품 갯수 정보 담기
		Integer buyCount = p1.getProductQty() - buyDto.getBuyQty();
		System.out.println(p1.getProductQty());
	

		System.out.println("사려던 갯수 : " + buyDto.getBuyQty());
		System.out.println("남은 개수 : " + buyCount);

		System.out.println("111111111111111111111111111111111111");

		// 3. buyDto에 담은 정보로 insert함
		buyDao.insert(buyDto);
		System.out.println("222222222222222222222222222222");

		// 4. buyCount와 buyDto에 담긴 productId로 qty 업데이트
		productDao.updateQty(buyCount, buyDto.getProductId());
		System.out.println("3333333333333333333333333333");

		return "redirect:/";
	}

	@GetMapping("/buy/buylist")
	public String buylist() {

		return "users/buylist";
	}
}
