public class Main {
    public static void main(String[] args) {
        Conta p1 = new Conta(111,  "jubileu");

        Conta p2 = new Conta(222,  "creusa");

        p1.abrirConta("cc");

        p2.abrirConta("cp");

        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(1000);

        p2.fecharConta();

        System.out.println(p1.toString());
        System.out.println(p2.toString());








    }
}