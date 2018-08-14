package kr.co.thirdparty.main.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.co.thirdparty.common.domain.Users;
import kr.co.thirdparty.common.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/hello")
	public String main() {
		
		return "Hello World";
	}
	
	@PostMapping("/insert")
	public void insertUser(@RequestParam(value="platformId") String platformId ,@RequestParam(value="name") String name  ) {
		
		Users user = new Users();
		
		user.setPlatformId(platformId);
		userService.insertUser(user);
	}
	
}
