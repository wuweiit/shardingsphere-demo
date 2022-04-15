package com.wuweiit.demo.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * (Order)表实体类
 *
 * @author makejava
 * @since 2022-04-12 13:54:31
 */
@SuppressWarnings("serial")
@Data
@TableName("`order`")
public class Order {

    @TableId
//    @TableId(type = IdType.INPUT)
    private Long orderId;
    
    private Integer userId;
    
    private Long addressId;
    
    private String status;

}

