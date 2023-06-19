package example02;

public class Main {
  public static void main(String[] args) {
    Aeroplane aeroplane = new Aeroplane();
    Bus bus = new Bus();
    Car car = new Car();
    Motorbike motorbike = new Motorbike();

    Helicopter helicopter = new Helicopter();

    LandTransport[] landTransports = {aeroplane, bus, car, motorbike};
    AirTransport[] airTransports = {helicopter,aeroplane};

    LandTransportDispatcher landTransportDispatcher = new LandTransportDispatcher(landTransports);
    AirTransportDispatcher airTransportDispatcher = new AirTransportDispatcher(airTransports);

    landTransportDispatcher.sayAllGo();
    landTransportDispatcher.sayAllStop();

    airTransportDispatcher.sayAllFly();
    airTransportDispatcher.sayAllLand();
  }
}