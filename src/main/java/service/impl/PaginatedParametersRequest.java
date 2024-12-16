package service.impl;

import jakarta.ws.rs.QueryParam;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
public class PaginatedParametersRequest {

    @QueryParam("pageIndex")
    @Parameter(description = "Page index", example = "1")
    private int pageIndex;

    @QueryParam("pageSize")
    @Parameter(description = "Page size", example = "5")
    private int pageSize;

    @QueryParam("sortOrder")
    @Parameter(description = "Sort order", example = "asc|desc")
    private String sortField;

}
