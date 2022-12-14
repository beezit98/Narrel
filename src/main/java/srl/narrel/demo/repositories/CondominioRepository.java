package srl.narrel.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import srl.narrel.demo.models.AppartamentoModel;
import srl.narrel.demo.models.CondominioModel;

import java.util.List;

public interface CondominioRepository extends JpaRepository<CondominioModel, Integer> {
    public List<CondominioModel> findByNome(String nome);
    public List<CondominioModel> findByVia(String via);

}