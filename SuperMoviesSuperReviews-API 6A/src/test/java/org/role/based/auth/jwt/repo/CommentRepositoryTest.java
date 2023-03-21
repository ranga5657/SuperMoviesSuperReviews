package org.role.based.auth.jwt.repo;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.role.based.auth.jwt.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class CommentRepositoryTest {
//	@Autowired
//	private MockMvc mockMvc;
////
//	  @Autowired
//	  private ObjectMapper objectMapper;
////
	@Autowired
	private CommentRepository commentRepository;

	@Test
	@Order(1)
	@Rollback(value = false)
	public void saveCommentTest() {

		Comment employee = Comment.builder().moviename("Vakeel Saab").id((long) 1L).comment("Nice Movie").rating(4L).build();

		//commentRepository.save(employee);
		Assertions.assertThat(employee.getId()).isGreaterThan(0);

		// Assertions.assertThat(employee.getId()).isGreaterThan(0);
	}

	@Test
	//@Order(2)
	public void getCommentByIdTest() {
		List<Comment> employees = commentRepository.findAll();
		System.out.println(employees);
		Comment employee = commentRepository.findById(3L).get();

		Assertions.assertThat(employee.getId()).isEqualTo(3L);

	}

	@Test
	@Order(3)
	public void getListOAllCommentsTest() {

		List<Comment> employees = commentRepository.findAll();
         System.out.println(employees);
		Assertions.assertThat(employees.size()).isGreaterThan(0);

	}

	@Test
	@Order(4)
	@Rollback(value = false)
	public void updateCommentTest() {

		Comment employee = commentRepository.findById((long) 2L).get();

		employee.setMoviename("RRR");
		;

		Comment employeeUpdated = commentRepository.save(employee);

		Assertions.assertThat(employeeUpdated.getMoviename()).isEqualTo("RRR");

	}

//	@Test
//	@Order(5)
//	public void DeleteCommentTest () {
//		commentRepository.deleteById(3L);
//		Assertions.assertThat(commentRepository.existsById(3L)).isFalse();
//	}

}
