package service;

import exception.ProdutoNaoEncontradoException;
import repository.ProdutoRepository;
import model.Produto;

import java.util.ArrayList;

public class ProdutosService {
    
    private ProdutoRepository repository;

    public ProdutosService(ProdutoRepository repository){
        this.repository = repository;
    }

    


}
