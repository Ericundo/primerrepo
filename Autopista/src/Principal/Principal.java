package Principal;

import Entidades.Tramo;

public class Principal {

	public static void main(String[] args) {
		
		Tramo tramo1;
		tramo1 = new Tramo();
		long idtramo1 = tramo1.getId();
		int puntokminiciotramo1 = tramo1.getPuntokminicio();
		int puntokmfinaltramo1 = tramo1.getPuntokmfinal();
		
		idtramo1 = 101;
		puntokminiciotramo1 = 22;
		puntokmfinaltramo1 = 27;
		//ddd
		
		tramo1.setId(idtramo1);
		tramo1.setPuntokminicio(puntokminiciotramo1);
		tramo1.setPuntokmfinal(puntokmfinaltramo1);
		//dxse
		
		
		


	}

}
