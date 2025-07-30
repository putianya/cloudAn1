package com.hy.scheduer;

import com.alibaba.nacos.shaded.org.checkerframework.checker.units.qual.A;
import com.hy.pojo.ActivityAnalysis;
import com.hy.pojo.CpmEx;
import com.hy.service.ActivityService;
import com.hy.service.CpmExService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Component
public class CpmScheduer {

    @Autowired
    private ActivityService activityService;
    @Autowired
    private CpmExService cpmExService;
    //编写一个定时器任务
    @Scheduled(cron = "1 * * * * *")
        public void taskCpm(){
          List<ActivityAnalysis> list= activityService.findActivityCpm();
        //判断当前cpm的闽值是否符合条件
        list.stream().forEach((x)->{
            if(x.getCpm().intValue()>70000){
                //复制需要增加的数据
                CpmEx ex =new CpmEx();
                ex.setCpm(x.getCpm().longValue());
                ex.setCid(Integer.parseInt(x.getCampaignId()));
                ex.setCpmDate(new Date());
                ex.setCname(x.getCampaignName());
                ex.setCpmDiff(x.getCpm().subtract(new BigDecimal(70000)).longValue());
                ex.setStauts("0");
                //全是不符合条件的数据
                // 把不符合条件的数据存放到cpm异常表中
                cpmExService.insertCpmEx(ex);
                System.out.println(x.getCampaignId()+":出现异常，已经插入异常表");

            }
        });
    }
}
