/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiposprimitivos;
/**Primeiro programa em java feito no labóratorio 111/*
/**Eu, Melissa Martins dos Santos estou fazendo meu primeiro trabalho em java/*
 */
/**
 *
 * @author FATEC ZONA LESTE
 */
public class TiposPrimitivos {
  public static void main(String[] args) {
  // Declaração de variáveis primitivas
          byte semanas = 2; // Armazena números pequenos (-120 a 120)
          short meses = 12; // Armazena valores um pouco maiores (-32.700 a 32.700)
          int taixadeNatalidade = 500000; // Tipo mais usado para números inteiros
          long populacaoMundialAtual = 8000000000L; //Necessário 'L' para valores muito longos
          
          float alturaemMetros = 1.46f; // Necessário 'f' no final para indicar float, armazena números quebrados
          double kg = 60.8; // Mais preciso que float, acrescenta mais numeros
          
          char inicial = 'M'; // Armazena um único caractere
          boolean ativo = true; // Armazena o verdadeiro e o falso
          
          // Exibição dos valores
          System.out.println("Semanas: " + semanas);
          System.out.println("Meses: " + meses);
          System.out.println("Taixa de natalidade: " + taixadeNatalidade);
          System.out.println("População Mundial Atual: " + populacaoMundialAtual);
          System.out.println("Altura: " + alturaemMetros + "m");
          System.out.println("Peso: " + kg + "kg");
          System.out.println("Inicial do nome: " + inicial);
          System.out.println("Está ativo?: " + ativo);
          
  }
  
}
  