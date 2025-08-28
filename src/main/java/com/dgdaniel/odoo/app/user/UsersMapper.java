package com.dgdaniel.odoo.app.user;

import com.dgdaniel.odoo.app.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsersMapper extends BaseMapper<Users, UsersDTO> {

}
