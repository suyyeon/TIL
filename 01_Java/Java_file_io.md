*220404(월)*
# 📌 파일 입출력

## 📌 자바에서 외부의 파일을 접근할 경우
1. 외부 파일을 참조하는 참조 객체 생성 > 대리인, 위임자
2. 참조 객체 조작 > 외부 파일에 적용

```java
// 경로 > 상수로 지정
final String PATH = "C:\\class\\java\\file\\data.txt";

// 파일 참조 객체 > java.io.File
// - file 객체 == data.txt
File file = new File(PATH);

// 파일이 존재하면
if (file.exists()) {

          System.out.println("파일 있음");

          System.out.println(file.getName()); // data.txt

          System.out.println(file.isFile()); // true
          System.out.println(file.isDirectory()); // false

          System.out.println(file.length()); // 파일 크기(바이트)

          System.out.println(file.getAbsolutePath()); // C:\class\java\file\data.txt
          System.out.println(file.getPath()); // C:\class\java\file\data.txt

          System.out.println(file.lastModified()); // 1649031846236 > tick값
          System.out.println(file.isHidden()); // false > 숨긴파일

          // tick -> 년월일시분초
          Calendar c1 = Calendar.getInstance();
          System.out.println(c1.getTimeInMillis());
          c1.setTimeInMillis(file.lastModified()); // c1을 수정
          System.out.printf("%tF %tT\n", c1, c1);

} else {
          System.out.println("파일 없음");
}
```

### ✅ 파일 조작법
- 생성, 복사(X), 이동, 파일명 수정, 삭제

1. 새파일 생성 > 가상으로 경로를 적어줌
```java
File file = new File("C:\\class\\java\\file\\hello.txt");

if (!file.exists()) {

          try {
                    // 동일한 파일이 존재하면 새로 만들기를 실패
                    System.out.println(file.createNewFile());

          } catch (IOException e) {
                    e.printStackTrace();
          }

} else {
          System.out.println("이미 동일한 파일이 존재합니다.");
}
```

2. 파일명 바꾸기
```java
// - hello.txt -> hi.txt
File file = new File("C:\\class\\java\\file\\hello.txt");
File file2 = new File("C:\\class\\java\\file\\hi.txt");

if (file.exists()) {
          // file(hello.txt) -> file2(hi.txt)
          boolean result = file.renameTo(file2);
          System.out.println(result);
}
```

3. 파일 이동
```java
// - file\hello.txt > move\hello.txt
File file = new File("C:\\class\\java\\file\\hello.txt");
File file2 = new File("C:\\class\\java\\move\\hi.txt");

if (file.exists()) {
          boolean result = file.renameTo(file2);
          System.out.println(result);
}
```

4. 파일 삭제
```java
File file = new File("C:\\class\\java\\file\\data.txt");

          if (file.exists()) {
                    boolean result = file.delete(); // 진짜 삭제
                    System.out.println(result);
          }
```


## 📌 자바에서 외부의 폴더를 접근할 경우
- 폴더(Folder), 디렉토리(Directroy)

```java
// 경로
final String PATH = "C:\\class\\java\\file";

// 디렉토리 참조 객체
// - 디렉토리(폴더)는 파일이다.
File dir = new File(PATH);

// 파일의 이동은 빠르다. 단, 드라이브가 다른 이동은 느림
// 파일의 복사는 느리다.

if (dir.exists()) {
          System.out.println("폴더 있음");

          System.out.println(dir.getName()); // file

          System.out.println(dir.isFile()); // false
          System.out.println(dir.isDirectory()); // true

          System.out.println(dir.length()); // 0 ** 폴더 크기

          System.out.println(dir.getAbsolutePath()); // C:\class\java\file
          System.out.println(dir.getPath()); // C:\class\java\file

          System.out.println(dir.lastModified()); // 1649032754448
          System.out.println(dir.isHidden()); // false > 숨긴파일

          System.out.println(dir.getParent()); // C:\class\java


} else {
          System.out.println("폴더 없음");
}
```

### ✅ 폴더 조작법
1. 폴더 생성
```java
File dir = new File("C:\\class\\java\\file\\bbb\\ccc");

if (!dir.exists()) {
          boolean result = dir.mkdirs(); // 존재하지 않는 폴더를 한방에 만들어줌
          System.out.println(result);
} else {
          System.out.println("이미 같은 이름의 폴더가 존재함.");
}
```

2. 폴더명 바꾸기
```java
File dir = new File("C:\\class\\java\\file\\할일");
File dir2 = new File("C:\\class\\java\\file\\todo");

boolean result = dir.renameTo(dir2);
System.out.println(result);
```

3. 폴더 이동
```java
File dir = new File("C:\\class\\java\\file\\todo");
File dir2 = new File("C:\\class\\java\\\\todo");

boolean result = dir.renameTo(dir2);
System.out.println(result);
 ```

 4. 폴더 삭제
 ```java
 // - 빈 폴더만 삭제가 가능하다.
File dir = new File("C:\\class\\java\\file\\회원");

if (dir.exists()) {
          boolean result = dir.delete(); // 진짜 삭제
          System.out.println(result);
}
 ```

 5. 폴더 내용보기**
 - 탐색기처럼
 ```java
File[] list = dir.listFiles();

for (File d : list) {

          if (d.isDirectory()) {
                    System.out.printf("[%s]\n", d.getName());
          }
}

for (File f : list) {

          if (f.isDirectory()) {
                    System.out.printf("%s\n", f.getName());
          }
}

 ```