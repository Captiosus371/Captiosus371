package ilkHafta;

public class SesliHarfler {

	public static void main(String[] args) {
		
		char harf = 'I';
		
		switch(harf) { // "switch" fonksiyonu, birkaç farklı girdi için ortak cevap oluşturmamızı sağlar
		case 'I':
		case 'U':
		case 'O':
		case 'A':
			System.out.println("Kalın sesli harf");
			break;
			default: // "default" komutu, case ile belirtilen şartların dışındaki şartlar için ortak cevap oluşturur
				System.out.println("İnce sesli harf");
		}

	}

}
