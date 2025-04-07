/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio008;

/**
 *
 * @author Fabricio de Aguiar
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Fabricio de Aguiar
 */
/**Escreva um programa em JAVA que solicite ao usuário 2 números inteiros
(um de cada vez), armazene os valores em variáveis e depois mostre a soma
dos dois em uma mensagem.*/

import javax.swing.JOptionPane;
public class Exercicio008 {
    public static void main(String[] args) {
        
        String input1 = JOptionPane.showInputDialog("Digite o primeiro número inteiro:");
        int numero1 = Integer.parseInt(input1); 
        String input2 = JOptionPane.showInputDialog("Digite mais um número inteiro:");
        int numero2 = Integer.parseInt(input2);
        int soma = numero1 + numero2;
        JOptionPane.showMessageDialog(null, "A soma dos dois números é: " + soma);
    }
}
