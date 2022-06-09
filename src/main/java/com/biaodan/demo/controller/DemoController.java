package com.biaodan.demo.controller;

import com.biaodan.demo.dao.BiaodanDao;
import com.biaodan.demo.model.BiaodanTable2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月15日 20:59
 */
@RestController
@RequestMapping("/biaodan")
public class DemoController {

    @Autowired
    private BiaodanDao biaodanDao;
    @GetMapping("/wenben")
    public String wenben(){
        return "redirect:../index.html";
    }

    @GetMapping("/data")
    public List<BiaodanTable2> getData(){
        return biaodanDao.findBiaoDanData();
    }

    @PostMapping("/update/{id}")
    public String updateRow(@PathVariable("id") Long id, @RequestBody BiaodanTable2 biaodanTable2){

        int i = biaodanDao.updateBiaoDanRow(id, biaodanTable2);
        System.out.println(i);
        return "success";
    }
}
