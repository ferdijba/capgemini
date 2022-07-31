package Heranca;

import java.sql.Date;

public class Vendedor extends Funcionario {

	private int totalItensVendidos;
	private float comissaoPorItem;

	//Construtor
	public Vendedor() {
		super();
	}
	
	public float calcularSalario() {
		
		
		return super.getSalario() + this.comissaoPorItem * this.totalItensVendidos;
	}

	public int getTotalItensVendidos() {
		return totalItensVendidos;
	}

	public void setTotalItensVendidos(int totalItensVendidos) {
		this.totalItensVendidos = totalItensVendidos;
	}

	public float getComissaoPorItem() {
		return comissaoPorItem;
	}

	public void setComissaoPorItem(float comissaoPorItem) {
		this.comissaoPorItem = comissaoPorItem;
	}

	
	
	
	
}
