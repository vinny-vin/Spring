package api.teste.firstapi.Service.Impl;

import api.teste.firstapi.DTO.ProdutoDTO;
import api.teste.firstapi.Exceptions.ProdutoException;
import api.teste.firstapi.Models.Produto;
import api.teste.firstapi.Repository.ProdutoRepositorio;
import api.teste.firstapi.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepositorio repositorio;

    public ProdutoServiceImpl(ProdutoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public Produto add(ProdutoDTO produtoDTO) {

        Produto produto= getProduto(produtoDTO);

        return repositorio.save(produto);
    }

    private Produto getProduto(ProdutoDTO produtoDTO){

        if(produtoDTO.getNome().equals(null) || produtoDTO.getNome().isEmpty()){
            throw new ProdutoException("Informe um valor valido para o campo nome ");
        }
        if(produtoDTO.getDescricao().equals(null) || produtoDTO.getDescricao().isEmpty()){
            throw new ProdutoException("Informe um valor valido para o campo descricao ");
        }
        if(produtoDTO.getQuantiidade() < 0 ) {
            throw new ProdutoException("Informe um valor valido para o campo quantidade ");
        }

        Produto produto= new Produto();
        produto.setNome(produtoDTO.getNome());
        produto.setDescricao(produtoDTO.getDescricao());
        produto.setQuantidade(produtoDTO.getQuantiidade());

        return produto;
    }
}
