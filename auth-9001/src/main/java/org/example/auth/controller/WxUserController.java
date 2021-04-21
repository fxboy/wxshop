package org.example.auth.controller;

import org.example.auth.service.WxUserService;
import org.example.common.entity.WxUser;
import org.example.common.resultvo.ResultVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * auth 鉴权模块控制器
 * @author Fanxing
 * @since 2021-04-21 13:18:27
 */
@RestController
@RequestMapping("/wxUser")
public class WxUserController {
    /**
     * 注入auth 鉴权模块service对象
     */
    @Autowired
    private WxUserService wxUserService;

    /**
     * 通过主键查询单个对象
     * @param  id 主键
     * @return 单个对象
     */
    @RequestMapping("/findById")
    public ResultVO findById(Integer id) {
        return this.wxUserService.findById(id);
    }
    
    /**
     * 查询所有auth 鉴权模块数据 不分页
     * @return
     */
    @RequestMapping("/list")
    public ResultVO list(){
        return this.wxUserService.list();
    }
    
     /**
     * 根据属性查询所有auth 鉴权模块数据 不分页
     * @return
     */
    @RequestMapping("/queryAll")
    public ResultVO queryAll(WxUser wxUser){
        return this.wxUserService.queryAll(wxUser);
    }
    
    /**
     * 分页获取所有auth 鉴权模块的数据
     * @param  currentPage 当前页数 必填
     * @param  pageSize   每页多少条数据 必填
     * @param  keyword  搜索的关键字
     * @return
     */
    @RequestMapping("/listAll")
    public ResultVO listAll(Integer currentPage, Integer pageSize,String keyword){
        return this.wxUserService.listAll(currentPage,pageSize,keyword);
    }

    /**
     * 保存或者修改auth 鉴权模块信息
     * @param wxUser  auth 鉴权模块对象
     * @return 
     */
    @RequestMapping("/saveOrUpdate")
    public ResultVO saveOrUpdate(WxUser wxUser){
         return  this.wxUserService.saveOrUpdate(wxUser);
    }
    
    /**
     * 保存auth 鉴权模块信息
     * @param wxUser  auth 鉴权模块对象
     * @return 
     */
    @RequestMapping("/save")
    public ResultVO save(WxUser wxUser){
         return  this.wxUserService.save(wxUser);
    }
    
    /**
     * 修改auth 鉴权模块信息
     * @return 
     */
    @RequestMapping("/update")
    public ResultVO update(WxUser wxUser){
         return  this.wxUserService.update(wxUser);
    }
    
    /**
     * 根据主键删除auth 鉴权模块信息
     * @return
     */
    @RequestMapping("/delete")
    public ResultVO delete(Integer userId) {
        return  this.wxUserService.deleteById(userId);
    }



    @RequestMapping("/wxlogin")
    public ResultVO wxLogin(String code){
        return this.wxUserService.wxLogin(code);
    }
}