package com;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class Cajero implements IMetodos {
	//Esta clase sera la encargada de implementa las acciones o logica
	
	private String sucursal;
	private Map<Integer,Cuenta> cuentas;//Le damos acceso
	//al cajero a la informacion de las cuentas
	private int folioContador=1; //Dejamos el folio iniciado
	//para que se incremente en el Ticket cada que se realice
	//una operacion con exito
	
	public Cajero() {}
	
	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}
	
	@Override
	public Cuenta buscarCuenta(int numeroCuenta) {
		//Buscar la cuenta sobre la cual vamos a realizar operaciones
		//Instanciar un objeto cuenta
		Cuenta cuenta = null; //Si la cuenta no existe, retorna ese valor
		
		//Busco dentro del HashMap esa cuenta y lo asiganos a este objeto para devolver dicho valor
		cuenta = cuentas.get(numeroCuenta);
		
		return cuenta;
	}
	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		//Instanciamos un objeto Ticket vacío, que es el objeto que
		//el método debe devolver como respuesta
		Ticket ticket = null;	
		//Si nuestro método de buscar cuenta localiza la cuenta
		//sobre la cual vamos a actuar
		//Realizamos algunas validaciones
		if(buscarCuenta(numeroCuenta)!=null) {
			//Si el metodo buscar cuenta, encuentra una a la cual realizarse el deposito realizamos lo siguiente
			//Asignamos el valor de la cuenta que se busca, a un objeto manipulable aqui
			//para editar sus valores (saldo)
			Cuenta cuenta = buscarCuenta(numeroCuenta);
		//Relizamos ciertas Validaciones
		//Validamos si el deposito excede el saldo maximo permitido
		//por la cuenta
		//Si el monto a depositar es mayor que el saldoMaximo no se realizara la operacion
		if(monto>cuenta.getSaldoMax()) {
			System.out.println("El monto excede el saldo máximo permitido en la cuenta");
			return ticket;
		//que hasta el nomento ticket es nulo.	
			
		//Si el saldo que tiene la cuenta, mas el monto a depositar exceden el saldo maximo el saldo maximo de la cuenta.	
		}else if (cuenta.getSaldo()+monto>cuenta.getSaldoMax()) {
			System.out.println("El monto más el saldo actual de la cuenta, excederían el máximo permitido");
			return ticket;
			
		}else {//Si podemos depositar el monto//El deposito si puede realizarce
			cuenta.setSaldo(cuenta.getSaldo()+monto);
			//Como la operacion si se va a realizar, emitimos un ticket
			ticket = new Ticket(folioContador++, new Date(), cuenta.getNombreUsuario(), cuenta.getSaldo(), sucursal, monto, 101);
			return ticket;			
		}
		}else {
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}
	}
	
	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		Ticket ticket = null;
		if(buscarCuenta(numeroCuenta)!=null) {
			Cuenta cuenta = buscarCuenta(numeroCuenta);
		//Validaciones para actualizar el sldo de la cuenta
		//Condicionando si la operacion excede el limite permitido por
		//el cajero
		if(monto>9000) {//Si el monto a retirar es mayor a 9000
			System.out.println("El monto excede el máximo permitido por el cajero");
			return ticket;
		}else if (cuenta.getSaldo()<monto) {//Si el saldo de la cuenta es menor al monto que quiero retirar
			System.out.println("Saldo insuficiente para realizar el retiro");
			return ticket;
		}else if(cuenta.getSaldo()-monto<cuenta.getSaldoMin()) {
			System.out.println("El retiro dejaría por debajo del mínimo a la cuenta");
			return ticket;
		}else {//Si el retiro puede realizarse
			//Actualizamos el saldo de la cuenta
			cuenta.setSaldo(cuenta.getSaldo()-monto);
			ticket = new Ticket(folioContador++, new Date(), cuenta.getNombreUsuario(), cuenta.getSaldo(), sucursal, monto, 1);
			return ticket;
		}
		}else {
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}
	}
	@Override
	public Ticket transferir(int numCuentaOrigen, int numCuentaDestino, double monto) {
		Ticket ticket = null;
		
		//Ahora buscamos 2 cuentas de usuario para esta operacion
		if(buscarCuenta(numCuentaOrigen)!=null && buscarCuenta(numCuentaDestino)!=null) {
			Cuenta origen = buscarCuenta(numCuentaOrigen);
			Cuenta destino = buscarCuenta(numCuentaDestino);
			
		//Validaciones
		//Si la cuenta de origen tiene un saldo menor al monto que quiere transferir
		if(origen.getSaldo()<monto) {
			System.out.println("No hay fondos suficientes para realizar la transferencia");
			return ticket;
			
		//Si el saldo de la cuenta de origen menos el monto deja debajo del minimo a la cuenta 
		}else if(origen.getSaldo()-monto<origen.getSaldoMin()) {
			System.out.println("La transferencia dejaría por debajo del mímino a la cta origen");
			return ticket;
			
		//Si el monto a transferir es mayor que el saldo maximo de la cuenta destino
		}else if(monto>destino.getSaldoMax()) {
			System.out.println("El monto excede el máximo permitido en la cta destino");
			return ticket;
		
		//Si el monto mas el saldo de la cuenta destino es mayor que saldoMaximo
		}else if(destino.getSaldo()+monto>destino.getSaldoMax()) {
			System.out.println("La transferencia excedería el saldo max en la cta destino");
			return ticket;
		
		//Se realiza la actualizacion de la cuenta
		}else {
			origen.setSaldo(origen.getSaldo()-monto);
			destino.setSaldo(destino.getSaldo()+monto);
			ticket = new Ticket(folioContador++, new Date(), origen.getNombreUsuario(), origen.getSaldo(), sucursal, monto, 1);
			return ticket;
		}	
		}else {
			System.out.println("Alguno de los clientes no tiene una cuenta asociada");
			return ticket;
		}
	}
}
