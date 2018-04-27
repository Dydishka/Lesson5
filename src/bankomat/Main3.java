package bankomat;

public class Main3 {
    public static void main(String[] args) {
        ATM belBank = new BelBank("Белбанк", "NCR", 100, 50, 75);
        belBank.menu();
    }
}