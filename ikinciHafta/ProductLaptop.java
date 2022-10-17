package ikinciHafta;

public class ProductLaptop {

	public static void main(String[] args) {
		Product product = new Product(5, "laptop", "", 7, 3, "");
		/*//iki kullanım da uygundur (alttaki de üstteki de)
		 * product.setName("Laptop"); product.setId(1); product.setDescription("Asus");
		 * product.setPrice(5000); product.setStockAmount(3);
		 * System.out.println(product.getKod());
		 */ // "get" komutu hazır değer verir, "set" komutu tüketicinin değer girmesini sağlar
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
	}

}
