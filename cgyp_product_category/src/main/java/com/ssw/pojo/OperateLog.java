package com.ssw.pojo;

import java.util.Date;

public class OperateLog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operatelog.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operatelog.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operatelog.user_name
     *
     * @mbg.generated
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operatelog.user_role
     *
     * @mbg.generated
     */
    private Integer userRole;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operatelog.user_ip
     *
     * @mbg.generated
     */
    private String userIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operatelog.handle_time
     *
     * @mbg.generated
     */
    private Date handleTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operatelog.handle_module
     *
     * @mbg.generated
     */
    private String handleModule;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operatelog.handle_type
     *
     * @mbg.generated
     */
    private String handleType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operatelog.context
     *
     * @mbg.generated
     */
    private String context;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operatelog.id
     *
     * @return the value of operatelog.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operatelog.id
     *
     * @param id the value for operatelog.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operatelog.user_id
     *
     * @return the value of operatelog.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operatelog.user_id
     *
     * @param userId the value for operatelog.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operatelog.user_name
     *
     * @return the value of operatelog.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operatelog.user_name
     *
     * @param userName the value for operatelog.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operatelog.user_role
     *
     * @return the value of operatelog.user_role
     *
     * @mbg.generated
     */
    public Integer getUserRole() {
        return userRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operatelog.user_role
     *
     * @param userRole the value for operatelog.user_role
     *
     * @mbg.generated
     */
    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operatelog.user_ip
     *
     * @return the value of operatelog.user_ip
     *
     * @mbg.generated
     */
    public String getUserIp() {
        return userIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operatelog.user_ip
     *
     * @param userIp the value for operatelog.user_ip
     *
     * @mbg.generated
     */
    public void setUserIp(String userIp) {
        this.userIp = userIp == null ? null : userIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operatelog.handle_time
     *
     * @return the value of operatelog.handle_time
     *
     * @mbg.generated
     */
    public Date getHandleTime() {
        return handleTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operatelog.handle_time
     *
     * @param handleTime the value for operatelog.handle_time
     *
     * @mbg.generated
     */
    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operatelog.handle_module
     *
     * @return the value of operatelog.handle_module
     *
     * @mbg.generated
     */
    public String getHandleModule() {
        return handleModule;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operatelog.handle_module
     *
     * @param handleModule the value for operatelog.handle_module
     *
     * @mbg.generated
     */
    public void setHandleModule(String handleModule) {
        this.handleModule = handleModule == null ? null : handleModule.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operatelog.handle_type
     *
     * @return the value of operatelog.handle_type
     *
     * @mbg.generated
     */
    public String getHandleType() {
        return handleType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operatelog.handle_type
     *
     * @param handleType the value for operatelog.handle_type
     *
     * @mbg.generated
     */
    public void setHandleType(String handleType) {
        this.handleType = handleType == null ? null : handleType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operatelog.context
     *
     * @return the value of operatelog.context
     *
     * @mbg.generated
     */
    public String getContext() {
        return context;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operatelog.context
     *
     * @param context the value for operatelog.context
     *
     * @mbg.generated
     */
    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }
}