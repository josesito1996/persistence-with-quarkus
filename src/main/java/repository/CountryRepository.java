package repository;

import entity.Country;

import java.util.List;

public interface CountryRepository {
    List<Country> listPaginated(String continent, String sortField, boolean descending);
}
