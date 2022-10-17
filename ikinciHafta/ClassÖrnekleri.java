package ikinciHafta;

public class ClassÖrnekleri {

	public static void main(String[] args) {
		//Classlar "referans tipi" olarak geçer
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		//olabildiğince az "new" kullanıp, heap alanı açmaya çalış çünkü "new" komutu bellekte çok yer kaplar
		customerManager = customerManager2; //Bu kısım stack alanındaki 101 ve 102 referans sayılarının ikisini de 102 yapar ve "customerManager" adlı değişkenin "heap" alanının silinmesini sağlar 
		customerManager.add();
		customerManager.remove();
		customerManager.update();
	
		// "int, double, float, byte" gibi değişkenlere "value type" yani "değer tipleri" denir.
	}
}
