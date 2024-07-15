package pack01;

public class ProxyApp {
	public static void main(String[] args) {
		
		ArquivoReal a1 = new ArquivoReal("Manual.pdf");
		ArquivoProxy ap1 = new ArquivoProxy("Instruções.txt", a1);
		
		a1.exibir();
		ap1.exibir();
		System.out.println("Arq Proxy: "+ap1.getNome());
		
	}
}