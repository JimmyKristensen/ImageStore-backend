package com.example.imagestore.Image.Service;

import com.example.imagestore.Image.Model.image;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ImageService {
    private final CrudRepository<image, Long> repository;
    public ImageService(CrudRepository<image, Long> repository){
        this.repository = repository;
    }

    public Iterable<image> findAll() {
        return repository.findAll();
    }

    public Optional<image> find(Long id) {
        return repository.findById(id);
    }

    public image create(image image) {
        return repository.save(image);
    }

    public image update(Long id, image image) {
        return repository.save(image);
    }

    public image delete(long id) {
        repository.deleteById(id);
        return null;
    }

}
