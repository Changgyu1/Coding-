import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String star = ""; // 별 개수
        for(int i = 1; i <= b; i++){ // 열
            for(int j = 1; j <= a; j++){ // 행( * 개수)
                star += "*";
            }
            System.out.println(star); // 행 출력
            star =""; // 행 초기화
        }
    }
}