package controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import repository.PaginatedResponse;
import service.CustomerService;
import service.impl.PaginatedParametersRequest;
import service.request.CustomerRegisterRequest;

import java.util.List;

@Path("/api-customer")
public class CustomerController {

    @Inject
    private CustomerService customerService;

    @POST
    @Path("/save")
    public Long create(CustomerRegisterRequest customerRegisterRequest) {
        return customerService.save(customerRegisterRequest);
    }

    @GET
    @Path("/names")
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> getNames() {
        return customerService.getNames();
    }

    @GET
    @Path("/namesPaginated")
    @Produces(MediaType.APPLICATION_JSON)
    public PaginatedResponse<String> getNamesPaginated(@BeanParam PaginatedParametersRequest paginatedParametersRequest) {
        return customerService.getNamesPaginated(paginatedParametersRequest);
    }

}
