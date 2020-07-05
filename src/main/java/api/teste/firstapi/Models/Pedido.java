package api.teste.firstapi.Models;

import javax.persistence.*;


import api.teste.firstapi.Enums.StatusPedido;

import java.util.Date;
import java.util.List;

@Entity
@Table(name ="pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "nome_cliente")
    private String nomeCliente;
    @Column(name = "valor")
    private long valor;
    @Column(name = "data_submissao")
    private Date dataSubmissao;
    @Column(name = "data_entrega")
    private Date dataEntrega;
    @OneToMany
    @JoinColumn(name = "id_descricao")
    private List<Produto> descricao;
    @Column(name = "status")
    @Enumerated(value = EnumType.STRING)
    private StatusPedido statusPedido;

    public Pedido() {
    }

    public Pedido(String nomeCliente, long valor, Date dataSubmissao, Date dataEntrega, List<Produto> descricao,StatusPedido statusPedido) {
        this.nomeCliente = nomeCliente;
        this.valor = valor;
        this.dataSubmissao = dataSubmissao;
        this.dataEntrega = dataEntrega;
        this.descricao = descricao;
        this.statusPedido = statusPedido;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }

    public Date getDataSubmissao() {
        return dataSubmissao;
    }

    public void setDataSubmissao(Date dataSubmissao) {
        this.dataSubmissao = dataSubmissao;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrga) {
        this.dataEntrega = dataEntrga;
    }

    public List<Produto> getDescricao() {
        return descricao;
    }

    public void setDescricao(List<Produto> descricao) {
        this.descricao = descricao;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "pedido{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", valor=" + valor +
                ", dataSubmissao=" + dataSubmissao +
                ", dataEntrga=" + dataEntrega +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
