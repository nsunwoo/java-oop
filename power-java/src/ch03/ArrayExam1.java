package ch03;

public class ArrayExam1 {

  public static void main(String[] args) {
    double[] faarray = new double[10];

    for (int i = 0; i < faarray.length; i++) {
      faarray[i] = i;
    }

    for (double i : faarray) {
      System.out.println(i);
    }

    double sum = 0;
    for (double i : faarray) {
      sum += i;
    }
    System.out.println(sum);
  }
}
