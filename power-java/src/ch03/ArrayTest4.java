package ch03;

// 정수형 배열을 작성하고 for-each 루프로 배열에서 정수를 하나씩 꺼내서
// 화면에 출력하여 보자.
public class ArrayTest4 {

  public static void main(String[] args) {
    int[] numbers = {10, 20, 30};
    for (int value : numbers) {
      System.out.print(value + " ");
    }
  }
}
