package pbo;

//inheritance
public class DetailMobil extends Rental{
    
public DetailMobil(String nama, String mobil, String plat) {
        super(nama, mobil, plat);
    }

    public int getKota() {
        return Integer.parseInt(getPlat().substring(0, 2));
    }

    public String getKotaPlat() {
        String KodePlat = getPlat().substring(0, 2);
        if (KodePlat.equals("DA")) {
            return "Kota Banjarmasin";
        } else {
            return "Kota Lain";
        }
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() +
                "\nNama Kota: " + getKotaPlat();
    }
}