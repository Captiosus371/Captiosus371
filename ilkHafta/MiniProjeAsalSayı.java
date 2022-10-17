package ilkHafta;

public class MiniProjeAsalSayı {

	public static void main(String[] args) {
		// 1 ve kendinden başka böleni olmayacak == 1 ve x dışında onu bölenleri test et
		int number = 1;
		boolean isPrime = true;
		
		if(number == 1){
			System.out.println("Sayı asal değildir");	// number ==1 olduğunda çıktı "Sayı asal değildir, Sayı asaldır" şeklinde oluyor çünkü algoritmanın altındaki if bloklarını da çalıştırıyor. bunu engellemek için return; komutunu kullanıp en yukarıdaki class bloğuna döndürmemiz gerek.
			return;
		}
		if(number < 1){
			System.out.println("Geçersiz sayı");
		}
		
		
		for(int i=2; i<number; i++) {
			if(number%i == 0);
			isPrime = false;
		}
		
		if(isPrime){ //if(isPrime == true) demek yerine direkt true olan bir durumu içeri yazmak, o şartın kabul olduğu durumların geçişine izin vermesini sağlar
			System.out.println("Sayı asaldır");
		}else{
			System.out.println("Sayı asal değildir");
		}
		
	}
}