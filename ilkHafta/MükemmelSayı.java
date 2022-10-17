package ilkHafta;

public class MükemmelSayı {

	public static void main(String[] args) {
		int tamBölenlerTop = 0;
		int number = 7;
		
		for(int i=1; i<number; i++) {
			int remainder = number % i; //kalandan yola çıkılır
			
			if(remainder == 0) {
				tamBölenlerTop = i + tamBölenlerTop ;
				
				
			}
		}
		if(tamBölenlerTop == number){
			System.out.println("Mükemmel sayıdır");
		}else{
			System.out.println("Mükemmel sayı değildir");
		}
	}

}
