
*220330(수)~220401(월)*
# 📌 Java Collection Framework(JCF)
- 향상된 `배열`
	- 배열은 선언 시 정한 크기를 변경할 수 없고, 항목을 저장, 삭제, 추가하는 메소드가 없기 때문에 직접 인덱스를 사용해야 함.
- 자료 구조 : 데이터를 저장하는 공간의 구조
- 기존의 순수 배열의 성능 향상(입출력), 사용법을 개량 > 클래스
- 내부에 순수 배열을 가지고 있음 > public 메소드들을 통해서 성능 or 사용법 개량
- `길이 가변` > 방의 개수를 마음대로 늘리고 줄이는게 가능
	- ❓why❓ 배열은 크기를 한번 설정하면 바뀔수가 없는데 어떻게 길이가 가변이지 
		> 배열 처음 4byte, 배열 크기가 부족하면 원래 크기 `x 2` 해서 새로운 배열을 만듦  <br>
		> 즉, 시작 주소가 바뀜 > 우리는 배열의 크기가 늘어나는것처럼 보임
	 


## 📌 종류
1. List : `순서가 있는` 데이터의 집합, 데이터의 `중복을 허용 O`
	  - ArrayList
	  - Stack
	  - Queue
	  - LinkedList
	  - Vector(legacy)
2. Set : `순서를 유지하지 않는` 데이터의 집합, 데이터의 `중복을 허용 X`  
	- HashSet
	- TreeSet
3. Map : `(key, value)`의 piar으로 이루어진 데이터의 집합. `순서는 유지되지 않으며, 키는 중복 X, 값은 중복 O`
	- HashMap
	- TreeMap
	- HashTable(legacy)
	- Properties(legacy) <br>


# 📌 List 계열
![](https://user-images.githubusercontent.com/97590398/160878474-15625dfd-8415-466c-8a2a-cfc0cb596ec3.png)
## 1️. ArrayList
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
	list.add("포도");
	list.add("파인애플");	
	```
	
	- void add(int index, T value)
	- 배열의 원하는 위치에 요소를 추가 > Insert Mode > 삽입(새치기)
	- 삽입된 방 이후의 모든 요소가 **right shift**가 발생함
	```java
	list.add(2, "망고");
	```		
2. 요소 수정
	- String set(int index, T newValue)
	```java
	list.set(2, "파인애플");
	```
3. 요소 개수
	- int size()
	```java
	list.size()
	```
4. 요소 접근
	- T get(int index)
	```java
	list.get(0)
	list.get(list.size() - 1) // 마지막 요소
	```
5. 요소 삭제
	- 순수 배열은 요소 삭제 불가능
	- 컬렉션은 요소 삭제 가능
	- T remove(int **index**) > 방 번호를 찾아서 삭제
	- boolean remove(T value) > 값을 찾아서 삭제 > `처음 만나는 요소`를 삭제
	- 삭제된 방 이후의 모든 요소는 **left shift가 발생**함
	```java
	list.remove(2);
	list.remove("파인애플");
	```	

6. 초기화
	- 모든 요소 삭제
	- void celar()
	```java
	list.clear();
	```		
7. 요소 검색
	- int indexOf(T value)
	- int lastIndexOf(T value)
	- boolean contains(T value)
	```java
	list.indexOf("사과")
	list.contains("사과")
	```			
8. 빈 배열 확인
	- boolean isEmpty()
	```java
	list.isEmpty()
	list.size() == 0
	```		  

### 💡 배열(고정) vs ArrayList(불확실)
- `길이`로 선택해

### 💡 컬렉션에 반복적으로 데이터에 넣는 행동으로 생기는 문제점
- 가비지 발생 > 비용 발생
- 배열 복사 발생 > 비용 발생
- `해결방법` ArrayList의 초기 길이를 지정하면 됨
---
### 💡 ADT(Adstract Data Type, 추상적 자료형)
- Stack, Queue
- 물리적인 특성을 가지는것이 아니라 사용법에 특성을 가진다.
## 2. Stack
- LIFO(후입선출)
- 저장소에 나중에 들어간 요소가 먼저 나옴
- ex) 메모리 구조(Stack), 되돌리기(Ctrl+Z), 다시하기(Ctrl+Y)
### ✅ 사용법
1. 요소 추가
	- T push(T value)
	```java
	stack.push("빨강");
	stack.push("파랑");
	stack.push("노랑");
	```
2. 요소 개수
	- int size()
	```java
	stack.size()
	```
3. 요소 접근(꺼내기 == 삭제)
	- 복구 불가능 
	- 마지막 요소부터 꺼내짐
	- T pop
	```java
	stack.pop()
	```
4. 빈 배열 확인
	- boolean isEmpty()
	```java
	stack.isEmpty()
	list.size() == 0
	```		  
5. 요소 확인(읽기 + 삭제 X, 꺼내기 X)
	- T peek
	```java
	stack.peek()
	```	

## 3. Queue
- FIFO(선입선출)
- 저장소에 먼저 들어간 요소가 먼저 나옴
- ex) 줄서기

### ✅ 사용법
1. 요소 추가
	- boolean add(T value)
	```java
	queue.add("빨강");
	queue.add("파랑");
	queue.add("노랑");
	```
2. 요소 개수
	- int size()
	```java
	queue.size()
	```
3. 요소 접근(꺼내기)
	- 복구 불가능 
	- 첫번째 요소부터 꺼내짐
	- 요소가 비어있어도 에러 발생 X
	- T poll
	```java
	queue.poll()
	```	
4. 빈 배열 확인
	- boolean isEmpty()
	```java
	queue.isEmpty()
	list.size() == 0
	```		  
5. 요소 확인(읽기 + 삭제 X, 꺼내기 X)
- T peek
	```java
	queue.peek()
	```	
5. 요소 초기화
- T clear                           
	```java
	queue.clear();
	```	
# 📌 Set 계열
## 1. HashSet
![](https://user-images.githubusercontent.com/97590398/161434599-d8a81069-62a3-49f6-a7c3-c5661d3f6a8b.png)
- 같은 문자열을 갖는 String 객체는 동등한 객체로 간주됨.
### ✅ 사용법
1. 요소 추가
	- boolean add(T value)
	```java
	set.add("사과");
	set.add("바나나");
	set.add("딸기");
	```
2. 요소 개수
	- set size()
	```java
	set.size()
	```
3. 요소 삭제
	- V remove(K key)
	```java
	set.remove();
	```	 
4. 요소 읽기
	- Iterator<T> iterator()
	```java
	Iterator<String> iter = set.iterator();
	```

# 📌 Map 계열
## 1. HaspMap

### ✅ 사용법
1. 요소 추가
	- V put(K key, V value)
	```java
	map.put("국어", 100);
	map.put("영어", 90);
	map.put("수학", 80);
	```
2. 요소 개수
	- int size()
	```java
	map.size()
	```
3. 요소 읽기
	- V get(k key)
	```java
	map.get()
	```
4. 일괄 탐색 > for > 불가능
	
5. 요소 수정
	- V put(k key, V value)
	```java
	map.put()
	```	
6. 요소 검색
	 - boolean containsKey(K key)
	 - boolean containsValue(V value)
	```java
	map.containsKey()
	map.containsValue()
	```	
7. 요소 삭제
	- V remove(K key)
	```java
	map.remove();
	```	 

8. 초기화
	- V clear()
	```java
	map.clear();
	```
