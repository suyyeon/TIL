###### *220327(μΌ)*
# π static
1. Class Loading
	- ν΄λΉ νλ‘κ·Έλ¨μ μ€ννκΈ° μ μ ν΄λμ€μ μ μλ₯Ό λ―Έλ¦¬ μ½μ΄μ λ©λͺ¨λ¦¬μ μΉλ μμ
	- ν΄λμ€λ₯Ό λ―Έλ¦¬ μ½μ΄μ μΈμ λ μ§ μ¬μ© κ°λ₯νκ² λ©λͺ¨λ¦¬μ μ¬λ €λλ μμ
	- **ν΄λμ€ λ‘λ© κ³Όμ μμ λ°κ²¬λλ `λͺ¨λ  static λ©€λ²`λ λ©λͺ¨λ¦¬μ κ΅¬νλ¨**
2. main( )

## π static ν€μλ
- `ν΄λμ€ λ©€λ²`μ λΆμ΄λ ν€μλ
	- κ°μ²΄ λ³μ + μ μ  λ³μ
- ν΄λμ€μ λΆμ΄λ ν€μλ
	- λ©€λ² λ³μ
	- λ©€λ² λ©μλ

### β κ°μ²΄ λ³μ
- κ° κ°μΈ(κ°μ²΄)μ΄ κ°μ μ μ₯ν  λ°μ΄ν°λ₯Ό μ μ₯νλ λ³μ
- **λλ§μ λ°μ΄ν° > κ°μΈμ νΉμ±**
- κ°μΈ μ¬λ¬Όν¨

### β μ μ  λ³μ (static λ³μ, ν΄λμ€ λ³μ, κ³΅μ© λ³μ)
- νλμ ν΄λμ€λ‘λΆν° λ§λ€μ΄μ§ λͺ¨λ  κ°μ²΄κ° κ³΅ν΅μΌλ‘ κ°μ§λ λ°μ΄ν°λ₯Ό μ μ₯νλ λ³μ
- **λͺ¨λ  κ°μ²΄μ κ³΅ν΅λ νΉμ±**
- κ³΅μ© μ¬λ¬Όν¨
- κ°μ²΄κ° μλ X > this μ¬μ© X
- λ©μλ μ κ·Όν  λ ν΄λμ€λͺ.XXX

> λ³κ²½ μ 
```java
main {
	Student s1 = new Student();
	s1.setSchool("μ­μΌμ€νκ΅");
	System.out.println(s1.info());

	Student s2 = new Student();
	s2.setSchool("μ­μΌμ€νκ΅");
	System.out.println(s2.info());
}

class Student {
	private String name;
	private int age;
	
	private String school;

	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String info() {
		return String.format("μ΄λ¦: %s, λμ΄: %d, νκ΅: %s", this.name, this.age, this.school);
	}

}
```
>λ³κ²½ ν (1.static, 2.Student.school)
```java
main {
	// static λ©μλλ μ κ·Όν  λ μμ ν΄λμ€λͺμ λΆμ
	Student.setSchool("μ­μΌμ€νκ΅");
	
	Student s1 = new Student();
	System.out.println(s1.info());
	
	Student s2 = new Student();
	System.out.println(s2.info());
}

class Student {
	private String name;
	private int age;
	
	private static String school;

	public static String getSchool() {
		return school;
	}
	public static void setSchool(String school) {
		Student.school = school;
	}
	
	public String info() {
		return String.format("μ΄λ¦: %s, λμ΄: %d, νκ΅: %s", this.name, this.age, Student.school);
	}
}
```
