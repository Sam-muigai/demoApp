package sam.spring.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class DemoController {

    private final DemoRepository repository;

    public DemoController(DemoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String welcome(){
        return "Welcome to Demo application";
    }

    @GetMapping("/tests")
    public List<Tests> getAllTests(){
        return repository.getTestsList();
    }


}
