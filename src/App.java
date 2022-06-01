
import java.util.Scanner;

import bangunruang.PrismaSegitiga;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner keyboard = new Scanner(System.in);
    
        PrismaSegitiga prismaSegitiga = new PrismaSegitiga();
    
        System.out.println("PROGRAM MENGHITUNG VOLUME PRISMA SEGITIGA");
        System.out.println("=========================================");
        System.out.print("Masukkan Alas (a) (cm): ");
        prismaSegitiga.a = keyboard.nextInt();
        System.out.print("Masukkan Tinggi (t) (cm): ");
        prismaSegitiga.t = keyboard.nextInt();
        System.out.print("Masukkan TInggi Prisma (cm): ");
        prismaSegitiga.tinggi = keyboard.nextInt();
        System.out.println("=========================================");
        prismaSegitiga.tampilkanVolumePrismaSegitiga();
    }
}
