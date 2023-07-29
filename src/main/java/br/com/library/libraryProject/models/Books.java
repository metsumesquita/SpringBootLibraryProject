package br.com.library.libraryProject.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.library.libraryProject.enums.Sizes;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
//@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String author;
    public Books(Integer id, String title, String author, String describe, Sizes i,Categocal string) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.describe = describe;
        this.size = i;
        this.categorical = string;
    }

    private String describe;

    private Sizes size;

    @ManyToOne
    @JoinColumn(name = "categorical_id")
    private Categocal categorical;
}