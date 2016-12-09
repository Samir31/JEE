package metier.session;

public class CalculetteService {
	
	private Double cumul=0D;
	
	public CalculetteService(){}
	
	public double cumuler(Double nombre){
		this.cumul+=nombre;
		return this.cumul;
	}
	
	public double addition(double nombre1, double nombre2) {
    	
        return nombre1 + nombre2;
    }
  
  public double sub(double nombre1, double nombre2){
	  return nombre1 - nombre2;
  }
  
  public double mult(double nombre1, double nombre2){
	  return nombre1*nombre2;
  }
  
  public double div(double nombre1, double nombre2){
	  if(nombre2!=0){
		  return nombre1/nombre2;
	  }else return (Double) null;
  }

}
