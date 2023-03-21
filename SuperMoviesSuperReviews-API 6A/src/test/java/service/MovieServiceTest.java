package service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.role.based.auth.jwt.controller.CommentController;
import org.role.based.auth.jwt.entity.Comment;
import org.role.based.auth.jwt.repo.AdminRepository;
import org.role.based.auth.jwt.service.AdminService;
import org.role.based.auth.jwt.service.CommentService;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//@ActiveProfiles("test")
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = RoleBasedAuthApplication.class)
public class MovieServiceTest {
	//@Mock private AdminRepository adminRepositorytest;
	 
    //private AdminService adminServicetest;
 
//    @BeforeEach void setUp()
//    {
//        this.adminServicetest
//            = new AdminService(this.adminRepositorytest);
//    }
// 
//    @Test void findall()
//    {
//    	adminServicetest.listAll();
//        verify(adminRepositorytest).findAll();
//    }
//  @Test
//	@SuppressWarnings("unchecked")
//	public void usingMockito() {
//		CommentService todoService = mock(CommentService.class);
//		List<String> allTodos = Arrays.asList("Learn Spring MVC",
//				"Learn Spring", "Learn to Dance");
//		when(todoService.getmoviename("Ranga")).thenReturn((Comment) allTodos);
//		//TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
//		CommentController controller = new CommentController();
//		List<String> todos = (List<String>) controller.getAllComments();
//		assertEquals(2, todos.size());
//	}
	
	@Test
	public void letsMockListSize() {
		List list = mock(List.class);
		when(list.size()).thenReturn(10);
		assertEquals(10, list.size());
	}
	@Test
	public void letsMockListGet() {
		List<String> list = mock(List.class);
		when(list.get(0)).thenReturn("in28Minutes");
		assertEquals("in28Minutes", list.get(0));
		assertNull(list.get(1));
	}


}
