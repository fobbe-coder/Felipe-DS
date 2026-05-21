
package com.mycompany.main;


class Caminhao extends Veiculo {

    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, double capacidadeCarga) {
        super(marca, modelo);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularConsumo() {
        return 5.0 - (capacidadeCarga / 1000.0);
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Capacidade de carga: " + capacidadeCarga + " kg");
        System.out.println("------------------------");
    }
}