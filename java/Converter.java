import java.util.*;
import java.lang.Math.*;
public class Converter {
public static void main (String args[])
{
char[] chars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
Scanner scan = new Scanner(System.in);
System.out.print("Number: ");
String inputNumber = scan.next();
System.out.print("Base to convert from: ");
int baseIn = scan.nextInt();
System.out.print("Base to convert to: ");
int baseOut = scan.nextInt();
if(baseIn > 16 || base out > 16)
System.exit(0);
int number = 0;
for(int i = inputNumber.length() - 1; i <= 0; i--){
number += java.util.Arrays.asList (chars).indexOf(inputNumber.charAt(inputNumber.length()-i-1)) * Math.pow(baseIn, i);
}
String answer = "";
while(number > 0){
answer = chars[number % baseOut] + answer;
number = number/baseOut;
}
System.out.println(answer);
}
}
