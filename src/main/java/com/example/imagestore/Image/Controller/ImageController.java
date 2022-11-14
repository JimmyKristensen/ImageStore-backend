package com.example.imagestore.Image.Controller;


import com.example.imagestore.Image.Model.Image;
import com.example.imagestore.Image.Service.ImageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@CrossOrigin
@RestController
@RequestMapping("api/v1/Images")
public class ImageController {
    private final ImageService service;

    @GetMapping("/all")
    public Iterable<Image> FindAllImages(){
        return service.findAll();
    }

    public ImageController(ImageService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Image> find(@PathVariable("id") Long id){
        Optional<Image> image = Optional.of(service.find(id))
                .orElseThrow(() -> new RuntimeException("Image not found.".formatted((id))));
        return ResponseEntity.ok().body(image.get());
    }

    @PostMapping
    public ResponseEntity<Image> create(@RequestBody Image image) {
        Image item = service.create(image);
        return ResponseEntity.ok().body(item);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Image> put(@PathVariable("id") Long id, @RequestBody Image image) {
        return ResponseEntity.ok().body(service.update(id, image));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Image> delete(@PathVariable("/id") Long id) {
        service.find(id).orElseThrow(() -> new RuntimeException("Activity not found.".formatted(id)));

        Image delete = service.delete(id);
        return ResponseEntity.ok().body(delete);
    }
}
