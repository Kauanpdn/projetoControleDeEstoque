package repository;

import model.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {
    
    private List<Produto> produtos = new ArrayList<>();

    public void adicionar(Produto produto){
        produtos.add(produto);
    }

    public Produto buscarPorId(int id){
        for (Produto p : produtos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void remover(Produto produto){
        produtos.remove(produto);
    }

    public List<Produto> listarTodos(){
        return produtos;
    }

}
