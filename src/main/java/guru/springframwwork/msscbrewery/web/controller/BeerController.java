package guru.springframwwork.msscbrewery.web.controller;


import guru.springframwwork.msscbrewery.services.BeerService;
import guru.springframwwork.msscbrewery.web.model.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/*
created by Dp on 12/11/2020
 */
@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable(name = "beerId") UUID beerId){
        return new ResponseEntity<>(beerService.getBeer(beerId), HttpStatus.OK);

    }
    @PostMapping
    public ResponseEntity handlePost( @RequestBody @Valid BeerDto beerDto){
        BeerDto dto= beerService.saveNewBeer(beerDto);
        HttpHeaders headers=new HttpHeaders();
        //todo Add hostname to url)
        headers.add( "Location", "/api/v1/beer/" + dto.getId().toString());
        return new ResponseEntity(headers,HttpStatus.CREATED);

    }

    @PutMapping({"/{beerId}"})
    public ResponseEntity handleUpdate(@PathVariable(name = "beerId") UUID beerId,@Valid @RequestBody BeerDto beerDto){

        beerService.updateBeer(beerId,beerDto);
        return  new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{beerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable(name = "beerId") UUID beerId){
        beerService.deleteBeer(beerId);
    }


}



