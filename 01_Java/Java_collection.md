
###### *220330(수)*
# 📌 Java Collection Framework(JCF)
- (향상된) `배열`
- 기존의 순수 배열의 성능 향상(입출력), 사용법을 개량 > 클래스
- 내부에 순수 배열을 가지고 있음 > public 메소드들을 통해서 성능 or 사용법 개량
- `길이 가변` > 방의 개수를 마음대로 늘리고 줄이는게 가능
- 자료 구조

## 📌 종류
1. List : `순서가 있는` 데이터의 집합, 데이터의 `중복을 허용 O`
	  - ArrayList
	  -  LinkedList
	  - Queue
	  - Stack
	  - Vector(legacy)
2. Set : 순서를 유지하지 않는 데이터의 집합, 데이터의 중복을 허용 X  
	- HashSet
	- TreeSet
3. Map : (key, value)의 piar으로 이루어진 데이터의 집합. <br> 순서는 유지되지 않으며, 키는 중복 X, 값은 중복 O
	- HashMap
	- TreeMap
	- HashTable(legacy)
	- Properties(legacy)

## 📌 ArrayList 클래스
![](https://images.app.goo.gl/4gTR6ubN1ZXg86tC7)

