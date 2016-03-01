
public class Generics {
	public static void main(String[] args)
	{
		
		Integer [] iray={1,2,3,4};
		Character [] cray={'D','a','n','i','e','l','e'};
		People [] pray={new People("Antonio","Verdi",22),new People("Marco","Rossi",34),new People("Luca","Bianchi",25)};
		
		Generics.printMe(iray);
		Generics.printMe(cray);
		Generics.printMe(pray);
		
		
	}
	
	//ciclo che scorre tutto l'array il parametro passato è un array
	public static <T>void printMe (T[] x){
	for(T b :  x)
	{
		System.out.printf("%s ",b);
		
		
		
	}
	System.out.println();
	}
}
