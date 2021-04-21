package org.example.auth.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.example.auth.dao.WxUserDao;
import org.example.auth.service.WxUserService;
import org.example.common.entity.WxUser;
import org.example.common.resultvo.ResultVO;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * auth 鉴权模块service接口实现类
 * @author Fanxing
 * @since 2021-04-21 13:18:27
 */
@Service
@Transactional
public class WxUserServiceImpl implements WxUserService {
    @Resource
    private WxUserDao wxUserDao;

    /**
     * 通过ID查询单个对象
     *
     * @param userId 主键
     * @return 实例对象
     */
    @Override
    public ResultVO findById(Integer userId) {
      WxUser result =  this.wxUserDao.findById(userId);
      return new ResultVO(100,"Success",result);

    }
    
    /**
     * 查询所有auth 鉴权模块数据 不分页
     * @return
     */
    @Override
    public ResultVO list(){
         
        return new ResultVO(100,"Success",this.wxUserDao.list());
    }
    
    /**
     * 查询所有的auth 鉴权模块信息 分页
     *@param currentPage 当前页
     *@param pageSize 每页多少条
     * @return
     */
    @Override
    public ResultVO listAll(Integer currentPage, Integer pageSize, String keyword){
        PageHelper.startPage(currentPage,pageSize);
        List<WxUser> wxUsers = this.wxUserDao.listAll(keyword);
        PageInfo<WxUser> pageInfo = new PageInfo<WxUser>(wxUsers);
        return new ResultVO(100,"Success",pageInfo);
    }
    
    /**
     * 通过实体作为筛选条件查询
     *
     * @param wxUser 实例对象
     * @return 对象列表
     */
    @Override
    public ResultVO queryAll(WxUser wxUser){
        List<WxUser> wxUsers = this.wxUserDao.queryAll(wxUser);
        ResultVO result = new ResultVO(100,"Success",wxUsers);
        return result;
    }

    /**
     * 保存或者修改auth 鉴权模块信息
     * @param wxUser auth 鉴权模块对象
     * @return
     */
    @Override
    public ResultVO saveOrUpdate(WxUser wxUser){
        Integer count =0;
        if( wxUser.getUserId()==null){
            //count 代表受影响的行数  即数据库中保存成功多少条数据
            count = this.wxUserDao.save(wxUser);
        }else{
            //count 代表受影响的行数  即数据库中修改成功多少条数据
            count = this.wxUserDao.update(wxUser);
        }
        ResultVO result = new ResultVO(100,"Success");
        if(count==0){
            result.setCode(200);
            result.setMsg("Fail");
        }
        return result;
    }
    
      /**
     * 保存auth 鉴权模块信息
     * @param wxUser auth 鉴权模块对象
     * @return
     */
      @Override
    public ResultVO save(WxUser wxUser){
        Integer count = this.wxUserDao.save(wxUser);       
        ResultVO result = new ResultVO(100,"Success");
        if(count==0){
            result.setCode(200);
            result.setMsg("Fail");
        }
        return result;
    }
     /**
     * 修改auth 鉴权模块信息
     * @param wxUser auth 鉴权模块对象
     * @return
     */
     @Override
    public ResultVO update(WxUser wxUser){
        ResultVO result = new ResultVO(100,"Success");
        Integer count = this.wxUserDao.update(wxUser);       
        if(count==0){
            result.setCode(200);
            result.setMsg("Fail");
        }
        return result ;
    }
    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    @Override
    public ResultVO deleteById(Integer userId) {
        ResultVO result = new ResultVO(100,"Success");
        Integer count =this.wxUserDao.deleteById(userId);
        if(count==0){
            result.setCode(200);
            result.setMsg("Fail");
        }
        return result ;
    }


    @Override
    public ResultVO wxLogin(String code){
        //根据小程序传过来的code，然后请求（看小程序开发文档）来获取openid和密钥
        //获取 session_key 然后存到redis内，用来校验这个
        // 先判断mysql内是否有这个openid的用户，如果有则登录，没有先给数据库创建
        String openid = "openid";
        // 根据openid拿到用户信息
        WxUser wxUser = new WxUser();

        if( wxUserDao.queryAll(wxUser).size() == 0){
            wxUser.setUserWx(openid);
            wxUser.setUserAvatar("");
            wxUser.setUserName("");
            wxUser.setUserDefaultAddress(0);
            wxUserDao.save(wxUser);
        }

        // 将值存入redis

        return new ResultVO(100,"success","这里是拿到的登录信息");
    }
}