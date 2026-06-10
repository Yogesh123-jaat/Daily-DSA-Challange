package functions_methods;

public class Shadowing {
	static int x = 90; // Yeh alag dappa hai

	public static void main(String[] args) {
		
			System.out.println(x); // 90
		
		    int x; // Yeh ek alag naya dappa ban gaya!
		    x = 40; // Yeh value is naye dappe mein gayi
		    
		    System.out.println(x); // Print karega: 40 (Naye dappe ki value)
		    
		    fun(); // fun() ke paas jaoge toh wo upar wale purane dappe ko dekhega
		}

		static void fun() {
		    System.out.println(x); // Print karega: 90 (Kyunki purana dappa abhi bhi safe hai!)
		}

}
