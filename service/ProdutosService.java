package service;

import exception.ProdutoNaoEncontradoException;
import repository.ProdutoRepository;
import model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutosService {
    
    private ProdutoRepository repository;

    public ProdutosService(ProdutoRepository repository){
        this.repository = repository;
    }

    public void adicionarProduto(Produto produto){
        repository.adicionar(produto);
    }

    public Produto buscarProduto(int id ){
        Produto p = repository.buscarPorId(id);
            if (p == null) {
                throw new ProdutoNaoEncontradoException("Produto com ID " + id + " não encontrado");
            }
            return p;
    }

    public void atualizarEstoque(int id, int novaQuantidade){
        Produto p = buscarProduto(id);
            p.setQuantidade(novaQuantidade);
    }

    public void atualizarPreco(int id, double novoPreco){
        Produto p = buscarProduto(id);
            p.setPreco(novoPreco);
    }

    public void removerProduto(int id){
        Produto p = buscarProduto(id);
        repository.remover(p);
    }

    public List <Produto> listarProdutos(){
        return repository.listarTodos();
    } 

    


}
