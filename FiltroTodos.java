import java.util.*;

public class FiltroTodos implements FiltroStrategy {
    @Override
    public List<Produto> filtrar(List<Produto> produtos, String argumento) {
        return produtos; // Retorna todos os produtos, sem fazer nenhum filtro.
    }
}
