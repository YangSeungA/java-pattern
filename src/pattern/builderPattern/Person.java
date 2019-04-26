package pattern.builderPattern;

/**
 * 조건 : 이 객체는 한번 생성되면 읽기(read)만 가능해야함
 */
public class Person {

	private String name;
	private Integer age;
	private String favoriteColor;
	private String favoriteAnimal;
	private Integer favoriteNumber;

	public Person(String name, Integer age, String favoriteColor, String favoriteAnimal, Integer favoriteNumber) {
		this.name = name;
		this.age = age;
		this.favoriteColor = favoriteColor;
		this.favoriteAnimal = favoriteAnimal;
		this.favoriteNumber = favoriteNumber;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public String getFavoriteColor() {
		return favoriteColor;
	}

	public String getFavoriteAnimal() {
		return favoriteAnimal;
	}

	public Integer getFavoriteNumber() {
		return favoriteNumber;
	}

	public String getPersonInfo(){
		String personInfo = String.format("name:%s, age:%d, favoriteColor:%s, favoriteAnimal:%s, favoriteNumber:%d"
		, name, age, favoriteColor, favoriteAnimal, favoriteNumber);
		return personInfo;
	}
}

