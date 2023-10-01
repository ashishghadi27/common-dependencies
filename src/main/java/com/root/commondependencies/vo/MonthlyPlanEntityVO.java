package com.root.commondependencies.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class MonthlyPlanEntityVO {
    private Long id;
    private Long productId;
    private int week1;
    private int week2;
    private int week3;
    private int week4;
    private Date creationDate;
    private Date updationDate;

}
