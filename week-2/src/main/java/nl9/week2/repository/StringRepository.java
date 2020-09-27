package nl9.week2.repository;

import nl9.week2.model.StringModel;
import org.springframework.data.repository.CrudRepository;

public interface StringRepository extends CrudRepository<StringModel, String> {
}
