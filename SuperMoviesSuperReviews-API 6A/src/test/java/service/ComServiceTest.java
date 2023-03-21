package service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
//import org.role.based.auth.jwt.entity.AdminData;
import org.role.based.auth.jwt.entity.Comment;
import org.role.based.auth.jwt.repo.CommentRepository;
import org.role.based.auth.jwt.service.CommentService;


@ExtendWith(MockitoExtension.class)

public class ComServiceTest {
	
	
	@Mock
	private CommentRepository Repository;
	
	@InjectMocks
	private CommentService Service;
	
     private Comment comment;
     
     private Comment comment1;
     
	@BeforeEach
	void init() {
		String pattern = "dd/MM/yyyy hh:mm:ss";

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(new Date());
	
		comment = new Comment();
		//comment.setId(1L);
		comment.setMoviename("hello");
		comment.setComment("good");
		comment.setRating(4);
		//comment.setCreatedat(date);
		//comment.setUpdatedat(date);
		
		comment1 = new Comment();
		//comment1.setId(2L);
		comment1.setMoviename("hello");
		comment1.setComment("good");
		comment1.setRating(4);
		//comment1.setCreatedat(date);
		//comment1.setUpdatedat(date);
	}
	@Test
	void save() {

		when(Repository.save(any(Comment.class))).thenReturn(comment);
		
		Comment newMovie = Service.save(comment);
		
		assertNotNull(newMovie);
		assertThat(newMovie.getMoviename()).isEqualTo("hello");
	}
	
        
	@Test
	void getComments() {
		
	
	List<Comment> commentlist = new ArrayList<>();
	commentlist.add(comment);
    commentlist.add(comment1);

		when(Repository.findAll()).thenReturn(commentlist);
		
	List<Comment> comments = Service.getAllComments();
		
	     assertEquals(2, comments.size());
		assertNotNull(comments);
	}
	
	
	@Test
	 void getAllcomments()
	    {
		 Service.getAllComments();
	        verify(Repository).findAll();
	    }
	
	
//	
//	@Test
//	void getcommentById() {
//		
//		when(Repository.findById(3L).thenReturn(Optional.of(comment);
//		//Comment existingMoviecomment = Service.getMovieById(comment.getId());
//		Comment existingMoviecomment = Service.getMovieById(comment.getId());
//		assertNotNull(existingMoviecomment);
//		assertThat(existingMoviecomment.getId()).isNotEqualTo(null);
//	}

	@SuppressWarnings("unused")
	@Test
	//@Order(2)
	public void getCommentByIdTest() {
		List<Comment> employees = Repository.findAll();
		System.out.println(employees);
		Comment employee = Repository.findById(3L).get();

		Assertions.assertThat(employee.getId()).isEqualTo(3L);

	}

	
//	@Test
//	void deletecomment() {
//		
//		Long Id = 1L;
//		when(Repository.findById(anyLong())).thenReturn(Optional.of(comment));
//		doNothing().when(Repository).deleteById(any(Comment.class));
//		
//		Service.deletecomment(Id);
//		
//		verify(Repository, times(1)).delete(comment);
//		
//	}
//		
}
