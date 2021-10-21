package Entidades;

public class Tramo1 extends Tramo {
	
	protected long id;
	protected int puntokminicio;
	protected int puntokmfinal;
	
	
	

	public Tramo1() {
	
			}




	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public int getPuntokminicio() {
		return puntokminicio;
	}




	public void setPuntokminicio(int puntokminicio) {
		this.puntokminicio = puntokminicio;
	}




	public int getPuntokmfinal() {
		return puntokmfinal;
	}




	public void setPuntokmfinal(int puntokmfinal) {
		this.puntokmfinal = puntokmfinal;
	}




	@Override
	public String toString() {
		return "Tramo1 [id=" + this.id + ", puntokminicio=" + puntokminicio + ", puntokmfinal=" + puntokmfinal + "]";
	}
	
	

}
