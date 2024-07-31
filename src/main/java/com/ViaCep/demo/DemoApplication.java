package com.ViaCep.demo;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
        Scanner sc = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar novo cliente");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");
            String opcao = sc.nextLine();

            switch (opcao) {
                case "1":
				try {
					Cliente.addCliente();

				} catch (Exception e) {
					System.out.println("Erro: " + e.getMessage());
					Cliente.addCliente();
				}
                    break;
                case "2":
                    rodando = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        sc.close();
	}
}

