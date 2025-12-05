package model;

public class Produto {
    
    private int id;
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(int id, String nome, int quantidade, double preco){
        
        this.id = id;    
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    // Getters e Setteres
    public int getId(){ return id; }
    public String getNome(){ return nome; }
    public int getQuantidade(){ return quantidade; }
    public double getPreco(){ return preco; }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public void setPreco(double preco){
        if (preco >= 0) {
            this.preco = preco;
        }
    }

    public void infoProduto(){
        System.out.println(
            "Id " + id +
            " Nome " + nome +
            " Quantidade " + quantidade +
            " Preço " + preco
        );
    }
}
