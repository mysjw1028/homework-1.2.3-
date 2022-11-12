package site.metacoding.firstapp.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.BuyDao;
import site.metacoding.firstapp.domain.Product;
import site.metacoding.firstapp.domain.ProductDao;
import site.metacoding.firstapp.domain.Users;
import site.metacoding.firstapp.domain.UsersDao;
import site.metacoding.firstapp.web.dto.request.buy.BuyDto;
import site.metacoding.firstapp.web.dto.request.users.LoginDto;

@RequiredArgsConstructor
@Controller
public class BuyController {
	private final HttpSession session;
	private final UsersDao usersDao;
	private final ProductDao productDao;
	private final BuyDao buyDao;

	@GetMapping("/buy/{productId}")
	public String buyTable(@PathVariable Integer productId, Model model) {
		model.addAttribute("product", productDao.findById(productId));
		return "users/buy";
	}

	@PostMapping("/buy")
	public String buy(BuyDto buyDto) {
		Product p1 = productDao.findById(buyDto.getProductId());
		Integer buyCount = p1.getProductQty() - buyDto.getProductQty();
		System.out.println("사려던 갯수 : " + buyDto.getProductQty());
		System.out.println("남은 개수 : " +buyCount);
		
		buyDao.insert(buyDto);
		
		productDao.updateQty(buyCount,buyDto.getProductId());
		
		
		return "redirect:/";
	}
}
