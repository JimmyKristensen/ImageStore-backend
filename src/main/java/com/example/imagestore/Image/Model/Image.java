package com.example.imagestore.Image.Model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="Image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date;
    private String ost;
    private String name;
    private String size;
    private String image;
    private String title;
    private String description;

    public Image(Date date, String ost, String name, String size, String image, String title, String description) {
        this.date = date;
        this.ost = ost;
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
                ", user='" + ost + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", image='" + image + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
