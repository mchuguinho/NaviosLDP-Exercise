//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PortaContentores A= new PortaContentores("asd", "joao",12,100);
        Petroleiro C= new Petroleiro("lol", "jonas", 44, 90);
        Porto B= new Porto(10);

        B.addNavio(A);
        B.addNavio(C);
        B.addNavio(C);

        B.getNavioNome(1);
        B.getNavioNome(2);

        System.out.println(B.totalContentores());
        System.out.println(B.totalCarga());

        }
    }
}