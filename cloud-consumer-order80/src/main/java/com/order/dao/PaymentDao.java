package com.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.common.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentDao extends BaseMapper<Payment> {

}
