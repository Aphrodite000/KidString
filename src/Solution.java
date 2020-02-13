import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String r="";
        int count=0;
        int right=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)<='9'&&str.charAt(i)>='0'){
                count =1;
                right=i;
                for(int j=i+1;j<str.length();j++){
                    if(str.charAt(j)<='9'&&str.charAt(j)>='0'){
                        count++;
                        right=j;
                    }else{
                        break;
                    }
                }
            }
            if(count>r.length()){
                r=str.substring(i,right+1);
            }
        }
        System.out.println(r);
    }
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        //插入排序
        for(int i=0;i<input.length-1;i++){
            int key =input[i+1];
            int j;
            for(j=i;j>=0&&key<input[j];j--){
                input[j+1]=input[j];
            }
            input[j+1]=key;
        }
        for(int i=0;i<k;i++){
            list.add(input[i]);
        }
        return list;
    }
}
