package classesandobjects;



public class FordFigoTitanium extends FordFigo{

	String popAirBags() {
		return "airbags are popped";
	}
	
	// Annotation
	@Override
	String applyBreak() {
		//super.applyBreak(); // used to call the overridden method 
								// of the parent class
							// it has to be the first line
		return "ABS Break applied";
	}
}
//annotations specific to ORM(Object Relational Mapping) - JPA
// @Entity - above the class
// @Table(name="table_name") - above the class
// @Id - above a property
// @Column(name="column_name)
