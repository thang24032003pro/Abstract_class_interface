package EcoGrid_Refactor_MSSV;
interface CloudConnectable {
    void connectToCloud();
}

abstract class HardwareDevice {
    private String id;
    private double voltage;
    private double temperature;

    public HardwareDevice(String id, double voltage, double temperature) {
        this.id = id;
        this.voltage = voltage;
        this.temperature = temperature;
    }

    public String getId() { return id; }
    public double getVoltage() { return voltage; }
    public double getTemperature() { return temperature; }

    public abstract void monitorEnergy();
}

class BatteryBank extends HardwareDevice implements CloudConnectable {
    public BatteryBank(String id, double voltage, double temperature) {
        super(id, voltage, temperature);
    }

    @Override
    public void monitorEnergy() {
        System.out.println("BatteryBank [" + getId() + "] đang xả điện: " + getVoltage() + "V");
    }

    @Override
    public void connectToCloud() {
        System.out.println("BatteryBank [" + getId() + "] đang gửi dữ liệu Telemetry qua Wifi...");
    }
}

class CloudBillingService implements CloudConnectable {
    private String id;
    private String apiEndpoint;

    public CloudBillingService(String id, String apiEndpoint) {
        this.id = id;
        this.apiEndpoint = apiEndpoint;
    }

    @Override
    public void connectToCloud() {
        System.out.println("CloudBillingService [" + id + "] đang kết nối API bảo mật Cloud...");
    }
}

public class EcoGridSystem {
    public static void main(String[] args) {
        System.out.println("=== ECOGRID: KIỂM THỬ ĐA HÌNH INTERFACE ===");

        CloudConnectable[] cloudNodes = {
            new BatteryBank("BATT_01", 220.5, 35.2),
            new CloudBillingService("BILL_01", "https://api.ecogrid.vn/v1")
        };

        for (CloudConnectable node : cloudNodes) {
            node.connectToCloud();
        }
    }
}