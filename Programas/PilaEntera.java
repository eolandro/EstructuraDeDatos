public class PilaEntera{
	private int Esquina[];
	private int indice;
	//contructor
	public PilaEntera(int n){
		// N es la cantidad de elementos
		// que puede guardar mi pila
		Esquina = new int[n];
		indice = 0;
	}
	public int cantidad(){
		return indice -1;
	}
	public void apilar(int num) throws DesbordamientoPila{
		if (this.llena()){
			throw new DesbordamientoPila();
		}
		Esquina[indice] = num;
		indice++;
	}
	public int sacar() throws SubDesbordamientoPila{
		if(this.vacia()){
			throw new SubDesbordamientoPila();
		}
		int esacar;
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
