package staff;

public class Demo {

	public static void main(String[] args) {
		AbstractMember CS_am= memberProducer.getDept("CS") ;
		Staff CS_stf_DR = CS_am.getMember("Doctor");
		Staff CS_stf_TS = CS_am.getMember("teaching assistant");
		CS_stf_DR.getSallary();
		CS_stf_TS.getSallary();
		AbstractMember IS_am= memberProducer.getDept("is") ;
		Staff IS_stf_DR = IS_am.getMember("Doctor");
		Staff IS_stf_TS = IS_am.getMember("teaching assistant");
		IS_stf_DR.getSallary();
		IS_stf_TS.getSallary();
		
		
	}

}
