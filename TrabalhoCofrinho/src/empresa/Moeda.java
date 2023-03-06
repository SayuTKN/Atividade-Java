package empresa;

import java.util.Objects;

public abstract class Moeda {
	float valorMoeda;
	String tipoMoeda;
	public Moeda(float valorMoeda, String tipoMoeda) {
		super();
		this.valorMoeda = valorMoeda;
		this.tipoMoeda = tipoMoeda;
		
	}
	
	abstract double converterValor();
	public void info() {
		System.out.println("-------------------");
	}
	@Override
	public boolean equals(Object obj) { //comparação de objetos na memória
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Objects.equals(tipoMoeda, other.tipoMoeda) && valorMoeda == other.valorMoeda;	
	}
}