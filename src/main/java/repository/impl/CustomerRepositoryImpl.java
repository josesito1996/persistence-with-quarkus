package repository.impl;

import static util.Constants.DESCENDING;
import static util.Constants.DISTRICT_COLUMN;

import entity.Customer;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Sort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import repository.CustomerRepository;
import repository.PaginatedResponse;

import java.util.List;

@Slf4j
@ApplicationScoped
public class CustomerRepositoryImpl implements CustomerRepository, PanacheRepository<Customer> {

    @Override
    public List<Customer> listAllGeneral() {
        return listAll();
    }

    @Override
    public PaginatedResponse<Customer> listPaginated(Integer pageIndex, Integer pageSize, String sortField) {
        Sort sort = sortField.equalsIgnoreCase(DESCENDING) ?
                Sort.by(DISTRICT_COLUMN).descending() :
                Sort.by(DISTRICT_COLUMN).ascending();
        var query = findAll(sort);
        long totalRecords = query.count();
        int totalPages = (int) Math.ceil((double) totalRecords / pageSize);
        List<Customer> customers = query.page(pageIndex - 1, pageSize).list();
        return new PaginatedResponse<>(customers, totalRecords, totalPages, customers.size());
    }

    @Transactional
    @Override
    public Customer save(Customer customer) {
        persist(customer);
        return customer;
    }


}
