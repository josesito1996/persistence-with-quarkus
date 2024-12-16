package util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Utils {

    public static int getTotalPages(long totalRecords, int pageSize) {
        return (int) Math.ceil((double) totalRecords / pageSize);
    }

}
