public class ServiceStation implements CheckVehicle {
    /*
    public void check(Auto car, Auto bicycle, Auto truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
            }
            car.checkEngine();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
        }
    }*/
    @Override
    public void check(Car car){
        printCheck(car);
        car.checkEngine();
    }
    @Override
    public void check(Bicycle bicycle){
        printCheck(bicycle);
        bicycle.checkEngine();
    }
    @Override
    public void check(Truck truck){
        printCheck(truck);
        truck.checkEngine();
        truck.checkTrailer();
    }
    private void printCheck(Vehicle vehicle){
            System.out.println("Обслуживаем " + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                vehicle.updateTyre();
        }
    }
}
