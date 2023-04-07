package org.senai.devinhouse.philipssenai;

import org.senai.devinhouse.philipssenai.models.Produto;
import org.senai.devinhouse.philipssenai.services.ProdutoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PhilipsSenaiSpringDataApplication implements CommandLineRunner {

	ProdutoService service;
	public PhilipsSenaiSpringDataApplication(ProdutoService service){
		this.service = service;
	}

	public static void main(String[] args) {

		SpringApplication.run(PhilipsSenaiSpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um nome de produto: ");
		String nome = scanner.nextLine();

		System.out.println("Digite uma descrição do produto:");
		String descricao = scanner.nextLine();

		Produto produto = new Produto();
		produto.setNome(nome);
		produto.setDescricao(descricao);
		produto.setPreco(100);

		service.salvar(produto);
	}

}
