package com.wuweiit.demo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
public class Order extends Model<Order> {

    @TableId(type = IdType.ASSIGN_ID)
    private Long orderId;
    
    private Integer userId;
    
    private Long addressId;
    
    private String status;

}

