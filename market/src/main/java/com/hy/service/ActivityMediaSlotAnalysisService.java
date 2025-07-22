package com.hy.service;

import com.hy.pojo.ActivityAnalysis;
import com.hy.pojo.MediaSlot;
import com.hy.result.PageResult;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public interface ActivityMediaSlotAnalysisService {
    List<String> findContactPoint();

    PageResult<MediaSlot> findMediaSlot(String cid, String point, String orderfield, String ordertype, Integer pageNum, Integer pageSize,String media);

    void mediaSlotDown(HttpServletResponse response, String cid, String point, String orderfield, String ordertype,Integer pageNum,Integer pageSize,String media) throws IOException;

    List<String> findAllMedia();
}
