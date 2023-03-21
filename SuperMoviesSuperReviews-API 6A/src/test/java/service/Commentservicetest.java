package service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.role.based.auth.jwt.entity.Comment;
import org.role.based.auth.jwt.repo.CommentRepository;
import org.role.based.auth.jwt.service.CommentService;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class Commentservicetest {
	
	 @Mock private CommentRepository commentRepository;
    private CommentService commentService;
 
    @BeforeEach void setUp()
    {
        this.commentService
     = new CommentService(this.commentRepository);
    }
    @Test 
    void getAllPerson()
    {
    	commentService.getAllComments();
        verify(commentRepository).findAll();
    }
    @Test
	void getMovies() {
    	List<Comment> movieDatalist=commentService.getAllComments();
    	System.out.println(movieDatalist);
when(commentRepository.findAll()).thenReturn(movieDatalist);
		
		List<Comment> comments = commentService.getAllComments();
		
	//assertEquals(2, comments.size());
		assertNotNull(comments);
    }
}
