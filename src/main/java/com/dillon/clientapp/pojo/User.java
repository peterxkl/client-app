package com.dillon.clientapp.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author DillonXie
 * @version 1.0
 * @date 2020/4/19 20:51
 */
@Data
@Entity(name = "tb_user")
public class User {
    @Id
    private String id;
    private String username;
    private String password;
    private String occupation;
    private String avatar;
}
