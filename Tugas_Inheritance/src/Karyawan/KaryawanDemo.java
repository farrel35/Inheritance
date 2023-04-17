package Karyawan;

/**
 *
 * Nama = Farrel Ardian
 * Nim = A11.2021.13437
 */

public class KaryawanDemo {
    public static void main(String[] args) {
        KaryawanTetap karyawanTetap = new KaryawanTetap(3, "Farrel Ardian", "A01");
        System.out.println("Nama\t\t= " + karyawanTetap.getNama());
        System.out.println("Nip \t\t= " + karyawanTetap.getNip());
        System.out.println("Gaji Pokok \t= " + karyawanTetap.getGajiPokok());
        System.out.println("Jumlah anak \t= " + karyawanTetap.getJumlahAnak());
        System.out.println("Total Gaji \t= " + karyawanTetap.hitungTotalGaji() + " (" + karyawanTetap.getGajiPokok()+ " + (" 
                + karyawanTetap.getJumlahAnak() + " * " + karyawanTetap.getTunjanganAnak() + "))");
        
        System.out.println("=================================================================");
        KaryawanKontrak karyawanKontrak = new KaryawanKontrak(10, 2, "Budi Santoso", "A02");
        System.out.println("Nama\t\t= " + karyawanKontrak.getNama());
        System.out.println("Nip\t\t= " + karyawanKontrak.getNip());
        System.out.println("Upah Harian \t= " + karyawanKontrak.getUpahHarian());
        System.out.println("Jumlah masuk \t= " + karyawanKontrak.getJumlahHariMasuk());
        System.out.println("Jumlah anak \t= " + karyawanKontrak.getJumlahAnak());
        System.out.println("Total Gaji \t= " + karyawanKontrak.hitungTotalGaji() 
                + " ((" + karyawanKontrak.getUpahHarian() + " * " + karyawanKontrak.getJumlahHariMasuk() + ") + (" 
                + karyawanKontrak.getJumlahAnak() + " * " + karyawanKontrak.getTunjanganAnak() + "))");
        
    }
}
