package staff;

public class CS_memberFactory extends AbstractMember{
	public Staff getMember (String staffType ) {
		switch(staffType.toLowerCase() ) {
		case"doctor":return new CS_Doctor() ;
		case"teaching assistant":return new CS_TeachingAssistant() ;
		default : return null ;
		}

	}
}
