import java.util.*;

class B04 {

public static void main(String args[]){
}
void taxpro {
Scanner s = new Scanner(System.in);
int tax;
System.out.print("연봉을 원단위로 입력하세요:");
int salary = s.nextInt();
if(salary < 10000000)
tax = salary*0.095;
if(salary<40000000)
tax = salary*0.19;
if(salary<80000000)
tax = salary*0.28;
if(salary>80000000)
tax = salary*0.37
System.out.print("연봉을 금액에 대한 소득세는 :"+tax+"+입니다.");
}
