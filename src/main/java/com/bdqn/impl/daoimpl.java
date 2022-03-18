package com.bdqn.impl;

import com.bdqn.dao;
import org.springframework.stereotype.Component;

@Component("dao")
public class daoimpl implements dao {

    @Override
    public void save() {
        System.out.println("running....");
    }
}
