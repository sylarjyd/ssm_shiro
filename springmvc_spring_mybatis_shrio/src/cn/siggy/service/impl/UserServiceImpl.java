package cn.siggy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.siggy.mapper.UserMapper;
import cn.siggy.service.UserService;
import cn.siggy.vo.User;
/***
 * UserService实现类
 * @author 邹波
 * @version 1.0
 * @date 2016-1-22
 */
@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	public User getByUsername(String username) throws Exception {
		return userMapper.getByUsername(username);
	}
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
}
