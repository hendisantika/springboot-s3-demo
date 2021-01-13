package com.hendisantika.springboots3demo.controller;

import com.hendisantika.springboots3demo.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-s3-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 14/01/21
 * Time: 06.31
 */
@RestController
@RequestMapping("/file")
public class StorageController {

    @Autowired
    private StorageService service;
}
