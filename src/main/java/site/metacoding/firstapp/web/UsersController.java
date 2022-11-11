package site.metacoding.firstapp.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.Product;
import site.metacoding.firstapp.domain.Users;
import site.metacoding.firstapp.domain.UsersDao;
import site.metacoding.firstapp.web.dto.CMRespDto;
import site.metacoding.firstapp.web.dto.request.users.JoinDto;
import site.metacoding.firstapp.web.dto.request.users.LoginDto;

@RequiredArgsConstructor
@Controller
public class UsersController {
	private final HttpSession session;
	private final UsersDao usersDao;

	@GetMapping("/join") // 화면 출력되는지 확인 완료
	public String join() {
		return "users/join";
	}

	@PostMapping("/join/insert")
	public  String 회원가입(Users users ) {
		//테스트할때 디비 / Dao /Dto 확인 후  값이 안들어가면 view name이 엔티티랑 같은지 확인하기!
		System.out.println(users.getUserName());
		usersDao.insert(users);
		System.out.println(users.getUserName());
		return "redirect:/";
	}
	

	@GetMapping("/login") // 화면 출력되는지 확인 완료
	public String login() {
		return "users/login";
	}

	@PostMapping("/login")
	public String 로그인(LoginDto loginDto) {// 로그인 하고 난 후
		Users usersPS = usersDao.login(loginDto);
		if (usersPS != null) {
			session.setAttribute("principal", usersPS);
			return "redirect:/";// model를 사용 했을때 "redirect:/" 이거를 사용해야 화면이 보여진다.
		} else {//인증실패하면
			return "users/login";
		}

	}
}
