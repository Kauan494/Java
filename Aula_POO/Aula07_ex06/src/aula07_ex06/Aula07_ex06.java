package aula07_ex06;

import java.util.Scanner;

public class Aula07_ex06 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        Pessoa p1 = null;
        Pessoa p2 = null;
        Pessoa p3 = null;
        Pessoa p4 = null;

        // PESSOA 1
        try {
            System.out.println("\nPessoa 1");
            System.out.print("Nome: ");
            String nome = input.nextLine();

            System.out.print("Sobrenome: ");
            String sobrenome = input.nextLine();

            System.out.print("Idade: ");
            int idade = input.nextInt();
            input.nextLine();

            System.out.print("CPF: ");
            String cpf = input.nextLine();

            p1 = new Pessoa(nome, sobrenome, idade, cpf);
        } catch (CpfException e) {
            System.out.println(e.getMessage());
        }

        // PESSOA 2
        try {
            System.out.println("\nPessoa 2");
            System.out.print("Nome: ");
            String nome = input.nextLine();

            System.out.print("Sobrenome: ");
            String sobrenome = input.nextLine();

            System.out.print("Idade: ");
            int idade = input.nextInt();
            input.nextLine();

            System.out.print("CPF: ");
            String cpf = input.nextLine();

            p2 = new Pessoa(nome, sobrenome, idade, cpf);
        } catch (CpfException e) {
            System.out.println(e.getMessage());
        }

        // PESSOA 3
        try {
            System.out.println("\nPessoa 3");
            System.out.print("Nome: ");
            String nome = input.nextLine();

            System.out.print("Sobrenome: ");
            String sobrenome = input.nextLine();

            System.out.print("Idade: ");
            int idade = input.nextInt();
            input.nextLine();

            System.out.print("CPF: ");
            String cpf = input.nextLine();

            p3 = new Pessoa(nome, sobrenome, idade, cpf);
        } catch (CpfException e) {
            System.out.println(e.getMessage());
        }

        // PESSOA 4
        try {
            System.out.println("\nPessoa 4");
            System.out.print("Nome: ");
            String nome = input.nextLine();

            System.out.print("Sobrenome: ");
            String sobrenome = input.nextLine();

            System.out.print("Idade: ");
            int idade = input.nextInt();
            input.nextLine();

            System.out.print("CPF: ");
            String cpf = input.nextLine();

            p4 = new Pessoa(nome, sobrenome, idade, cpf);
        } catch (CpfException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- RESULTADOS ---");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
    
}
