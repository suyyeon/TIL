###### *220330(수)*
# 📌 Enum(열거형)
- 서로 관련된 `상수`를 선언함
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
