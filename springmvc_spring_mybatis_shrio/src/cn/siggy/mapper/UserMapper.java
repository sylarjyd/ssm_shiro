package cn.siggy.mapper;

import cn.siggy.vo.User;
/**
 * 定义用户接口
 * @author 邹波
 * @version 1.0
 * @date 2016-1-22
 */
public interface UserMapper {
	public User getByUsername(String username);
}
