package com.dgdaniel.odoo.app.user;

import com.dgdaniel.odoo.app.BaseMapper;
import com.dgdaniel.odoo.app.task.TaskMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {TaskMapper.class})
public interface UsersMapper extends BaseMapper<Users, UsersDTO> {

}
