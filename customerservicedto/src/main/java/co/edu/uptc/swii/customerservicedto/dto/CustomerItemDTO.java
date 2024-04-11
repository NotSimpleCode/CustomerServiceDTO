package co.edu.uptc.swii.customerservicedto.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerItemDTO {

    private Integer id;
    private String firsName;
    private String lastName;
    private String address;
}
