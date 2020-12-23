package guru.springframwwork.msscbrewery.web.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.validation.constraints.*;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Component
public class CustomerDto {


    private UUID id;

    @NotBlank
    @Size(min = 4,max=10)
    private String name;

}
