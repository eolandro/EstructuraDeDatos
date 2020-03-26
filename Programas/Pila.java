public class Pila<T>{
	private T Esquina[];
	private int indice;
	//contructor
	@SuppressWarnings("unchecked")
	public Pila(int n){
		// N es la cantidad de elementos
		// que puede guardar mi pila
		Esquina = (T[])new Object[n];
		indice = 0;
	}
	public int cantidad(){
		return indice -1;
	}
	public void apilar(T valor) throws DesbordamientoPila{
		if (this.llena()){
			throw new DesbordamientoPila();
		}
		Esquina[indice] = valor;
		indice++;
	}
	public T sacar() throws SubDesbordamientoPila{
		if(this.vacia()){
			throw new SubDesbordamientoPila();
		}
		T esacar;
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
