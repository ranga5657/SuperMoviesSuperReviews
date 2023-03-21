package org.role.based.auth.jwt.service;

import java.util.List;

import org.role.based.auth.jwt.entity.AdminData;
import org.role.based.auth.jwt.entity.Comment;
import org.role.based.auth.jwt.repo.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;


@Service

@RequiredArgsConstructor
public class CommentService {
	
	
	 @Autowired
	    CommentRepository commentRepository;
	 
	 
	 
	 
	
	//UPDATED SERVICE CLASS FOR TEST CASES 
	 public List<Comment> getAllComments()
	    {
	        return this.commentRepository.findAll();
	    }
	   
	 public CommentService(CommentRepository repo)
	    {
	        // this keyword refers to current instance
	        this.commentRepository = repo;
	    }
	 
	 public Comment getMovieById(Long id) {
			return commentRepository.findById(id).orElseThrow(() -> new RuntimeException("comment found for the id "+id));	
		}
	 
	 public void deletecomment(Long id) {
			Comment existingMovie = commentRepository.findById(id).get();
			commentRepository.delete(existingMovie);
			
		}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 //PREVIOUS SERVICE CLASS FROM HERE
	 public List<Comment> listAll() {
	        return commentRepository.findAll();
	 }
	 	   // public void save(Comment comment) {
	       // commentRepository.save(comment);
	   // }
	 
	    public Comment save(Comment comment) {
	    	return commentRepository.save(comment);
			//return null;
	    }

	    
	    
	    public void delete(Long id) {
	    	
	        commentRepository.deleteById(id);
	    }
	    
	    
	    
	    public Comment get(Long id) {
	        return commentRepository.findById(id).get();
	    }
	    
	    

	    public List<Comment> getByLang(String moviename) {
	        return commentRepository.findBySearchFields(moviename);
	    }
	    
	    }
