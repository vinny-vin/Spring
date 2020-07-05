package api.teste.firstapi.DTO;

public class ProdutoDTO {

    private String nome;
    private String descricao;
    private int quantiidade;

    public ProdutoDTO() {
    }

    public ProdutoDTO(String nome, String descricao, int quantiidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.quantiidade = quantiidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantiidade() {
        return quantiidade;
    }

    public void setQuantiidade(int quantiidade) {
        this.quantiidade = quantiidade;
    }
}
