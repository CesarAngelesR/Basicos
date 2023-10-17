package com;

public class Principal {

	
	//En la programacion orientada a objetos solo existe una clase con el metodo principal,
	//es decir, una clase que se encargara de ejecutar la logica de las demas.
	
	public static void main(String[] args) {
		
		//Al momento de crear un objeto, traemos el nombre de la clase y posteriomente
		//su variable tambien conocida como instancia u objeto.
		
		
		//Creando un objeto perro con todos sus argumentos
		Animal perro = new Animal("Fido",4.5,2,1.5,"cafe");
		
		//perro.nombre = "Fido";: Manera incorrecta de asignar un valor a mi atributo.
		
		//Crear otro animal, un objeto gato, con el contructor vacio
		Animal gato = new Animal();
		gato.setNombre("Kitty");//Asignando valor a un atributo con su metodo Setter.
		
		System.out.println(perro.getNombre());
		
		//Pero si quiero darle una salida a todos los datos de mi objeto
		System.out.println(perro);
		System.out.println(gato);
		System.out.println("\n");
		
		//Crear 5 plantillas para crear 2 objetos de cada una
		//Uno se va a crear con el constructor vacio y le asignan un valor a algun atributo 
		//posteriormente
		//Y el otro lo crean con todos sus argumentos
		//Ya que los tengan le dan salida a sus objetos.
		
		
		//Ejercicio1.............................................................	
		Zapato deportivo = new Zapato("Primavera", 26, 'm', "Sintetico", 2022);
		Zapato casual = new Zapato();
		casual.setMaterial("Piel");
		
		System.out.println("Ejercicio 1");
		System.out.println(deportivo.getMaterial());
		System.out.println(deportivo);
		System.out.println(casual);
		System.out.println("\n");
		
		//Ejercicio2.............................................................
		Remolque pipa = new Remolque(2015,"Pipa para Gas",'G',3,"HFG-3595");
		Remolque plana = new Remolque();
		plana.setTipo("Plataforma");
		
		System.out.println("Ejercicio 2");
		System.out.println(pipa.getPlacas());
		System.out.println(pipa);
		System.out.println(plana);
		System.out.println("\n");
		
		//Ejercicio 3............................................................
		Taco suadero = new Taco("suadero de res",'s','s',5,'s');
		Taco bistec = new Taco();
		bistec.setDeQueEs("Bistec de puerco");
		
		System.out.println("Ejercicio 3");
		System.out.println(suadero.getCantidad());
		System.out.println(suadero);
		System.out.println(bistec);
		System.out.println("\n");
		
		//Ejercicio 4.............................................................
		Cerveza clara = new Cerveza("Corona","Light Lager",355,"25/05/2023","Grupo Modelo");
		Cerveza ambar = new Cerveza();
		ambar.setEstilo("Viena");
		
		System.out.println("Ejercicio 4");
		System.out.println(clara.getEstilo());
		System.out.println(clara);
		System.out.println(ambar);
		System.out.println("\n");
		
		//Ejercicio 5..............................................................
		
		Herramienta desarmador = new Herramienta("Desarmador","Mediano","Plastico",12,"Rojo");
		Herramienta pinsa = new Herramienta();
		pinsa.setManterial("Metal");
		
		System.out.println("Ejercicio 5");
		System.out.println(desarmador.getColor());
		System.out.println(desarmador);
		System.out.println(pinsa);
		
		Celular nokia = new Celular();
		Celular iphon = new Celular("Retina", 128, "50", 8, 4);
		
		/*nokia.precio(5000)
		//Aqui vemos como podemos con una variable static, aun asi modificar su precio, pero cambia
		//para todas las instancias de clase*/
		
		System.out.println(nokia);
		System.out.println(iphon);
		
		
	}

}
