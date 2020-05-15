
package ejercicio2;


import java.util.Scanner;

public class datos {
public static void main(String[] args) {

factura fac = new factura();

Scanner leer = new Scanner (System.in);

long n_cuenta ;
int lectura_actual_del_medidor, lectura_anterior_del_medidor,multiplicador,consumo_mensual,consumo_diario,dias_facturados,valor_factura,consumo;

try {
System.out.println("Ingrese el numero de la cuenta: ");
n_cuenta=  leer.nextLong();

System.out.println("Ingrese la lectura actual del medidor: ");
lectura_actual_del_medidor= leer.nextInt();

System.out.println("Ingrese la lectura anterior del medidor: ");
lectura_anterior_del_medidor=leer.nextInt();

System.out.println("Ingrese el multiplicador: ");
multiplicador=leer.nextInt();

System.out.println("Ingrese los dias facturados: ");
dias_facturados=leer.nextInt();

 System.out.println("Ingrese el consumo mensual: ");
 consumo_mensual =leer.nextInt();
 
 System.out.println("Ingrese ingrese el consumo diario");
 consumo_diario=leer.nextInt();
 
 

 //ASIGNAR VALORES METODO SET
 
 fac.setN_cuenta(n_cuenta);
 fac.setLectura_actual_del_medidor(lectura_actual_del_medidor);
 fac.setLectura_anterior_del_medidor(lectura_anterior_del_medidor);
 fac.setMultiplicador(multiplicador);
 fac.setDias_facturados(dias_facturados);
 fac.setConsumo_diario(consumo_diario);
 fac.setConsumo_mensual(consumo_mensual);
 fac.setConsumo();
 fac.setValor_factura();
 
 
 //RETORNAR VALORES METODO GET
System.out.println("El numero de la cuenta es:"+fac.getN_cuenta());

System.out.println("La lectura actual del medidor es: "+fac.getLectura_actual_del_medidor());

System.out.println("La lectura anterior del medidor es: "+fac.getLectura_anterior_del_medidor());

System.out.println("El multiplicador es: "+fac.getMultiplicador());

System.out.println("Los dias facturados son: "+fac.getDias_facturados());

System.out.println("El consumo mensual es:"+fac.getConsumo_mensual());

System.out.println("El consumo Diario es:"+fac.getConsumo_diario());

System.out.println("El consumo de la Energia electrica es: "+fac.getConsumo()*10 +"kWh");

System.out.println("El valor de la factura electrica es :$"+fac.getValor_factura()*0.20);
 


}catch (Exception e){

     System.out.println(e.getMessage());

}
}
}

 


