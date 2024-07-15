package atividade_observer;

public class AppSalario {
	public static void main(String[] args) {
		
		//observador
		Fun_publicconcreto salariofuncionario = new Fun_publicconcreto();		
		//observado
		MinistroConcreto salarioministro = new MinistroConcreto();
		//adicionar observador ao observado
		salarioministro.addObserver(salariofuncionario);
		 // invocação dos metodos
		salarioministro.atualizarSalario();

	}
}