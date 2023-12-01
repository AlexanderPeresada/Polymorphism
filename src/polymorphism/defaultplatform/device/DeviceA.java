package polymorphism.defaultplatform.device;

public class DeviceA implements CalculationDevice {
    public double performCalculation(double param1, double param2) {
        // Результат через перемноження параметрів
        return param1 * param2;
    }
}
