public class Main {
    public static void main(String[] args) {
        Potenzfunktion p = new Potenzfunktion();
        Summenformel s = new Summenformel();
        FibonacciZahl f = new FibonacciZahl();
        FiboEndRekursion fe = new FiboEndRekursion();

        p.Run();
        s.Run();
        f.Run();
        fe.Run();

    }
}
