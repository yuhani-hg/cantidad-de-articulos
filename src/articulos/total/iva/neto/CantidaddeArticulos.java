package articulos.total.iva.neto;
import java.util.Scanner;
public class CantidaddeArticulos {
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        float law, kurae, t1, iva, iva1, neto;
        System.out.print("Ingresa cantidad de artículo: ");
        law=leer.nextFloat();
        System.out.print("Ingresa el precio: ");
        kurae=leer.nextFloat();
        t1=(law*kurae);
        System.out.print ("Ingresa el iva: ");
        iva=leer.nextFloat();
        iva1=(t1*iva);
        neto=(t1+iva1);
        System.out.println ("El primer total es: "+t1);
        System.out.println ("El iva a pagar es: "+iva1);
        System.out.println ("El neto a pagar es: "+neto);
    }
    
}
