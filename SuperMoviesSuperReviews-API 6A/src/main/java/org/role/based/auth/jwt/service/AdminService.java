package org.role.based.auth.jwt.service;
//
import java.util.List;
import java.util.Optional;

//
import javax.transaction.Transactional;

//
import org.role.based.auth.jwt.entity.AdminData;
import org.role.based.auth.jwt.entity.Comment;
import org.role.based.auth.jwt.repo.AdminRepository;
import org.role.based.auth.jwt.repo.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//
//
@Service
@Transactional


public class AdminService {
//	
//
    @Autowired
    AdminRepository adminRepository;
    
	public List<AdminData> fetchBygenreAction;
     
	
	
	//@HystrixCommand(fallbackMethod = "AdminFallback")
    public List<AdminData> listAll() {
        return adminRepository.findAll();
    }
    
    //List<AdminData> listAll();
     
    public void save(AdminData adminData) {
        adminRepository.save(adminData);
   }
//     
    public AdminData get(long id) {
        return adminRepository.findById(id).get();
    }
//    
    public Optional<AdminData> getByGenre(String genre) {
        return adminRepository.findByGenre(genre);
    }
    
//
    public List<AdminData> getByLang(String language) {
        return adminRepository.findByLang(language);
    }
     
//     
    public void delete(long id) {
        adminRepository.deleteById(id);
    }
    
    

	public List<AdminData> save(List<AdminData> movieDatalist) {
		// TODO Auto-generated method stub
		return adminRepository.findAll();
	}
	public AdminData savenewmovie(AdminData adminData) {
        return adminRepository.save(adminData);
    }

	public List<AdminData> getAllmovies()
    {
        return this.adminRepository.findAll();
    }
   
	 public AdminService(AdminRepository repo)
	    {
	        // this keyword refers to current instance
	        this.adminRepository = repo;
	    }
 

}