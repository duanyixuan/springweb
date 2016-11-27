package basic;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.alibaba.fastjson.JSONArray;

import dyx.springweb.entity.User;

public class Basic {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		User u = new User();
		u.setId(1);
		u.setName("dyx");

		User u2 = new User();
		u2.setId(1);
		u2.setName("dyx");

		ArrayList<User> a = new ArrayList<>();
		a.add(u);
		a.add(u2);

		String result = JSONArray.toJSONString(a);
		System.out.println(result);
	}

}
