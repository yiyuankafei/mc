package com.mh.mc.service.impl;

import com.mh.mc.entity.Record;
import com.mh.mc.entity.RecordExample;
import com.mh.mc.entity.User;
import com.mh.mc.entity.UserExample;
import com.mh.mc.mapper.RecordMapper;
import com.mh.mc.mapper.UserMapper;
import com.mh.mc.service.RecordService;
import com.mh.mc.service.UserService;
import org.springframework.stereotype.Service;

/**
 * createtime:2020
 */
@Service
public class RecordServiceImpl extends BaseServiceImpl<RecordMapper, Record, RecordExample> implements RecordService {
}
