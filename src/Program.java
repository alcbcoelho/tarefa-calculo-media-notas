import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double val1 = getGradeInput(Order.PRIMEIRA, sc);
        double val2 = getGradeInput(Order.SEGUNDA, sc);
        double val3 = getGradeInput(Order.TERCEIRA, sc);
        double val4 = getGradeInput(Order.QUARTA, sc);

        List<Grade> grades = new ArrayList<>(Arrays.asList(new Grade(val1), new Grade(val2), new Grade(val3), new Grade(val4)));

        printAverageGrade(grades);
    }

    public static double getGradeInput(Order order, Scanner scanner) {
        System.out.print("Insira a " + order.toString().toLowerCase() + " nota: ");
        return scanner.nextDouble();
    }

    private static Grade getAverageGrade(List<Grade> grades) {
        double sum = grades.stream().map(Grade::getValue).reduce(0.0, Double::sum);
        return new Grade(sum / grades.size());
    }

    public static void printAverageGrade(List<Grade> grades) {
        Grade averageGrade = getAverageGrade(grades);
        System.out.println("\nMédia entre as notas: " + averageGrade);
    }
}
