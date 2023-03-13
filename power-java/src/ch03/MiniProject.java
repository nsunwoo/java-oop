package ch03;

import java.util.Scanner;

public class MiniProject {

  public static void main(String[] args) {
    int answer = (int) (Math.random() * 100);
    int count = 0;
    System.out.println("정답: " + answer);
    Scanner sc = new Scanner(System.in);
    do {
      System.out.print("정답을 추측하여 보시오: ");
      int guess = sc.nextInt();
      count += 1;
      if (answer > guess) {
        System.out.println("제시한 정수가 낮습니다.");
      } else if (answer < guess) {
        System.out.println("제시한 정수가 높습니다.");
      } else {
        System.out.println("축하합니다. 시도횟수=" + count);
        break;
      }
    } while (true);
  }
}
