package polymorphism.defaultplatform.device;

public class Calculator {
    public double getResult(CalculationDevice device, double param1, double param2) {
        return device.performCalculation(param1, param2);
    }
}
