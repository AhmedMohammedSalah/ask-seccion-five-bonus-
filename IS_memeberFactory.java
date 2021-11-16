package staff;

public class IS_memeberFactory extends AbstractMember {
public Staff getMember (String staffType ) {
	switch(staffType.toLowerCase() ) {
	case"doctor":return new IS_Doctor() ;
	case"teaching assistant":return new IS_TeachingAssistant() ;
	default : return null ;
	}
	
}
}
