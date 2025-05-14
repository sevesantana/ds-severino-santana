package carropoo;

public class Carropoo {
    // Adicionando os atributos de classe.
    int ano;
    String modelo;
    String cor;
    
    // Método construtor para inicializar os atributos.
    public Carropoo(int a, String m, String c){
        ano = a;
        modelo = m;
        cor = c;
    }
    
    public static void main(String[] args){
        Carropoo myObj = new Carropoo(2015, "Golf", "Vermelho"); // Criando um objeto para chamar os atributos e definindo o valor dos atributos através do método construtor.
        System.out.println("Ano do carro: " + myObj.ano); // Usando objeto para chamar o atributo.
        System.out.println("Modelo do carro: " + myObj.modelo); // Usando objeto para chamar o atributo.
        System.out.println("Cor do carro: " + myObj.cor); // Usando objeto para chamar o atributo.
    }
}
