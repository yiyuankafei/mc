package com.mh.mc.controller;

import com.mh.mc.entity.Record;
import com.mh.mc.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * createtime:2020
 */
@RestController
@RequestMapping("/record")
public class RecordController {

    @Autowired
    RecordService recordService;

    @RequestMapping("/insert")
    public void insert(@RequestBody Record record) {

        recordService.insert(record);

    }
}
