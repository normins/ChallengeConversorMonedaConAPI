import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void mostarMenu() throws IOException, InterruptedException{
        int opcion;
        double valorAConvertir;
        //valorAConvertir = 0;
        Scanner entrada = new Scanner(System.in);

        // Información sobre la conversión solicitada
        ConvertirOpcion moneda1A2 = new ConvertirOpcion();

        do {
            System.out.println("****************************************");
            System.out.println("Sea bienvenida/o al conversor de moneda");
            System.out.println("1) Dólar =>> Peso argentino");
            System.out.println("2) Peso argentino =>> Dólar ");
            System.out.println("3) Dólar =>> Real brasileño");
            System.out.println("4) Real brasileño =>> Dólar ");
            System.out.println("5) Dólar =>> Peso colombiano");
            System.out.println("6) Peso colombiano =>> Dólar ");
            System.out.println("7) Salir");

            System.out.println("Elija una opción válida");

            opcion = entrada.nextInt();


            switch (opcion) {
                case 1:
                    moneda1A2.ingresarDato();
                    valorAConvertir = moneda1A2.getValor();
                    moneda1A2.convertir("USD", "ARS", valorAConvertir);
                    break;
                case 2:
                    moneda1A2.ingresarDato();
                    valorAConvertir = moneda1A2.getValor();
                    moneda1A2.convertir("ARS", "USD", valorAConvertir);
                    break;
                case 3:
                    moneda1A2.ingresarDato();
                    valorAConvertir = moneda1A2.getValor();
                    moneda1A2.convertir("USD", "BRL", valorAConvertir);
                    break;
                case 4:
                    moneda1A2.ingresarDato();
                    valorAConvertir = moneda1A2.getValor();
                    moneda1A2.convertir("BRL", "USD", valorAConvertir);
                    break;
                case 5:
                    moneda1A2.ingresarDato();
                    valorAConvertir = moneda1A2.getValor();
                    moneda1A2.convertir("USD", "COP", valorAConvertir);
                    break;
                case 6:
                    moneda1A2.ingresarDato();
                    valorAConvertir = moneda1A2.getValor();
                    moneda1A2.convertir("COP", "USD", valorAConvertir);
                    break;
                case 7:
                    System.out.println("Finalizando la aplicación.");
                    System.exit(0);
                default:
                    System.out.println("Opción incorrecta");
            }

        } while (opcion != 7);
    }
}
