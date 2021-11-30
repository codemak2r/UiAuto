package com.chancetop.qa.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class TBrowser implements Serializable {
    private Long id;

    private Long tProjectId;

    private String remoteUrl;

    private String browserName;

    private String browserVersion;

    private String platform;

    private Date createDate;

    private Date updateDate;

    private static final long serialVersionUID = 1L;
}