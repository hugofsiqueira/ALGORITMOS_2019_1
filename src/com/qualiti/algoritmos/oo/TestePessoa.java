package com.qualiti.algoritmos.oo;

public class TestePessoa {

	public static void main(String[] args) {
		
		Endereco end = new Endereco();
		end.logradouro = "Av. Boa Viagem";
		end.numero = "123";
		end.bairro = "Boa Viagem";
		end.complemento = "APT 1009";
		end.uf = "PE";
		end.cep = "50000-777";
		end.cidade = "Recife";
		
		Pessoa p1 = new Pessoa();
		p1.nome = "Maria Jose"; // setNome
		p1.cpf = "1234"; //setCpf
		p1.dataNascimento = "12/12/2009";
		p1.endereco = end;
		
		//get
		System.out.println(p1.nome);
		
		System.out.println(p1.endereco.bairro);

	}

}
