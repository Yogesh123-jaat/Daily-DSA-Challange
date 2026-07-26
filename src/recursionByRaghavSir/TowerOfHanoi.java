package recursionByRaghavSir;

public class TowerOfHanoi 
{
	public static void main(String[] args) 
	{
		hanoi(3 , 'A' , 'B' , 'C');
	}
	
	public static void hanoi(int n , char src , char hlp , char dest)
	{
		if(n == 0) return;
		
		hanoi(n-1 , src , dest , hlp); // n-1 disks from A to B via C
		System.out.println(src + "->" + dest); // largets from A to C
		hanoi(n-1 , hlp , src , dest); // n-1 disk from B to C via A
	}
}
