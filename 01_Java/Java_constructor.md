###### *220327(일)*
# 📌 Constructor(생성자)
- (특수한 목적을 가지는) 메소드
- 객체 멤버(변수)를 **초기화**하는 역할을 가지는 메소드
- 일반 메소드처럼 마음대로 호출이 불가능함 > 객체가 생성될 때 딱, 1번만 호출됨 
- 그 뒤에는 호출이 불가능 > 1회용
- 클래스 이름과 동일한 이름을 가짐

### ✅ new
- 객체 생성 연산자. 가장 중요한 일을 함

## 📌 기본 생성자
- 개발자가 작성 안하면 자동으로 생성됨
- 개발자가 작성하면 자동으로 생성 안됨
- 개발자가 기본 생성자를 생성 후 일부 멤버를 초기화를 안 하면 그 일부 멤버에 한해서는 자동으로 `'초기화 코드'`가 작성 됨
- **객체의 멤버 변수는 반드시 초기화 과정을 거치게 됨**
- 초기화는 무조건 **'생성자'**
```java
class Cup {

	private String color;
	private String owner;
	private int weight;

	//초기화 코드 -> 생성자!!!
	public Cup() {
		this.color = "white";
		this.owner = "미정";
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void info() {
		System.out.printf("색상: %s, 소유주: %s\n", this.color, this.owner);
	}
}
```

### ✅ 객체의 초기 상태 > 상황에 따라 달라질 수 있음
- 생성자의 `매개변수` 사용 > 다양성

```java
main {
	// 모델명 기본값(M705) + 가격 지정
	Mouse m4 = new Mouse(35000);

	// 모델명 지정 + 가격 기본값(40000)
	Mouse m5 = new Mouse("A100");

	// 모델명 지정 + 가격 지정
	Mouse m6 = new Mouse("A200",30000);
}

class Mouse {
	private String model;
	private int price;
	
	// 기본값
	public Mouse() {
		this.model = "M705";
		this.price = 40000;
	}
	
	// 모델명 기본값 + 가격 지정
	public Mouse(int price) {
		this.model = "M705";
		this.price = price;
	}
	
	// 모델명 지정 + 가격 기본값
	public Mouse(String model) {
		this.model = model;
		this.price = 40000;
	}
	
	// 모델명 지정 + 가격 지정
	public Mouse(String model, int price) {
		this.model = model;
		this.price = price;
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
```

### 💡 생성자를 여러개 생성(생성자 오버로딩) > 중복 코드 발생!!! > 줄이자!!!
- `this();` > 생성자 호출하는 표현

```java
main {
	// 모델명 기본값(M705) + 가격 지정
	Mouse m4 = new Mouse(35000);

	// 모델명 지정 + 가격 기본값(40000)
	Mouse m5 = new Mouse("A100");

	// 모델명 지정 + 가격 지정
	Mouse m6 = new Mouse("A200",30000);
}

class Mouse {
	private String model;
	private int price;
	
	// 기본값
	public Mouse() {
		// A 호출
		this("M705", 40000);
	}
	
	// 모델명 기본값 + 가격 지정
	public Mouse(int price) {
		// A 호출
		this("M705", price);
	}
	
	// 모델명 지정 + 가격 기본값
	public Mouse(String model) {
		// A 호출
		this(model, 40000);
	}
	
	// A.
	// 모델명 지정 + 가격 지정
	public Mouse(String model, int price) {
		this.model = model;
		this.price = price;
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
```
