package service.impl;

import entity.Customer;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import repository.CustomerRepository;
import repository.PaginatedResponse;
import service.CustomerService;
import service.request.CustomerRegisterRequest;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@ApplicationScoped
public class CustomerServiceImpl implements CustomerService {

    @Inject
    private CustomerRepository customerRepository;

    @Override
    public List<String> getNames() {
        return customerRepository.listAllGeneral()
                .stream()
                .map(Customer::getName)
                .collect(Collectors.toList());
    }

    @Override
    public PaginatedResponse<String> getNamesPaginated(PaginatedParametersRequest request) {
        PaginatedResponse<Customer> paginatedResponse = customerRepository.listPaginated(request.getPageIndex(),
                request.getPageSize(),
                request.getSortField());
        List<String> customers = paginatedResponse.getData()
                .stream()
                //.peek(customer -> {
                //    log.info("Customer.Country: {}", customer.getCountry().getName());
                //})
                .map(customer -> String.format("%s - %s", customer.getName(),
                        customer.getDistrict()))
                .collect(Collectors.toList());
        return new PaginatedResponse<>(customers, paginatedResponse.getTotalRecords(),
                paginatedResponse.getTotalPages(), paginatedResponse.getElementsPerPage());
    }

    @Override
    public Long save(CustomerRegisterRequest customerRegisterRequest) {
        return customerRepository.save(Customer.builder()
                        .name(customerRegisterRequest.getName())
                        .email(customerRegisterRequest.getEmail())
                        .district(customerRegisterRequest.getDistrict())
                .build()).id;
    }
}
