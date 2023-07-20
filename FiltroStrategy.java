import java.util.*;

public interface FiltroStrategy {
    List<Produto> filtrar(List<Produto> produtos, String argumento);
}
