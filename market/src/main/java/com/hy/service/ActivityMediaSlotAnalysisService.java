package com.hy.service;

import com.hy.pojo.ActivityAnalysis;
import com.hy.pojo.MediaSlot;
import com.hy.pojo.PlatBean;
import com.hy.result.PageResult;
import com.hy.result.ResultMediaSlot;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

public interface ActivityMediaSlotAnalysisService {


    List<String> findContactPoint();

    PageResult<MediaSlot> findMediaSlot(ResultMediaSlot slot);

    void mediaSlotDown(HttpServletResponse response,ResultMediaSlot slot) throws IOException;

    List<String> findAllMedia();

    void contactPointDown(HttpServletResponse response, ResultMediaSlot slot ) throws IOException;


    Map<String, Map<String, List<PlatBean>>> platformDeliveryComparison(String cidA, String cidB, String filed);

    void platformDeliveryComparisonDownload(HttpServletResponse response, String cidA, String cidB, String filed) throws Exception;

    Map<String, Map<String, List<PlatBean>>> distributionOfSubMediaPlatforms(String cidA, String cidB, String filed);

    void distributionOfSubMediaPlatformsDownload(HttpServletResponse response, String cidA, String cidB, String filed) throws Exception;

    Map<String, Map<String, List<PlatBean>>> contactTypeComposition(String cidA, String cidB, String filed);

    void contactTypeCompositionDownload(HttpServletResponse response, String cidA, String cidB, String filed) throws Exception;

    Map<String, List<PlatBean>> contactDistribution(String cidA, String cidB, String filed,String media);

    void contactDistributionDownload(HttpServletResponse response, String cidA, String cidB, String filed, String media) throws  Exception;
}
