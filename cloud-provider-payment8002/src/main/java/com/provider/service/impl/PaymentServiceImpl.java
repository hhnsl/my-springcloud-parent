package com.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.common.entity.Payment;
import com.provider.dao.PaymentDao;
import com.provider.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentDao, Payment> implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public List<Payment> findAll() {
        List<Payment> payments = paymentDao.selectList(null);
        return payments;
    }
}
