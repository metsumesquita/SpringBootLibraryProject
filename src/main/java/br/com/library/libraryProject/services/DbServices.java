package br.com.library.libraryProject.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.library.libraryProject.enums.Sizes;
import br.com.library.libraryProject.models.Books;
import br.com.library.libraryProject.models.Categocal;
import br.com.library.libraryProject.repositories.BooksRepository;
import br.com.library.libraryProject.repositories.CategocalRepository;

@Service
public class DbServices {
    @Autowired
    private BooksRepository booksrepository;
    private CategocalRepository categocalRepository;

    public void instanciaDB() {

        Categocal cat1 = new Categocal(null, "Informática", "Livro de TI");
        Categocal cat2 = new Categocal(null, "Ficção Científica", "Ficção Científica");
        Categocal cat3 = new Categocal(null, "Biografias", "Livros de Biografias");

        Books livro1 = new Books(null, "Clean code", "Robertin Martin", "Lorem ipsum", Sizes.MEDIO, cat1);
        Books livro2 = new Books(null, "Engenharia de Software", "Louis V. Gerstner", "Lorem ipsum", Sizes.GRANDE,
                cat1);

        cat1.getBooks().addAll(0, Arrays.asList(livro1, livro2));
    }
}
