package com.dgdaniel.odoo.app;

import java.util.List;

public interface BaseMapper <Entity, Dto>{

    Dto toDto(Entity entity);
    List<Dto> toDto(List<Entity> entities);

    Entity toEntity(Dto dto);
    List<Entity> toEntity(List<Dto> dtos);
}
