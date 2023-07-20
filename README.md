# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Rental`, `DetailMobil`, dan `MobilBeraksi` adalah contoh dari class.

```bash
public class Rental {
    ...
}

public class DetailMobil extends Rental {
    ...
}

public class MobilBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `rtl[i] = new DetailMobil(nama, mobil, plat);` adalah contoh pembuatan object.

```bash
rtl[i] = new DetailMobil(nama, mobil, plat);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `npm`, dan `plat`  adalah contoh atribut.

```bash
String nama;
String mobil;
String plat;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Rental` dan `DetailMobil`.

```bash
public Rental(String nama, String mobil, String plat) {
    this.nama = nama;
    this.mobil = mobil;
    this.plat = plat;
}

public DetailMobil(String nama, String mobil, String plat) {
        super(nama, mobil, plat)
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama`, `setNpm`, dan `setPlat` adalah contoh method mutator.

```bash
public void setNama(String nama) {
		this.nama = nama;
	}

	public void setMobil(String mobil) {
		this.mobil = mobil;
	}

	public void setPlat(String plat) {
		this.plat = plat;
	}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getMobil`, `getPlat`, `getKota`, dan `getKotaPlat` adalah contoh method accessor.

```bash
public String getNama() {
		return nama;
	}
	
	public String getMobil() {
		return mobil;
	}

	public String getPlat() {
		return plat;
	}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`, `mobil`, dan `plat` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String mobil;
private String plat;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `DetailMobil` mewarisi `Rental` dengan sintaks `extends`.

```bash
public class DetailMobil extends Rental{
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Rental` merupakan overloading method `displayInfo` dan `displayInfo` di `DetailMobil` merupakan override dari method `displayInfo` di `Rental`.

```bash
public String displayInfo(String telepon) {
		return displayInfo() + "\nTelepon: "+telepon;
}

@Override
    public String displayInfo() {
        return super.displayInfo() +
                "\nNama Kota: " + getKotaPlat();
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getKotaPlat`.

```bash
public String getKotaPlat() {
        String KodePlat = getPlat().substring(0, 2);
        if (KodePlat.equals("DA")) {
            return "Kota Banjarmasin";
        } else {
            return "Kota Lain";
        }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(int i=0; i<rtl.length; i++){
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
        System.out.print("Masukkan Nama Pelanggan "+(i+1)+": ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Nama Mobil "+(i+1)+": ");
        String mobil = scanner.nextLine();  
        System.out.print("Masukkan No Plat "+(i+1)+": ");
        String plat = scanner.nextLine();

System.out.println("Data Rental");
            System.out.println(data.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `DetailMobil[] rtl = new DetailMobil[2];` adalah contoh penggunaan array.

```bash
DetailMobil[] rtl = new DetailMobil[2];
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
|     | **TOTAL**      | **85** |

## Pembuat

Nama: M. Raihan Al Farabi
NPM: 2110010516
