class DefaultMethodsExample{
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}
interface vehicle{
    default void print(){
        System.out.println("I'm a Vehicle");
    }
}
interface fourWheeler{
    default void print(){
        System.out.println("I'm a four wheeler!");
    }
}