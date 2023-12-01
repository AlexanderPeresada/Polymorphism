package polymorphism.defaultplatform.device;

import java.util.Scanner;

public class Main {

    static double num1;
    static double num2;


    public static void main(String[] args) {

        double[] result = getResults(getNums());


        System.out.println("Result from Device A: " + result[0] + "\n" +
                "Result from Device B: " + result[1]);


    }

    private static double[] getNums() {
        System.out.print("Set param: ");
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        System.out.print("Set param: ");
        num2 = scanner.nextInt();

        return new double[]{num1, num2};
    }

    private static double[] getResults(double[] nums) {
        // Створення об'єктів для девайсів
        CalculationDevice deviceA = new DeviceA();
        CalculationDevice deviceB = new DeviceB(2.5); // Приклад константного коефіцієнта 2.5 для девайса B

        // Використання калькулятора з різними девайсами
        Calculator calculator = new Calculator();
        double resultA;
        resultA = calculator.getResult(deviceA, nums[0], nums[1]);
        double resultB;
        resultB = calculator.getResult(deviceB, nums[0], nums[1]);

        // Виведення результатів
        return new double[]{resultA, resultB};


    }

}



