package com.zqc.base;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @author : zengQingCheng
 * @date : 2019/8/10 16:28
 */
@Data
public class BaseVoModel {

    @TableId(
            value = "id_",
            type = IdType.AUTO
    )
    private Long id;

    @TableField("status")
    private Integer status;
    @TableField("system_remark")
    private String remark;
    @TableField("create_id")
    private String createId;
    @TableField("create_user")
    private String createUser;
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    @TableField("create_time")
    private Date createTime;
    @TableField("update_id")
    private String updateId;
    @TableField("update_user")
    private String updateUser;
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    @TableField("update_time")
    private Date updateTime;
}
