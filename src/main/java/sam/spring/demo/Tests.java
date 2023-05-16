package sam.spring.demo;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tests {

    private Integer Id;

    private String name;

    private String description;

    public Tests(){

    }

    public Tests(Integer id, String name, String description) {
        Id = id;
        this.name = name;
        this.description = description;
    }
}
