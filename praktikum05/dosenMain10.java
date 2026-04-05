package praktikum05;

import java.util.Scanner;

public class dosenMain10 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      dataDosen10 list = new dataDosen10();

      for (int i = 0; i < 10; i++) {
         System.out.println("-- Data Dosen ke-" + (i + 1) + " --");
         System.out.print("Kode          : ");
         String kode = sc.nextLine();
         System.out.print("Nama          : ");
         String nama = sc.nextLine();
         System.out.print("Jenis Kelamin (true=laki laki/false=perempuan): ");
         boolean jenisKelamin = sc.nextBoolean();
         System.out.print("Usia          : ");
         int usia = sc.nextInt();
         sc.nextLine();
         dosen10 d = new dosen10(kode, nama, jenisKelamin, usia);
         list.tambah(d);
      }
      System.out.println("Data dosen sebelum sorting: ");
      list.tampil();

      System.out.println("Data dosen setelah di sorting berdasarkan usia (ASC):");
      list.SortingASC();
      list.tampil();

      System.out.println("Data dosen di sorting berdasarkan usia menggunakan SELECTION SORT(DSC): ");
      list.sortingDSC();
      list.tampil();

      System.out.println("Data dosen di sorting berdasatkan usia menggunakan INSERTIION SORT (DSC): ");
      list.insertionSort();
      list.tampil();

   }
}
