package com.nchu.dao.impl;

import com.nchu.dao.FavoritesDao;
import com.nchu.entity.Favorites;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
@Repository
public class FavoritesDaoImpl implements FavoritesDao {
    /**
     * 保存一个对象到数据库
     *
     * @param model 要保存的对象
     * @return 主键
     */
    @Override
    public Integer save(Favorites model) {
        return null;
    }

    /**
     * 保存或者更新,当数据库中 存在同id对象时执行更新操作,没有则执行插入操作
     *
     * @param model 实体类
     */
    @Override
    public void saveOrUpdate(Favorites model) {

    }

    /**
     * 更新一条记录
     *
     * @param model 要更新的实例对象
     */
    @Override
    public void update(Favorites model) {

    }

    /**
     * 混合方法
     *
     * @param model
     */
    @Override
    public void merge(Favorites model) {

    }

    /**
     * 根据主键id删除记录
     *
     * @param id
     */
    @Override
    public void delete(Integer id) {

    }

    /**
     * 删除所有指定的持久化对象
     *
     * @param favorites 要删除的列表
     */
    @Override
    public void deleteAll(List<Favorites> favorites) {

    }

    /**
     * 通过实体对象删除记录
     *
     * @param model 实体对象
     */
    @Override
    public void deleteObject(Favorites model) {

    }

    /**
     * 通过主键Id获取对象
     *
     * @param id 主键id
     * @return 实体对象
     */
    @Override
    public Favorites get(Integer id) {
        return null;
    }

    /**
     * 统计整张表的记录数
     *
     * @return 返回记录条数
     */
    @Override
    public int countAll() {
        return 0;
    }

    /**
     * 查询全部数据记录
     *
     * @return 全部记录列表
     */
    @Override
    public List<Favorites> listAll() {
        return null;
    }

    /**
     * 分页查询
     *
     * @param conditions 条件参数集合
     * @param page       页码
     * @param pageSize   每页大小
     * @return 查询结果集
     */
    @Override
    public List<Favorites> searchPage(Map<String, Object> conditions, int page, int pageSize) {
        return null;
    }

    /**
     * 带排序的分页查询
     *
     * @param conditions 条件参数集合
     * @param orderBy    排序参考列
     * @param order      排序方式
     * @param page       页码
     * @param pageSize   每页大小
     * @return 查询结果集
     */
    @Override
    public List<Favorites> searchPageByOrder(Map<String, Object> conditions, String orderBy, String order, int page, int pageSize) {
        return null;
    }

    /**
     * 直接通过HQL语句进行查询
     *
     * @param HQL 语句字符串
     * @return 查询结果列表
     */
    @Override
    public List<Favorites> searchListDefined(String HQL) {
        return null;
    }

    /**
     * 通过Id判断对象是否存在
     *
     * @param id 要判断的Id
     * @return 返回判断结果
     */
    @Override
    public boolean exists(Integer id) {
        return false;
    }
}