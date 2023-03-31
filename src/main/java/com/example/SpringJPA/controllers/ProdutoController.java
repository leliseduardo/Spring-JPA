package com.example.SpringJPA.controllers;

import com.example.SpringJPA.model.entities.Produto;
import com.example.SpringJPA.model.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired      // Automaticamente o Spring cria um objeto do tipo ProdutoRepositorio e atribui à variável produtoRepository
    private ProdutoRepository produtoRepository;

    @PostMapping
    public @ResponseBody Produto novoProduto(@Valid Produto produto){

        produtoRepository.save(produto);

        return produto;
    }

    @GetMapping
    public Iterable<Produto> obterProdutos(){

        return produtoRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<Produto> obterProdutoPorId(@PathVariable int id){

        return produtoRepository.findById(id);
    }
}




















