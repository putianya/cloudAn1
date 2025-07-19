package com.hy.service;

import com.hy.pojo.ActivityAnalysis;
import com.hy.pojo.MediaSlot;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public interface ActivityMediaSlotAnalysisService {
    List<String> findContactPoint();

    List<MediaSlot> findMediaSlot(String cid, String point, String orderfield, String ordertype);

    void mediaSlotDown(HttpServletResponse response, String cid, String point, String orderfield, String ordertype) throws IOException;
}
