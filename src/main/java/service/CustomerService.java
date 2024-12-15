package service;

import repository.PaginatedResponse;
import service.impl.PaginatedParametersRequest;
import service.request.CustomerRegisterRequest;

import java.util.List;


public interface CustomerService {

    List<String> getNames();

    PaginatedResponse<String> getNamesPaginated(PaginatedParametersRequest paginatedParametersRequest);

    Long save(CustomerRegisterRequest customerRegisterRequest);
}
