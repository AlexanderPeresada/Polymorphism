package polymorphism.defaultplatform.device;

public class DeviceB implements CalculationDevice {
    private double constantCoefficient;

    // Конструктор для ініціалізації константного коефіцієнта
    public DeviceB(double constantCoefficient) {
        this.constantCoefficient = constantCoefficient;
    }

    @Override
    public double performCalculation(double param1, double param2) {
        // Результат через складення параметрів, множення суми на константний коефіцієнт
        return (param1 + param2) * constantCoefficient;
    }
}
