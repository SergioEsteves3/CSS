package facade;


import businesslogic.*;
import datatypes.Masters;
import jakarta.persistence.Entity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Set;


@SpringBootApplication
@EnableJpaRepositories("businesslogic")
@ComponentScan("businesslogic")
@EntityScan("businesslogic")
public class TMApp {

    private static final Logger log = LoggerFactory.getLogger(facade.TMApp.class);

    public static void main(String[] args) {
        SpringApplication.run(facade.TMApp.class, args);
    }

   /** @Bean
    public CommandLineRunner demo(CounselorsCatalog counselors, StudentsCatalog students, DiscussionCatalog discussion, ThesisCatalog thesis, ThemesCatalog themes, ClassroomCatalog classrooms, ApplicationCatalog applications) {
        return (args) -> {
        /**    Set<Masters> masters = Set.of(Masters.BIOLOGY, Masters.LAW);

            Counselor jack = new Faculty("Jack");
            Counselor jim = new Faculty(("Jim"));
            Set <Counselor> cl = Set.of (jack,jim);
            counselors.save(jack);
            counselors.save(jim);

            Student jane = new Student("Jane",12.5,Masters.BIOLOGY);
            students.save(jane);

            Theme theme = new Theme("Theme","desc", masters,12.5,jack);
            themes.save(theme);

            Application appl = new Application(jane,true,12.5, List.of(theme));
            applications.save(appl);

            Thesis thes = new Dissertation(null, jim, theme, jane);
            thesis.save(thes);

            Classroom room = new Classroom(12);
            classrooms.save(room);

            Discussion disc= new InPerson(false,0,thes, new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis()), cl, room );
            discussion.save(disc);
        };
    }**/

}