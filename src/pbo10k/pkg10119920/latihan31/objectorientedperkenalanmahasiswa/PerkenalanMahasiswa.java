/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan31.objectorientedperkenalanmahasiswa;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

class Mahasiswa {
    
    public String nim, nama;
    
    public void perkenalkanDiri() {
        System.out.println("Hallo Everyone");
        System.out.println("My NIM is " + nim);
        System.out.println("My Name is " + nama);
    }
}

public class PerkenalanMahasiswa {
    
    public static void main(String[] args) {
        
        Mahasiswa mhs = new Mahasiswa();
        mhs.nim = "10110269";
        mhs.nama = "Rizki Adam Kurniawan";
        mhs.perkenalkanDiri();
        System.out.println();
        
        mhs.nim = "10110270";
        mhs.nama = "Indra Tiola";
        mhs.perkenalkanDiri();
        System.out.println();
        
        mhs.nim = "10110271";
        mhs.nama = "Robi Tanzil Ganefi";
        mhs.perkenalkanDiri();
        System.out.println();
        
        mhs.nim = "10110269";
        mhs.nama = "Muhammad Nur Awaludin";
        mhs.perkenalkanDiri();
        System.out.println();
    }
}