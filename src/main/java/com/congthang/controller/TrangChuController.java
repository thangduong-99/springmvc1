package com.congthang.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.congthang.model.User;
import com.congthang.service.UserService;

@Controller
@RequestMapping("/")
public class TrangChuController {
	@GetMapping
	public String TrangChu() {
		return "trangchu";
	}
	@PostMapping("/signup")
	public String SignUp(@RequestParam("username") String username, @RequestParam("password1") String password1, @RequestParam("password2") String password2, ModelMap modelMap) {
		ApplicationContext context = new ClassPathXmlApplicationContext("data.xml");
		UserService userService = (UserService) context.getBean("userDAO");
		User user = new User();
		user.setUserName(username);
		user.setPassWord(password2);
		if(password1.equals(password2)&&userService.creatUser(user)) {
			userService.creatUser(user);
			modelMap.addAttribute("thongbao","Tạo tài khoản thành công !");
			return "trangchu";
		}else {
			modelMap.addAttribute("thongbao","Tạo tài khoản thất bại !");
			return "trangchu";
		}
		
	}
	@PostMapping("/login")
	public String Login(@RequestParam("username") String username, @RequestParam("password") String password,ModelMap modelMap) {
		ApplicationContext context = new ClassPathXmlApplicationContext("data.xml");
		UserService userService = (UserService) context.getBean("userDAO");
		User user = new User();
		user.setUserName(username);
		user.setPassWord(password);
		if(userService.checkLogin(user)) {
			modelMap.addAttribute("thongbao",username);
			return "product";
		}else {
			modelMap.addAttribute("thongbao","Sai tài khoản hoặc mật khẩu !");
			return "trangchu";
		}
	}
}
