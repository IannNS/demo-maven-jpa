package domain;

import java.io.Serializable;

// Maintain this import to grant that persistence will work properly
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person implements Serializable{
	private static final long serialVersionUID = 1L;
	
	// Create SQL table with data bellow, following annotation
	// Make sure the @Id annotation is over the Identifier of your table!
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Id;
	
	// To make a different column name, use @Column annotation (ex. @Column(name="fullName"))
	private String name;
	private String email;
	
	public Person() { }

	public Person(Integer id, String name, String email) {
		Id = id;
		this.name = name;
		this.email = email;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [Id=" + Id + ", name=" + name + ", email=" + email + "]";
	}
}
