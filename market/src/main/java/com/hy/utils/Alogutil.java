package com.hy.utils;

import com.hy.pojo.Alog;
import com.hy.pojo.AlogAvg;
import com.hy.pojo.AlogDiff;

public class Alogutil {
    //获取差值指标
    public static AlogDiff getAlogDiff(Alog alog, AlogAvg alogAvg)
    {
        AlogDiff diff = new AlogDiff();
        diff.setCpmDiff(alog.getCpm().subtract(alogAvg.getCpmAvg()));
        diff.setCacDiff(alog.getCac().subtract(alogAvg.getCacAvg()));
        diff.setRoiDiff(alog.getRoi().subtract(alogAvg.getRoiAvg()));
        diff.setMamcGmvRateDiff(alog.getMamcGmvRate().subtract(alogAvg.getMamcGmvRateAvg()));
        diff.setMamcRateDiff(alog.getMamcRate().subtract(alogAvg.getMamcRateAvg()));
        diff.setMasmRateDiff(alog.getMasmRate().subtract(alogAvg.getMasmRateAvg()));
        diff.setMpcmaGmvDiff(alog.getMpcmaGmv().subtract(alogAvg.getMpcmaGmvAvg()));
        diff.setMrrRateDiff(alog.getMrrRate().subtract(alogAvg.getMrrRateAvg()));
        diff.setNmcGmvRateDiff(alog.getNmcGmvRate().subtract(alogAvg.getNmcGmvRateAvg()));
        diff.setNmcRateDiff(alog.getNmcRate().subtract(alogAvg.getNmcRateAvg()));
        diff.setRnmRoiDiff(alog.getRnmRoi().subtract(alogAvg.getRnmRoiAvg()));
        diff.setRnmCacDiff(alog.getRnmCac().subtract(alogAvg.getRnmCacAvg()));
        diff.setPcmaGmvDiff(alog.getPcmaGmv().subtract(alogAvg.getPcmaGmvAvg()));
        diff.setPcnGmvDiff(alog.getPcnGmv().subtract(alogAvg.getPcnGmvAvg()));
        diff.setPanGmvDiff(alog.getPanGmv().subtract(alogAvg.getPanGmvAvg()));
        return diff;
    }

    //计算两个活动的计算指标差值
    public static AlogDiff getAlogDiffTwo(Alog alogA, Alog alogB)
    {
        AlogDiff diff = new AlogDiff();
        diff.setCpmDiff(alogA.getCpm().subtract(alogB.getCpm()));
        diff.setCacDiff(alogA.getCac().subtract(alogB.getCac()));
        diff.setRoiDiff(alogA.getRoi().subtract(alogB.getRoi()));
        diff.setMamcGmvRateDiff(alogA.getMamcGmvRate().subtract(alogB.getMamcGmvRate()));
        diff.setMamcRateDiff(alogA.getMamcRate().subtract(alogB.getMamcRate()));
        diff.setMasmRateDiff(alogA.getMasmRate().subtract(alogB.getMasmRate()));
        diff.setMpcmaGmvDiff(alogA.getMpcmaGmv().subtract(alogB.getMpcmaGmv()));
        diff.setMrrRateDiff(alogA.getMrrRate().subtract(alogB.getMrrRate()));
        diff.setNmcGmvRateDiff(alogA.getNmcGmvRate().subtract(alogB.getNmcGmvRate()));
        diff.setNmcRateDiff(alogA.getNmcRate().subtract(alogB.getNmcRate()));
        diff.setRnmRoiDiff(alogA.getRnmRoi().subtract(alogB.getRnmRoi()));
        diff.setRnmCacDiff(alogA.getRnmCac().subtract(alogB.getRnmCac()));
        diff.setPcmaGmvDiff(alogA.getPcmaGmv().subtract(alogB.getPcmaGmv()));
        diff.setPcnGmvDiff(alogA.getPcnGmv().subtract(alogB.getPcnGmv()));
        diff.setPanGmvDiff(alogA.getPanGmv().subtract(alogB.getPanGmv()));
        return diff;
    }


}
