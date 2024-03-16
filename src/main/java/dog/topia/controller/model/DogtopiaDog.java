package dog.topia.controller.model;

import dog.topia.entity.Dog;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
public class DogtopiaDog {
	private Long dog_id;
	private String dog_name;
	private String dog_breed;
	private String dog_owner_notes;
	
	// Constructor that takes a Dog object.
		public DogtopiaDog(Dog dog) {
			this.dog_id = dog.getDog_id();
			this.dog_name = dog.getDog_name();
			this.dog_breed = dog.getDog_breed();
			this.dog_owner_notes = dog.getDog_owner_notes();
		}
		
		
}
