class MainResta{ //Nombre de la clase
    public static void main(String[] args) { //metodo principal
        Resta a = new Resta(); //Creamos un primer objeto de la clase Resta

        a.setNum(40);//Le damos un valor al primer numero del objeto 'a'.
        a.setNum2(20);//Le damos un valor al segundo numero del objeto 'a'

        Resta b = new Resta();//Se crea un segundo objeto de la clase Resta.

        b.setNum(50);//Le damos un valor al primer numero del objeto 'b'
        b.setNum2(10);//Le damos un valor al segundo numero del objeto 'b'

        int r = a.getNum() - a.getNum2();// creamos un variable 'r' que almacene la resta de los numeros del objeto 'a'
        int r2 = b.getNum() - b.getNum2();// creamos una segunda varible que almacene la  de los numeros del objeto 'b'

        System.out.println(r);//Imprimimos el resultado de los numeros del objeto 'a'
        System.out.println(r2);//Imprimimos el resultado de los numeros del objeto 'b'
    }//Cerramos el metodo principal
}//Cerramos la clase