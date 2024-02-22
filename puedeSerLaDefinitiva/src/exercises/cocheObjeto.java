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
}public void road_to_200000() {
	for(double i = kilometros; i <= 200000; i++) 
	System.out.println(i);
}
public void contadorCaracteres() {
System.out.println(marca.length());
System.out.println(modelo.length());
}
public void masUsado() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce los kilometros de tu coche y veremos si tiene más :");
	double nuevokilometros = sc.nextInt();
	if(nuevokilometros > this.kilometros) {
		System.out.println("Tu coche tiene mas km");
	}else {
		System.out.println("Tu coche tiene menos km");
	}
}
public void caro() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce el precio de tu coche y veremos si es mas caro :");	
	double nuevoPrecio = sc.nextInt();
	if(nuevoPrecio > this.kilometros
			) {
		System.out.println("Tu coche es mas caro");
	}else {
		System.out.println("Tu coche es menos caro");
	}
}