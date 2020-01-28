package com.hua.gmall.oms.service.impl;

import com.hua.gmall.oms.entity.Order;
import com.hua.gmall.oms.mapper.OrderMapper;
import com.hua.gmall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author Hua
 * @since 2020-01-27
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
