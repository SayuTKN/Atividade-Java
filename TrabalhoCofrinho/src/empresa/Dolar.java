package empresa;

import java.util.Objects;

public class Dolar extends Moeda{ //classe filha da classe Moeda
	double taxaDolar=5.16;

	public Dolar(float valorMoeda, String tipoMoeda) {
		super(valorMoeda, tipoMoeda);
	}

	@Override
	public void info() {
		super.info();
		System.out.println(tipoMoeda + valorMoeda);
	}
	double converterValor() {
		float total = (float) (valorMoeda*taxaDolar);
		System.out.println("Valor do dolar convertido em reais:" + total);
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
		Dolar other = (Dolar) obj;
		return Double.doubleToLongBits(taxaDolar) == Double.doubleToLongBits(other.taxaDolar);
	}
}