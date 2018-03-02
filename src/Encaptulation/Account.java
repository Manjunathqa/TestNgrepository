package Encaptulation;

public class Account extends VerifyEncaptulation {
	//Declaring --> Using privateaccess specifier
		private int amt;
		//initilizations -->using private access specifiers
		public Account(int n)
		{
			 amt=n;
		}
		//Utilizatio ==> Using public method/public()
		public int getAmount()
		{
			return amt;
		}
	}


