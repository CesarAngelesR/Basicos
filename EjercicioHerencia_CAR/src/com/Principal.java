package com;

public class Principal {

	public static void main(String[] args) {
		
		Remolque remolque1 = new Remolque();
		remolque1.setNombre("Pipa combustoleo");
		remolque1.setNumEjes(2);
		remolque1.setSuspencion("Muelles");
		remolque1.setModelo(2003);
		remolque1.setTamano("Grande");
		
		System.out.println(remolque1);
		remolque1.trabajando();
		
		CajaSeca caja1 = new CajaSeca(); 
		caja1.setNombre("Caja seca uno"); 
		caja1.setNumEjes(3);
		caja1.setSuspencion("Bolsa de aire");
		caja1.setModelo(2010);
		caja1.setTamano("Mediana");
		caja1.setCapacidad(28);
		caja1.setTransporta("Harina");
		
		System.out.println(caja1);
		System.out.println(caja1.trabajando("Aguascalientes"));
	}

}
