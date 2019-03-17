package com.taobao.ems.server.request;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Data
public class ArticleRequest implements Serializable {

    private String title;

    private String summary;

    private String smallContent;

    private String content;
}
