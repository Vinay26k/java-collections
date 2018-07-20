class car_helper implements vehicle, fourWheeler{
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
  /*  public void print() {
        System.out.println("I'm a fourwheeler vehicle");
    }*/
    public void print(){
        vehicle.super.print();
        fourWheeler.super.print();
        vehicle.blowHorn();
        System.out.println("I;m a car;");
    }
}
interface vehicle{
    default void print(){
        System.out.println("I'm a Vehicle");
    }
    static void blowHorn(){
        System.out.println("Blowing Horn!!");
    }
}
interface fourWheeler{
    default void print(){
        System.out.println("I'm a four wheeler!");
    }
}

class car{
    public static void main(String[] args) {
        vehicle obj = new car_helper();
        obj.print();
    }
}