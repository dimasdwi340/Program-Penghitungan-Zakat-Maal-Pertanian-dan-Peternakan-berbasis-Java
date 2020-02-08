/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programpenghitunganzakatmaal;

/**
 *
 * @author Media
 */
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

public class Programpenghitunganzakatmaal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        int a = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("*************************************");
        System.out.println("|| PROGRAM PENGHITUNGAN ZAKAT MAAL ||");
        System.out.println("||     PERTANIAN & PETERNAKAN      || ");
        System.out.println("*************************************");
        while (a == 1) {
            int b = 1;
            int j = 1;
            while (j == 1) {
                System.out.println("1. Zakat Maal Peternakan");
                System.out.println("2. Zakat Maal Pertanian");
                System.out.println("3. Zakat Maal Peternakan & Pertanian");
                System.out.println("4. Melihat syarat wajib zakat");
                System.out.print("Silahkan pilih zakat yang ingin anda hitung : ");
                int pilih = input.nextInt();
                System.out.println("============================================================================");
                umum um = new umum();
                if (pilih == 1) {
                    um.peternakan();
                    j = j + 1;
                }
                if (pilih == 2) {
                    um.pertanian();
                    j = j + 1;
                }
                if (pilih == 3) {
                    um.peternakan();
                    um.pertanian();
                    j = j + 1;
                }
                if (pilih == 4) {
                    syarat st = new syarat();
                    st.wajib();
                }
                if (pilih > 4) {
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    System.out.println("||Masukkan angka yang tepat!||");
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                }
            }

            int c = 0;
            while (c == 0) {
                System.out.println("Apakah anda ingin melakukan penghitungan lagi?");
                System.out.println("1. ya");
                System.out.println("2. tidak");
                int again = input.nextInt();
                if (again == 1){
                    c=c+1;
                }
                if (again == 2){
                    a=a+1;
                    b=b+1;
                    c=c+1;
                }
                if (again > 2) {
                    System.out.println("Masukkan Pilihan yang tepat!");
                }
                }
            }
            System.out.println("============================================================================");

        }
    }



class umum {

    public void peternakan() throws Exception {
        Peternakan pt = new Peternakan();
        Scanner input = new Scanner(System.in);
        System.out.println("1. Zakat Maal Peternakan Sapi");
        System.out.println("2. Zakat Maal Peternakan Kambing");
        System.out.println("3. Zakat Maal Peternakan Sapi & Kambing");
        System.out.println("Catatan : apabila hewan ternak yang anda pelihara jangka waktunya kurang dari satu tahun,Anda tidak wajib membayar zakat");
        int b = 1;
        while (b == 1) {
            System.out.print("Silahkan pilih jenis peternakan : ");
            int pet = input.nextInt();
            System.out.println("============================================================================");
            if (pet == 1) {
                pt.nisab();
                pt.sapi();
                b = b + 1;
            }
            if (pet == 2) {
                pt.nisab();
                pt.kambing();
                b = b + 1;
            }
            if (pet == 3) {
                pt.nisab();
                pt.sapi();
                pt.kambing();
                b = b + 1;
            }
            if (pet > 3) {
                System.out.println("Masukkan Pilihan yang tepat!");
            }
        }
    }

    public void pertanian() throws Exception {
        tani tan = new tani();
        Scanner input = new Scanner(System.in);
        Pertanian per = new Pertanian();
        System.out.println("1. Zakat Maal Pertanian(dengan menggunakan air hujan)");
        System.out.println("2. Zakat Maal Pertanian(tidak menggunakan air hujan)");
        System.out.println("3. Melihat ketentuan zakat maal pertanian");
        System.out.println("Silahkan pilih jenis pertanian : ");
        int pet = input.nextInt();
        int b = 1;
        while (b == 1) {
            if (pet == 1) {
                per.hujan();
                b = b + 1;
            }
            if (pet == 2) {
                per.nonhujan();
                b = b + 1;
            }
            if (pet == 3) {
                per.lanjutan();
                b = b + 1;
            }
            if (pet > 3) {
                System.out.println("Masukkan Pilihan yang tepat!");
            }
        }
    }

}

class Peternakan {

    public void sapi() {
        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung Zakat yang harus dibayarkan");
        System.out.print("Masukkan jumlah sapi yang anda miliki : ");
        int x = input.nextInt();
        if (x < 30) {
            System.out.println("Anda tidak wajib zakat");
        }
        if (x >= 30 && x < 40) {
            System.out.println("Anda harus membayar 1 ekor tabi' atau tabi'ah");
        }
        if (x >= 40 && x < 60) {
            System.out.println("Anda harus membayar 1 ekor musinnah");
        }
        if (x >= 60 && x < 70) {
            System.out.println("Anda harus membayar 2 ekor tabi' atau 2 ekor tabi'ah");
        }
        if (x >= 70 && x < 80) {
            System.out.println("Anda harus membayar 2 ekor musinnah");
        }
        if (x >= 80 && x < 90) {
            System.out.println("Anda harus membayar 3 tabi'");
        }
        if (x >= 90 && x <= 100) {
            System.out.println("Anda harus membayar 2 ekor tabi' dan 1 ekor musinnah");
        }
        if (x > 100) {
            if ((x / 10) % 3 == 0 & (x / 10) % 4 == 0) {
                System.out.println("Anda harus membayar " + (x / 30) + " ekor tabi'/tabi'ah atau " + (x / 40) + " ekor musinnah");
            }
            if (((x / 10) % 3) < ((x / 10) % 4)) {
                System.out.println("Anda harus membayar " + (x / 30) + " ekor tabi'/tabi'ah");
            } else {
                System.out.println("Anda harus membayar " + (x / 40) + " ekor musinnah");
            }
        }
        System.out.println("note : ");
        System.out.println("- tabi' => sapi jantan berusia satu tahun");
        System.out.println("- tabi'ah => sapi betina berusia satu tahun");
        System.out.println("- musinnah => sapi betina berusia dua tahun");
        System.out.println("============================================================================");
    }

    public void kambing() {
        Scanner input = new Scanner(System.in);
        int pembagi[] = new int[1];
        pembagi[0] = 100;
        System.out.println("Menghitung Zakat yang harus dibayarkan");
        System.out.print("Masukkan jumlah kambing yang anda miliki : ");
        int x = input.nextInt();
        if (x < 40) {
            System.out.println("Anda tidak wajib zakat");

        }
        if (x >= 40 && x < 120) {
            System.out.println("Anda harus membayar 1 ekor kambing");

        }
        if (x >= 120 && x < 201) {
            System.out.println("Anda harus membayar 2 ekor kambing");

        }
        if (x >= 201 && x < 300) {
            System.out.println("Anda harus membayar 2 ekor kambing");

        }
        if (x > 300) {
            int jumlah = x / pembagi[0];
            System.out.println("Anda harus membayar " + jumlah + " ekor kambing");
        }
        System.out.println("============================================================================");
    }

    public void nisab() throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Berapa lama jangka waktu/nisab anda memelihara hewan ternak ?(dalam bulan)");
        int x = input.nextInt();
        if (x < 11) {
            throw new Exception("Anda tidak wajib membayar zakat!");
        } else {
        }
    }
}

class Pertanian {

    public void hujan() throws Exception {
        tani tn = new tani();
        double y = tn.nisab(0.1);
        System.out.println("Anda wajib membayar zakat sebanyak " + y + " kg atau uang setara dengan harga yang berlaku");
        System.out.println("============================================================================");
    }

    public void nonhujan() throws Exception {
        tani tn = new tani();
        double y = tn.nisab(0.05);
        System.out.println("Anda wajib membayar zakat sebanyak " + y + " kg atau uang setara dengan harga yang berlaku");
        System.out.println("============================================================================");
    }

    public void lanjutan() {
        System.out.println("Nisab hasil pertanian adalah 5 wasaq"
                + ",1 wasaq = 60 sha',1 sha' = 3kg, jadi nishab zakat hasil pertanian adalah 300 sha' x 3 kg = 900 kg");
        System.out.println("============================================================================");
    }
}

class tani {

    public double nisab(double g) throws Exception {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[1];
        System.out.println("Berapa banyak hasil panen anda?(dalam kg)");
        int x = input.nextInt();
        arr[0] = x;
        if (x < 900) {
            throw new Exception("Anda tidak wajib membayar zakat!");
        } else {
            double hasil = arr[0] * g;
            return hasil;
        }
    }
}

class syarat {

    public void wajib() {
        System.out.println("Berikut ketentuan wajib Zakat : ");
        System.out.println("1. Islam");
        System.out.println("2. Merdeka");
        System.out.println("3. Berakal & baligh");
        System.out.println("4. Hartanya memenuhi nisab(jangka waktu yang sudah ditentukan)");
        System.out.println("============================================================================");

    }
}
