package repository.impl;

import entity.Country;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.extern.slf4j.Slf4j;
import repository.CountryRepository;

import java.util.List;

@Slf4j
@ApplicationScoped
public class CountryRepositoryImpl implements CountryRepository {

    @Override
    public List<Country> listPaginated(String continent, String sortField, boolean descending) {
        return Country.findByContinent(continent, sortField, descending);
    }
}
