package empresa;

import java.util.ArrayList;

public class Cofrinho {
	
    private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	public void adicionar(Moeda coin) {
		listaMoedas.add(coin);
	}
	public void remover(Moeda coin) {
		listaMoedas.remove(coin);
	}
	public void listar() {
		listaMoedas.forEach(moeda->moeda.info());
		}
	public void totalConvertido() {
		float total=0;
		for (Moeda coin:listaMoedas) {
			total += coin.converterValor();
		}
	}
}