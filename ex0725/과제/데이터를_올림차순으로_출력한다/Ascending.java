package ex0725.과제.데이터를_올림차순으로_출력한다;

import javax.swing.*;
import java.util.Arrays;

public class Ascending {
    int[] arr = {29, 17, 78, 4, 2, 47};
    int arrLength = arr.length;

    public static void main(String[] args) {
        Ascending a = new Ascending();
        System.out.println("-----------------버블 정렬-----------------");
        a.bubbleSort();

        System.out.println("-----------------선택 정렬-----------------");
        a.selectionSort();

        System.out.println("-----------------삽입 정렬-----------------");
        a.insertionSort();


    }

    // 1. 버블정렬 : 서로 붙은 애들끼리 자리 바꾸기
    public void bubbleSort() {
        int temp = 0;
        for (int i = 0; i < arrLength; i++) {
            for (int j = 0; j < arrLength - i; j++) {
                if (j + 1 < 6 && arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    // 2. 선택정렬 : 비교할 애들중 최소값 찾기
    public void selectionSort() {
        int min = 0;

        for (int i = 0; i < arrLength; i++) {
            for (int j = (i + 1); j < arrLength; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                    int tmp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    // 3. 삽입정렬 : 그냥 연결리스트일때 하나씩 연결해주기
    public void insertionSort() {
        for (int i = 1; i < arrLength; i++) {
            for (int j = i; j >= 1; j--) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}


/*     평소에 자주 쓰는 오름차순, 내림차순 핵심로직
        for (int i = 0; i < a.arrLength; i++) {
            for (int j = 0; j < i; j++) {
                if (a.arr[i] < a.arr[j]) {           부등호방향만 바꿔주면 왼쪽이 크다 일때 내림차순 오른쪽이 크다일땐 오름차순
                    int tmp = a.arr[i];
                    a.arr[i] = a.arr[j];
                    a.arr[j] = tmp;
                }
            }
        }

        for (int x : a.arr) {
            System.out.print(x + "  ");
        }
*/

/*
  본인이름: 권규정
  날짜: 22.07.25
  주제 : 버블정렬, 선택정렬, 삽입정렬 오름차순
*/