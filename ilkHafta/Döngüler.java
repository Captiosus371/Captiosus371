package ilkHafta;

public class Döngüler {

	public static void main(String[] args) {

		for (int i = 2; i <= 10; i += 2) {
			// "i+=2" demek, i'yi 2'şer 2'şer arttır demek.
			System.out.println(i);
		} 	// "int i=2" bölümü, for komutunun bulunduğu bloğa dahil olduğu için "i" sadece
			// o aralıkta "2" değerindedir.
	System.out.println("For Döngüsü Bitti");

		int i=2;
		while(i<10) {
			System.out.println(i);
			i += 2;
		}
		System.out.println("While Döngüsü Bitti");
		
		//do-while
		int j=1;
		do {  //Bu döngünün while döngüsünden farkı, koşulun sağlanmamasına rağmen "do"da verilen komutun yapılmasıdır. Whileda sadece şart sağlandığı müddetçe komut yerine getirilir.
			System.out.println(j);
			j+=2;
		}while(j<10);
	}
}