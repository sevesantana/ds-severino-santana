/*
 * Arquivo principal do projeto.
 * Altere este cabeçalho de acordo com a licença do seu projeto, se necessário.
 */


/**
 * Classe principal que testa a classe Mostrar (subclasse de Carro).
 * Autor: joaod
 */
public class Main {
    public static void main(String[] args) {
        Mostrar myCar = new Mostrar("Civic", 2000, 2, 20000, "Azul");
        myCar.print();
    }
}

// Classe Carro com atributos básicos de um veículo
class Carro {
    private String modelo;
    private int ano;
    private int potencia;

    public Carro(String modelo, int ano, int potencia) {
        this.modelo = modelo;
        this.ano = ano;
        this.potencia = potencia;
    }

    protected String getModelo() {
        return modelo;
    }

    protected int getAno() {
        return ano;
    }

    protected int getPotencia() {
        return potencia;
    }
}

// Subclasse Mostrar que estende Carro e adiciona mais informações
class Mostrar extends Carro {
    private int kmRodado;
    private String cor;

    public Mostrar(String modelo, int ano, int potencia, int kmRodado, String cor) {
        super(modelo, ano, potencia);
        this.kmRodado = kmRodado;
        this.cor = cor;
    }

    public void print() {
        System.out.println("Modelo : "+getModelo() + " Ano:  " + getAno() + " Potencia : " + getPotencia() + " km rodado :  " + kmRodado + " cor:  " + cor);
    }
}