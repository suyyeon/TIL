# 📌 static
1. Class Loading
	- 해당 프로그램을 실행하기 전에 클래스의 정의를 미리 읽어서 메모리에 얹는 작업
	- 클래스를 미리 읽어서 언제든지 사용 가능하게 메모리에 올려놓는 작업
	- **클래스 로딩 과정에서 발견되는 `모든 static 멤버`는 메모리에 구현됨**
2. main( )

## 📌 static 키워드
- `클래스 멤버`에 붙이는 키워드
	- 객체 변수 + 정적 변수
- 클래스에 붙이는 키워드
	- 멤버 변수
	- 멤버 메소드

### ✅ 객체 변수
- 각 개인(객체)이 각자 저장할 데이터를 저장하는 변수
- **나만의 데이터 > 개인의 특성**
- 개인 사물함

### ✅ 정적 변수 (static 변수, 클래스 변수, 공용 변수)
- 하나의 클래스로부터 만들어진 모든 객체가 공통으로 가지는 데이터를 저장하는 변수
- **모든 객체의 공통된 특성**
- 공용 사물함
- 객체가 아님 X > this 사용 X

> 변경 전
```java
main {
	Student s1 = new Student();
	s1.setSchool("역삼중학교");
	System.out.println(s1.info());

	Student s2 = new Student();
	s2.setSchool("역삼중학교");
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
		return String.format("이름: %s, 나이: %d, 학교: %s", this.name, this.age, this.school);
	}

}
```
>변경 후 (static, Student.school)
```java
main {
	// static 메소드는 접근할 때 앞에 클래스명을 붙임
	Student.setSchool("역삼중학교");
	
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
		return String.format("이름: %s, 나이: %d, 학교: %s", this.name, this.age, Student.school);
	}
}
```
