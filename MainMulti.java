class MainMulti{ //Nombre de la clase
    public static void main(String[] args) { //metodo principal
        Multi a = new Multi(); //Creamos un primer objeto de la clase Multi

        a.setNum(5);//Le damos un valor al primer numero del objeto 'a'.
        a.setNum2(5);//Le damos un valor al segundo numero del objeto 'a'

        Multi b = new Multi();//Se crea un segundo objeto de la clase Multi

        b.setNum(4);//Le damos un valor al primer numero del objeto 'b'
        b.setNum2(8);//Le damos un valor al segundo numero del objeto 'b'

        int r = a.getNum() * a.getNum2();// creamos un variable 'r' que almacene la resta de los numeros del objeto 'a'
        int r2 = b.getNum() * b.getNum2();// creamos una segunda varible que almacene la  de los numeros del objeto 'b'

        System.out.println(r);//Imprimimos el resultado de los numeros del objeto 'a'
        System.out.println(r2);//Imprimimos el resultado de los numeros del objeto 'b'
    }//Cerramos el metodo principal
}//Cerramos la clase