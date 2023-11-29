/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package siapakamu;

/**
 *
 * @author User
 */
public class Siapakamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen dosen;
        Mahasiswa mhs;
        
        dosen = new Dosen();
        System.out.println("NIP Dosen\t: 41227829930");
        dosen.siapaKamu();
        dosen.mengajarApa();
        System.out.println("");
        mhs = new Mahasiswa();
        System.out.println("NIM Mahasiswa\t: 10110269");
        mhs.siapaKamu();
        mhs.kelasApa();

    }
    
}

class Manusia {
    protected String nama;
    protected int umur;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public void siapaKamu(){
        System.out.println("Saya Manusia");
}
}

class Mahasiswa extends Manusia{
    private String nim;
    private String kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public void kelasApa(){
        System.out.println("Saya Rizal umur 18 tahun sedang balajar dikelas PBO2");  
    } 
    @Override
    public void siapaKamu(){
        System.out.println("Saya Mahasiswa");
}
}

class Dosen extends Manusia {
    private String nip;
    private String mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa(){
        System.out.println("Saya Rizki Adam Kurniawan umur 27 tahun sedang mengajar matakuliah PBO");
    }
    @Override
    public void siapaKamu(){
        System.out.println("Saya Dosen");
        
    }
  
}
