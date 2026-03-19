/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula1903;

/**
 *
 * @author Aluno CA
 */
public class Aula1903 {

    public static void main(String[] args) {
    Pessoa felipe = new Pessoa();
        System.out.println(felipe.nome);
        felipe.alteraNome("Felipe");
        felipe.recuperanome();
        felipe.recuperaridade();
        felipe.altearidade(17);
        felipe.recuperarCPF();
        felipe.alterarCPF("754.234.234-01");
        felipe.recuperarvivo();
        felipe.alterarvivo(true);
        
    }
}
