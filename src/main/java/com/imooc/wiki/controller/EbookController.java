package com.imooc.wiki.controller;

import com.imooc.wiki.req.EbookReq;
import com.imooc.wiki.resp.CommonResp;
import com.imooc.wiki.resp.EbookResp;
import com.imooc.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 描述：ToDo
 */
@RestController
@RequestMapping("/ebook")
public class EbookController {
    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp list(EbookReq req){
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> list = ebookService.list(req);
        //在CommonResp类里success默认是true
        resp.setContent(list);
        return resp;
    }
}
