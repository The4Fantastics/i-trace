package iTrace.ui.tools;


public class MeasureTime {
	
	private long tiempoInicioParcial = 0;
	private long tiempoFinalParcial = 0;
	private long tiempoInicioTotal = 0;
	private long tiempoFinalTotal = 0;
	private String proyect;
	
	public MeasureTime(){
		init();
	}
	
	public MeasureTime(String proyect){
		init();
		this.proyect=proyect;
	}
	
	public void init(){
		tiempoInicioParcial = 0;
		tiempoFinalParcial = 0;
		tiempoInicioTotal = 0;
		tiempoFinalTotal = 0;	
		proyect= new String();
	}
	
	public void start (){
		tiempoInicioTotal = System.currentTimeMillis();
		tiempoInicioParcial = tiempoInicioTotal;
		System.out.println("============== Start Execution: " + proyect + " ==============");
	}
	
	public void stop (){
		tiempoFinalParcial = System.currentTimeMillis() - tiempoInicioParcial;
		tiempoFinalTotal =  System.currentTimeMillis() - tiempoInicioTotal;
		System.out.println("==> Parcial Execution Time: " + tiempoFinalParcial/1000.000 + " secs. \n" + 
						   "==> Total Execution Time: " + tiempoFinalTotal/1000.000 + " secs.");
		System.out.println("============== End Execution: " + proyect + " ==============");
	}
	
	public void partialStart (){
		tiempoInicioParcial = System.currentTimeMillis();
	}
	
	public void partialStop (){
		tiempoFinalParcial = System.currentTimeMillis() - tiempoInicioParcial;
		System.out.println("==> Parcial Execution Time: " + tiempoFinalParcial/1000.000 + " secs.");
	}
	
	public void restartParcial (){
		partialStop();
		partialStart();
	}

}
