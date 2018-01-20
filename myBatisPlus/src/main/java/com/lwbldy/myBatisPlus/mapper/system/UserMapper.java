package com.lwbldy.myBatisPlus.mapper.system;

import java.util.List;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.lwbldy.myBatisPlus.common.SuperMapper;
import com.lwbldy.myBatisPlus.model.system.User;

/**
*
* User �����ݿ���Ʋ�ӿ�
*
*/
public interface UserMapper extends SuperMapper<User> {

	/**
     * <p>
     * ��ѯ : ����state״̬��ѯ�û��б���ҳ��ʾ
     * </p>
     *
     * @param page
     *            ��ҳ���󣬿�����Ϊ xml ����ֱ��ʹ�ã����ݲ��� Page ���Զ���ҳ
     * @param state
     *            ״̬
     * @return
     */
    List<User> selectUserList(Pagination page, Integer state);
}
