package Elderly.People.Project;

import java.util.logging.Logger;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ElderlyPeopleApplication {
    private static final Logger log = Logger.getLogger(ElderlyPeopleApplication.class.getName());

    public static void main(String[] args) {
        new SpringApplicationBuilder(ElderlyPeopleApplication.class).run(args);
    }
}