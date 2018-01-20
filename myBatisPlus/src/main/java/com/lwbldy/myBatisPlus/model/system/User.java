package com.lwbldy.myBatisPlus.model.system;

import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.lwbldy.myBatisPlus.common.SuperEntity;
import com.lwbldy.myBatisPlus.model.enums.TypeEnum;

/**
 * ϵͳ�û���
 */
@TableName("sys_user")
public class User extends SuperEntity {

    /**
     * �û���
     */
    private String name;
    /**
     * �û�����
     */
    private TypeEnum type;
    /**
     * ͨ��ö�ٲ���
     */
    private Integer age;
    /**
     * �Զ������Ĵ���ʱ��
     */
    @TableField(fill = FieldFill.INSERT)// ��ע����������֤���Զ����
    private Date ctime;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}