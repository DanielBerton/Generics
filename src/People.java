
public class People {
	public String nome;
	public String cognome;
	public int eta;
	public People(String nome, String cognome,int eta){
		this.nome= nome;
		this.cognome=cognome;
		this.eta=eta;
	}
	 
	public String toString(){
		return nome +" "+ cognome+" " + eta + "\n";
	}
}
