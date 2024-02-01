public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double m = 1.87; // метра(ов)
        int kg = 98; // килограмм
        int bmi = service.calculate(m, kg);
        System.out.println(bmi);
    }
}
