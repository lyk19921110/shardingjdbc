package com.example.demo.Mapper;

import com.example.demo.Vo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {

    /**
     * 插入商品
     * @param order
     */
    void inertOrder(Order order);
}
