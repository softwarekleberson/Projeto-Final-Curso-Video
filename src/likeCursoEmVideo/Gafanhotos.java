package likeCursoEmVideo;

public class Gafanhotos extends Pessoa {
	
	private String login;
	private int totAssistido;
	
	public Gafanhotos(String nome, int idade, String sexo, String login, int totAssistido) {
		
		super(nome, idade, sexo);
		this.login = login;
		this.totAssistido = totAssistido;
	}
	
	public void viuMaisUm() {
		
	}

	public String getLogin() {
		return login;
	}

	
	public void setLogin(String login) {
		this.login = login;
	}

	
	public int getTotAssistido() {
		return totAssistido;
	}

	
	public void setTotAssistido(int totAssistio) {
		this.totAssistido = totAssistio;
	}
	
	
}
