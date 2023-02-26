public class Main {
    public static void main(String[] args) {
        int result;
        result = myFunction(10, 20, 62);
        Coche myCoche = new Coche();
        myCoche.incrementDoors();
        System.out.println(result);
        System.out.println(myCoche.puertas);

    }
    //First Part
    public static int myFunction (int a, int b, int d){
        return a + b + d;

    }

}
//Second Part
class Coche{
    public int puertas = 4;
    public void incrementDoors(){
        this.puertas++;

    }

}