package api.teste.firstapi.Repository;


import api.teste.firstapi.Models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepositorio extends JpaRepository<Produto,Long> {



}
