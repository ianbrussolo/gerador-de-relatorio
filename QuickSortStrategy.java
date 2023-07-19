public class QuickSortStrategy implements OrdenacaoStrategy {
    private String criterio;

    public QuickSortStrategy(String criterio) {
        this.criterio = criterio;
    }

    @Override
    public void ordenar(Produto[] produtos) {
        ordena(produtos, 0, produtos.length - 1);
    }

    private void ordena(Produto[] produtos, int ini, int fim) {
        // Implementação do QuickSort de acordo com o critério de ordenação
        // (criterio) que pode ser "descricao_c", "preco_c" ou "estoque_c".
        if (ini < fim) {
            int pivotIndex = partition(produtos, ini, fim);
            ordena(produtos, ini, pivotIndex - 1);
            ordena(produtos, pivotIndex + 1, fim);
        }
    }


    private int partition(Produto[] produtos, int ini, int fim) {
        Produto pivot = produtos[fim];
        int i = ini - 1;

        for (int j = ini; j < fim; j++) {
            if (compare(produtos[j], pivot) < 0) {
                i++;
                swap(produtos, i, j);
            }
        }

        swap(produtos, i + 1, fim);
        return i + 1;
    }

    // Método auxiliar para trocar elementos no produtosay
    private void swap(Produto[] produtos, int i, int j) {
        Produto temp = produtos[i];
        produtos[i] = produtos[j];
        produtos[j] = temp;
    }

    private int compare(Produto p1, Produto p2) {
        // A lógica de comparação vai depender do critério escolhido
        // Neste exemplo, estamos comparando pelo atributo de descrição em ordem crescente
        return p1.getDescricao().compareToIgnoreCase(p2.getDescricao());
    }
}


