package com.xiami.springboot.sbootdemo.mapper;

import com.xiami.springboot.sbootdemo.domain.Commodity;
import com.xiami.springboot.sbootdemo.domain.dto.CommodityDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 *CommodityMapper
 * @author LYX
 * @data 2019/6/5
 */
@Repository
public interface CommodityMapper {
    /**
     * 查询所有商品信息
     * @return List<Commodity> 所有商品信息
     */
    List<Commodity> selectAll();

    /**
     * 新增商品方法
     * @param commodity 新增的商品信息
     * @return int 结果
     */
    int insertCommodity(Commodity commodity);

    /**
     * 修改商品信息的方法
     * @param commodity 要修改的商品信息
     * @return int 修改结果
     */
    int updateCommodity(Commodity commodity);

    /**
     * 删除商品信息
     * @param id
     * @return
     */
    int deleteCommodity(Integer id);

    /**
     * 查询单个商品信息
     * @param id 商品id
     * @return  Commodity 返回单个商品d
     */
    CommodityDTO selectSingle(@Param("id") Integer id);
}
