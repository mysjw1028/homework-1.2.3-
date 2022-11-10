package site.metacoding.firstapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class UsersController {

	@GetMapping("/login") // 화면 출력되는지 확인 완료
	public String login() {
		return "users/login";
	}

	@GetMapping("/join") // 화면 출력되는지 확인 완료
	public String join() {
		return "users/join";
	}

}
