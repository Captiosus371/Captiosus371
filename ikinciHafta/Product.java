package ikinciHafta;

public class Product {

	public Product(int id, String name, String description, double price, int stockAmount, String kod) { // Bu bir
																											// "constructor"
																											// dır
		System.out.println("Yapıcı blok çalıştı"); // constructor'In parantezinin içerisindeki veriler eksik olur ise
													// constructor çalışamaz.
	}

	public Product(){
		
	}

	{
		// bir tane boş constructor açarsak ProductLaptop'da yorum bloğu olan bölümü de
		// rahatlıkla kullanabiliriz. aynı anda iki yolu da çalıştırabilecek durumda
		// oluruz. Buna "overloading" denir
	}

	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String kod;

//Bir class sadece tek bir görevi yapar, SOLİD prensiplerinin ilki. 
	// single responsibility yani bir classa tek bir sorumluluk verilmesi sorun
	// oluşma ihtimalini azaltır

	public String getKod() { // eğer "kod" un tüketici tarafından değiştirilmesini istemiyorsan
		return this.name.substring(0, 1) + id; // set kod olan bloğu komple sil
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name; // burdaki "this" komutu, bu classta bulunan "name" in alınmasını sağlar. aksi
							// taktirde başka classlardaki "name"ler ile karışabilir.
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
}
