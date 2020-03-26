public class Prin{
	public static void main(String args[]){
		// int ==> Integer
		// double ==> Double
		// boolean ==> Boolean
		Gen<Integer> obj = new Gen<Integer>(10);
		Gen<String> objs = new Gen<>("Hola");
		// Primero se crea el objeto
		Estudiante Est =  new Estudiante("Leonardo","0123132");
		// Se pasa a la clase Generica
		Gen<Estudiante> objE = new Gen<>(Est);
		System.out.println(obj.obtenerValor());
		System.out.println(objs.obtenerValor());
		// Con referencia
		Estudiante ref;
		ref = objE.obtenerValor();
		System.out.println(ref);
	}
}
