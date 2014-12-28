public class Product {
	public static final int reorder_point=3;
	private String id;
	private String nama;
	private int harga;
	private int persediaan;
	
	public Product(String id, String nama, int harga, int persediaan) {
		super();
		this.id = id;
		this.nama = nama;
		this.harga = harga;
		this.persediaan = persediaan;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public int getHarga() {
		return harga;
	}
	public void setHarga(int harga) {
		this.harga = harga;
	}
	public int getPersediaan() {
		return persediaan;
	}
	public void setPersediaan(int persediaan) {
		this.persediaan = persediaan;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String toString (){
		return getId()+"\t"+getNama()+"\t"+getHarga()+"\t"+getPersediaan();
		
	}
	public void tambahPersediaan(){
		persediaan += reorder_point;
	}
	public void tambahPersediaan(int jml){
		persediaan+=jml;
	}
}
