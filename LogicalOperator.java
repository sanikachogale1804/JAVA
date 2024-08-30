class LogicalOperator
{
	public static void main (String args[])
	{
		int a=50;
		System.out.println(a!=0 && a==10);
		System.out.println(a==0 && a>=10);
		System.out.println(a%50==0 || a%15==0);
		System.out.println(a>=0 || a==10);
		
		// not(!) operator(it is calles unary operaor also)
		System.out.println(!(a>=0 || a==10));
		
		//Bitwise Operator
		//Bitwise and   &
		//Bitwise OR    |
		//Bitwise XOR   ^
		//if bits are deifferent then 1 
		//bits same hai to 0 milega
		//Bitwise NOt   ~
		
	    System.out.println(20&12);        //20=10100
		                                  //10=01100
                                          //- --------
										  //   00100 
        System.out.println(14&8);         //14=1110
		                                  //8= 1000
										  // ---------
										  //   1000 
        System.out.println(20|12);        //20=10100
		                                  //10=01100
                                          //- --------
										  //   11100 
        System.out.println(14^8);         //14=1110
		                                  //8= 1000
										  // ---------
										  //   0110
	    System.out.println(~14);           //0000 0000 0000 1110
		                                   //1111 1111 1111 0001
	    System.out.println(~8);           //0000 0000 0000 1000
		                                   //1111 1111 1111 0111  
										  
	}
}
