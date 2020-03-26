//https://discord.gg/SABYq8Z
public class PruebaPila{
	public static void main(String args[]){
		PilaEntera Pila = new PilaEntera(5);
		try{
			System.out.println("agregamos 10");
			Pila.apilar(10);
			System.out.println("agregamos -5");
			Pila.apilar(-5);
			System.out.println("agregamos -1");
			Pila.apilar(-1);
			System.out.println("agregamos 100");
			Pila.apilar(100);
			System.out.println("agregamos 1000");
			Pila.apilar(1000);
			int elem;
			elem = Pila.sacar();
			System.out.println(elem);
			elem = Pila.sacar();
			System.out.println(elem);
			elem = Pila.sacar();
			System.out.println(elem);
			elem = Pila.sacar();
			System.out.println(elem);
			elem = Pila.sacar();
			System.out.println(elem);
			elem = Pila.sacar();
			System.out.println(elem);
		}catch(DesbordamientoPila err){
			System.out.println(err.getMessage());
		}catch(SubDesbordamientoPila err){
			System.out.println(err.getMessage());
		}
		//////////////////////////////////
		/*
		System.out.println(Pila.sacar());
		int elem = Pila.sacar();
		System.out.println(elem);
		elem = Pila.sacar();
		System.out.println(elem);
		elem = Pila.sacar();
		System.out.println(elem);
		elem = Pila.sacar();
		System.out.println(elem);
		//elem = Pila.sacar();
		//System.out.println(elem);
		**/
	}
}
