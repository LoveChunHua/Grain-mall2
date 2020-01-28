package com.hua.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hua.gmall.pms.entity.Brand;
import com.hua.gmall.pms.mapper.BrandMapper;
import com.hua.gmall.pms.service.BrandService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author Hua
 * @since 2020-01-27
 */
@Service
@Component
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

}
