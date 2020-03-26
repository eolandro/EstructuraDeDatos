public class PilaCadena{
	private String Esquina[];
	private int indice;
	//contructor
	public PilaCadena(int n){
		// N es la cantidad de elementos
		// que puede guardar mi pila
		Esquina = new String[n];
		indice = 0;
	}
	public int cantidad(){
		return indice -1;
	}
	public void apilar(String val) throws DesbordamientoPila{
		if (this.llena()){
			throw new DesbordamientoPila();
		}
		Esquina[indice] = val;
		indice++;
	}
	public String sacar() throws SubDesbordamientoPila{
		if(this.vacia()){
			throw new SubDesbordamientoPila();
		}
		String esacar;
		esacar = Esquina[indice-1];
		indice--;
		//indice--;
		//esacar = Esquina[indice];
		return esacar;
	}
	public boolean vacia(){
		if (indice == 0){
			return true;
		}
		return false;
	}
	public boolean llena(){
		if (indice == Esquina.length){
			return true;
		}
		return false;
	}
	public int capacidad(){
		return Esquina.length;
	}
}
