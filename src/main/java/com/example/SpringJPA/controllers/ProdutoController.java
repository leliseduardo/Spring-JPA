package com.example.SpringJPA.controllers;

import com.example.SpringJPA.model.entities.Produto;
import com.example.SpringJPA.model.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired      // Automaticamente o Spring cria um objeto do tipo ProdutoRepositorio e atribui à variável produtoRepository
    private ProdutoRepository produtoRepository;

    @PostMapping
    public @ResponseBody Produto novoProduto(
            @RequestParam String nome,
            @RequestParam double preco,
            @RequestParam double desconto
    ){
        Produto produto = new Produto(nome, preco, desconto);

        produtoRepository.save(produto);

        return produto;
    }
}
