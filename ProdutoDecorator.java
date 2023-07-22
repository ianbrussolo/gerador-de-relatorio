public class ProdutoDecorator implements Produto {
    private Produto produtoDecorado;

    public ProdutoDecorator(Produto produto) {
        this.produtoDecorado = produto;
    }

    @Override
    public void setQtdEstoque(int qtdEstoque) {
        produtoDecorado.setQtdEstoque(qtdEstoque);
    }

    @Override
    public void setPreco(double preco) {
        produtoDecorado.setPreco(preco);
    }

    @Override
    public int getId() {
        return produtoDecorado.getId();
    }

    @Override
    public String getDescricao() {
        return produtoDecorado.getDescricao();
    }

    @Override
    public String getCategoria() {
        return produtoDecorado.getCategoria();
    }

    @Override
    public int getQtdEstoque() {
        return produtoDecorado.getQtdEstoque();
    }

    @Override
    public double getPreco() {
        return produtoDecorado.getPreco();
    }

    @Override
    public String formataParaImpressao() {
        return produtoDecorado.formataParaImpressao();
    }
}
