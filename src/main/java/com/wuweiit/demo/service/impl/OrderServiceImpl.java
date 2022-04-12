package com.wuweiit.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wuweiit.demo.dao.OrderDao;
import com.wuweiit.demo.entity.Order;
import com.wuweiit.demo.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * (Order)表服务实现类
 *
 * @author makejava
 * @since 2022-04-12 13:54:33
 */
@Service("orderService")
public class OrderServiceImpl extends ServiceImpl<OrderDao, Order> implements OrderService {

}

