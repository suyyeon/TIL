*220327(์ผ)*
# ๐ Access Modifier (์ ๊ทผ ์ง์ ์ & ์ ์ด์)
- ํด๋์ค ๋ฉค๋ฒ์ ๋ถ์ฌ์ ์ฌ์ฉํจ
- ํด๋์ค ์์ฒด์ ๋ถ์ฌ์ ์ฌ์ฉํจ
- ์ง์ญ๋ณ์์๋ ์ฌ์ฉ ๋ถ๊ฐ๋ฅ
- ํด๋์ค(๊ฐ์ฒด)์ ์์ญ์ ๊ธฐ์ค์ผ๋ก ์ธ๋ถ์ ํด๋น ๋ฉค๋ฒ๋ฅผ ๋ธ์ถํ๋ ์์๋ฅผ ๊ฒฐ์ 
- ๋ฉค๋ฒ๋ฅผ ์ธ๋ถ์ ๊ณต๊ฐํ ์ง ์ฌ๋ถ๋ฅผ ์กฐ์ ํ๋ ์ญํ 
> 1. public > 100% ๊ณต๊ฐ
> 2. private > 100% ๋น๊ณต๊ฐ
> >์ด๋ค ๊ฑฐ๋ ๊ณต๊ฐํ๊ณ  ์ด๋ค ๊ฑฐ๋ ๊ณต๊ฐ ์ํ๊ณ 
> 3. protected
> 4. default
<br>

## ๐ Class Access Modifier ์ฌ์ฉ๋ฐฉ๋ฒ
1.  ๋ฉค๋ฒ ๋ณ์๋ ๋ฌด์กฐ๊ฑด `private`์ผ๋ก ์ง์ ํจ > ๋ถํ๋ค..
2. ์ธํฐํ์ด์ค ์ญํ  ๋ฉ์๋ `public`์ผ๋ก ์์ฑํจ  > ๋ฆฌ๋ชจ์ปจ์ ๋ฒํผ๋ค.. > ๊ฐ์ฒด์ ์ฌ์ฉ๋ฐฉ๋ฒ
	- ๋จ์ถํค : Alt + Shift + S
### โ Setter
- ์ฐ๊ธฐ
- set๋ฉค๋ฒ๋ณ์()
- ์ญํ  : ๊ฐ์ฒด ์ด๊ธฐํ X, ๊ฐ์ฒด ์ ๋ณด ์์  O
### โ Getter
- ์ฝ๊ธฐ
- get๋ฉค๋ฒ๋ณ์()

###  โ Setter/Getter ์ญํ 
- ๋ฉค๋ฒ ๋ณดํธ(๋ฉค๋ฒ ๋ณ์์ ์ ํจํ์ง ์์ ๊ฐ์ด ๋ค์ด๊ฐ๋ ๊ฒ์ ๋ฐฉ์ง)
- ์ฐ๊ธฐ ์ ์ฉ, ์ฝ๊ธฐ ์ ์ฉ ๊ฐ๋ฅ
- ๊ณ์ฐ๋ ๋ฉค๋ฒ ์์ฑ ๊ฐ๋ฅ
### โ this
- ๊ฐ์ฒด ์ ๊ทผ ์ฐ์ฐ์
- this.๋ฉค๋ฒ๋ณ์
- this.๋ฉค๋ฒ๋ณ์ = ๋งค๊ฐ๋ณ์(์ง์ญ๋ณ์)


```java
main {
	SmartPhone s1 = new SmartPhone();

	//์ฐ๊ธฐ
	s1.setModel("S22");
	s1.setColor("white");
	s1.setPrice(120);
	s1.setWeight(300); // g

	System.out.println(s1.getModel());
	System.out.println(s1.getColor());
	System.out.println(s1.getPrice());
	System.out.println(s1.getWeight()); // kg

	// *** ์ฌ์ฉ์์๊ฒ ํผ๋์ ์ด๋ํจ!! > ์ด ๋ฉ์๋๊ฐ ์ ์์ง?
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
			System.out.println("์กด์ฌํ์ง ์๋ ์์์๋๋ค.");
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
	// *** calcWeight ๋ฉ์๋์ ์ฑ๊ฒฉ?
	// - Getter > X
	// - ๋ด๋ถ์๋ฌด์ ํ์ํ ์์์ ๋ถ๋ฆฌ์ํค๊ธฐ ์ํด์
	private double calcWeight(int weight) {
		return weight / 1000.0;
	}
}
```

<br>

## ๐ ํด๋์ค ์ค๊ณ ์ ๊ทผ ์ง์ ์ ๊ฐ์ด๋
1. ๋ฉค๋ฒ๋ณ์ > private
2. ํ์ํ Setter/Getter > public
3. ๋ถํ์ํ ๋ด๋ถ ๋ฉค๋ฒ ๋ฉ์๋ > private
4. ์ธ๋ถ ํธ์ถ ๋ฉค๋ฒ ๋ฉ์๋ > public
> โโ ์ ๋ชจ๋ฅด๊ฒ ๋ค
> 1. ๋ฌด์กฐ๊ฑด ๋ชจ๋ ๋ค private(๋ณ์, ๋ฉ์๋)
> 2. Setter/Getter > public
> 3. ํ์ํ๋ฐ ์ ๋ณด์ด๋ ๋ฉค๋ฒ๊ฐ ๋ฐ์ > ๊ฑ๋ค๋ค๋ง ํ๋์ฉ public ๊ต์ฒด 

## ๐ก ์ฃผ์์ฌํญ
- ๋ชจ๋  ์ํฉ์์ ๋ฒ์๊ฐ ํฐ ์์์ ๋ฒ์๊ฐ ์์ ์์๋ผ๋ฆฌ ์ถฉ๋ ๋ฐ์ํจ
- **๋ฌด์กฐ๊ฑด(100%) ๋ฒ์๊ฐ ์์ ์์๊ฐ ์ฐ์ **

