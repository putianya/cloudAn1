package com.hy.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResult<T> {
    private Integer pageNum; // 当前页码
    private Integer pageSize; // 每页显示条数
    private List<T> list; // 数据列表
    private Long total; // 总记录数


}
