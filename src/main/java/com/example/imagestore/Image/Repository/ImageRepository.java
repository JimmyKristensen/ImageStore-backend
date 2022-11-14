package com.example.imagestore.Image.Repository;

import com.example.imagestore.Image.Model.Image;
import org.springframework.data.repository.CrudRepository;

public interface ImageRepository extends CrudRepository<Image, Long> {

}
