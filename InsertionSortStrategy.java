public class InsertionSortStrategy implements OrdenacaoStrategy {
    private String criterio;

    public InsertionSortStrategy(String criterio) {
        this.criterio = criterio;
    }

    @Override
    public void ordenar(Produto[] produtos) {
        // Implementação do Insertion Sort de acordo com o critério de ordenação
        // (criterio) que pode ser "descricao_c", "preco_c" ou "estoque_c".
    }

    // Restante das implementações e métodos auxiliares para o Insertion Sort...
}