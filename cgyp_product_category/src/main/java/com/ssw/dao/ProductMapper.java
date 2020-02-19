package com.ssw.dao;

import com.ssw.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_product
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_product
     *
     * @mbg.generated
     */
    int insert(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_product
     *
     * @mbg.generated
     */
    Product selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_product
     *
     * @mbg.generated
     */
    List<Product> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_product
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Product record);

    /*
     * 通过商品名字和id查询商品*/
    List<Product> findProductsByNameAndId(@Param("productId")Integer productId,
                                          @Param("productName")String productName);

    /*
    扣库存
     */
    int reduceProductStock(@Param("productId") Integer productId,@Param("stock") Integer stock);
    /*
    查看热销产品
     */
    List<Product> isHotProduct(@Param("categoryid") Integer category_id
            ,@Param("ishot")Integer is_hot);

    /*
   查看新产品
    */
    List<Product> isNewProduct();
    /*
    改变商品在售状态
    */
    int updateStatus(Integer productId,Integer status);
    /*
    改变商品是否热门
    */
    int updateIsnew(Integer productId,Integer isnew);
    /*
    改变商品是否是新品
    */
    int updateIshot(Integer productId,Integer ishot);
    /*
    根据商品id删除商品
    */
    int deleteById (Integer productId);
}