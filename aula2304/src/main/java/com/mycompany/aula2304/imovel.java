/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula2304;

/**
 *
 * @author Aluno CA
 */
public class imovel {
    private int idimovel;
    private String endereco;
    private double valor;
    
    public imovel(int idimovel, String endereco, double valor){
    this.idimovel = idimovel;
    this.endereco = endereco;
    this.valor = valor;
    }
    public void getInfo(){
        System.out.println("ID: "+ idimovel);
        System.out.println("Endereço: "+ endereco);
        System.out.println("Valor: "+ valor);
    }
}
