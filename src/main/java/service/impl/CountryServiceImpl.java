package service.impl;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import repository.CountryRepository;
import service.CountryService;

import java.util.List;

@Slf4j
@ApplicationScoped
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    @Override
    public List<String> getNames(String continent, String sortField, boolean descending) {
        return countryRepository.listPaginated(continent, sortField, descending)
                .stream()
                .map(country -> String.format("%s - %s", country.getName(), country.getContinent()))
                .toList();
    }
}
