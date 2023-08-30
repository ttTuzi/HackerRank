package threeMonthPrepareKit.week1;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年08月29日 11:43 AM
 */
public class CamelCase {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while(!scanner.nextLine().equals("\n")){
//            String curr = scanner.nextLine();
//            if(curr.substring(0,1).equals("S")){
//                System.out.println(FindCapitalAndSplit(curr.substring(4)));
//
//            }
//        }
//    }
//
//
//    public static String FindCapitalAndSplit(String str){
//        char[] chars = str.toCharArray();
//        String newString = "";
//        int i=0;
//        int j=0;
//        while(j<str.length()) {
//            if (chars[j] >= 'A' && chars[j] <= 'Z') {
//                newString = newString + str.substring(i, j) + " ";
//                i = j;
//            }
//            j++;
//        }
//        return newString+str.substring(i);
//    }
//
//
//    @Test
//    public void test(){
//        String s = FindCapitalAndSplit("thatPadIsMine");
//        System.out.println(s);
//    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            String[] str=s.split(";");
            if(str[0].equalsIgnoreCase("S") && str[1].equalsIgnoreCase("M")){
                String res1="";
                char[] c=str[2].toCharArray();

                for(char ch:c){
                    if(Character.isUpperCase(ch)){
                        res1=res1+" "+Character.toLowerCase(ch);
                    }
                    else{
                        res1=res1+ch;
                    }
                }
                res1=res1.substring(0,c.length-1);
                System.out.println(res1);
            }

            if(str[0].equalsIgnoreCase("S") && str[1].equalsIgnoreCase("C")){
                String res2="";
                char[] c=str[2].toCharArray();

                for(char ch:c){
                    if(Character.isUpperCase(ch)){
                        res2=res2+" "+Character.toLowerCase(ch);
                    }
                    else{
                        res2=res2+ch;
                    }
                }
                System.out.println(res2.trim());
            }
            if(str[0].equalsIgnoreCase("S") && str[1].equalsIgnoreCase("V")){
                String res3="";
                char[] c=str[2].toCharArray();

                for(char ch:c){
                    if(Character.isUpperCase(ch)){
                        res3=res3+" "+Character.toLowerCase(ch);
                    }
                    else{
                        res3=res3+ch;
                    }
                }
                System.out.println(res3);
            }

            if(str[0].equalsIgnoreCase("C") && str[1].equalsIgnoreCase("M")){
                String res4="";
                String[] str3=str[2].split(" ");
                for(String chr:str3){
                    char p=chr.charAt(0);
                    res4=res4+Character.toUpperCase(p)+chr.substring(1);
                }
                res4=res4.substring(0, 1).toLowerCase() + res4.substring(1)+"()";
                System.out.println(res4);
            }
            if(str[0].equalsIgnoreCase("C") && str[1].equalsIgnoreCase("C")){
                String res5="";
                String[] str3=str[2].split(" ");
                for(String chr:str3){
                    char p=chr.charAt(0);
                    res5=res5+Character.toUpperCase(p)+chr.substring(1);
                }
                System.out.println(res5);
            }
            if(str[0].equalsIgnoreCase("C") && str[1].equalsIgnoreCase("V")){
                String res6="";
                String[] str3=str[2].split(" ");
                for(String chr:str3){
                    char p=chr.charAt(0);
                    res6=res6+Character.toUpperCase(p)+chr.substring(1);
                }
                res6=res6.substring(0, 1).toLowerCase() + res6.substring(1);
                System.out.println(res6);
            }


        }
    }

}
