package com.dgdaniel.odoo.app.task;

import com.dgdaniel.odoo.app.BaseMapper;
import com.dgdaniel.odoo.app.user.UsersMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {UsersMapper.class})
public interface TaskMapper extends BaseMapper<Task, TaskDTO> {

}
