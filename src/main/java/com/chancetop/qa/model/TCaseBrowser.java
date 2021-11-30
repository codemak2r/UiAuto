package com.chancetop.qa.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class TCaseBrowser implements Serializable {
    private Long id;

    private Long tProjectId;

    private Long tBrowserId;

    private Long tCaseId;

    private static final long serialVersionUID = 1L;
}