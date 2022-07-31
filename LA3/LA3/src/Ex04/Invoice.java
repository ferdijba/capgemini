package Ex04;

public class Invoice {

	private int codigoItem;
	private String descricao;
	private int quantidade;
	private float precoUnitario;

	// metodo construtor
	public Invoice(int codigoItem, String descricao, int quantidade, float precoUnitario) {

		this.setCodigoItem(codigoItem);
		this.setDescricao(descricao);
		this.setQuantidade(quantidade);
		this.setPrecoUnitario(precoUnitario);
	}

	public double getInvoiceAmount() {

		// Calculo do retorno da fatura
		return quantidade * precoUnitario;
	}

	// Getters e Setters
	public int getCodigoItem() {
		return codigoItem;
	}

	public void setCodigoItem(int codigoItem) {
		this.codigoItem = codigoItem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {

		// podemos fazer validações dentro do set igual exemplo abaixo.
		if (quantidade < 0) {
			this.quantidade = 0;

		} else {
			this.quantidade = quantidade;

		}
	}

	public float getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(float precoUnitario) {
		// podemos fazer validações dentro do set igual exemplo abaixo.
		if (precoUnitario < 0) {
			this.precoUnitario = 0;
		} else {
			this.precoUnitario = precoUnitario;
		}
	}

}
