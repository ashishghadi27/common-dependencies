package com.root.commondependencies.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DefaultResponseVO {

    private String statusCode;
    private String message;

}
