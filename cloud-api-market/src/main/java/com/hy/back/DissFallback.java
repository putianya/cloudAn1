package com.hy.back;

import com.hy.api.DissApi;
import com.hy.pojo.TbDistributor;
import org.springframework.cloud.openfeign.FallbackFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DissFallback implements FallbackFactory<DissApi> {
    @Override
    public DissApi create(Throwable cause) {
        return new DissApi() {
            @Override
            public List<TbDistributor> findDissByUid(Integer uid) {
                return new ArrayList<TbDistributor>();
                }
            };
        }
    }

