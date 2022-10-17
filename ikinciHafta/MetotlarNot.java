package ikinciHafta;

public class MetotlarNot {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		String konum = şehirVer();
		System.out.println(konum);
		int sayi = topla(5,7); // topla(5,7) metodunun doğru olması için public static kısmındaki topla() metoduna özeellik ekle
	}
	public static int topla(int num1, int num2) {
		return num1 + num2; //bu metot bize bu işlemi yaptırır.
	}
	
	public static String şehirVer() {
		return "Ankara"; //Bu metot Ankara yazısını döndürür ve gerekirse bunu printleyebilirsin
	}
}
