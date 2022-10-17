package ilkHafta;

public class SwitchBlokları {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) { // "switch" komutu, bir değişkenin değerlerinin birden fazla değere eşit
			case 'A':	// olma olasılığına sahip olduğunda kullanılır. Else if blokları gibi.
				System.out.println("Mükemmel: Geçtiniz");
				break;
			case 'B': //case'in altına bir şey yazmazsak, bir altındaki case ile bir olmuş gibi davranır.
			case 'C':
				System.out.println("Çok iyi: Geçtiniz");	
				break;
			case 'D':
				System.out.println("Fena değil: Geçtiniz");	
				break;
			case 'F':
				System.out.println("Kötü: Geçemediniz");	
				break;
		}

	}

}
