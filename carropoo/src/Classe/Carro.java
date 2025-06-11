package Classe;

    import javax.swing.JOptionPane;

public class Carro {
   
    private String cor;
    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;
    private int velocidade;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    
    
    public void ligar(){
        if(!ligado){
            ligado = true;
            JOptionPane.showMessageDialog(null, "O carro foi ligado.");
        } else {
            JOptionPane.showMessageDialog(null, "O carro ja esta ligado.");
        }
    }
    
    public void desligar(){
        if(ligado) {
            ligado = false;
            JOptionPane.showMessageDialog(null, "O carro foi desligado");
        } else {
            JOptionPane.showMessageDialog(null, "O carro ja esta desligado.");
        }
}
    
    public void acelerar(){
        velocidade += 10;
        JOptionPane.showMessageDialog(null, "A velocidade atual do carro e de: " + velocidade + "Km/h.");
    }
    
    public void frear(){
        velocidade -= 10;
        JOptionPane.showMessageDialog(null, "A velocidade atual do carro e de: " + velocidade + "Km/h.");
    }
}
