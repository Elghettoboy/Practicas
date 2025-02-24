import java.util.Scanner;
class Calculadora{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int opcion;
    
        
    do{
        System.out.println("--------------------");
        System.out.println(" Bienvenido ");
        System.out.println("\n Elige una opcion: ");
        System.out.println("\n 1.Sumar");
        System.out.println("\n 2.Restar");
        System.out.println("\n 3.Multiplicar");
        System.out.println("\n 4.Dividir");
        System.out.println("\n 5.Salir");
        System.out.println("---------------------");
        System.out.println("Opcion: ");
        
        opcion=sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingresa el primer numero ");
                int num=sc.nextInt();
                System.out.println("Ingresa el segundo numero");
                int num2=sc.nextInt();
                System.out.println("La suma de los numeros es: " + (num+num2));
                break;
            case 2:
                System.out.println("Ingresa el primer numero ");
                int num3=sc.nextInt();
                System.out.println("Ingresa el segundo numero");
                int num4=sc.nextInt();
                System.out.println("La resta de los numeros es: " + (num3-num4));
                break;
            
            case 3:
                System.out.println("Ingresa el primer numero ");
                int num5=sc.nextInt();
                System.out.println("Ingresa el segundo numero");
                int num6=sc.nextInt();
                System.out.println("La multiplicacion de los numeros es: " + (num5*num6));
                break;
            
            case 4:
                System.out.println("Ingresa el primer numero ");
                int num7=sc.nextInt();
                System.out.println("Ingresa el segundo numero");
                int num8=sc.nextInt();
                System.out.println("La divison de los numeros es: " + (num7/num8));
                break;
            
            case 5:
                System.out.println("Hasta luego");
                break;    
            
            default:
                System.out.println("Ingresa una opcion valida");
                break;
        }

    } while(opcion !=5);
    sc.close();
}
}