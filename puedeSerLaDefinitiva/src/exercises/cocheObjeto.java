package exercises;
import java.util.Scanner;

public class cocheObjeto {
String id;
String marca;
String modelo;
double precio_base;
String fecha_matriculacion;
double kilometros;

public cocheObjeto(String id, String marca, String modelo, double precio_base, String fecha_matriculacion, double kilometros) {
	this.id = id;
	this.marca = marca;
	this.modelo = modelo;
	this.precio_base = precio_base;
	this.fecha_matriculacion = fecha_matriculacion;
	this.kilometros = kilometros;
}
public cocheObjeto(String id, double precio_base, String fecha_matriculacion, double kilometros) {
}
public void datos() {
	System.out.println("La id es :" + id);
	System.out.println("La marca es :" + marca);
	System.out.println("El modelo es :" + modelo);
	System.out.println("El precio base es :" + precio_base);
	System.out.println("La fecha de matriculacion es :" + fecha_matriculacion);
	System.out.println("Tiene" + kilometros + "kilometros");
}
public void precio_base() {
	System.out.println("El precio base es :" + precio_base);
}
public void año_matriculacion() {
	System.out.println("La fecha de matriculacion es :" + fecha_matriculacion);
}
public void bisisesto() {
	 Scanner sn = new Scanner(System.in);
	 
     System.out.println("Introduce un año");
     int anio = sn.nextInt();

     if (anio % 4 == 0 && anio % 100 != 0) {
         System.out.println("El año " + anio + " es bisiesto");
     } else {
         System.out.println("El año " + anio + " no es bisiesto");
     }   
}
public void precio() {
	double precio = 0;
	if (kilometros <= 10000) {
		precio = precio_base;
		System.out.println("Este es su precio :" + precio_base);
	}else if(kilometros >= 10000 && kilometros <= 50000) {
		precio = precio_base * 0.8;
		System.out.println("Este es su precio :" + precio_base);
	}else if(kilometros >= 50000) {
		precio = precio_base * 0.5;
		System.out.println("Este es su precio :" + precio_base);
	}
}
public void primo() {
	boolean primo = true;
	for(int i = 2; i < kilometros; i++) {
		if(kilometros%i==0) {
			primo=false;
	}}if(primo) {
		System.out.println("Es primo");
	}else 
		System.out.println("No es primo");
}
}