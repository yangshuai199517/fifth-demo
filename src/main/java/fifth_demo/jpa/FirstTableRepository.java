package fifth_demo.jpa;

import org.springframework.data.repository.CrudRepository;

public interface FirstTableRepository extends CrudRepository<FirstTable,Long> {

    FirstTable findByName(String name);

}
