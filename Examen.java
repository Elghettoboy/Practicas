public class Examen {
    String nombre, correo; //aqui declaramos los atributos con su tipo de dato
    int edad, numcon;
Examen(){ //el constructor vacio

}
  
public String getNombre(){      // recordar para el get= public + el tipo de dato del atributo + get y el nombre del atributo con Uppercamlecase + parentesis abrir y cerrar llaves
    return nombre;             // recordar que los get van return + el atributo
}

public void setNombre(String nombre){ // recordar que para los set= public void (recordar que los set van con void) + set y el nombre del atributo igual con Uppercamelcase + adentro de los parentesis (el tipo de dato y el atributo) + abrimos y cerramos llaves
    this.nombre=nombre;          //recordar que los sets van this. + el nombre del atributo = al atributo
}

public String getCorreo(){
    return correo;
}

public void setCorreo(String correo){
    this.correo=correo;
}

public int getEdad(){
    return edad;
}

public void setEdad(int edad){
    this.edad= edad;
}

public int getNumcon(){
    return numcon;

}

public void setNumcon(int numcon){
    this.numcon=numcon;
}

@Override
public String toString() { // metodo toString = public + String + toString()
    return "Examen [nombre=" + nombre + ", correo=" + correo + ", edad=" + edad + ", numcon=" + numcon + "]";
    // recordar que retornamos todos los atributos 
}


}
