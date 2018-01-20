package com.lwbldy.myBatisPlus.mapper.system;

import java.util.List;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.lwbldy.myBatisPlus.common.SuperMapper;
import com.lwbldy.myBatisPlus.model.system.User;

/**
*
* User 表数据库控制层接口
*
*/
public interface UserMapper extends SuperMapper<User> {

	/**
     * <p>
     * 查询 : 根据state状态查询用户列表，分页显示
     * </p>
     *
     * @param page
     *            翻页对象，可以作为 xml 参数直接使用，传递参数 Page 即自动分页
     * @param state
     *            状态
     * @return
     */
    List<User> selectUserList(Pagination page, Integer state);
}
