package cn.itcast.ssm.service;

import cn.itcast.ssm.dao.ItemMapper;
import cn.itcast.ssm.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service    // 声明这是Service
@Transactional  // 事务注解
public class ItemServiceImpl implements ItemService{
    @Autowired  // 注入
    private ItemMapper itemMapper;

    public Item findById(int id) {
        return itemMapper.findById(id);
    }
}
