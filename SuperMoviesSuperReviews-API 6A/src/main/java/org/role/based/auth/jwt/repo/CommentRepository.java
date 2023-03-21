
package org.role.based.auth.jwt.repo;

import java.util.List;
import java.util.Optional;

import org.role.based.auth.jwt.entity.AdminData;
import org.role.based.auth.jwt.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long>{
	
	

	List<Comment> findAll();
	
	@Query(value="SELECT * FROM comments_data cd WHERE cd.rating LIKE '4%' ",nativeQuery=true)
	List<Comment>  getBestMovies();
	
	
	@Query(value="SELECT * FROM comments_data cd WHERE cd.rating LIKE '5%' ",nativeQuery=true)
	List<Comment>  getTrending();
	
    @Query(value="SELECT * FROM comments_data cd WHERE cd.moviename=?#{[0]}",nativeQuery=true)
	
    List<Comment> findBySearchFields(String moviename);

	

     //void save(AdminData adminData);
	

    
	Comment save(List<Comment> getCommentlist);

	Optional<Comment> findbymoviename();

	void deleteById(Comment any);

}
