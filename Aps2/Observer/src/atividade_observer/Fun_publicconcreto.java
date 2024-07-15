package atividade_observer;



import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

public class Fun_publicconcreto  implements Observer, AtualizarSalario {
	
	public void atualizarSalario() {
			
	System.out.println(" Atualizacao salarios dos ministros gerou atualizacao do teto dos funcionarios publicos");
	
	}

		//atualizar
	public void update(Observable arg0, Object arg1) {
		MinistroConcreto salarioobservado = (MinistroConcreto) arg0;
		String ativarAtualizacao = String.valueOf("a");
		
		if (ativarAtualizacao.equalsIgnoreCase("a")) {
			this.atualizarSalario();
			
		
	}

	
	

	}
	

}
