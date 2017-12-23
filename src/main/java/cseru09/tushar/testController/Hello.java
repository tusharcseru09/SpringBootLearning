package cseru09.tushar.testController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cseru09.tushar.mdlEntity.Person;
import cseru09.tushar.services.PersonService;

@RestController  
public class Hello {
	
	@Autowired
	private PersonService personService;
	
	//Insert Person [Remember we can also use it for update as we know by Hibernate configuration...]
	@RequestMapping(method=RequestMethod.POST, value="/person")
	public void insertPerson(@RequestBody Person person) {
		personService.addPerson(person);
	}
	
	//Update Person
	@RequestMapping(method=RequestMethod.PUT, value="/persons/{pId}")
	public void updatePerson(@RequestBody Person person, @PathVariable Long pId) {
		personService.updatePerson(person,pId);
	}	
	
	
	//Retrieve all person
	@RequestMapping(method=RequestMethod.GET, value="/persons")
	public List<Person> retriveAllPerson(){
		return personService.getAllPerson();
	}
	
	//Retrive single person
	@RequestMapping(method=RequestMethod.GET, value="/persons/{pId}")
	public Person retrivePerson(@PathVariable Long pId) {
		return personService.getPerson(pId);
	}
	
	
	//Delete single person
	@RequestMapping(method=RequestMethod.DELETE, value="/persons/{pId}")
	public void deletePerson(@PathVariable Long pId) {
		 personService.deletePerson(pId);
	}
	
	
	@RequestMapping("/")
	public String index() {
		return "NewFile";
	}
	
}
