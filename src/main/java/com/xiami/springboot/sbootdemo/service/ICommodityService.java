package com.xiami.springboot.sbootdemo.service;

import com.xiami.springboot.sbootdemo.domain.Commodity;
import com.xiami.springboot.sbootdemo.domain.dto.CommodityDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * IUserService service层
 * @author  LYX
 * @date 2019/6/5
 */
public interface ICommodityService {
    /**
     * 查询所有商品信息列表
     * @return List<Commodity>
     */
   List<Commodity> selectAll();

    /**
     * 新增一个商品的方法
     * @param commodity 商品信息
     * @return int 返回结果
     */
   int insertCommodity(Commodity commodity);

    /**
     * 修改商品信息
     * @param commodity 商品主要信息
     * @return int
     */
    @RequestMapping("/updateCommodity")
   int updateCommodity(Commodity commodity);

    /**
     * 删除方法
     * @param id 要删除的商品id
     * @return int 删除结果
     */
   int deleteCommodity(Integer id);

    /**
     * 单个商品查询方法
     * @param id 要查询的商品的id
     * @return int
     */
    CommodityDTO selectSingle(Integer id);
}
