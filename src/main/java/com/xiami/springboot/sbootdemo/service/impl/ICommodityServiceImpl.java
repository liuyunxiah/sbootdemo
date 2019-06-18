package com.xiami.springboot.sbootdemo.service.impl;

import com.xiami.springboot.sbootdemo.domain.Commodity;
import com.xiami.springboot.sbootdemo.domain.dto.CommodityDTO;
import com.xiami.springboot.sbootdemo.mapper.CommodityMapper;
import com.xiami.springboot.sbootdemo.service.ICommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 商品service
 * @author LYX
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ICommodityServiceImpl implements ICommodityService {
    @Autowired
    private CommodityMapper commodityMapper;
    @Override
    @Transactional(readOnly = true,rollbackFor = Exception.class)
    public List<Commodity> selectAll() {
        System.out.println("这是service方法");
        return commodityMapper.selectAll();
    }

    @Override
    public int insertCommodity(Commodity commodity) {
        System.out.println("这是service 新增方法");
        return commodityMapper.insertCommodity(commodity);
    }

    @Override
    public int updateCommodity(Commodity commodity) {
        System.out.println("这是service 修改方法");
        return commodityMapper.updateCommodity(commodity);
    }

    @Override
    public int deleteCommodity(Integer id) {
        System.out.println("这是service 删除方法");
        return commodityMapper.deleteCommodity(id);
    }

    @Override
    public CommodityDTO selectSingle(Integer id) {
        System.out.println("这是service 查询商品单个的方法");
        return commodityMapper.selectSingle(id);
    }
}
