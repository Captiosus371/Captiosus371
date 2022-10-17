package ikinciHafta;

public class DortIslem {
	public DortIslem(int sayi7, int sayi8, int sayi9) {
		System.out.println(sayi7 + sayi8+ sayi9);
	}
	public int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	// müşteri 2 sayı yerine 3 sayının da toplanmasını isterse "metot overloading"
	// yaparak aynı "topla" metodunu kullanarak yeni bir özellik ekleyebilirsin

	public int topla(int sayi1, int sayi5, int sayi3) {
		return sayi1 + sayi5 + sayi3; // Aynı metot adını kullanabilmemizin sebebi metot "parametrelerinin" sayı
										// olarak birbirlerinden farklı olmasından kaynaklanmaktadır.
	}
}
