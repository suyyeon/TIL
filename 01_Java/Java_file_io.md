*220404(์)*
# ๐ ํ์ผ ์์ถ๋ ฅ

## ๐ ์๋ฐ์์ ์ธ๋ถ์ ํ์ผ์ ์ ๊ทผํ  ๊ฒฝ์ฐ
1. ์ธ๋ถ ํ์ผ์ ์ฐธ์กฐํ๋ ์ฐธ์กฐ ๊ฐ์ฒด ์์ฑ > ๋๋ฆฌ์ธ, ์์์
2. ์ฐธ์กฐ ๊ฐ์ฒด ์กฐ์ > ์ธ๋ถ ํ์ผ์ ์ ์ฉ

```java
// ๊ฒฝ๋ก > ์์๋ก ์ง์ 
final String PATH = "C:\\class\\java\\file\\data.txt";

// ํ์ผ ์ฐธ์กฐ ๊ฐ์ฒด > java.io.File
// - file ๊ฐ์ฒด == data.txt
File file = new File(PATH);

// ํ์ผ์ด ์กด์ฌํ๋ฉด
if (file.exists()) {

          System.out.println("ํ์ผ ์์");

          System.out.println(file.getName()); // data.txt

          System.out.println(file.isFile()); // true
          System.out.println(file.isDirectory()); // false

          System.out.println(file.length()); // ํ์ผ ํฌ๊ธฐ(๋ฐ์ดํธ)

          System.out.println(file.getAbsolutePath()); // C:\class\java\file\data.txt
          System.out.println(file.getPath()); // C:\class\java\file\data.txt

          System.out.println(file.lastModified()); // 1649031846236 > tick๊ฐ
          System.out.println(file.isHidden()); // false > ์จ๊ธดํ์ผ

          // tick -> ๋์์ผ์๋ถ์ด
          Calendar c1 = Calendar.getInstance();
          System.out.println(c1.getTimeInMillis());
          c1.setTimeInMillis(file.lastModified()); // c1์ ์์ 
          System.out.printf("%tF %tT\n", c1, c1);

} else {
          System.out.println("ํ์ผ ์์");
}
```

### โ ํ์ผ ์กฐ์๋ฒ
- ์์ฑ, ๋ณต์ฌ(X), ์ด๋, ํ์ผ๋ช ์์ , ์ญ์ 

1. ์ํ์ผ ์์ฑ > ๊ฐ์์ผ๋ก ๊ฒฝ๋ก๋ฅผ ์ ์ด์ค
```java
File file = new File("C:\\class\\java\\file\\hello.txt");

if (!file.exists()) {

          try {
                    // ๋์ผํ ํ์ผ์ด ์กด์ฌํ๋ฉด ์๋ก ๋ง๋ค๊ธฐ๋ฅผ ์คํจ
                    System.out.println(file.createNewFile());

          } catch (IOException e) {
                    e.printStackTrace();
          }

} else {
          System.out.println("์ด๋ฏธ ๋์ผํ ํ์ผ์ด ์กด์ฌํฉ๋๋ค.");
}
```

2. ํ์ผ๋ช ๋ฐ๊พธ๊ธฐ
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

3. ํ์ผ ์ด๋
```java
// - file\hello.txt > move\hello.txt
File file = new File("C:\\class\\java\\file\\hello.txt");
File file2 = new File("C:\\class\\java\\move\\hi.txt");

if (file.exists()) {
          boolean result = file.renameTo(file2);
          System.out.println(result);
}
```

4. ํ์ผ ์ญ์ 
```java
File file = new File("C:\\class\\java\\file\\data.txt");

          if (file.exists()) {
                    boolean result = file.delete(); // ์ง์ง ์ญ์ 
                    System.out.println(result);
          }
```


## ๐ ์๋ฐ์์ ์ธ๋ถ์ ํด๋๋ฅผ ์ ๊ทผํ  ๊ฒฝ์ฐ
- ํด๋(Folder), ๋๋ ํ ๋ฆฌ(Directroy)

```java
// ๊ฒฝ๋ก
final String PATH = "C:\\class\\java\\file";

// ๋๋ ํ ๋ฆฌ ์ฐธ์กฐ ๊ฐ์ฒด
// - ๋๋ ํ ๋ฆฌ(ํด๋)๋ ํ์ผ์ด๋ค.
File dir = new File(PATH);

// ํ์ผ์ ์ด๋์ ๋น ๋ฅด๋ค. ๋จ, ๋๋ผ์ด๋ธ๊ฐ ๋ค๋ฅธ ์ด๋์ ๋๋ฆผ
// ํ์ผ์ ๋ณต์ฌ๋ ๋๋ฆฌ๋ค.

if (dir.exists()) {
          System.out.println("ํด๋ ์์");

          System.out.println(dir.getName()); // file

          System.out.println(dir.isFile()); // false
          System.out.println(dir.isDirectory()); // true

          System.out.println(dir.length()); // 0 ** ํด๋ ํฌ๊ธฐ

          System.out.println(dir.getAbsolutePath()); // C:\class\java\file
          System.out.println(dir.getPath()); // C:\class\java\file

          System.out.println(dir.lastModified()); // 1649032754448
          System.out.println(dir.isHidden()); // false > ์จ๊ธดํ์ผ

          System.out.println(dir.getParent()); // C:\class\java


} else {
          System.out.println("ํด๋ ์์");
}
```

### โ ํด๋ ์กฐ์๋ฒ
1. ํด๋ ์์ฑ
```java
File dir = new File("C:\\class\\java\\file\\bbb\\ccc");

if (!dir.exists()) {
          boolean result = dir.mkdirs(); // ์กด์ฌํ์ง ์๋ ํด๋๋ฅผ ํ๋ฐฉ์ ๋ง๋ค์ด์ค
          System.out.println(result);
} else {
          System.out.println("์ด๋ฏธ ๊ฐ์ ์ด๋ฆ์ ํด๋๊ฐ ์กด์ฌํจ.");
}
```

2. ํด๋๋ช ๋ฐ๊พธ๊ธฐ
```java
File dir = new File("C:\\class\\java\\file\\ํ ์ผ");
File dir2 = new File("C:\\class\\java\\file\\todo");

boolean result = dir.renameTo(dir2);
System.out.println(result);
```

3. ํด๋ ์ด๋
```java
File dir = new File("C:\\class\\java\\file\\todo");
File dir2 = new File("C:\\class\\java\\\\todo");

boolean result = dir.renameTo(dir2);
System.out.println(result);
 ```

 4. ํด๋ ์ญ์ 
 ```java
 // - ๋น ํด๋๋ง ์ญ์ ๊ฐ ๊ฐ๋ฅํ๋ค.
File dir = new File("C:\\class\\java\\file\\ํ์");

if (dir.exists()) {
          boolean result = dir.delete(); // ์ง์ง ์ญ์ 
          System.out.println(result);
}
 ```

 5. ํด๋ ๋ด์ฉ๋ณด๊ธฐ**
 - ํ์๊ธฐ์ฒ๋ผ
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