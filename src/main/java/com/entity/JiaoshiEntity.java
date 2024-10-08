package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 教师
 *
 * @author 
 * @email
 */
@TableName("jiaoshi")
public class JiaoshiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiaoshiEntity() {

	}

	public JiaoshiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 工号
     */
    @TableField(value = "jiaoshi_uuid_number")

    private String jiaoshiUuidNumber;


    /**
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 教师姓名
     */
    @TableField(value = "jiaoshi_name")

    private String jiaoshiName;


    /**
     * 头像
     */
    @TableField(value = "jiaoshi_photo")

    private String jiaoshiPhoto;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 联系方式
     */
    @TableField(value = "jiaoshi_phone")

    private String jiaoshiPhone;


    /**
     * 邮箱
     */
    @TableField(value = "jiaoshi_email")

    private String jiaoshiEmail;


    /**
     * 假删
     */
    @TableField(value = "jiaoshi_delete")

    private Integer jiaoshiDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：工号
	 */
    public String getJiaoshiUuidNumber() {
        return jiaoshiUuidNumber;
    }
    /**
	 * 获取：工号
	 */

    public void setJiaoshiUuidNumber(String jiaoshiUuidNumber) {
        this.jiaoshiUuidNumber = jiaoshiUuidNumber;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }
    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }
    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：教师姓名
	 */
    public String getJiaoshiName() {
        return jiaoshiName;
    }
    /**
	 * 获取：教师姓名
	 */

    public void setJiaoshiName(String jiaoshiName) {
        this.jiaoshiName = jiaoshiName;
    }
    /**
	 * 设置：头像
	 */
    public String getJiaoshiPhoto() {
        return jiaoshiPhoto;
    }
    /**
	 * 获取：头像
	 */

    public void setJiaoshiPhoto(String jiaoshiPhoto) {
        this.jiaoshiPhoto = jiaoshiPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：联系方式
	 */
    public String getJiaoshiPhone() {
        return jiaoshiPhone;
    }
    /**
	 * 获取：联系方式
	 */

    public void setJiaoshiPhone(String jiaoshiPhone) {
        this.jiaoshiPhone = jiaoshiPhone;
    }
    /**
	 * 设置：邮箱
	 */
    public String getJiaoshiEmail() {
        return jiaoshiEmail;
    }
    /**
	 * 获取：邮箱
	 */

    public void setJiaoshiEmail(String jiaoshiEmail) {
        this.jiaoshiEmail = jiaoshiEmail;
    }
    /**
	 * 设置：假删
	 */
    public Integer getJiaoshiDelete() {
        return jiaoshiDelete;
    }
    /**
	 * 获取：假删
	 */

    public void setJiaoshiDelete(Integer jiaoshiDelete) {
        this.jiaoshiDelete = jiaoshiDelete;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Jiaoshi{" +
            "id=" + id +
            ", jiaoshiUuidNumber=" + jiaoshiUuidNumber +
            ", username=" + username +
            ", password=" + password +
            ", jiaoshiName=" + jiaoshiName +
            ", jiaoshiPhoto=" + jiaoshiPhoto +
            ", sexTypes=" + sexTypes +
            ", jiaoshiPhone=" + jiaoshiPhone +
            ", jiaoshiEmail=" + jiaoshiEmail +
            ", jiaoshiDelete=" + jiaoshiDelete +
            ", createTime=" + createTime +
        "}";
    }
}
