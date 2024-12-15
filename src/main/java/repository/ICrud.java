package repository;

import java.util.List;

public interface ICrud <T>{

    List<T> listAllGeneral();

    T saveGeneral(T t);

}
