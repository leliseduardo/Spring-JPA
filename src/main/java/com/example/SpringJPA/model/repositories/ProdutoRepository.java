package com.example.SpringJPA.model.repositories;

import com.example.SpringJPA.model.entities.Produto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>, PagingAndSortingRepository<Produto, Integer> {

    public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

//    findByNomeContaining
//    findByNomeIsContaining
//    findByNomeContains

//    findByNomeStartWith
//    findByNomeEndWith

//    findByNomeNotContaining

    @Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
    public Iterable<Produto> searchByNameLike(@Param("nome") String nome);
}
