###### *220330(수)*
# 📌 Enum(열거형)
- 서로 관련된 `상수`를 선언함
- 하나의 객체를 public static final 필드 형태로 제공
- `값` 뿐만 아니라 `타입`까지 체크함

## 📌 열거형 정의
```java
enum 열거형이름 { 상수명1, 상수명2, ...}
```
```java
enum Direction {
	EAST, 
	SOUTH,
	WEST,
	NORTH
}
```
## 📌 열거형 사용
```java
열거형이름.상수명
```
```java
Direction d1 = Direction.EAST; // 이 방법을 제일 많이 사용함
Direction d2 = Direction.valueOf("WEST");
Direction d3 = Enum.valueOf(Direction.class, "EAST");
```
## 📌 열거형에서 사용되는 메서드
- String name( ) : 열거형 상수의 이름을 문자열로 반환
- int ordinal( ) : 열거형 상수가 정의된 순서를 반환(0부터 시작)
- T valueOf(Class<T> enumType, String name) : 지정된 열거형에서 name과 일치하는 열거형 상수를 반환
- values( ) : 열거형의 모든 상수를 배열에 담아 반환
