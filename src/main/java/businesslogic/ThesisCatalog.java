package businesslogic;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * A catalog for thesis
 * @author Henrique Vale 58168
 * @author Leonardo Monteiro 58250
 * @author Sergio Esteves 58245
 *
 */
public interface ThesisCatalog extends JpaRepository<Thesis, Integer>{

}
