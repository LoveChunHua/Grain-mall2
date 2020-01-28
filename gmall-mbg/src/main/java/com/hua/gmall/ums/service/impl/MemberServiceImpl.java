package com.hua.gmall.ums.service.impl;

import com.hua.gmall.ums.entity.Member;
import com.hua.gmall.ums.mapper.MemberMapper;
import com.hua.gmall.ums.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author Hua
 * @since 2020-01-27
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
