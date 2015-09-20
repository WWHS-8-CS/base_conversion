import java.util.*;
public class Converter {
public static void main (String args[])
{
char[] chars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
Scanner scan = new Scanner(System.in);
System.out.print("Number: ");
int number = scan.nextInt();
System.out.print("Base to convert to: ");
int base = scan.nextInt();
if(base > 16)
System.exit(0);
String answer = "";
while(number > 0){
answer = chars[number % base] + answer;
number = number/base;
}
System.out.println(answer);
}
}
