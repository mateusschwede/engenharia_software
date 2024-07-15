package pack01;

public class ArquivoReal implements Arquivo {
	
	//atributos
	public String nome;
	
	//construct
	public ArquivoReal(String nome) {this.nome = nome;}
	
	//gets & sets
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}

	@Override
	public void exibir() {System.out.println("Exibindo arquivo real...");}
}