package fcade;

class Facade {
	
	private SubsistemaUm sis1;
	private SubsistemaDois sis2;
	private SubsistemaTres sis3;
	
	public Facade(){
		sis1 = new SubsistemaUm();
		sis2 = new SubsistemaDois();
		sis3 = new SubsistemaTres();
	}
	
	public void metodo123(){
		sis1.metodoUm(); 
		sis2.metodoDois();
		sis3.metodoTres(); 
	}
	
	public void metodo321(){
		sis3.metodoTres(); 
		sis2.metodoDois(); 
		sis1.metodoUm(); 
	}

	public void metodo213(){
		sis2.metodoDois(); 		 
		sis1.metodoUm();
		sis3.metodoTres();
	}
}