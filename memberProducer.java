package staff;

public class memberProducer {
	public static AbstractMember getDept (String Department  ) {
		switch(Department.toLowerCase() ) {
		case"is":return new IS_memeberFactory() ;
		case"cs":return new CS_memberFactory();
		default : return null ;
		}

		
	}

}
