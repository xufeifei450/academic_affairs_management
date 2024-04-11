package com.example.mapper;

import com.example.entity.Admin;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 操作admin相关数据接口
*/
public interface AdminMapper {
    int insert(Admin admin); /** 新增 */
    int deleteById(Integer id);/** 删除 */
    int updateById(Admin admin);/** 修改 */
    Admin selectById(Integer id);/** 根据ID查询 */
    List<Admin> selectAll(Admin admin);/** 根查询所有 */
    @Select("select * from admin where username = #{username}")
    Admin selectByUsername(String username);
}

