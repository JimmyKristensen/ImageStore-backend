package com.example.imagestore.Image.Service;

import com.example.imagestore.Image.Model.Image;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ImageService {
    private final CrudRepository<Image, Long> repository;
    public ImageService(CrudRepository<Image, Long> repository){
        this.repository = repository;
    }

    public Iterable<Image> findAll() {
        return repository.findAll();
    }

    public Optional<Image> find(Long id) {
        return repository.findById(id);
    }

    public Image create(Image image) {
        return repository.save(image);
    }

    public Image update(Long id, Image image) {
        return repository.save(image);
    }

    public Image delete(long id) {
        repository.deleteById(id);
        return null;
    }

}
