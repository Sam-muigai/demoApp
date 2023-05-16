package sam.spring.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DemoRepository {

    private final List<Tests> testsList = new ArrayList<>(
            List.of(
                    new Tests(1,"Samuel","Samuel is a great software engineer."),
                    new Tests(2,"Muigai","Samuel is a great android engineer."),
                    new Tests(3,"Samuel Kang'au","Samuel is a great backend engineer."),
                    new Tests(4,"Samuel ","Samuel is a great software engineer.")
            )
    );


    public List<Tests> getTestsList(){
        return testsList;
    }

}
