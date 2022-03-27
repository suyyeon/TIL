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
#### ✅ Setter
- 쓰기
- set멤버변수()
#### ✅ Getter
- 읽기
- get멤버변수()
#### ✅ this
- 객체 접근 연산자
- this.멤버변수 = 매개변수(지역변수)

```java
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
	
	private double calcWeight(int weight) {
		return weight / 1000.0;
	}
}
```

