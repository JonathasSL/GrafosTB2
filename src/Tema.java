
public class Tema {
	
	private int id;
	private String nome;
	
	public Tema (int id, String nome) {
		setId(id);
		setNome(nome);
	}
	public Tema (String id, String nome) {
		setId(Integer.parseInt(id));
		setNome(nome);
	}
	
	//Getter & Setters
	public int getId() {
		return id;
	}
	public String getIdAsString() {
		return String.valueOf(this.id);
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
