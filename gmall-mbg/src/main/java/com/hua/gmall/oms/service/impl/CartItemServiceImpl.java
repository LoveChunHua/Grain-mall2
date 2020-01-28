package com.hua.gmall.oms.service.impl;

import com.hua.gmall.oms.entity.CartItem;
import com.hua.gmall.oms.mapper.CartItemMapper;
import com.hua.gmall.oms.service.CartItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车表 服务实现类
 * </p>
 *
 * @author Hua
 * @since 2020-01-27
 */
@Service
public class CartItemServiceImpl extends ServiceImpl<CartItemMapper, CartItem> implements CartItemService {

}
