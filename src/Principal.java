
public class Principal {

    public static void main(String[] args) {
        //Permite el ingreso de conversiones hasta que se elija la opción Salir.
        try{
            Menu.mostarMenu();
        } catch(Exception e){
            System.out.println("Inconvenientes en la conversión");
        }
        System.out.println("Finalizando la aplicación");
    }
}
