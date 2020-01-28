package com.hua.gmall.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hua.gmall.pms.entity.ProductLadder;
import com.hua.gmall.pms.mapper.ProductLadderMapper;
import com.hua.gmall.pms.service.ProductLadderService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品阶梯价格表(只针对同商品) 服务实现类
 * </p>
 *
 * @author Hua
 * @since 2020-01-27
 */
@Service
public class ProductLadderServiceImpl extends ServiceImpl<ProductLadderMapper, ProductLadder> implements ProductLadderService {

}
