package com.bdqn.impl;

import com.bdqn.biz;
import com.bdqn.dao;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
@Component("biz")
public class bizimpl implements biz {
    /*@Autowired*/
  /*  @Qualifier("dao")*/
    @Resource
    dao dao;
    @Override
    public void save() {
        dao.save();
    }
}
