class Main {
  public static void main(String[] args)
   {
     
		long x=0b10010011;
		int i=1;
		int j=2;
		System.out.println(Long.toBinaryString(swap(x,i,j)));
	
	}
  
	public static long swap(long x,int i,int j) {
		if(((x>>i)&1)!=((x>>j)&1))
     {
			int mask=(1<<i)|(1<<j);
			x=x^mask;
	}
		return x;
  }}
     
