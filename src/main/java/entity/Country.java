package entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.panache.common.Sort;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
@ToString
public class Country extends PanacheEntity {

    public String name;
    public String code;
    public String continent;

    @OneToMany(mappedBy = "country")
    private List<Customer> customers;

    public static List<Country> findByContinent(String continent,
                                                String sortField,
                                                boolean descending) {
        Sort sort = descending ? Sort.by(sortField).descending() : Sort.by(sortField).ascending();
        return find("continent", sort, continent)
                .list();
    }
}
