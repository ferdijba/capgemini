package Heranca;

import java.sql.Date;

public class Principal {

	public static void main(String[] args) {
		
		Vendedor v = new Vendedor();
		Motorista m = new Motorista();
		
		v.setNome("Ferdi");
		v.setSalario(12500);
		v.setCpf("054545444");
		v.setDataNasc(new Date(0));
		
		v.setComissaoPorItem(10);
		v.setTotalItensVendidos(5);
		
		v.calcularSalario();
		
		System.out.println("O salario do vendedor �:"+ v.calcularSalario());
		
	
		
 	
		
		

	}

}
