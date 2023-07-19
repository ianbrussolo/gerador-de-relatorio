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
    }

    // Restante das implementações e métodos auxiliares para o QuickSort...
}


