package service.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
@ToString
public class CustomerRegisterRequest {

    private String name;

    private String email;

    private String district;

}
