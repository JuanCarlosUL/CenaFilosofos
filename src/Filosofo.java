public class Filosofo implements Runnable{  
	private int espera;  
	private Thread hilo;  
	protected Cena cena;  
	protected int tizq, tder;  
	protected int numero;  
  
public Filosofo (int x, Cena cena,int tiempo){  
	espera = (int)(Math.random()*tiempo); 
	this.numero= x;  
    this.cena= cena;  
    tizq= cena.getTenedorIzq(numero);  
    tder= cena.getTenedorDer(numero);  
    hilo = new Thread(this);  
    hilo.start();  
}  
public void pensar(){  	
     try{  
        System.out.println ("?: Filosofo "+numero+" pensando \n");         
        Thread.sleep(espera);  
        System.out.println ("-: Filosofo "+numero+" tiene hambre");  
     }catch(InterruptedException e){  
 e.printStackTrace();  
     }  
}  
public void tomarTenedores(){  
     System.out.println ("[Tomando tenedores]");  
     Tenedor t1= cena.getTenedor(tizq);  
     Tenedor t2= cena.getTenedor(tder);  
     t1.usar();  
     t2.usar();  
}  
@SuppressWarnings("deprecation")
public void comer(){  
     try{  
        System.out.println("++: Filosofo "+numero+" esta comiendo\n");       
        Thread.sleep(espera);  
        System.out.println("|| Filosofo "+numero+" esta satisfecho ||\n");           
     }catch(InterruptedException e){  
    	 e.printStackTrace();  
     }  
}  
protected void dejarTenedores(){  
     System.out.println("--: Soltando los tenedores.");  
     Tenedor t1= cena.getTenedor(tizq);  
     Tenedor t2= cena.getTenedor(tder);  
     t1.dejar();  
     t2.dejar();  
}  
public void run(){  
      while(true){  
         pensar();  
         tomarTenedores();  
         comer();  
         dejarTenedores();
         hilo.stop();
      }  
}  
}  