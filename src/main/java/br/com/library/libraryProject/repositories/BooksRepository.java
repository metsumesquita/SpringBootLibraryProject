package br.com.library.libraryProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.library.libraryProject.models.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, Integer> {

}
