package streams;

public class PersonDTO {

	private Integer id;
	
	private String name;
	
	private Integer age;
	
	private Integer salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public PersonDTO(Integer id, String name, Integer age, Integer salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "PersonDTO [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary +  "]";
	}
	
	public static PersonDTO map(Person person)
	{
		return new PersonDTO(person.getId(), person.getName(), person.getAge(),person.getSalary());
	}
	
	
}
