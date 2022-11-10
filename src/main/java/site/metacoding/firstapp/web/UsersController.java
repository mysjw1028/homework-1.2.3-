package site.metacoding.firstapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.Product;
import site.metacoding.firstapp.domain.ProductDao;
import site.metacoding.firstapp.domain.Users;
import site.metacoding.firstapp.domain.UsersDao;
import site.metacoding.firstapp.web.dto.CMRespDto;

@RequiredArgsConstructor
@Controller
public class UsersController {
	private final UsersDao usersDao;
	@GetMapping("/login") // 화면 출력되는지 확인 완료
	public String login() {
		return "users/login";
	}
	
	@GetMapping("/join") // 화면 출력되는지 확인 완료
	public String join() {
		return "users/join";
	}
	
	@PostMapping("/join/insert") 
	public String 회원가입( Users users) {
		usersDao.insert(users);
		return "product/product";
	}

	
	
	


}
