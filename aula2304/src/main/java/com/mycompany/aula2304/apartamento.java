package com.mycompany.aula2304;
public class apartamento extends imovel{
    private int andar;
    public apartamento(int idimovel, String endereco, double valor, int andar) {
        super(idimovel, endereco, valor);
        this.andar = andar;
    }
    
    @Override
    public void getInfo(){
    super.getInfo();
        System.out.println("Andar: "+ andar);
    }
}
