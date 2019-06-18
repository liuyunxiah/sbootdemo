package com.xiami.springboot.sbootdemo.web.controller;

import com.xiami.springboot.sbootdemo.domain.Commodity;
import com.xiami.springboot.sbootdemo.domain.dto.CommodityDTO;
import com.xiami.springboot.sbootdemo.service.ICommodityService;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @author LYX
 * @date 2019/6/13
 */
@RestController
@RequestMapping("/commodityController")
public class CommodityController {
    @Autowired
    private ICommodityService iCommodityService;

    @GetMapping(value = {"/selectAll"})
    public List<Commodity> selectAll() {
        List<Commodity> list = iCommodityService.selectAll();
        return list;
    }

    @PostMapping(value = {"/insertCommodity"})
    public int insertCommodity(@RequestBody Commodity commodity) {
        System.out.println("这是新增controller" + commodity.toString());
        return iCommodityService.insertCommodity(commodity);
    }

    @PutMapping(value = {"/updateCommodity"})
    public int updateCommodity(@RequestBody Commodity commodity) {
        return iCommodityService.updateCommodity(commodity);
    }

    @DeleteMapping(value = {"/deleteCommodity"})
    public int deleteCommodity(Integer id) {

        return iCommodityService.deleteCommodity(id);
    }

    @GetMapping(value = {"/selectSingle/{id}","/selectSingle"})
    public CommodityDTO selectSingle(@PathVariable(required = false) Integer id) {
        return iCommodityService.selectSingle(id);
    }

}
