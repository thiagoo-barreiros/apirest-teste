package com.financeiro.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.financeiro.apirest.repository.FinanceiroRepository;
import com.financeiro.apirest.models.Financeiro;





@RestController
@RequestMapping(value="/api")
public class FinanceiroResources<Financeiro> {
	
	@Autowired
	FinanceiroRepository financeiroRepository;
	
	@GetMapping("/financeiros")
	public List<com.financeiro.apirest.models.Financeiro> listaFinanceiros (){
		return financeiroRepository.findAll();
		}

	@PostMapping("/financeiro")
	public com.financeiro.apirest.models.Financeiro salvaFinanceiro(@RequestBody com.financeiro.apirest.models.Financeiro financeiro){
		return financeiroRepository.save(financeiro);
		
	}
		
	
	@DeleteMapping("/financeiro")
	public void deletaFinanceiro(@RequestBody com.financeiro.apirest.models.Financeiro financeiro){
		financeiroRepository.delete(financeiro);
	}
	
	
	
	
}
