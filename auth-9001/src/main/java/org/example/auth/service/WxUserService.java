package org.example.auth.service;

import org.example.common.entity.WxUser;
import org.example.common.resultvo.ResultVO;

import java.sql.ResultSet;

/**
 * auth 鉴权模块service接口
 * @author Fanxing
 * @since 2021-04-21 13:18:27
 */
public interface WxUserService {

    /**
     * 通过ID查询单个对象
     * @param userId 主键
     * @return 实例对象
     */
    ResultVO findById(Integer userId);

    /**
     * 查询所有auth 鉴权模块数据 不分页
     * @return
     */
    public ResultVO list();
    
    /**
     * 查询所有的auth 鉴权模块信息 分页
     *@param currentPage 当前页
     *@param pageSize 每页多少条
     * @return
     */
    public ResultVO listAll(Integer currentPage, Integer pageSize,String keyword);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param wxUser 实例对象
     * @return 对象列表
     */
    public ResultVO queryAll(WxUser wxUser);


    /**
     * 保存或者修改auth 鉴权模块信息
     * @param wxUser auth 鉴权模块对象
     * @return
     */
    public ResultVO saveOrUpdate(WxUser wxUser); 
   
      /**
     * 保存auth 鉴权模块信息
     * @param wxUser auth 鉴权模块对象
     * @return
     */
    public ResultVO save(WxUser wxUser); 
   
     /**
     *修改auth 鉴权模块信息
     * @param wxUser auth 鉴权模块对象
     * @return
     */
    public ResultVO update(WxUser wxUser); 
   
    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    public ResultVO deleteById(Integer userId);


    // 根据code以及appkey登录
    public ResultVO wxLogin(String code);
}