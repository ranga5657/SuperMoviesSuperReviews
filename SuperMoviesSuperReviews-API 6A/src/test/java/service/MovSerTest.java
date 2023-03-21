package service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.role.based.auth.jwt.entity.AdminData;
import org.role.based.auth.jwt.entity.Comment;
import org.role.based.auth.jwt.repo.AdminRepository;
import org.role.based.auth.jwt.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
@ExtendWith(MockitoExtension.class)

public class MovSerTest {
	

    @Mock
	private AdminRepository Repository;

    @InjectMocks
    private AdminService Service;
	
    private AdminData Movie;
    
    @BeforeEach
	void init() {
		String pattern = "dd/MM/yyyy hh:mm:ss";

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(new Date());
	
		Movie = new AdminData();
		Movie.setId(1L);
		Movie.setAdmin("ranga9");
		Movie.setArtists("pawan kalayan");
		Movie.setCreatedat(date);
		Movie.setDirector("venu sri ram");
		Movie.setGenre("drama");
		Movie.setLang("telugu");
		Movie.setMoviename("vakeel saab");
		Movie.setPicture("https://www.thehansindia.com/h-upload/uid/2112876nnOY78IW0fUCi2irwMxAmGr8vaxkDY2654688.jpg");
		Movie.setProducer("dil raju");
		Movie.setReleasedate("02/08/2020");
		Movie.setSummary("the story of three middle class girls");
		Movie.setWatchMovie("link");

}
    @Test
	void save() {

		when(Repository.save(any(AdminData.class))).thenReturn(Movie);
		
		AdminData newMovie = Service.savenewmovie(Movie);
		
		assertNotNull(newMovie);
		//assertThat(newMovie.getMoviename()).isEqualTo("hello");
	}
    
    @Test
	 void getAllmovies()
	    {
		 Service.getAllmovies();
	        verify(Repository).findAll();
	    }
    


@Test
void findAll_success() {
	
    List<AdminData> all = Repository.findAll();
    
    System.out.println(all);
    
    assertThat(all.size()).isGreaterThanOrEqualTo(1);
}
}









//@Test
//void getMovies() {
//	List<AdminData> list = Repository.findAll();
//	assertThat(list).size().isGreaterThan(0);
//}