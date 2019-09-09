# BOJ
Baekjoon Online Judge

## 소스파일 제출해서 채점받을 때 주의사항 !!  

### 1. 클래스 이름은 Main으로 변경해서 제출할 것.
`작성 예시`
``` Java
class Main {
  public static void main(String[] args) {
    // code
  }
}
```

### 2. import하는 라이브러리는 반드시 추가할 것.

`java.util.Scanner 를 사용하는 경우`

``` Java
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
  }
}
```
