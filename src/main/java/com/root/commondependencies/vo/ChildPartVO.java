package com.root.commondependencies.vo;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class ChildPartVO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L ;

    private String childPartName;
    private String childPartSeries;
    private Integer childPartOpeningStock;
}
