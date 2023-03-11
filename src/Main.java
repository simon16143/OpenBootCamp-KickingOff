import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String value = JOptionPane.showInputDialog("Digita un valor para el if");
        String valueWhile = JOptionPane.showInputDialog("Digita un valor para el while y do While");

        int numeroIf = Integer.parseInt(value);
        int numeroWhile = Integer.parseInt(valueWhile);
        int numeroFor;
        int estacion = 1;
        int counter = 0;


        //If example
        if(numeroIf<=0){
            System.out.println("El número "+ (numeroIf) + " es negativo o cero");
        }else{
            System.out.println("El número "+ (numeroIf) + " es positivo");
        }

       //While example
        while(numeroIf<3){
            numeroIf++;
            System.out.println("El valor del while " + (numeroIf));
        }

        //DoWhile example
        do{
            numeroIf++;
            System.out.println("El valor del doWhile "+ (numeroIf));
        }while(numeroIf<3 && counter<2);

        //For Example
        for(numeroFor=0;numeroFor<3;numeroFor++){
            System.out.println("Este es el incremento del numero en el for " + (numeroFor));

        }

        //Switch example
        switch (estacion){
            case 1:
                System.out.println("primavera");
                break;
            case 2:
                System.out.println("verano");
                break;
            case 3:
                System.out.println("otoño");
                break;
            case 4:
                System.out.println("invierno");
                break;

        }
    }
}