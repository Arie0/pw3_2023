package com.example.pw3.services;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.example.pw3.dto.ResumoDTO;
import com.example.pw3.models.Conta;
import com.example.pw3.repositories.ContaRepository;

@Service
public class ContaService {

    private ContaRepository repository;
    
    
    public ContaService(ContaRepository repository) {
        this.repository = repository;
    }

    public Collection<Conta> findAll() {
        return repository.findAll();
    }

    public Conta save(Conta conta) {
        return repository.save(conta);
    }
    public ResumoDTO resumo () {
        Collection<Conta> despesa = repository.findByTipo(Conta.TIPO_DESPESA);
        Collection<Conta> receita = repository.findByTipo(Conta.TIPO_RECEITA);

        double totaldespesa = despesa.stream().mapToDouble(d -> d.getValor()).sum();
        double totalreceita = receita.stream().mapToDouble(d -> d.getValor()).sum();
        double saldo = totalreceita - totaldespesa;

        ResumoDTO resumo = new ResumoDTO();

        resumo.setSaldo(saldo);
        resumo.setTotaldespesa(totaldespesa);
        resumo.setTotalreceita(totalreceita);

        return resumo;

    }

   



}
