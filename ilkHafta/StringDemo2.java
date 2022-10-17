package ilkHafta;

public class StringDemo2 {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		String yeniMesaj = mesaj.replace(" ", "-");
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,5)); // "substring" komutu, bir indeksten diğer indekse kadar olan kısmı kesip alır
		
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		System.out.println(mesaj.toLowerCase()); //Mesajı küçük harfe çevirir
		System.out.println(mesaj.toUpperCase()); //Mesajı büyük harfe çevirir. 
		// Yukarıdaki iki komut, veri tabanlarında bir kelimeyi ararken kullanırız. Böylece eğer
		// data, Case Sensetive ise bu sayede aramalarımız daha kolay yapılır.
		
		System.out.println(mesaj.trim()); // Bu fonksiyon sayesinde başka kaynaklardan alındığı
		//için kaynak uyuşmazlığına uğrayan verileri, başka bir platforma başlarındaki ve sonlarındaki 
		//gereksiz boşlukları atıp yollayabiliriz
	}

}
