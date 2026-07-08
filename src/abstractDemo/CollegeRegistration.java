package abstractDemo;

interface CollegeRegistration {
	void register();
	void successful();
}

class LNCT implements CollegeRegistration {


	@Override
	public void register() {
		 String name = "LNCT College";
		 int contact = 67841225;
		 String CollegeAffiliated = "Private";
		 int rank =  12457;
		 String courses = "UG, PG Programme";
	}	
	
	
	@Override
	public void successful() {
		// TODO Auto-generated method stub
		System.out.println("Registration is successful");
	}
	
}

class Truba implements CollegeRegistration {

	@Override
	public void register() {
		String name = "TRUBA College";
		int contact = 67841235;
		String CollegeAffiliated = "Private";
		int rank =  12907;
		String courses = "UG, PG Programme";
		
	}


	@Override
	public void successful() {
		// TODO Auto-generated method stub
		System.out.println("Registration done successful");
	}
	
}

