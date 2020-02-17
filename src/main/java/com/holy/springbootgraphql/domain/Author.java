package com.holy.springbootgraphql.domain;

import lombok.Builder;
import lombok.Data;

/**
 * @author wangzhao
 * @version 1.0
 * @date 2020/2/10 23:10
 * @desc
 */
@Data
@Builder
public class Author {
    private Integer id;
    private String name;
    private Integer age;
}
