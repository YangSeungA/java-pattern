package pattern.builderPattern;

import java.util.zip.Inflater;

public class PersonInfoBuilder {
	private String name;
	private Integer age;
	private String favoriteColor;
	private String favoriteAnimal;
	private Integer favoriteNumber;

	public PersonInfoBuilder setName(String name){
		this.name = name;
		return this;
	}

	public PersonInfoBuilder setAge(Integer age){
		this.age = age;
		return this;
	}

	public PersonInfoBuilder setFavoriteColor(String color){
		this.favoriteColor = favoriteAnimal;
		return this;
	}

	public PersonInfoBuilder setFavoriteAnimal(String animal){
		this.favoriteAnimal = animal;
		return this;
	}

	public PersonInfoBuilder setFavoriteNumber(Integer number){
		this.favoriteNumber = number;
		return this;
	}

	public Person build(){
		Person person = new Person(name,age,favoriteColor,favoriteAnimal,favoriteNumber);
		return person;
	}
}
