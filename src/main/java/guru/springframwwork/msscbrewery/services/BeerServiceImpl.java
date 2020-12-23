package guru.springframwwork.msscbrewery.services;

import guru.springframwwork.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeer(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID()).beerName("corona").beerStyle("pale axe").build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {

        beerDto.setId(UUID.randomUUID());
        return beerDto;
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {

    }

    @Override
    public void deleteBeer(UUID beerId) {
       log.debug("deleting a Beer");
    }
}
