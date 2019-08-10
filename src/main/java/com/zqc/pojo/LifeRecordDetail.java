package com.zqc.pojo;

import com.zqc.base.BaseVoModel;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class LifeRecordDetail extends BaseVoModel {

    private Long userId;

    private String payName;

    private String context;

    private BigDecimal money;

    private String remark;
}