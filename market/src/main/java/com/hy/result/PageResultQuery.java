package com.hy.result;

import lombok.Data;

import java.util.List;

@Data
public class PageResultQuery {

    private Integer pageNum;
    private Integer pageSize;
    private String cname;
    private List<String> medias ;
    private List<String> content;
    private List<String> contentDirection;
}
