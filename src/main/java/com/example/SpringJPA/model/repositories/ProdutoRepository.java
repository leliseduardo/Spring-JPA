package com.example.SpringJPA.model.repositories;

import com.example.SpringJPA.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>, PagingAndSortingRepository<Produto, Integer> {

}
