package businesslogic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * A catalog for discussion classrooms
 * @author Henrique Vale 58168
 * @author Leonardo Monteiro 58250
 * @author Sergio Esteves 58245
 *
 */

@Component
public interface ClassroomCatalog extends JpaRepository<Classroom, Integer>{

}
