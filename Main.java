import model.Produto;
import  repository.ProdutoRepository;
import service.ProdutosService;

public class Main {
    public static void main(String[] args) {
        
        ProdutoRepository repository = new ProdutoRepository();
        ProdutosService service = new ProdutosService(repository);

        service.adicionarProduto(new Produto(1, "Arroz", 20,7.50));
        service.adicionarProduto(new Produto(2, "Feijão", 15, 8.00));

        System.out.println("📦 Lista de produtos:");
        service.listarProdutos().forEach(System.out::println);

        System.out.println("\n🔄 Atualizando estoque do produto 1...");
        service.atualizarEstoque(1, 30);

        System.out.println("\n📦 Lista atualizada:");
        service.listarProdutos().forEach(System.out::println);

        System.out.println("\n🗑 Removendo produto 2...");
        service.removerProduto(2);

        System.out.println("\n📦 Lista final:");
        service.listarProdutos().forEach(System.out::println);
    }
}