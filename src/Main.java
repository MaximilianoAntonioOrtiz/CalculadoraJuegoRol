import personajes.Personaje;

import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Personaje personaje1 = new Personaje();
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese nombre");
        personaje1.setNombrePersonaje(entrada.nextLine());
        System.out.println("ingrese vida Max");
        personaje1.setVidaMax(entrada.nextInt());
        int vidaActual = personaje1.getVidaMax();
        personaje1.setVidaActual(vidaActual);
        System.out.println(personaje1);
        do {
            System.out.println("Para restar vida presione 1 y para curarse presione 2");
            int valor = entrada.nextInt();

            switch (valor){
                case 1:
                System.out.println("ingrese Daño recibido:");
                personaje1.restaVida(entrada.nextInt());
                System.out.println(personaje1.toString());

            break;
            case 2:
                System.out.println("ingrese curacion recibida:");
                personaje1.sumaVida(entrada.nextInt());
                System.out.println(personaje1.toString());
                break;
            default:
                System.out.println("Opcion no valida");
        }

    }

        while(personaje1.getVidaActual()>-9);



}
    }
