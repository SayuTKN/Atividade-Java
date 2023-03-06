package empresa;

import java.util.Objects;

public class Euro extends Moeda{ //classe filha da classe Moeda
	double taxaEuro=5.10;

	public Euro(float valorMoeda, String tipoMoeda) {
		super(valorMoeda, tipoMoeda);
	}

	@Override
	public void info() {
		super.info();
		System.out.println(tipoMoeda + valorMoeda);
	}
	double converterValor() {
		float total = (float) (valorMoeda*taxaEuro);
		System.out.println("Valor do euro convertido em reais:" + total);
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
		Euro other = (Euro) obj;
		return Double.doubleToLongBits(taxaEuro) == Double.doubleToLongBits(other.taxaEuro);
	}
}