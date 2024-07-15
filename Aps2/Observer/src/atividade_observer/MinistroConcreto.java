package atividade_observer;

import java.util.Observable;
import java.util.Scanner;


public class MinistroConcreto extends Observable implements AtualizarSalario{

	
		double salario ;
		double aumento ;
		double salarionovo;
		String ativarAtualizacao;


		//Metodos
		@Override
		public void atualizarSalario() {
			System.out.println(" ATUALIZAÇÃO SALARIAL DOS MINISTROS");
			Scanner leitor = new Scanner(System.in);
			System.out.println("digite ' A ' se deseja atualizar o salario dos ministros no sistema");
			String ativarAtualizacao = leitor.nextLine();
			if (ativarAtualizacao.equalsIgnoreCase("a")) {
				System.out.print("informe o valor atual do salario: ");
				double salario = leitor.nextDouble();
				System.out.print("informe o valor do aumento: ");
				double aumento = leitor.nextDouble();
				double salarionovo = salario+(salario*aumento)/100;
				System.out.println("o salario dos ministros foi atualizado para R$"+ salarionovo);
				this.mudaEstado();
				
				leitor.close();	
				
				
			} else { 
				System.out.println("...");

			}
			
		
				}
	
			 
//leitor.close();		
			
		


		private void mudaEstado() {
			setChanged(); //mudar
			notifyObservers(ativarAtualizacao); // atualizar
			
		}


	

		
		 



		
			
		
	

	
}
