/***
 * @author Carlos
 * Alumno: Juan Carlos Uribe Lucero
 * Universidad Autonoma de Baja California Sur
 * Departamento Academico de Sistemas Computacionales 
 *
 */
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantidadFilosofos = 3;
		int tiempo = 1;
		System.out.println("Cena de los Filosofos");  		
		Cena cena = new Cena(cantidadFilosofos);  
		for(int i=0; i<cantidadFilosofos; i++){  
			new Filosofo(i, cena,tiempo);  
		}  
	}

}
