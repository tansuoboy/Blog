package com.taobao.ems.server.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taobao.ems.model.entity.MyArticle;
import com.taobao.ems.model.mapper.MyArticleMapper;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


/**  业务逻辑处理
 * @since 2019.03.11
 * @author Mr.Xu
 */
@Service
public class MyArticleServiceImpl implements MyArticleService {

    //注入mapper
    @Resource
    MyArticleMapper myArticleMapper;
    //日志
    private final Logger logger = Logger.getLogger(this.getClass());

    /**
     * 根据主键删除实体
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {
        int number = 0;
        try {
            number = myArticleMapper.deleteByPrimaryKey(id);
        } catch (Exception e) {
            logger.error("根据主键删除出错",e);
        }
        return number;
    }
    /**
     *   添加博客信息
     * @param record
     * @return
     */
    @Override
    public int insert(MyArticle record) {
        int number = 1; //1是失败
        try {
            number = myArticleMapper.insert(record);
        } catch (Exception e) {
            logger.error("添加博客出错",e);
        }
        return number;
    }


    @Override
    public int insertSelective(MyArticle record) {
       return 0;
    }

    /**
     * 根据主键查找 MyArticle
     * @param id
     * @return
     */
    @Override
    public MyArticle selectByPrimaryKey(Integer id) {
        MyArticle myArticle = new MyArticle();
        try {
            myArticle = myArticleMapper.selectByPrimaryKey(id);
        } catch (Exception e) {
            logger.error("根据主键查找出错",e);
        }
        return myArticle;

    }

    /**
     *  查询所有博客信息
     * @return
     */
    @Override
    public Page<MyArticle> selectAll() {

        return myArticleMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKeySelective(MyArticle record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(MyArticle record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(MyArticle record) {
        return 0;
    }
}
