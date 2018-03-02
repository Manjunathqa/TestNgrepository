package Encaptulation;


	
public class VerifyEncaptulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account rak=new Account(10);
		int r=rak.getAmount();
		System.out.println(r);
		
		
		Account Man=new Account(10000);
		int x=Man.getAmount();
		System.out.println(x);
		
		}
}


