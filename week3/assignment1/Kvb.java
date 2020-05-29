package week3.assignment1;

public class Kvb extends Rbi{
	
	public void loanterestRate(String pl) {
		
	System.out.println("The interest rat of Personal Loan is: "+pl);
	}
	
	@Override
	public void loanInterestRate(String agri) {
		// TODO Auto-generated method stub
		super.loanInterestRate(agri);
	}
	
	public static void main(String[] args) { 
		
	  Kvb obj=new Kvb();
	  	  
	  obj.loanInterestRate(); 
	  obj.loanInterestRate("10.08%");
	  obj.loanterestRate("11.25%");
	  
	  
	  }
	 
}
