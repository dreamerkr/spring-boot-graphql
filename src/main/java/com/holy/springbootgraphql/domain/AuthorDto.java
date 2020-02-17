package com.holy.springbootgraphql.domain;

import lombok.Data;

/**
 * @author wangzhao
 * @version 1.0
 * @date 2020/2/11 10:19
 * @desc
 */
@Data
public class AuthorDto {
    private String id;
    private String name;
    private String thumbnail;
}
