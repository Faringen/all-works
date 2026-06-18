package Labaratory_21;

public class TransportCompany {
    static void main(){
        Logistics roadLog = new RoadLogistics();
        roadLog.delivery();
        Logistics shipLog = new SeaLogistics();
        shipLog.delivery();
        Logistics airLog = new AirLogistics();
        airLog.delivery();
    }
}

interface Transport {
    void deliver();
}

class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Доставка автомобилем по суше.");
    }
}
class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Доставка кораблем по морю.");
    }
}
class Airplane implements Transport {
    @Override
    public void deliver() {
        System.out.println("Доставка по воздуху на самолете.");
    }
}

abstract class Logistics {
    public abstract Transport createTransport();
    public void delivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}

class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}

class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}

class AirLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new Airplane();
    }
}
