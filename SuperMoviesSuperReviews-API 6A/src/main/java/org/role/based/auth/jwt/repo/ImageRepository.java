package org.role.based.auth.jwt.repo;

import java.util.List;
import java.util.Optional;

import org.role.based.auth.jwt.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

//import com.techgeeknext.entities.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
	
	List<Image> findAll();
	Image findById(int id);
	int deleteById(int id);
	Optional<Image> findByfilename(String filename);
	
	//Optional<Image> findByName(String name);
	
	
}
