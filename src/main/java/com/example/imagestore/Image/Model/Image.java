package com.example.imagestore.Image.Model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.awt.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date;
    private String user;
    private String name;
    private String size;
    private String image;
    private String title;
    private String description;

    public image(Date date, String user, String name, String size, String image, String title, String description) {
        this.date = date;
        this.user = user;
        this.name = name;
        this.size = size;
        this.image = image;
        this.title = title;
        this.description = description;
    }

    @Override
    public String toString() {
        return "image{" +
                "date=" + date +
                ", user='" + user + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", image='" + image + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
