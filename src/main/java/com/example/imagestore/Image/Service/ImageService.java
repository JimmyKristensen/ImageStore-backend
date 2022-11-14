package com.example.imagestore.Image.Service;

import org.springframework.stereotype.Service;

@Service
public class ImageService {
    private final CrudRepository<Image, Long> repository;

    public Iterable<Image> findAll() {
        return repository.findAll();
    }

    public Optinal<Image> find(Long id) {
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
