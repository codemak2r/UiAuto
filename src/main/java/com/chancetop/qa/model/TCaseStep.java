package com.chancetop.qa.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class TCaseStep implements Serializable {
    private Long id;

    private Long tProjectId;

    private Long tCaseId;

    private String action;

    private String selector;

    private String element;

    private String value;

    private static final long serialVersionUID = 1L;
}