package ilkHafta;

public class SayıBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[]{1,2,5,7,9,10};
		int aranacak = 5;
		boolean varMi = false;
		
		
		for(int i=0; i<6; i++){ //for(int sayı : sayilar) dizideki elemanlar böyle de gezilebilir
			if(sayilar[i] == aranacak) {
				varMi = true;
				break;
			}else {
				varMi = false;
			}
		}
			if(varMi) {
				System.out.println("Sayı mevcuttur");
	
			}else {
				System.out.println("Sayı mevcut değildir");
			}
	}
}
