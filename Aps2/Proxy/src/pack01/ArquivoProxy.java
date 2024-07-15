package pack01;

public class ArquivoProxy implements Arquivo {
	
	//atributos
	ArquivoReal a1;
	public String nome;
	
	//construct
	public ArquivoProxy(String nome, ArquivoReal a1) {this.nome = nome; this.a1 = a1;}
	
	//gets & sets
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}

	@Override
	public void exibir() {System.out.println("Exibindo arquivo proxy...");}
}