package com.imooc.wiki.service;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.github.pagehelper.PageHelper;
import com.imooc.wiki.domain.Ebook;
import com.imooc.wiki.domain.EbookExample;
import com.imooc.wiki.mapper.EbookMapper;
import com.imooc.wiki.req.EbookReq;
import com.imooc.wiki.resp.EbookResp;
import com.imooc.wiki.util.CopyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 描述：ToDo
 */
@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;
    public List<EbookResp> list(EbookReq req){
//        PageHelper.startPage(1, 3);
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        if( !ObjectUtils.isEmpty(req.getName())) {
            criteria.andNameLike("%" + req.getName() + "%");
        }
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
        //持久层返回List<Ebook>需要转成List<EbookResp>再返回controller
        /*List<EbookResp> respList = new ArrayList<>();
        for (Ebook ebook : ebookList) {
            //EbookResp ebookResp = new EbookResp();
            //BeanUtils.copyProperties(ebook, ebookResp);
            EbookResp ebookResp = CopyUtil.copy(ebook, EbookResp.class);
            respList.add(ebookResp);
        }*/
        List<EbookResp> respList = CopyUtil.copyList(ebookList, EbookResp.class);
        return respList;
    }
}
