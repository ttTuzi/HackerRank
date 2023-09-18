package threeMonthPrepareKit.week4;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年09月09日 3:50 PM
 */
public class TowerBreaker {
    public static void main(String[] args) {
        System.out.println(towerBreakers(1,7));
        System.out.println(towerBreakers(3,7));
    }
    public static int towerBreakers(int n, int m) {
        // Write your code here



        if(m==1){
            return 2;
        }
        if(n%2==1){
            return 1;
        }else{
            return 2;
        }
    }
}
