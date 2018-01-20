package com.lwbldy.myBatisPlus.service.system;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.lwbldy.myBatisPlus.model.system.User;

/**
 * user数据接口
 * @author Administrator
 *
 */
public interface IUserService extends IService<User> {
	public Page<User> selectUserPage(Page<User> page, Integer state);
}
