package com.example.seprojback.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.seprojback.entity.PermsMenu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PermsMenuMapper extends BaseMapper<PermsMenu> {
    @Select("SELECT\n" +
            "\tDISTINCT m.`perms`\n" +
            "FROM\n" +
            "\tsys_user_role ur\n" +
            "\tLEFT JOIN `sys_role` r ON ur.`role_id` = r.`id`\n" +
            "\tLEFT JOIN `sys_role_menu` rm ON ur.`role_id` = rm.`role_id`\n" +
            "\tLEFT JOIN `sys_menu` m ON m.`id` = rm.`menu_id`\n" +
            "WHERE\n" +
            "\tuser_id = #{userId}")
    List<String> selectPermsByUserId(String userId);
}
