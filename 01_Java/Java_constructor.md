*220327(์ผ)*
# ๐ Constructor(์์ฑ์)
- (ํน์ํ ๋ชฉ์ ์ ๊ฐ์ง๋) ๋ฉ์๋
- `๊ฐ์ฒด ๋ฉค๋ฒ(๋ณ์)`๋ฅผ **์ด๊ธฐํ**ํ๋ ์ญํ ์ ๊ฐ์ง๋ ๋ฉ์๋
- ์ผ๋ฐ ๋ฉ์๋์ฒ๋ผ ๋ง์๋๋ก ํธ์ถ์ด ๋ถ๊ฐ๋ฅํจ > ๊ฐ์ฒด๊ฐ ์์ฑ๋  ๋ ๋ฑ, 1๋ฒ๋ง ํธ์ถ๋จ 
- ๊ทธ ๋ค์๋ ํธ์ถ์ด ๋ถ๊ฐ๋ฅ > 1ํ์ฉ
- ํด๋์ค ์ด๋ฆ๊ณผ ๋์ผํ ์ด๋ฆ์ ๊ฐ์ง

### โ new
- ๊ฐ์ฒด ์์ฑ ์ฐ์ฐ์. `๊ฐ์ฅ ์ค์ํ ์ผ์ ํจ`

## ๐ ๊ธฐ๋ณธ ์์ฑ์
- ๊ฐ๋ฐ์๊ฐ ์์ฑ ์ํ๋ฉด ์๋์ผ๋ก ์์ฑ๋จ
- ๊ฐ๋ฐ์๊ฐ ์์ฑํ๋ฉด ์๋์ผ๋ก ์์ฑ ์๋จ
- ๊ฐ๋ฐ์๊ฐ ๊ธฐ๋ณธ ์์ฑ์๋ฅผ ์์ฑ ํ ์ผ๋ถ ๋ฉค๋ฒ๋ฅผ ์ด๊ธฐํ๋ฅผ ์ ํ๋ฉด, ๊ทธ ์ผ๋ถ ๋ฉค๋ฒ์ ํํด์๋ ์๋์ผ๋ก `'์ด๊ธฐํ ์ฝ๋'`๊ฐ ์์ฑ ๋จ
- `๊ฐ์ฒด์ ๋ฉค๋ฒ ๋ณ์๋ ๋ฐ๋์ ์ด๊ธฐํ ๊ณผ์ ์ ๊ฑฐ์น๊ฒ ๋จ`
- ์ด๊ธฐํ๋ ๋ฌด์กฐ๊ฑด `'์์ฑ์'`
```java
class Cup {

	private String color;
	private String owner;
	private int weight;

	//์ด๊ธฐํ ์ฝ๋ -> ์์ฑ์!!!
	public Cup() {
		this.color = "white";
		this.owner = "๋ฏธ์ ";
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
		System.out.printf("์์: %s, ์์ ์ฃผ: %s\n", this.color, this.owner);
	}
}
```

### โ ๊ฐ์ฒด์ ์ด๊ธฐ ์ํ > ์ํฉ์ ๋ฐ๋ผ ๋ฌ๋ผ์ง ์ ์์
- ์์ฑ์์ `๋งค๊ฐ๋ณ์` ์ฌ์ฉ > ๋ค์์ฑ

```java
main {
	// ๋ชจ๋ธ๋ช ๊ธฐ๋ณธ๊ฐ(M705) + ๊ฐ๊ฒฉ ์ง์ 
	Mouse m4 = new Mouse(35000);

	// ๋ชจ๋ธ๋ช ์ง์  + ๊ฐ๊ฒฉ ๊ธฐ๋ณธ๊ฐ(40000)
	Mouse m5 = new Mouse("A100");

	// ๋ชจ๋ธ๋ช ์ง์  + ๊ฐ๊ฒฉ ์ง์ 
	Mouse m6 = new Mouse("A200",30000);
}

class Mouse {
	private String model;
	private int price;
	
	// ๊ธฐ๋ณธ๊ฐ
	public Mouse() {
		this.model = "M705";
		this.price = 40000;
	}
	
	// ๋ชจ๋ธ๋ช ๊ธฐ๋ณธ๊ฐ + ๊ฐ๊ฒฉ ์ง์ 
	public Mouse(int price) {
		this.model = "M705";
		this.price = price;
	}
	
	// ๋ชจ๋ธ๋ช ์ง์  + ๊ฐ๊ฒฉ ๊ธฐ๋ณธ๊ฐ
	public Mouse(String model) {
		this.model = model;
		this.price = 40000;
	}
	
	// ๋ชจ๋ธ๋ช ์ง์  + ๊ฐ๊ฒฉ ์ง์ 
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

### ๐ก ์์ฑ์๋ฅผ ์ฌ๋ฌ๊ฐ ์์ฑ(์์ฑ์ ์ค๋ฒ๋ก๋ฉ) > ์ค๋ณต ์ฝ๋ ๋ฐ์ > ์ค์ด์
- `this();` > ์์ฑ์ ํธ์ถํ๋ ํํ

```java
main {
	// ๋ชจ๋ธ๋ช ๊ธฐ๋ณธ๊ฐ(M705) + ๊ฐ๊ฒฉ ์ง์ 
	Mouse m4 = new Mouse(35000);

	// ๋ชจ๋ธ๋ช ์ง์  + ๊ฐ๊ฒฉ ๊ธฐ๋ณธ๊ฐ(40000)
	Mouse m5 = new Mouse("A100");

	// ๋ชจ๋ธ๋ช ์ง์  + ๊ฐ๊ฒฉ ์ง์ 
	Mouse m6 = new Mouse("A200",30000);
}

class Mouse {
	private String model;
	private int price;
	
	// ๊ธฐ๋ณธ๊ฐ
	public Mouse() {
		// A ํธ์ถ
		this("M705", 40000);
	}
	
	// ๋ชจ๋ธ๋ช ๊ธฐ๋ณธ๊ฐ + ๊ฐ๊ฒฉ ์ง์ 
	public Mouse(int price) {
		// A ํธ์ถ
		this("M705", price);
	}
	
	// ๋ชจ๋ธ๋ช ์ง์  + ๊ฐ๊ฒฉ ๊ธฐ๋ณธ๊ฐ
	public Mouse(String model) {
		// A ํธ์ถ
		this(model, 40000);
	}
	
	// A.
	// ๋ชจ๋ธ๋ช ์ง์  + ๊ฐ๊ฒฉ ์ง์ 
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
