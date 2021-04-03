package cn.itcast.ssm.dao;

import cn.itcast.ssm.pojo.Item;

// 定义dao层的接口，最后用mybatis进行xml配置的实现
public interface ItemMapper {
    public Item findById(int id);
}
