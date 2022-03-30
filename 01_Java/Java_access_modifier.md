*220327(일)*
# 📌 Access Modifier (접근 지정자 & 제어자)
- 클래스 멤버에 붙여서 사용함
- 클래스 자체에 붙여서 사용함
- 지역변수에는 사용 불가능
- 클래스(객체)의 영역을 기준으로 외부에 해당 멤버를 노출하는 수위를 결정
- 멤버를 외부에 공개할지 여부를 조절하는 역할
> 1. public > 100% 공개
> 2. private > 100% 비공개
> >어떤 거는 공개하고 어떤 거는 공개 안하고
> 3. protected
> 4. default
<br>

## 📌 Class Access Modifier 사용방법
1.  멤버 변수는 무조건 `private`으로 지정함 > 부품들..
2. 인터페이스 역할 메소드 `public`으로 생성함  > 리모컨의 버튼들.. > 객체의 사용방법
	- 단축키 : Alt + Shift + S
### ✅ Setter
- 쓰기
- set멤버변수()
- 역할 : 객체 초기화 X, 객체 정보 수정 O
### ✅ Getter
- 읽기
- get멤버변수()

###  ✅ Setter/Getter 역할
- 멤버 보호(멤버 변수에 유효하지 않은 값이 들어가는 것을 방지)
- 쓰기 전용, 읽기 전용 가능
- 계산된 멤버 생성 가능
### ✅ this
- 객체 접근 연산자
- this.멤버변수
- this.멤버변수 = 매개변수(지역변수)


```java
main {
	SmartPhone s1 = new SmartPhone();

	//쓰기
	s1.setModel("S22");
	s1.setColor("white");
	s1.setPrice(120);
	s1.setWeight(300); // g

	System.out.println(s1.getModel());
	System.out.println(s1.getColor());
	System.out.println(s1.getPrice());
	System.out.println(s1.getWeight()); // kg

	// *** 사용자에게 혼동을 초래함!! > 이 메소드가 왜 있지?
	// s1.calcWeight(0);
}

class Phone {
	private String model;
	private String color;
	private int price;
	private int weight;

	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return this.model;
	}

	public void setColor(String color) {
		if (color.equals("black") || color.equals("white") || color.equals("red")
				|| color.equals("yellow") || color.equals("blue")) {
			this.color = color;
		} else {
			System.out.println("존재하지 않는 색상입니다.");
		}
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return this.price;
	}

	public void setWeight(int weight) {
		if (weight > 0) {
			this.weight = weight;
		}
	}
	public double getWeight() {
		return calcWeight(this.weight);
	}
	// *** calcWeight 메소드의 성격?
	// - Getter > X
	// - 내부업무에 필요한 작업을 분리시키기 위해서
	private double calcWeight(int weight) {
		return weight / 1000.0;
	}
}
```

<br>

## 📌 클래스 설계 접근 지정자 가이드
1. 멤버변수 > private
2. 필요한 Setter/Getter > public
3. 불필요한 내부 멤버 메소드 > private
4. 외부 호출 멤버 메소드 > public
> ?? 잘 모르겠다
> 1. 무조건 모두 다 private(변수, 메소드)
> 2. Setter/Getter > public
> 3. 필요한데 안 보이는 멤버가 발생 > 걔네들만 하나씩 public 교체 

## 📌 주의사항
- 모든 상황에서 범위가 큰 요소와 범위가 작은 요소끼리 충돌 발생함
- **무조건(100%) 범위가 작은 요소가 우선**

