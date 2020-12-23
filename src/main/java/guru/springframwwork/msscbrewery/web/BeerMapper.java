package guru.springframwwork.msscbrewery.web;

import guru.springframwwork.msscbrewery.web.domain.Beer;
import guru.springframwwork.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    public Beer BeerDtoToBeer(BeerDto beerDto);

    public BeerDto BeerToBeerDto(Beer beer);
}
