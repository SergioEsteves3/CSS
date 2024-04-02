package businesslogic;


import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Catalog for submitted themes
 * @author Henrique Vale 58168
 * @author Leonardo Monteiro 58250
 * @author Sergio Esteves 58245
 *
 */
public interface ThemesCatalog extends JpaRepository<Theme, Integer>{
	
}
