package com.baomidou.mybatisplus.samples.wrapper.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author miemie
 * @since 2018-08-10
 */
@Data
@TableName(value="demo.roleq")
public class Role {
    /**
     * 主键ID
     */
    private Long id;
    /**
     * 角色名
     */
    private String roleName;
    /**
     * 角色描述
     */
    private String roleDescribe;
}
