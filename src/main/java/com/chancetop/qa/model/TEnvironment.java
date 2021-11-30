package com.chancetop.qa.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class TEnvironment implements Serializable {
    private Long id;

    private Long tProjectId;

    private String name;

    private String owner;

    private String desc;

    private Date createDate;

    private Date updateDate;

    private static final long serialVersionUID = 1L;
}