package cseru09.tushar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cseru09.tushar.mdlDAO.PersonRepository;
import cseru09.tushar.mdlEntity.Person;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	//Insert  person
	public void addPerson(Person person) {
		personRepository.saveAndFlush(person);
	}
	
	//Update person
	public void updatePerson(Person person, Long pId) {
		personRepository.save(person);
	}
	
	
	//Retrieve all person
	public List<Person> getAllPerson(){
		return personRepository.findAll();
	}

	//Retrive single person
	public Person getPerson(Long id) {
		return personRepository.findOne(id);
	}

	//Delete person
	public void deletePerson(Long pId) {
		personRepository.delete(pId);
		
	}


	
	
}
