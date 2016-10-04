package dyx.springweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import dyx.springweb.service.UserService;

@Controller
@RequestMapping(value = "user")
public class UserController {

	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "all", method = RequestMethod.GET)
	@ResponseBody
	// fastjson
	public String all() {

		String result = userService.getAllUser();
		return result;
	}

}
