/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta.bancaria;

/**
 *
 * @author Estudiante
 */
public class Cuenta {
    private  int numero;
    private  int clave;
    private  String dueño;
    private  float saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Cuenta(int numero, int clave, String dueño, float saldo) {
        this.numero = numero;
        this.clave = clave;
        this.dueño = dueño;
        this.saldo = saldo;
    }
    
    
public boolean retirar(int numeroIngresado,int clave,float valor){
    if (numeroIngresado==clave){
        saldo= saldo-valor;
     return true;
    } 
    else{
        return false;
    }
}   
public boolean consignar(float valor){
   if (valor>0){
       saldo= saldo+valor;
       return true;
   }
   else{
       return false;
   }
   
}   
public boolean consultar(int numero){
     if (numero==this.clave){
 System.out.println(saldo);
         return true;
    } 
    else{
        return false;
    }
}
public boolean cambiarClave(int numero,int nuevaClave){
     if (numero==this.clave){
     clave=nuevaClave;
         return true;
    } 
    else{
        return false;
    }
}

}
