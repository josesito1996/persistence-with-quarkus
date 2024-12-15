package repository;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class PaginatedResponse<T> {
    private List<T> data;
    private long totalRecords;
    private int totalPages;
    private int elementsPerPage;
}
