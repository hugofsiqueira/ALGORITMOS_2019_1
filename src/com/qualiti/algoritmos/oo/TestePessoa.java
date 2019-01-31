package com.qualiti.algoritmos.oo;

public class TestePessoa {

	public static void main(String[] args) {
		
		Endereco end = new Endereco();
		end.setLogradouro("Av. Boa Viagem");
		end.setNumero("123");
		end.setBairro("Boa Viagem");
		end.setComplemento("APT 1009");
		end.setUf("PE");
		end.setCep("50000-777");
		end.setCidade("Recife") ;
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Maria Jose");
		System.out.println(p1.getNome());
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Ana Maria");
		System.out.println(p2.getNome());
	
		p1.setCpf("1234");
		p1.setDataNascimento("12/12/2009");
		p1.setEndereco(end);
		
		//get
		System.out.println(p1.getNome());
		
		System.out.println(p1.getEndereco().getBairro());

	}

}
