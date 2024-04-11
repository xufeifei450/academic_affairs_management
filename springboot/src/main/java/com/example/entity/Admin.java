package com.example.entity;
import java.io.Serializable;
/**
 * 管理员
 */
public class Admin extends Account implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;/** ID */
    private String username;/** 用户名 */
    private String password;/** 密码 */
    private String name; /** 姓名 */
    private String phone; /** 电话 */
    private String email; /** 邮箱 */
    private String avatar;/** 头像 */
    private String role;/** 角色标识 */
//    省略get和set方法

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getAvatar() {
        return avatar;
    }

    @Override
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public void setRole(String role) {
        this.role = role;
    }
}