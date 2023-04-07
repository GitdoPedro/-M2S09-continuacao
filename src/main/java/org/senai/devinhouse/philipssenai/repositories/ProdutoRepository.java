package org.senai.devinhouse.philipssenai.repositories;

import org.senai.devinhouse.philipssenai.models.Produto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto,Integer> {

    @Query(value = "SELECT P FROM Produto p WHERE p.descricao = :descricao") //jpql
    public List<Produto> findByDecricao (String descricao);

    @Query(value = "SELECT P FROM Produto p WHERE p.descricao = :nome", nativeQuery = true) //sql
    public List<Produto> findByNome (String descricao);

    public List<Produto> findByPreco(double preco); //pode fazer assim direto


}
