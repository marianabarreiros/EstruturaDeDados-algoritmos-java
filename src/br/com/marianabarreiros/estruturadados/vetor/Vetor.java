/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.marianabarreiros.estruturadados.vetor;

import java.util.Arrays;

/**
 *
 * @author Mariana
 */
public class Vetor{
    private String[] elementosDoVetor;
    private int tamanho; //para controlar o tamanho real do vetor(usado no segundo método adiciona) 
    
    public Vetor(int capacidade){//usuario ja cria o vetor com a sua capacidade
        this.elementosDoVetor = new String[capacidade];
        this.tamanho = 0;
    }
    
    //Verificar se a posição está nula para poder adicionar o elemento
    //Problema: Ineficiente pois passa por todas as posições do vetor até achar uma que seja nula.
    public void adiciona(String elemento){
        for(int i = 0; i<this.elementosDoVetor.length; i++){
          if(this.elementosDoVetor[i] == null){
            this.elementosDoVetor[i] = elemento;
            break;//break para o programa parar na primeira posição que encontrou nula
          }
        }
    }
    
    //Método que sabe o tamanho real do vetor.
    public boolean adiciona2(String elemento){
        if(this.tamanho < this.elementosDoVetor.length){
            this.elementosDoVetor[this.tamanho] = elemento;
            this.tamanho++;
            return true; //sai do laço
        }
        return false;
    }
    
    //retorna o valor REAL do vetor (a quantidade de posições preenchidas com um valor que, é diferente da CAPACIDADE do vetor)
    public int tamanho(){
        return this.tamanho;
    }
    
     /**Retorna os elementos de dentro do array com nulo
    @Override
    public String toString(){
        return Arrays.toString(elementosDoVetor);
    }**/
    
    //Sem a presença de campos nulos
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");
        for(int i = 0; i<this.tamanho-1; i++){
            s.append(this.elementosDoVetor[i]);
            s.append(",");
        }
        if(this.tamanho>0){
            s.append(this.elementosDoVetor[this.tamanho-1]);
        }
        s.append("]");
        return s.toString();
    }
    
    //Buscar um elemento, dada uma posição específica
    public String obterElemento(int posicao){
       posicao--; 
       if(!(posicao >= 0) && (posicao < this.tamanho))
            return null;
       return this.elementosDoVetor[posicao];
    }
    
    //Saber se um elemento existe
    public boolean existeElemento(String s){
        for(int i = 0; i<this.tamanho; i++){
            if(this.elementosDoVetor[i].equals(s)){
                return true;
            }   
        }
        return false;
    }
    
    public boolean adiciona(int posicao, String elemento){
        if(!(posicao >= 0) && (posicao < this.tamanho)){
            return false;
        }
        
        //movo todos os elementos para direita
        //o 'i' começa com o tamanho real menos 1
        for(int i=this.tamanho-1; i>=posicao; i--){
           this.elementosDoVetor[i+1] = this.elementosDoVetor[i]; 
        }
        this.elementosDoVetor[posicao] = elemento;
        this.tamanho++;
        return true;   
    }
}
