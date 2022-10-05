package exercicio1;

public class Teste {

	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado();
		Circulo circulo = new Circulo();
		Retangulo retangulo = new Retangulo();
		
		quadrado.setLado(5);
		
		retangulo.setAltura(5);
		retangulo.setBase(10);
		
		double vetor[];
		vetor = new double[5];
		
		vetor[0] = quadrado.calculaArea();
		vetor[1] = retangulo.calculaArea();
		vetor[2] = circulo.calculaArea();
		
		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		System.out.println(vetor[2]);
	}

}
