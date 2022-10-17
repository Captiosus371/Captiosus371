package ikinciHafta;

public class VariableArguments {

	public static void main(String[] args) {
		int toplam = topla2(2,3,4,5,6);
		System.out.println(toplam);
	}
	public static int topla2(int... sayilar) { // burdaki 3 nokta array oluşturmak içindir. "sayilar" da arrayin adıdır
		int toplam = 0;
		for(int sayi : sayilar) {
			toplam += sayi; //  toplam = toplam + sayi demek
		}
		return toplam; //return bulunmak zorunda ve döndürdüğü değer hep int olmak zorunda "void" yerine int yazdığımız için
	}
}

//Nesne kullanılan uygulamalarda VariableArguments sorun olabilir. Bunun yerine koleksiyonlar kullanılabilir ve daha kolay olur
//Bu integer için kullanılabilir ama nesneler açısınından test edilebilirlik sorun çıkartıyor. 