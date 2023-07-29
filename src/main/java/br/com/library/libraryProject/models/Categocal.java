package br.com.library.libraryProject.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Categocal implements Serializable {

    private static long serialVersionID = 1L;

    public Categocal(Integer id, String name, String discribe) {
        this.id = id;
        this.name = name;
        this.discribe = discribe;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String discribe;

    @OneToMany(mappedBy = "categorical")
    private List<Books> books = new ArrayList<Books>();

}
