package day2_homework_32;

public class Main {

	public static void main(String[] args) {
		
		// Fonksiyon (Method) Overloading Ile Calismak
		// Adi Ayni Olan Fonksiyonlarin Gecerli Olmas� Icin 
		// Parametre Sayilarinin Farkli Olmasi Gerekiyor 
		FourOperations fourOperations = new FourOperations();
		System.out.println("2 Parameters Total Operarion : " + fourOperations.total(2,3));
		System.out.println("3 Parameters Total Operarion : " + fourOperations.total(2,3,7));
	}
}