package com.hua.gmall.pms.service.impl;

import com.hua.gmall.pms.entity.Comment;
import com.hua.gmall.pms.mapper.CommentMapper;
import com.hua.gmall.pms.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author Hua
 * @since 2020-01-27
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
