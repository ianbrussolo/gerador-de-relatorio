import java.util.*;

public class InsertionSortStrategy implements OrdenacaoStrategy {
    private String criterio;

    public InsertionSortStrategy(String criterio) {
        this.criterio = criterio;
    }

    @Override
    public void ordenar(List<Produto> produtos) {
        // Implementação do Insertion Sort de acordo com o critério de ordenação
        // (criterio) que pode ser "descricao_c", "preco_c" ou "estoque_c".
        for (int i = 1; i < produtos.size(); i++) {
            Produto key = produtos.get(i);
            int j = i - 1;

            while (j >= 0 && compare(produtos.get(j), key) > 0) {
                produtos.set(j + 1, produtos.get(j));
                //produtos[j + 1] = produtos[j];
                j--;
            }

            produtos.set(j + 1, key);
        }
    }

    private int compare(Produto p1, Produto p2) {
        // A lógica de comparação vai depender do critério escolhido
        // Neste exemplo, estamos comparando pelo atributo de descrição em ordem crescente
        return p1.getDescricao().compareToIgnoreCase(p2.getDescricao());
    }
}