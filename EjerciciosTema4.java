public class EjerciciosTema4 {
    public static void main(String[] args) {
        System.out.println("Aqui empieza el primer ejercicio");
        /*Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.*/
        int numero = 0;

        if (numero < 0){
            System.out.println("es negativo");
        } else if (numero == 0 ) {
            System.out.println("es igual a Cero");
        } else {
            System.out.println("es positivo");

        }

        System.out.println("Aqui empieza el segundo ejercicio");
        /*Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
            el bloque de código que tendrá el bucle deberá:
            Incrementar el valor de la variable en uno cada vez que se ejecute.
            Mostrarlo por pantalla cada vez que se ejecute.*/

        int numeroWhile = 0;
        while (numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        System.out.println("Aqui empieza el tercer ejercicio");
        /*Para el bucle Do While, deberás crear la misma estructura que en el While,
        pero solo se debe ejecutar una vez.
         */
        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while (numeroWhile<=3);



        System.out.println("Aqui empieza el cuarto ejercicio");
        /*Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será
        que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá
        mostrarse por pantalla.
         */

        for(int numeroFor= 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        System.out.println("Aqui empieza el quinto ejercicio");
        /*Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
         Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está.
          También habrá que poner un default para cuando el valor de la variable no sea una estación.
         */
        var estacion= "primavera";
        switch (estacion){
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
            break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            default:
                System.out.println("defalut");
        }


    }





}
