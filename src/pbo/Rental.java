package pbo;


public class Rental {
    //atribut dan encapsulation
	private String nama;
	private String mobil;
	private String plat;

	//constructor
        public Rental(String nama, String mobil, String plat) {
        this.nama = nama;
        this.mobil = mobil;
        this.plat = plat;
         }
	
	//mutator (setter)
	public void setNama(String nama) {
		this.nama = nama;
	}

	public void setMobil(String mobil) {
		this.mobil = mobil;
	}

	public void setPlat(String plat) {
		this.plat = plat;
	}
	
	//accessor (getter)
	public String getNama() {
		return nama;
	}
	
	public String getMobil() {
		return mobil;
	}

	public String getPlat() {
		return plat;
	}
	
	public String displayInfo() {
		return "Nama: "+getNama()+ "\nMobil: "+getMobil()+"\nPlat: "+getPlat();
	}	

	//polymorphisme(overloading)
	public String displayInfo(String telepon) {
		return displayInfo() + "\nTelepon: "+telepon;
	}
	
}
