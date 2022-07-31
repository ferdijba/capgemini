package Classes;

public class Pessoa {

	// Atributos
	private float peso;
	private float altura;
	
	
	//Metodo construtor
	public Pessoa(float peso, float altura) {
		this.peso = peso;
		this.altura = altura;
		
	}
	
	// Metodos
	public float calcularIMC() {
		float imc = this.peso / (this.altura * this.altura);
		return imc;
	}

	
	//Metodos Getters e Setters
	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
	

}
