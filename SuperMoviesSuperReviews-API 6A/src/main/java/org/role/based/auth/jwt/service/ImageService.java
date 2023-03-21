package org.role.based.auth.jwt.service;

import java.util.List;

import javax.transaction.Transactional;

import org.role.based.auth.jwt.entity.Image;
import org.role.based.auth.jwt.repo.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.super6.movies.model.Image;
//import org.super6.movies.repository.ImageRepository;


@Service
@Transactional
public class ImageService {
	

    @Autowired
    private ImageRepository imageRepository;
     
    public List<Image> listAll() {
        return imageRepository.findAll();
    }
     
    public void save(Image movie) {
        imageRepository.save(movie);
    }
     
    public Image get(long id) {
        return imageRepository.findById(id).get();
    }
     
    public void delete(long id) {
        imageRepository.deleteById(id);
    }

}
