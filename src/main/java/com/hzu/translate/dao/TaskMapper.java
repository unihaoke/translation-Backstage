package com.hzu.translate.dao;

import com.hzu.translate.entity.Task;
import com.hzu.translate.entity.TaskWithBLOBs;

public interface TaskMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TaskWithBLOBs record);

    int insertSelective(TaskWithBLOBs record);

    TaskWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TaskWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TaskWithBLOBs record);

    int updateByPrimaryKey(Task record);
}