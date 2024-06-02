import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 열
        int b = sc.nextInt(); // 행
        
        for(int i = 1; i <= b; i++){ // 행
            String star = ""; // 행 마다 초기화
            for(int j = 1; j <= a; j++){ // 열( * 개수)
                star += "*";
            }
            System.out.println(star); // 각 행 출력
        }
    }
}
