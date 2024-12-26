public class Pessoa {
    public String nome;
    public double peso;
    public double altura;
    public double imc;


    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;

        this.imc = peso / (altura * altura);
    }

    public void imprimePessoa(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + this.altura);
        System.out.println("IMC: " + this.imc);
    }
}
