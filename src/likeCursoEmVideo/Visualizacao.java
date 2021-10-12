package likeCursoEmVideo;

public class Visualizacao {
	
	private Gafanhotos espectador;
	private Video filme;
	
	
	public Visualizacao(Gafanhotos espectador, Video filme) {
		
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
		this.filme.setView(this.filme.getView() + 1);
	}
	
	public void avaliar() {
		this.filme.setAvaliacao(5);
	}
	
	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
	}

	public void avaliar(double porc) {
		
		int tot = 0;
		
		if(porc <= 20) {
			tot = 3;
		}
		
		else if(porc <= 50) {
			tot = 5;
		}
		
		else if(porc <= 90) {
			tot = 8;
		}
		
		else {
			tot = 10;
		}
		
		this.filme.setAvaliacao(tot);
	}
	
	public Gafanhotos getEspectador() {
		return espectador;
	}

	public void setEspectador(Gafanhotos espectador) {
		this.espectador = espectador;
	}

	public Video getFilme() {
		return filme;
	}

	public void setFilme(Video filme) {
		this.filme = filme;
	}

	@Override
	public String toString() {
		return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
	}
	
	
	
	
}
