package com.dgdaniel.odoo.app.task;

import com.dgdaniel.odoo.app.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskMapper extends BaseMapper<Task, TaskDTO> {

}
