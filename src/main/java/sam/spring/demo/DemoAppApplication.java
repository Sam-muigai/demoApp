package sam.spring.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoAppApplication implements CommandLineRunner {

    private final DemoRepository repository;

    public DemoAppApplication(DemoRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoAppApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Tests example = new Tests(null,"Samuel","I love coding");
        if (repository.count() == 0){
            repository.save(example);
        }
     }

}
