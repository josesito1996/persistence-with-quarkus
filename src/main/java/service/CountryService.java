package service;

import java.util.List;


public interface CountryService {

    List<String> getNames(String continent, String sortField, boolean descending);

}
