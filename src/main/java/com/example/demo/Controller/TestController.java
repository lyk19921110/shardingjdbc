package com.example.demo.Controller;

import com.example.demo.Mapper.OrderMapper;
import com.example.demo.Vo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private  OrderMapper orderMapper;


    /**
     * 分表测试,插入时10条数据到mysql,会根据application的shardingjdbc的配置规则,均匀的插入两个表中
     * @return
     */
    @RequestMapping("/insertOrder")
    Map<String,Object> insertOrder(){
        for(int i=0;i<10;i++){
            Order order=new Order();
            order.setProduct("门票");
            order.setPrice("10"+i);
            order.setInsertTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            orderMapper.inertOrder(order);
        }
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("status","success");
        return map;
    }
}
