package cn.siggy.mapper;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.siggy.vo.User;

public class UserMapperTest {
	@Test
	public void testGetUser(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-dao.xml");
		UserMapper userMapper = (UserMapper)ac.getBean("userMapper");
		User u=userMapper.getByUsername("zhangsan");
		System.out.println(u.getSalt());
	}
}
