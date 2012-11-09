package iTrace.ui.tools;


public class MeasureTime {
	
	long tiempoInicioParcial = 0;
	long tiempoFinalParcial = 0;
	long tiempoInicioTotal = 0;
	long tiempoFinalTotal = 0;
	
	public MeasureTime(){
		super();
		clearTimes();
	}
	
	public void clearTimes(){
		tiempoInicioParcial = 0;
		tiempoFinalParcial = 0;
		tiempoInicioTotal = 0;
		tiempoFinalTotal = 0;		
	}
	
	public void start (){
		tiempoInicioTotal = System.currentTimeMillis();
		tiempoInicioParcial = tiempoInicioTotal;
	}
	
	public String stop (){
		tiempoFinalParcial = System.currentTimeMillis() - tiempoInicioParcial;
		tiempoFinalTotal = tiempoInicioTotal - tiempoFinalParcial;
		return "==> Tiempo Ejecuci�n: " + tiempoFinalParcial + " milliseconds \n" + 
			   "==> Total Tiempo Ejecuci�n: " + tiempoFinalTotal/1000 + " secs.";
	}
	
	public void partialStart (){
		tiempoInicioParcial = System.currentTimeMillis();
	}
	
	public void partialStop (){
		tiempoFinalParcial = System.currentTimeMillis() - tiempoInicioParcial;
		System.out.println("==> Tiempo Ejecuci�n: " + tiempoFinalParcial/1000.000 + " secs.");
	}
	
	public String restartParcial (){
		tiempoFinalParcial = System.currentTimeMillis() - tiempoInicioParcial;
		partialStart();
		return "==> Tiempo Ejecuci�n: " + tiempoFinalParcial + " milliseconds.";
	}

}
