package com.mycompany.aula2304;
public class Casa extends imovel{
   private int areaterreno;
    public Casa(int idimovel, String endereco, double valor, int areaterreno) {
        super(idimovel, endereco, valor);
        this.areaterreno = areaterreno;
    }
    
   @Override
    public void getInfo(){
    super.getInfo();
    System.out.println("Area do Terreno: "+ areaterreno);
    }
}
