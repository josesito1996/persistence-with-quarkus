package repository;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class PaginatedResponse<T> {
    private List<T> data;

    @Schema(description = "Total records")
    private Long totalRecords;

    @Schema(description = "Total pages")
    private Integer totalPages;

    @Schema(description = "Elements per page", minimum = "0", maximum = "150")
    private Integer elementsPerPage;
}
