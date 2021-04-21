package org.example.auth.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.common.entity.WxUser;

import java.util.List;

/**
 * auth 鉴权模块dao接口
 * @author Fanxing
 * @since 2021-04-21 13:18:27
 */
@Mapper
public interface WxUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    public WxUser findById(Integer userId);
    
    

    /**
     * 查询所有auth 鉴权模块数据 不分页
     * @return 对象列表
     */
   public List<WxUser> list();


    /**
     * 查询所有auth 鉴权模块
     * @return
     */
    public List<WxUser> listAll(@Param("keyword") String keyword);


    /**
     * 保存auth 鉴权模块的方法
     * @param wxUser
     * @return
     */
    public Integer save(WxUser wxUser);


    /**
     * 更新auth 鉴权模块的方法
     * @param wxUser
     * @return
     */
    public Integer update(WxUser wxUser);
    
    /**
     * 通过实体作为筛选条件查询
     *
     * @param wxUser 实例对象
     * @return 对象列表
     */
    List<WxUser> queryAll(WxUser wxUser);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 影响行数
     */
    int deleteById(Integer userId);

}