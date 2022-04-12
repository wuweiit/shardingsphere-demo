package com.wuweiit.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wuweiit.demo.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Order)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-12 13:54:30
 */
@Mapper
public interface OrderDao extends BaseMapper<Order> {

/**
* 批量新增数据（MyBatis原生foreach方法）
*
* @param entities List<Order> 实例对象列表
* @return 影响行数
*/
int insertBatch(@Param("entities") List<Order> entities);

/**
* 批量新增或按主键更新数据（MyBatis原生foreach方法）
*
* @param entities List<Order> 实例对象列表
* @return 影响行数
* @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
*/
int insertOrUpdateBatch(@Param("entities") List<Order> entities);

}

