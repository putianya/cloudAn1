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
}
