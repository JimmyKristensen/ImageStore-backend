package com.example.imagestore.Image.Controller;


import com.example.imagestore.Image.Model.image;
import com.example.imagestore.Image.Service.ImageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@CrossOrigin
@RestController
@RequestMapping("api/v1/Images")
public class ImageController {
    private final ImageService service;

    public ImageController(ImageService service) {
        this.service = service;
    }

    @GetMapping()
    public Iterable<image> FindAllImages(){
        return service.findAll();
    }

    @GetMapping("/{id")
    public ResponseEntity<image> find(@PathVariable("id") Long id){
        Optional<image> image = Optional.of(service.find(id))
                .orElseThrow(() -> new RuntimeException("Image not found.".formatted((id))));
        return ResponseEntity.ok().body(image.get());
    }

    @PostMapping
    public ResponseEntity<image> create(@RequestBody image image) {
        image item = service.create(image);
        return ResponseEntity.ok().body(item);
    }

    @PutMapping("/{id}")
    public ResponseEntity<image> put(@PathVariable("id") Long id, @RequestBody image image) {
        return ResponseEntity.ok().body(service.update(id, image));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<image> delete(@PathVariable("id") Long id) {
        service.find(id).orElseThrow(() -> new RuntimeException("Activity not found.".formatted(id)));

        image delete = service.delete(id);
        return ResponseEntity.ok().body(delete);
    }
}
