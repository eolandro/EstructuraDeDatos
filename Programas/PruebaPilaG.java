public class PruebaPilaG{
	public static void main(String args[]){
		Pila<Integer> PI = new Pila<>(10);
		try{
			PI.apilar(100);
			PI.apilar(1000);
			int V = PI.sacar();
			System.out.println(V);
		}catch(DesbordamientoPila E){
			System.out.println(E.getMessage());
		}catch(SubDesbordamientoPila E){
			System.out.println(E.getMessage());
		}
		///////////////////////////////////////
		Pila<String> PS = new Pila<>(10);
		try{
			PS.apilar("hola");
			PS.apilar("Mundo");
			String S = PS.sacar();
			System.out.println(S);
		}catch(DesbordamientoPila E){
			System.out.println(E.getMessage());
		}catch(SubDesbordamientoPila E){
			System.out.println(E.getMessage());
		}
		///////////////////////////////////////
		Pila<Estudiante> PE = new Pila<>(10);
		try{
			Estudiante e1,e2;
			e1 = new Estudiante(
				"Leonardo","18293"
			);
			e2 = new Estudiante(
				"Sybelle","148293"
			);
			PE.apilar(e1);
			PE.apilar(e2);
			Estudiante Ref = PE.sacar();
			System.out.println(Ref);
		}catch(DesbordamientoPila E){
			System.out.println(E.getMessage());
		}catch(SubDesbordamientoPila E){
			System.out.println(E.getMessage());
		}
		
	}
}
