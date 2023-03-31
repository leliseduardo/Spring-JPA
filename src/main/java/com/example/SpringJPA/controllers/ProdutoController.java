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

//    @PostMapping
    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Produto salvarProduto(@Valid Produto produto){

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

//    O PUT pode ser usado juntamente com a função POST, pois fazem a mesma coisa. O código fica mais limpo
//    @PutMapping
//    public Produto alterarProduto(@Valid Produto produto){
//
//        produtoRepository.save(produto);
//
//        return produto;
//    }

    @DeleteMapping(path = "/{id}")
    public void excluirProduto(@PathVariable int id){

        produtoRepository.deleteById(id);
    }
}




















