package com.holy.springbootgraphql.domain;

import lombok.Data;

/**
 * @author wangzhao
 * @version 1.0
 * @date 2020/2/11 10:17
 * @desc
 */
@Data
public class Post {
    private String id;
    private String title;
    private String text;
    private String category;
    private String authorId;
}
