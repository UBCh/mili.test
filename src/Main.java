public class Main {
    public static void main(String[] args) {

        BonusMillesServices run = new BonusMillesServices();
        int resultZero = run.calculate(0, 20);
        System.out.println(resultZero);

        int resultMini = run.calculate(20, 20);
        System.out.println(resultMini);

        int resultMax = run.calculate(2_000_000_001, 20);
        System.out.println(resultMax);
    }
}