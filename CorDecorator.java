public class CorDecorator implements Produto {

    private Produto produto;
    private String cor;

    public CorDecorator(Produto produto, String cor) {
        this.produto = produto;
        this.cor = cor;
    }

    @Override
    public void setQtdEstoque(int qtdEstoque) {
        produto.setQtdEstoque(qtdEstoque);
    }

    @Override
    public void setPreco(double preco) {
        produto.setPreco(preco);
    }

    @Override
    public int getId() {
        return produto.getId();
    }

    @Override
    public String getDescricao() {
        return "<span style=\"color:" + cor + "\">" + produto.getDescricao() + "</span>";
    }

    @Override
    public String getCategoria() {
        return produto.getCategoria();
    }

    @Override
    public int getQtdEstoque() {
        return produto.getQtdEstoque();
    }

    @Override
    public double getPreco() {
        return produto.getPreco();
    }

    @Override
    public String formataParaImpressao() {
        return produto.formataParaImpressao();
    }
}
