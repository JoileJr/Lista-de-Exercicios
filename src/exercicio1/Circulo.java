package exercicio1;

public class Circulo implements AreaCalculavel {
	public double pi = 3.14;
	public double raio;
	public double area;
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double calculaArea() {
		this.area = this.pi * (this.raio * this.raio);
		return area;
	}

}
