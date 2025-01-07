import java.awt.geom.Area;
import java.util.Scanner;

public class Es3 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        perimetroRettangolo();
        pariDispari();
        perimetroTriangolo();
    }
    public static void perimetroRettangolo(){
        System.out.println("inserire le dimensioni del rettangolo: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int perimetro = 2*(a+b);
        System.out.print("Il perimetro del rettangolo è: " + perimetro);

    }

    public static void pariDispari(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero: ");
        int a = scanner.nextInt();
        if(a % 2 == 0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }

    public static void perimetroTriangolo(){
        Scanner scanner =new Scanner(System.in);
        boolean isTriangle=true;
        System.out.println("inserisci un lato: ");
        double a = scanner.nextDouble();
        System.out.println("inserisci un lato: ");
        double b = scanner.nextDouble();
        System.out.println("inserisci un lato: ");
        double c = scanner.nextDouble();
        if((a<=(b+c))&&(b<=(a+c))&&(c<=(a+b))){
            System.out.print("Triangolo fattibile");
        }
        else {
            System.out.print("Triangolo NON fattibile");
        }
        double semiperimetro = (a + b+ c)/2;
        double Area = Math.sqrt(semiperimetro*(semiperimetro - a)* (semiperimetro -b)* (semiperimetro-c));
        System.out.println("L'area del triangolo è: " + Area);
   }
}
