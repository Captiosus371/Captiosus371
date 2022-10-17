package ilkHafta;

public class ArraysOdev {

	public static void main(String[] args) {
		
		String[] ogrenciler = new String[3];// "string[3]"teki "3" dizideki eleman sayısıdır.
		ogrenciler[0] = "Ahmet";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
								// "length" dizeye verdiğimiz eleman sayısını sayar
		for(int i=0; i < ogrenciler.length; i++){
			System.out.println(ogrenciler[i]);
		}
		//Örnek 2
		
		double[] myList = {1.2, 6.3, 4.3, 5.6};
		double total = 0;
		double max = myList[0];
		for (double number: myList) {
			if(max < number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
			
		}
			System.out.println("En büyük:" + max);
			System.out.println("Toplam:" + total);
	}

}
