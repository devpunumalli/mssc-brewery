package guru.springframwwork.msscbrewery.web.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.util.UUID;
/*
created by Devendranth Punumalli on 12/11/2020
 */

@Component
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getBeerName() {
        return beerName;
    }

    public void setBeerName(String beerName) {
        this.beerName = beerName;
    }

    public String getBeerStyle() {
        return beerStyle;
    }

    public void setBeerStyle(String beerStyle) {
        this.beerStyle = beerStyle;
    }

    public Long getUpc() {
        return upc;
    }

    public void setUpc(Long upc) {
        this.upc = upc;
    }

    @Null
    private UUID id;

    @NotEmpty
    private String beerName;

    @NonNull
    private String beerStyle;

    @Positive
    private  Long upc;
}
