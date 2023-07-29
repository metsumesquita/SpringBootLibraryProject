package br.com.library.libraryProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.library.libraryProject.models.Categocal;

@Repository
public interface CategocalRepository extends JpaRepository<Categocal, Integer> {

}
