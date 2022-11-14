package site.metacoding.firstapp.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.Buy;
import site.metacoding.firstapp.domain.BuyDao;
import site.metacoding.firstapp.domain.Product;
import site.metacoding.firstapp.domain.ProductDao;

import site.metacoding.firstapp.web.dto.request.buy.BuyDto;
import site.metacoding.firstapp.web.dto.request.buy.BuyListDto;

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
	public String buy(BuyDto buyDto) {// 테이블 수정후 jsp name 확인하기

		// 1. findById로 p1에 사려던 품목을 담김
		Product p1 = productDao.findById(buyDto.getProductId());
		System.out.println(buyDto.getProductId());
		// 2. buyCount에 기존 DB의 상품갯수 - 구매하려고 한 상품 갯수 정보 담기
	
	
		Integer buyCount = p1.getProductQty() - buyDto.getBuyQty();
		if(p1.getProductQty() - buyDto.getBuyQty()< 0){
			return "redirect:/";
		}//0이하는 못들어가게 -> 남은갯수보다 살려는 갯수가 많으면 메인으로 튕겨짐
		
//		if(p1.getProductQty() - buyDto.getBuyQty()< 0) {
//			return "redirect:/";
//		}
		System.out.println("사려던 갯수 : " + buyDto.getBuyQty());
		System.out.println("남은 개수 : " + buyCount);

		// 3. buyDto에 담은 정보로 insert함
		buyDao.insert(buyDto);

		// 4. buyCount와 buyDto에 담긴 productId로 qty 업데이트
		productDao.updateQty(buyCount, buyDto.getProductId());

		return "redirect:/";

	}//- (음수 못들어가게) js 로 구현을 해도 -면 자동으로 +가됨

	@GetMapping("/buy/buylist/{id}")
	public String buylist(@PathVariable Integer id, Model model) {
		List<BuyListDto> buyList = buyDao.buyList(id);
		model.addAttribute("buy", buyList);
		return "users/buylist";
	}

}
