package empresa;

import java.util.Objects;

public class Real extends Moeda { //classe filha da classe Moeda
	double taxaReal=1;

	public Real(float valorMoeda, String tipoMoeda) {
		super(valorMoeda, tipoMoeda);
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println(tipoMoeda + valorMoeda);
	}
	double converterValor() {
		float total = (float) (valorMoeda*taxaReal);
		System.out.println("Valor do real:" + total);
		return total;
	}
	@Override
	public boolean equals(Object obj) { //comparação de objetos na memória
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Real other = (Real) obj;
		return Double.doubleToLongBits(taxaReal) == Double.doubleToLongBits(other.taxaReal);
	}
}