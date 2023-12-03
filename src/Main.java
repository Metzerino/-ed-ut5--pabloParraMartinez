import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int numEncuestados;
        double [] salarioHabitantes;
        double sumaSueldos = 0, mediaSueldos;


        //Primero pregunto el numero de habitantes encuestados.
        System.out.println("Introduce el numero de personas encuestadas: ");
        numEncuestados = sc.nextInt();

        salarioHabitantes = new double[numEncuestados];

        //Creo un for para almacenar el sueldo de todos los habitantes y sumarlos para calcular la media.
        for(int i = 0; i < salarioHabitantes.length; i++){
            System.out.println("Introduce el salario del habitante " + (i+1));
            salarioHabitantes[i] = sc.nextDouble();
            sumaSueldos = sumaSueldos + salarioHabitantes[i];
        }

        //Declaro las variables mayor y menor salario y les asigno el primer valor del array para luego comparar.
        double mayorSalario = salarioHabitantes[0];
        double menorSalario = salarioHabitantes[0];

        //Utilizo el método sort para ordenar el array.
        Arrays.sort(salarioHabitantes);

        //Calculo la media de los sueldos.
        mediaSueldos = sumaSueldos / numEncuestados;

        //Creo un for para asumir que el mayor es el primero y comparo con el resto.
        for(int i = 0; i < salarioHabitantes.length;i++){
            if(salarioHabitantes[i] > mayorSalario){
                mayorSalario = salarioHabitantes[i];
            }
        }

        //Creo un for para asumir que el menor es el primero y comparo con el resto.
        for(int i = 0; i < salarioHabitantes.length;i++){
            if(salarioHabitantes[i] < menorSalario){
                menorSalario = salarioHabitantes[i];
            }
        }

        //Creo un for para mostrar todos los sueldos ordenados de manera decreciente.
        for(int i = numEncuestados - 1; i >= 0; i--){
            System.out.print(salarioHabitantes[i] + ", ");
        }

        //Muestro el resto de los datos.
        System.out.println("La media de los sueldos es de: " + mediaSueldos);
        System.out.println("El menor de los sueldos es de: " + menorSalario);
        System.out.println("El mayor de los sueldos es de: " + mayorSalario);
    }

}