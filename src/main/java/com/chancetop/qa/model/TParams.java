package com.chancetop.qa.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class TParams implements Serializable {
    private Long id;

    private Long tEnvId;

    private Long tProjectId;

    private String key;

    private String val;

    private Date createDate;

    private Date updateDate;

    private static final long serialVersionUID = 1L;
}