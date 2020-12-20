import java.util.Scanner;

    import java.util.Scanner;

    public class Summenformel {
        //Stack-Overflow
        //Bei Rekursion ohne Terminierungsbedingung kann es vorkommen, dass der Zwischenspeicher voll wird
        static Scanner reader = new Scanner(System.in);
        static int n;
        public static void main(String[] args) {
            Summenformel main = new Summenformel();

            main.InputN();
            main.OutPut();

        }
        private int Rekursion(int n){
            if(n == 1){
                System.out.print(n + " = ");
                return 1;
            }
            System.out.print(n + " + ");
            return (n + Rekursion(--n));
        }
        private int Iterativ(int n){
            int sum = 0;
            for (int i = 1; i <= n; i++){
                System.out.print(i);
                if (i < n) {
                    System.out.print(" + ");
                }
                sum += i;
            }
            System.out.print(" = ");
            return sum;
        }
        private void InputN(){
            System.out.print("Number for n: ");
            n = reader.nextInt();
        }
        private void OutPut(){
            if(n > 0) {
                System.out.println("Rekursion: ");
                System.out.print(Rekursion(n));
                System.out.println(" ");
                System.out.println("Iterativ: ");
                System.out.println(Iterativ(n));
            }
            else {
                System.out.println("ERROR!");
            }
        }
        public void Run(){
            System.out.println("Summenformel rekursiv: ");
            InputN();
            OutPut();
            System.out.println(" ");

        }
    }


