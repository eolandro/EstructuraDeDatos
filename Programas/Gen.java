public class Gen<T>{
	private T valor;
	public Gen(T valor){
		this.valor = valor;
	}
	public T obtenerValor(){
		return this.valor;
	}
}
