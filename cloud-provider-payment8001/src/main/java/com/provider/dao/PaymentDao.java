package com.provider.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.common.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PaymentDao extends BaseMapper<Payment> {

}
