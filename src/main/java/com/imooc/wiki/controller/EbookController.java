package com.imooc.wiki.controller;

import com.imooc.wiki.req.EbookQueryReq;
import com.imooc.wiki.req.EbookSaveReq;
import com.imooc.wiki.resp.CommonResp;
import com.imooc.wiki.resp.EbookResp;
import com.imooc.wiki.resp.PageResp;
import com.imooc.wiki.service.EbookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * 描述：ToDo
 */
@RestController
@RequestMapping("/ebook")
public class EbookController {
    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp list(@Valid EbookQueryReq req){
        CommonResp<PageResp<EbookResp>> resp = new CommonResp<>();
        PageResp<EbookResp> list = ebookService.list(req);
        //在CommonResp类里success默认是true
        resp.setContent(list);
        return resp;
    }
    //@RequestBody post用json方式的提交
    @PostMapping("/save")
    public CommonResp save(@RequestBody EbookSaveReq req){
        CommonResp resp = new CommonResp<>();
        ebookService.save(req);
        //在CommonResp类里success默认是true
        return resp;
    }

    @DeleteMapping("/delete/{id}")
    public CommonResp delete(@PathVariable Long id){
        CommonResp resp = new CommonResp<>();
        ebookService.delete(id);
        //在CommonResp类里success默认是true
        return resp;
    }
}
