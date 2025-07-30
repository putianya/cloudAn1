package com.hy.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.write.style.HorizontalCellStyleStrategy;
import com.alibaba.nacos.shaded.org.checkerframework.checker.units.qual.A;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hy.exceltemp.ActivityKolGroupExcel;
import com.hy.mapper.ActivityKolGroupMapper;
import com.hy.pojo.ActivityKolGroup;
import com.hy.result.PageResult;
import com.hy.result.PageResultQuery;
import com.hy.service.ActivityKolGroupService;
import com.hy.utils.ExcelUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ActivityKolGroupServiceImpl implements ActivityKolGroupService {
    @Autowired
    private ActivityKolGroupMapper activityKolGroupMapper;

    @Override
    public PageResult<ActivityKolGroup> findActivityKolGroup(PageResultQuery query) {
        PageHelper.startPage(query.getPageNum(), query.getPageSize());
        List<ActivityKolGroup> list=activityKolGroupMapper.findActivityKolGroup(query);
        PageInfo<ActivityKolGroup> info = new PageInfo<>(list);
        return new PageResult<>(info.getPageNum(),info.getPageSize(),info.getList(),info.getTotal());
    }

    @Override
    public void findActivityKolGroupDownload(HttpServletResponse response, PageResultQuery query) throws IOException {
        // 根据查询条件查询分活动分帖子列表
        PageResult<ActivityKolGroup> page = findActivityKolGroup(query);
        // 获取分活动分帖子列表
        List<ActivityKolGroup> list = page.getList();
        // 将分活动分帖子列表转换为分活动分帖子Excel列表
        List<ActivityKolGroupExcel> collection=list.stream().map((x)->{
            ActivityKolGroupExcel excel=new ActivityKolGroupExcel();
            // 将分活动分帖子对象属性复制到分活动分帖子Excel对象中
            BeanUtils.copyProperties(x,excel);
            return excel;
        }).collect(Collectors.toList());
        // 生成文件名
        String filename = System.currentTimeMillis() + "";
        // 获取水平单元格样式策略
        HorizontalCellStyleStrategy horizontalCellStyleStrategy = ExcelUtil.getHorizontalCellStyleStrategy(response,filename);
        // 使用EasyExcel将分活动分帖子Excel列表写入响应输出流中
        EasyExcel.write(response.getOutputStream(), ActivityKolGroupExcel.class)
                // 注册水平单元格样式策略
                .registerWriteHandler(horizontalCellStyleStrategy)
                // 设置工作表名称
                .sheet("分活动分帖子")
                // 执行写入操作
                .doWrite(collection);
    }
}
