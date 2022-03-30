
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
3. Map : (key, value)의 piar으로 이루어진 데이터의 집합. 순서는 유지되지 않으며, 키는 중복 X, 값은 중복 O
	- HashMap
	- TreeMap
	- HashTable(legacy)
	- Properties(legacy) <br>


# 📌 List 계열
![](https://user-images.githubusercontent.com/97590398/160878474-15625dfd-8415-466c-8a2a-cfc0cb596ec3.png)
## 1️⃣ ArrayList 클래스
```java
ArrayList<T> list = new ArrayList<T>();
```
- 순수 배열과 구조가 가장 유사함 > `index` 사용해서 `element(요소)`에 접근
- 사용 빈도가 가장 높음


### ✅ 사용법
1. 요소 추가
	- boolean add(T value)
	- 배열의 맨 마지막에 추가함 > Append Mode
	```java
	list.add("바나나");
	list.add("딸기");
	list.add("사과");
	list.add("배");
	list.add("포도");
	list.add("파인애플");	
	```
2. 요소 개수
	- int size()
	```java
	list.size()
	```
3. 요소 접근
	- T get(int index)
	```java
	list.get(0)
	list.get(list.size() - 1) // 마지막 요소
	```


4. 요소 수정
	- String set(int index, T newValue)
	```java
	list.set(2, "파인애플");
	```
5. 요소 삭제
	- 순수 배열은 요소 삭제 불가능
	- 컬렉션은 요소 삭제 가능
	- T remove(int index) > 방 번호를 찾아서 삭제
	- boolean remove(T value) > 값을 찾아서 삭제 > `처음 만나는 요소`를 삭제
	- 삭제된 방 이후의 모든 요소는 **left shift가 발생**함
	```java
	list.remove(2);
	list.remove("파인애플");
	```	
6. 요소 추가
	- 배열의 원하는 위치에 요소를 추가 > Insert Mode
	- 삽입(새치기)
	- void add(int index, T value)
	- 삽입된 방 이후의 모든 요소가 **right shift**가 발생함
	```java
	list.add(2, "망고");
	```	

7. 요소 검색
	- int indexOf(T value)
	- int lastIndexOf(T value)
	- boolean contains(T value)
	```java
	list.indexOf("사과")
	list.contains("사과")
	```			

8. 초기화
	- 모든 요소 삭제
	- void celar()
	```java
	list.clear();
	```		
9. 빈 배열 확인
	- boolean isEmpty()
	```java
	list.isEmpty()
	list.size() == 0
	```		  

