package org.role.based.auth.jwt.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.role.based.auth.jwt.entity.AdminData;
import org.role.based.auth.jwt.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import com.fasterxml.jackson.databind.*;
import com.jayway.jsonpath.JsonPath;

//@ContextConfiguration(classes = {MoviesCrudController.class})
public class Moviecrudcontrollertest {

	@MockBean
	private AdminService adminService;
	@Autowired
	private MockMvc mockMvc;
	@Autowired
	private ObjectMapper ObjectMapper;
	@Test
	void postnewmovie() throws Exception {
		AdminData newmovie=new AdminData();
		newmovie.setMoviename("Vakeel saab");

		newmovie.setArtists("pawan kalyan");
		newmovie.setAdmin("sandip1");

		newmovie.setCreatedat("date");
		newmovie.setDirector("venu sri ram");
		newmovie.setGenre("drama");
		newmovie.setLang("telugu");
		
		//newmovie.setPicture();
		newmovie.setProducer("dil raju");
		//newmovie.setReleasedate();
		newmovie.setSummary("a drama played by three girls");
//		newmovie.setUpdatedat(Date);
//		adminservice.setUpdatedat(date);
//		newmovie.setWatchMovie(movieDetails.getWatchMovie());
//		
//		Mockito.when(adminService.save(newmovie)).thenReturn(newmovie);
//
//		this.mockMvc.perform(post("/create/movie")
//				.contentType(MediaType.APPLICATION_JSON)
//				.content(ObjectMapper.writeValueAsString(newmovie)))
//		        .andExpect(jsonpath("$.Moviename",newmovie.getMoviename()));
//		       
}
	
	
}
