package cn.e3mall.manager.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.e3mall.common.base.entity.Item;
import cn.e3mall.common.base.vo.ItemVo;

/**
 * - @mbg.generated
 *
 * @author colg
 */
public interface ItemMapper extends tk.mybatis.mapper.common.Mapper<Item> {

    /**
     * 批量修改商品状态
     *
     * @param ids
     * @param status
     */
    void updateItemStatus(@Param("ids") List<String> ids, @Param("status") int status);

    /**
     * 查询商品列表
     *
     * @return
     */
    List<ItemVo> selectItemList();

}