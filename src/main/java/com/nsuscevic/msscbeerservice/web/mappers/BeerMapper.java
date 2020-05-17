package com.nsuscevic.msscbeerservice.web.mappers;

import com.nsuscevic.msscbeerservice.domain.Beer;
import com.nsuscevic.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = { DateMapper.class })
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDto beerDto);
    BeerDto beerToBeerDto(Beer beer);

}
