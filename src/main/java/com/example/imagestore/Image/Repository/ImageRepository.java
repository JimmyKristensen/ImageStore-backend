package com.example.imagestore.Image.Repository;

import com.example.imagestore.Image.Model.image;
import org.springframework.data.repository.CrudRepository;

public interface ImageRepository extends CrudRepository<image, Long> {

}
