package com.univerity.diploma.doctoronlie.dto.converter;

import com.reserver.common.starter.data.jpa.basecrud.entity.BaseEntity;
import com.univerity.diploma.doctoronlie.dto.BaseDto;

public interface DtoConverter <E extends BaseEntity, D extends BaseDto>{
    E toEntity(D dto);
    D toDto(E entity);
}
