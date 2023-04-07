package org.senai.devinhouse.philipssenai.services;

import org.senai.devinhouse.philipssenai.models.Produto;
import org.senai.devinhouse.philipssenai.repositories.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    ProdutoRepository repository;
    public ProdutoService(ProdutoRepository repository){ //injeção de dependencia

        this.repository = repository;
    }

    public void salvar(Produto produto){

        this.repository.save(produto);
    }

    public List<Produto> buscaTodos(){
        return (List<Produto>) this.repository.findAll();
    }

    public void excluir (Produto produto){
        this.repository.delete(produto);
    }

    public void excluirPorId(int id){
        this.repository.deleteById(id);
    }


}
