package likeCursoEmVideo;

public class Principal {
	
	public static void main(String[] args) {
		
		
		Video v[] = new Video[3];
		
		v[0] = new Video("Aula de poo");
		v[1] = new Video("Aula de banco de dados");
		v[2] = new Video("Aula de html 5");
		
		 //System.out.println(v[0].toString());
		//ystem.out.println(v[1].toString());
		 //System.out.println(v[2].toString());
		
		
		Gafanhotos g[] = new Gafanhotos[3];
		
		g[0] = new Gafanhotos("kleberson", 26, "Masc", "lordlof", 0);
		g[1] = new Gafanhotos("Jubileu", 22, "Masc", "juba", 0);
		g[2] = new Gafanhotos("Creusa", 50, "Fem", "Creuzita", 0);	
		
		System.out.println(g[0].toString());
		System.out.println(g[1].toString());
		System.out.println(g[2].toString());
		
		Visualizacao vis[] = new Visualizacao[5];
		
		vis[0] = new Visualizacao(g[0], v[2]);
		vis[0].avaliar();
		System.out.println(vis[0].toString());
	
		vis[1] = new Visualizacao(g[0], v[2]);
		vis[0].avaliar(87.0);
		System.out.println(vis[1].toString());
		
	}
}
