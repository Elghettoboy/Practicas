import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; //librerias que se podrian usar 

public class MainExamen {
public static void main(String[] args) { // recordar que el metodo main va en el main vaya xd
    Scanner sc = new Scanner(System.in); // objeto para escanear los datos ingresados
    Examen ex1 = new Examen(); //creamos un objeto recordar= nombre de la clase + como se va a llamar tu objeto + new nombre de la clase + () parantesis vacios y punto y coma
    ArrayList<Examen> lista = new ArrayList<>(); 
    //para el arraylist es asi: ArrayList + notacion diamante "<>" y dentro de este el tipo de dato, en este caso la clase + el nombre de mi arraylist + = new Arraylist + notacion de diamante vacio y parentesis vacios y punto y coma

    System.out.println("dame tu nombre"); // pedir datos al usuario
    ex1.setNombre(sc.nextLine()); 
    System.out.println();//salto de linea
    System.out.println("dame tu correo");
    ex1.setCorreo(sc.nextLine());
    System.out.println();
    System.out.println("dame tu edad");
    ex1.setEdad(sc.nextInt());
    System.out.println();
    System.out.println("ingresa tu numero de control");
    ex1.setNumcon(sc.nextInt());
// para guardar los datos recordar que es= nombre de tu objeto + . + set y el nombre del atributo (recordar en UpperCamelCase) y entre los parentesis va el objeto escaner.
    lista.add(ex1);
    //agregamos con .add y entre los parentisis el objeto
    //recordar es = nombre de tu lista + .add + (nombre de tu objeto)

    System.out.println(lista);
    //aqui solo imprimimos la lista
    sc.close();
}    
}
