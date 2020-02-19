package com.ssw.pojo;

public class ProductSpecificationOption {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_specification_option.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_specification_option.option_name
     *
     * @mbg.generated
     */
    private String optionName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_specification_option.spec_id
     *
     * @mbg.generated
     */
    private Long specId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_specification_option.orders
     *
     * @mbg.generated
     */
    private Integer orders;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_specification_option.id
     *
     * @return the value of product_specification_option.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_specification_option.id
     *
     * @param id the value for product_specification_option.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_specification_option.option_name
     *
     * @return the value of product_specification_option.option_name
     *
     * @mbg.generated
     */
    public String getOptionName() {
        return optionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_specification_option.option_name
     *
     * @param optionName the value for product_specification_option.option_name
     *
     * @mbg.generated
     */
    public void setOptionName(String optionName) {
        this.optionName = optionName == null ? null : optionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_specification_option.spec_id
     *
     * @return the value of product_specification_option.spec_id
     *
     * @mbg.generated
     */
    public Long getSpecId() {
        return specId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_specification_option.spec_id
     *
     * @param specId the value for product_specification_option.spec_id
     *
     * @mbg.generated
     */
    public void setSpecId(Long specId) {
        this.specId = specId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_specification_option.orders
     *
     * @return the value of product_specification_option.orders
     *
     * @mbg.generated
     */
    public Integer getOrders() {
        return orders;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_specification_option.orders
     *
     * @param orders the value for product_specification_option.orders
     *
     * @mbg.generated
     */
    public void setOrders(Integer orders) {
        this.orders = orders;
    }
}