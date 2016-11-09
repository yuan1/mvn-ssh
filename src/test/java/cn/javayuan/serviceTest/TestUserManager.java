package cn.javayuan.serviceTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import org.apache.logging.log4j.LogManager;  
import org.apache.logging.log4j.Logger;  

import cn.javayuan.beans.User;
import cn.javayuan.service.UserManager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-hibernate.xml" })
public class TestUserManager {
	private static final Logger logger = LogManager.getLogger(TestUserManager.class.getName());
	@Autowired
	UserManager userManager;

	@Test
	public void save() {
		User user = new User();
		user.setUserName("fengwusan");
		user.setPassword("123456");
		user.setGender(0);
		Integer id = userManager.save(user);
		JSON.toJSONString(id);
	}
}