package com.example.entity;

import lombok.Data;

/**
 * @author Alex Young
 * @since 2023/5/2 23:10
 */
@Data
public class Account {

    private int id;
    private String name;
    private String password;
    private String email;
}
