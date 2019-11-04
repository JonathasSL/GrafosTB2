
public class Aluno {
	
	private int id;
	private int idTema;
	
	public Aluno (String id, String idTema) {
		setId(id);
		setIdTema(idTema);
	}
	
	public int getId() {
		return id;
	}
	public String getIdAsString() {
		return String.valueOf(this.id);
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setId(String id) {
		this.id = Integer.parseInt(id);
	}
	
	public int getIdTema() {
		return idTema;
	}
	public String getIdTemaAsString() {
		return String.valueOf(this.idTema);
	}
	public void setIdTema(int idTema) {
		this.idTema = idTema;
	}
	public void setIdTema(String idTema) {
		this.idTema = Integer.valueOf(idTema);
	}
	
	

}
