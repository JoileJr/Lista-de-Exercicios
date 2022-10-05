package exercicio1;

public class Retangulo implements AreaCalculavel {
	public double base;
	public double altura;
	public double area;
	
	
	public double getBase() {
		return base;
	}



	public void setBase(double base) {
		this.base = base;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	public double getArea() {
		return area;
	}



	public void setArea(double area) {
		this.area = area;
	}



	public double calculaArea() {
		this.area = this.base * this.altura;
		return area;
	}

}
