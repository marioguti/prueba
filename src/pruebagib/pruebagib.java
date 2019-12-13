package pruebagib;

public class pruebagib {
	
	public static int suma() {
		int resultado=0;
		resultado=5+5;
		return resultado;
	}
	public static int resta() {
		int resultado=0;
		resultado=10-5;
		return resultado;
	}
	public static int multiplicacion() {
		int resultado=0;
		resultado=10*5;
		return resultado;
	}
	public static int division() {
		int resultado=0;
		resultado=20/2;
		return resultado;
	}
	public static int elevado() {
		int resultado=0;
		resultado=(int)Math.pow(5,2);
		return resultado;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("suma"+suma());
		System.out.println("resta"+resta());
		System.out.println("multiplicacion"+multiplicacion());
		System.out.println("division"+division());
		System.out.println("elevado"+elevado());
	}

}
