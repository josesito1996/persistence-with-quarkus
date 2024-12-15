package repository;

import entity.Customer;

import java.util.List;

public interface CustomerRepository {

    List<Customer> listAllGeneral();

    PaginatedResponse<Customer> listPaginated(Integer pageIndex, Integer pageSize, String sortField);

    Customer save(Customer customer);


}
