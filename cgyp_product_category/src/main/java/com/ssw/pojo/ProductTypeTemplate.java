package com.ssw.pojo;

public class ProductTypeTemplate {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_type_template.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_type_template.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_type_template.spec_ids
     *
     * @mbg.generated
     */
    private String specIds;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_type_template.brand_ids
     *
     * @mbg.generated
     */
    private String brandIds;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_type_template.custom_attribute_items
     *
     * @mbg.generated
     */
    private String customAttributeItems;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_type_template.id
     *
     * @return the value of product_type_template.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_type_template.id
     *
     * @param id the value for product_type_template.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_type_template.name
     *
     * @return the value of product_type_template.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_type_template.name
     *
     * @param name the value for product_type_template.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_type_template.spec_ids
     *
     * @return the value of product_type_template.spec_ids
     *
     * @mbg.generated
     */
    public String getSpecIds() {
        return specIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_type_template.spec_ids
     *
     * @param specIds the value for product_type_template.spec_ids
     *
     * @mbg.generated
     */
    public void setSpecIds(String specIds) {
        this.specIds = specIds == null ? null : specIds.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_type_template.brand_ids
     *
     * @return the value of product_type_template.brand_ids
     *
     * @mbg.generated
     */
    public String getBrandIds() {
        return brandIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_type_template.brand_ids
     *
     * @param brandIds the value for product_type_template.brand_ids
     *
     * @mbg.generated
     */
    public void setBrandIds(String brandIds) {
        this.brandIds = brandIds == null ? null : brandIds.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_type_template.custom_attribute_items
     *
     * @return the value of product_type_template.custom_attribute_items
     *
     * @mbg.generated
     */
    public String getCustomAttributeItems() {
        return customAttributeItems;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_type_template.custom_attribute_items
     *
     * @param customAttributeItems the value for product_type_template.custom_attribute_items
     *
     * @mbg.generated
     */
    public void setCustomAttributeItems(String customAttributeItems) {
        this.customAttributeItems = customAttributeItems == null ? null : customAttributeItems.trim();
    }
}