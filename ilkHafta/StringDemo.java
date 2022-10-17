package ilkHafta;

public class StringDemo {

	public static void main(String[] args) {
		
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		System.out.println("Eleman Sayısı: " + mesaj.length());
		System.out.println("5.eleman" + mesaj.charAt(4));
		System.out.print(mesaj.concat("Yaşasın!")); // "concat" komutu, Farklı konumlardaki String
											//leri birleştirir.
		System.out.println(mesaj.startsWith("B")); // "startsWith" komutu boolean bir komuttur.
											//Bize o yazının istenilen karakterle başlayıp başlamadığını
											//verir.
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5]; //bu kısımda bu atamayı yapmamızın sebebi, aşağıda yazan getChars'ın doğru bir şekilde çalışmasını sağlamaktır.
		mesaj.getChars(0, 5, karakterler, 0);
					//ilk kısım bize başlanacak indeksi yazmamızı söyler
				//ikinci kısım bitiş indeksini söyler. yazılan indeks dahil değildir.
			//3. kısım bize değişkenin adını girmemizi söyler. Çünkü o ada atama yapılacaktır.
		//4.kısımda ise, atama yapılacak array'in kaçıncı elemanına atanılacağını verir.
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf(".")); //"indexOf" komutları bize eleman sayısını verir
	
	}	

}
