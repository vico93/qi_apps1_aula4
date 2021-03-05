/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.Scanner;
import Cliente.Cliente;

/**
 *
 * @author Vico
 */
public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        
        Cliente fulano = new Cliente();
        
        System.out.print("Digite o Nome do Cliente: ");
        fulano.setNome(stdin.next());
        
        System.out.print("Digite a idade do " + fulano.getNome() + ": ");
        fulano.setIdade(stdin.nextInt());
        
        System.out.print("Digite a renda do " + fulano.getNome() + ": ");
        fulano.setRenda(stdin.nextDouble());
        
        System.out.println(fulano.classificarRenda());
        System.out.println(fulano.classificarIdade());
        
    }
    
}
