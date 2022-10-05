package exercicio1;

public class Quadrado implements AreaCalculavel {
	public double lado;
	public double area;
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double calculaArea() {
		this.area = this.lado * this.lado;
		return area;
	}
	
}
