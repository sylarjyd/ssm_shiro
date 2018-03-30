package cn.siggy.service;

import cn.siggy.vo.User;

public interface UserService {
	public User getByUsername(String username)throws Exception;
}
