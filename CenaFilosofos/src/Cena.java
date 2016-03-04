public class Cena{  
	Tenedor tenedores[];  
	int cantidad;
	
	public Cena(int cantidadFilosofos){
		cantidad = cantidadFilosofos;
		tenedores = new Tenedor[cantidad];  
		for(int i=0; i<cantidadFilosofos; i++){  
			tenedores[i] = new Tenedor(i);  
		}  
	} 
	
	public Tenedor getTenedor(int x){return tenedores[x];} 	
	public int getTenedorDer(int x){return (x+1)%cantidad;} 	
	public int getTenedorIzq(int x){return x;}  
}  