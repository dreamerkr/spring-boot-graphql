package com.holy.springbootgraphql.domain;

import lombok.Builder;
import lombok.Data;

/**
 * @author wangzhao
 * @version 1.0
 * @date 2020/2/10 23:13
 * @desc
 */
@Data
@Builder
public class Book {
    private Integer id;
    private String name;
    private Author author;
    private String publisher;
}
