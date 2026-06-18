package Labaratory_22;

public class AdapterCharge {
    static void main(String[] args){
        Power380V power380V = new HighPower();
        Power220V phoneCharge220V = new StandardPower();
        Power220V power220V = new Adapter(power380V);
        phoneCharge220V.charge220V();

        System.out.println("Result voltage: "+power220V.charge220V() + "B");
    }
}

interface Power380V {
    int charge380V();
}

class HighPower implements Power380V {
    @Override
    public int charge380V() {
        System.out.println("High voltage is applied: 380 В");
        return 380;
    }
}

interface  Power220V  {
    int charge220V();
}

class StandardPower implements  Power220V  {
    @Override
    public int charge220V() {
        System.out.println("The standard voltage is applied: 220V");
        return 220;
    }
}

class Adapter implements  Power220V  {
    private Power380V highVolt;
    public Adapter(Power380V highVolt) {
        this.highVolt = highVolt;
    }
    @Override
    public int charge220V() {
        int maxVolt = highVolt.charge380V();
        int adaptedVoltage = maxVolt - 160;
        System.out.println("Charging drops " + maxVolt + "B to " + adaptedVoltage + "B");
        return adaptedVoltage;
    }
}
