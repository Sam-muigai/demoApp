package sam.spring.demo;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface DemoRepository extends ListCrudRepository<Tests,Integer> {


}
