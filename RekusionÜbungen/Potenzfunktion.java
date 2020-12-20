import java.util.Scanner;

public class Potenzfunktion {
    // 2 Parameter
    //return Ergebnis
    static Scanner reader = new Scanner(System.in);
    static int basis, exponent;
    public static void main(String[] args) {
        Potenzfunktion main = new Potenzfunktion();
        main.Input();
        main.Output();
    }
    int Potenzfunktion(int basis, int exponent){
        if (exponent == 1){
            return basis;
        }
        return basis * Potenzfunktion(basis,exponent-1);
    }
    private void Input(){
        System.out.print("Basis: ");
        basis = reader.nextInt();
        System.out.print("Exponent: ");
        exponent = reader.nextInt();
    }
    private void Output(){
        System.out.println(Potenzfunktion(basis, exponent));
    }
    public void Run(){
        System.out.println("Potenz rekursiv: ");
        Input();
        Output();
        System.out.println(" ");
    }

}
