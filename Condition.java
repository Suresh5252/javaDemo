import java.util.*;
class Condition{
//this is main function
public static void main(String args[]){


Scanner obj = new Scanner(System.in);

int male = obj.nextInt();
int female = obj.nextInt();

if(male > 23){

if(female > 21){

System.out.println("Eligible to have marriage");

}else{
System.out.println("Not Eligible to have marriage");
}
}
else{
System.out.println("Not Eligible to have marriage");
}
}
}


