
package com.mycompany.aula1903;


public class Pessoa {
    int idade;
    String nome;
    String CPF;
    boolean vivo;
    
    void recuperanome(){
    System.out.println("Nome do cara é: "+ nome);     
    }
    void alteraNome( String nome2){
        nome=nome2;
    }
    void recuperaridade(){
        System.out.println("A idade da pessoa é: "+ idade);
    }
    void altearidade( int idade2){
     idade = idade2;
    }
    void recuperarCPF(){
        System.out.println("O CPF da pessoa é: " + CPF );
    }
    void alterarCPF( String CPF2){
        CPF = CPF2;
    }
 
    void recuperarvivo(){
           if (vivo = true){
    System.out.println("A pessoa está viva");
}
        if (vivo = false){
    System.out.println("A pessoa está morta");
}
    }
    void alterarvivo( boolean vivo2){
        vivo = vivo2;
    }

         
}
