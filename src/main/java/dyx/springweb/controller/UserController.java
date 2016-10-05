package dyx.springweb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import dyx.springweb.entity.User;
import dyx.springweb.service.UserService;

@Controller
@RequestMapping(value = "user")
public class UserController {

	private UserService userService;

	@Resource(name = "userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping(value = "all", method = RequestMethod.GET)
	@ResponseBody
	// fastjson
	public String all() {

		List<User> result = userService.getAllUser();
		String jsonResult = JSONArray.toJSONString(result);
		return jsonResult;
	}

	@RequestMapping(value = "test")
	@ResponseBody
	// fastjson
	public String test() {
		return "hello";
	}

}
