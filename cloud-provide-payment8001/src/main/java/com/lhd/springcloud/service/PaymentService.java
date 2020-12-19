package com.lhd.springcloud.service;

import com.lhd.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author 罗惠铎
 * @date 2020/11/10
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
