import java.util.Random;
public class Numeros{
	public static void main(String args[]){
		int vec[] = new int[100];
		Random gen = new Random();
		for(int i=0; i<vec.length; i++){
			vec[i] = gen.nextInt(50)+1;
		}
		/////// Vamos a crear la pila 
		// y agregarlos datos
		//
		PilaEntera Pila = new PilaEntera(vec.length/2);
		for(int i=0; i<vec.length; i++){ 
			if(vec[i] % 3 == 0){
				try{
					Pila.apilar(vec[i]);
				}catch(DesbordamientoPila err){
					System.out.println(err.getMessage());
				}
			}
		}
		//Crear nuevo vector para ordenar
		int vecord[] = new int[Pila.cantidad()];
		int p = 0;
		while(!Pila.vacia()){
			try{
				vecord[p] = Pila.sacar();
			}catch(SubDesbordamientoPila err){
				System.out.println(err.getMessage());
			}
			p++;
		}
	}
}
