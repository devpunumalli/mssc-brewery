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
@Data
public class BeerDto {


    @Null
    private UUID id;

    @NotEmpty
    private String beerName;

    @NonNull
    private String beerStyle;

    @Positive
    private  Long upc;
}
