import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        System.out.print("Birinci ededi daxil edin:");
        int eded1 = skan.nextInt();
        System.out.print("Ikinci ededi daxil edin:");
        int eded2 = skan.nextInt();
        System.out.print("Toplama ucun 0, Cixma ucun 1, Vurma ucun 2, Bolme ucun ise 3-u daxil edin:");
        int islem = skan.nextInt();
        if (islem == 0) {
            System.out.println("Toplama emeli icra olunacag.");
            int cem = eded1 + eded2;
            System.out.println("Ededlerin cemi:" + cem);
        }
        else if (islem == 1) {
                System.out.println("Cixma emeli icra olunacag.");
            int ferq = eded1 - eded2;
                    System.out.println("Ededlerin ferqi:" + ferq);
        }
        else if (islem == 2){
            System.out.println("Vurma emeli icra olunacag.");
            int vurma = eded1*eded2;
            System.out.println("Hasil:" + vurma);
        }
        else {
            System.out.println("Vurma emeli icra olunacag.");
            int bolme = eded1/eded2;
            System.out.println("Qismet:" + bolme);
        }
    }
}