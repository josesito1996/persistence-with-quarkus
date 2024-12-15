package controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import service.CountryService;

import java.util.List;

@Path("/api-country")
public class CountryController {

    @Inject
    private CountryService countryService;

    @GET
    @Path("/namesPaginated")
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> getNamesPaginated(@QueryParam("continent") String continent,
                                          @QueryParam("sortField") String sortField,
                                          @QueryParam("descending") boolean descending) {
        return countryService.getNames(continent, sortField, descending);
    }

}
