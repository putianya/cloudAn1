package com.hy.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {

    private String code;    //1           2
    private String message; //操作成功      > data;   //数据操作失败
    private Object data; //数据集合

    public Result(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
