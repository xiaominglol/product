package com.gemini.business.member.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gemini.boot.framework.mybatis.service.impl.BaseDetailServiceImpl;
import com.gemini.business.member.mapper.MemberCollectionMapper;
import com.gemini.business.member.po.MemberCollectionPo;
import com.gemini.business.member.service.MemberCollectionService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * 会员收藏表
 *
 * @author 小明不读书
 * @date Wed Dec 04 09:34:37 CST 2019
 */
@Service
public class MemberCollectionServiceImpl extends BaseDetailServiceImpl<MemberCollectionPo, MemberCollectionPo, MemberCollectionMapper, MemberCollectionMapper> implements MemberCollectionService {

    @Override
    public QueryWrapper<MemberCollectionPo> wrapper(MemberCollectionPo po) {
        return super.wrapper(po)
                .eq(!StringUtils.isEmpty(po.getMemberId()), "member_id", po.getMemberId())
                .eq(!StringUtils.isEmpty(po.getMemberNickname()), "member_nickname", po.getMemberNickname())
                .eq(!StringUtils.isEmpty(po.getGoodsId()), "goods_id", po.getGoodsId())
                .eq(!StringUtils.isEmpty(po.getGoodsName()), "goods_name", po.getGoodsName())
                .eq(!StringUtils.isEmpty(po.getCreateTime()), "create_time", po.getCreateTime());
    }
}
