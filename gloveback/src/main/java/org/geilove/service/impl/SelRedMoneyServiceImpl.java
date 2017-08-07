package org.geilove.service.impl;

import org.geilove.dao.RedMoneyMapper;
import org.geilove.pojo.RedMoney;
import org.geilove.service.SelRedMoneyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
@Service
public class SelRedMoneyServiceImpl implements SelRedMoneyService {

    @Resource
    public  RedMoneyMapper redMoneyMapper;

    @Override
    public List<RedMoney> selAllRedMoney(HashMap<String,Object> hashMap) {
        List<RedMoney> redMoneyList=redMoneyMapper.selectAllUserRedMoney(hashMap);
        return redMoneyList;
    }
}
