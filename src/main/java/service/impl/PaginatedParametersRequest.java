package service.impl;

import jakarta.ws.rs.QueryParam;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
public class PaginatedParametersRequest {

    @QueryParam("pageIndex")
    private int pageIndex;

    @QueryParam("pageSize")
    private int pageSize;

    @QueryParam("sortOrder")
    private String sortField;

}
