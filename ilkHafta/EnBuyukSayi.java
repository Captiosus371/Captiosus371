package ilkHafta;

public class EnBuyukSayi {

	public static void main(String[] args) {
		int sayi1 = 2;
		int sayi2 = 25;
		int sayi3 = 3;

		int[] sayilar = new int[] { sayi1, sayi2, sayi3 };

		if (sayilar[1] > sayilar[2] && sayilar[1] > sayilar[0]) {
			System.out.println("En büyük sayı: " + sayilar[1]);
		}
		if (sayilar[2] > sayilar[1] && sayilar[2] > sayilar[0]) {
			System.out.println("En büyük sayı: " + sayilar[2]);
		}
		if (sayilar[0] > sayilar[1] && sayilar[0] > sayilar[2]) {
			System.out.println("En büyük sayı: " + sayilar[0]);
		}

	}

}
