public class Truck extends Auto {

  @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

@Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
@Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
