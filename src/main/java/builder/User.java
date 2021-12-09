package builder;

import lombok.Builder;
import lombok.ToString;

import java.util.List;

@Builder @ToString
public class User {
    private String name;
    private int age;
    private String gender;
    private int weight;
    private int height;
    private String city;
    private String race;
    private List<String> occupations;
}
