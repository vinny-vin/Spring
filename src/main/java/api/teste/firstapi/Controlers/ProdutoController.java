package api.teste.firstapi.Controlers;


import api.teste.firstapi.DTO.ProdutoDTO;
import api.teste.firstapi.Models.Produto;
import api.teste.firstapi.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

    final
    ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }


    @PostMapping
    public ResponseEntity add(@RequestBody ProdutoDTO produtoDTO){

        try{
            Produto produto = service.add(produtoDTO);
            return ResponseEntity.ok(produto);


        }catch (Exception e){

            return ResponseEntity.badRequest().body(e.getMessage());

        }
    }
}
