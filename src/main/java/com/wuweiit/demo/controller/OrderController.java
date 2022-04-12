package com.wuweiit.demo.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wuweiit.demo.entity.Order;
import com.wuweiit.demo.service.OrderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Order)表控制层
 *
 * @author makejava
 * @since 2022-04-12 13:54:29
 */
@RestController
@RequestMapping("/api/order")
public class OrderController     {
    /**
     * 服务对象
     */
    @Resource
    private OrderService orderService;


    /**
     * 保存
     * @return 所有数据
     */
    @PostMapping("/")
    public Object save(@RequestBody Order order) {
        return this.orderService.save(order);
    }


    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param order 查询实体
     * @return 所有数据
     */
    @GetMapping
    public Object selectAll(Page<Order> page, Order order) {
        return this.orderService.page(page, new QueryWrapper<>(order));
    }

}

