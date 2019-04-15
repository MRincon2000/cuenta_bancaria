
package cuenta.bancaria;
import java.util.*;

public class CuentaBancaria {

 
    public static void main(String[] args) {
 Cuenta cuenta1= new Cuenta(1012,1234,"Magdalena Sanchez",0);
System.out.println("ingrese el valor a consignar: ");
 Scanner teclado= new Scanner(System.in);
 float valor=teclado.nextFloat();
 
 Transaccion(cuenta1.consignar(valor));
 System.out.println(cuenta1.getSaldo());

Cuenta cuenta2=new Cuenta(1013,9876,"Joselito Perez",500000);

int clave=cuenta2.getClave();
System.out.println("ingrese su clave: ");
 Scanner teclado1= new Scanner(System.in);
 int numero=teclado1.nextInt();
 System.out.println("ingrese su nueva clave: ");
 Scanner teclado2= new Scanner(System.in);
 int nuevaClave=teclado2.nextInt();
Transaccion(cuenta2.cambiarClave(numero, nuevaClave));
    
System.out.println("ingrese su clave: ");
 Scanner teclado3= new Scanner(System.in);
 int numero1=teclado3.nextInt();
 int clave1=cuenta2.getClave();
 Transaccion(cuenta2.consultar(numero1));
    
    }
public static void Transaccion(boolean operacion){
   if (operacion==true){
       System.out.println("transaccion exitosa");
   }
   else{
       System.out.println("transaccion fallida");
   }
}
    
}
