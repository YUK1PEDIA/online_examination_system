package com.ruoyi.exam.controller;

import com.aliyun.oss.AliOSSUtils;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.file.FileUtils;
import com.ruoyi.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


@Slf4j
@RestController
public class UploadController {

    @Autowired
    private AliOSSUtils aliOSSUtils;

    @PostMapping("/oss/upload")
    public AjaxResult upload(MultipartFile file) throws IOException {
        log.info("文件上传:{}", file.getOriginalFilename());
        String url = aliOSSUtils.upload(file);
        String[] split = url.split("/");
        log.info("文件上传成功, 文件访问的url地址为:{}", url);
        AjaxResult ajax = AjaxResult.success();
        ajax.put("url", url);
        ajax.put("fileName", file.getOriginalFilename());
        ajax.put("newFileName", split[split.length - 1]);
        ajax.put("originalFilename", file.getOriginalFilename());
        System.out.println(ajax);
        return ajax;
    }
}
