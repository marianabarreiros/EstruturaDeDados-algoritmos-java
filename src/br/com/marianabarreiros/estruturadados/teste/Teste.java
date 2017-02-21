/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.marianabarreiros.estruturadados.teste;

import br.com.marianabarreiros.estruturadados.vetor.Vetor;

/**
 *
 * @author Mariana
 */
public class Teste {
    public static void main(String Args[]){
         Vetor vetor = new Vetor(4);
         vetor.adiciona2("mariana");
         vetor.adiciona2("manu");
         vetor.adiciona2("nildes");
         vetor.adiciona2("vitor");
         
        // int tamanho = vetor.tamanho();
         
         //System.out.println("O tamanho do vetor é: " +tamanho);
         
         System.out.println(vetor.existeElemento("vitor"));
         
         
    }
    
    
}
