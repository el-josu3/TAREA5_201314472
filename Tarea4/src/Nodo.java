import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Nodo{
	List<Integer> lista=new LinkedList<Integer>();
	//Metodo para agregar los numeros
	public void agregar(int a){
		lista.add(a);
		System.out.println("Objeto " +a+ "agregando");
		
	}
	//Metodo para que elimine el primero en ingresar
	public void  remover(int a){
		lista.remove(lista.indexOf(a));
		System.out.println("Objeto" +a+ "removiendo");
			
	}
	public void mostrar(){
		System.out.println("lISTA: " +lista);
		
	}
	

public static void main (String[]args ){
Nodo l=new Nodo(); //Instancia del metodo.

l.agregar(10);
l.mostrar();
l.agregar(20);
l.mostrar();
l.remover(10);
l.mostrar();
l.agregar(30);
l.mostrar();
l.remover(10);
l.mostrar();
	}
}

// Aca lo intente realizar mediante punteros pero no me mostrò nada
//*public  class Lista {
	 
	
	// Nodo inicio = null;
	 
	 //void agregar (int elemento){
		// if (inicio==null){
			// inicio= new Nodo(elemento);
		 //}
		// else{
			//	 Nodo temp=inicio;
				// inicio=new Nodo(elemento);
				/// inicio.siguiente=temp;
		// }
	// }

	//void remover(int elemento){
		//Nodo temp=inicio;
		//Nodo anterior=null;
		//if (temp==null)
			//System.out.println("La lista esta vacia");
	//	else{
		//		while(temp!=null){
			//		if(temp.elemento==elemento){
				//		if(anterior==null){
					//		inicio=inicio.siguiente;
						//}
					//	else{
						//		anterior.siguiente=temp.siguiente;
					//}
				//	break;
			//	}
				//anterior=temp;
				//temp=temp.siguiente;
				//		}
					//}
				//}
	
//void mostrar(){
	//Nodo temp=inicio;
	//if (temp==null)
	//	System.out.println("La lista esta vacia");
	//else{
		//System.out.println("[");
		//while(temp!=null){
			//System.out.println(temp.elemento+" ");
			//temp=temp.siguiente;
		//}
		//System.out.println("]");
	//}
//}

	
	//public static void main(String[] args) {
		//Lista lista=new Lista();
		//lista.agregar(10);
		//lista.mostrar();
		//lista.agregar(20);
		//lista.mostrar();
	//	lista.agregar(30);
	//	lista.mostrar();

	//}

//}

