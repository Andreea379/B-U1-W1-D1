import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        moltiplica();
        concatena();
        inserisciInArray();
    }
    public static int moltiplica(){
        int num1 = 12;
        int num2 = 3;
        int sum = num1 + num2;

        System.out.println(sum);
        return sum;
    }
    public static void concatena(){
        String nome = "Ciao";
        int num =  2;
        System.out.println(nome + num);
    }
    public static void inserisciInArray(){
        String[] arr ={"a", "b", "c", "d", "e"};
        String str ="Ciao";
        System.out.println(arr[0]+ arr[1] + arr[2]+ str + arr[3] + arr[4]);
    }


}