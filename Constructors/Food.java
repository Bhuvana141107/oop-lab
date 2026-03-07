public class Food{
int token;
String name;
int price;
double rating;

public Food(){
token=56;
name="Sandwich";
price=500;
rating=4.5;
}
public Food(int token,String name,int price,double rating){
this.token=token;
this.name=name;
this.price=price;
this.rating=rating;
}
public Food(Food f){
this.token=f.token;
this.name=f.name;
this.price=f.price;
this.rating=f.rating;
}
void display(){
System.out.println("Token number:"+token+",Food name:"+name+",Food price:"+price+",Ratings:"+rating);
}
public static void main (String args[]){
Food f1=new Food();
Food f2=new Food(23,"pizza",600,5);
Food payroll=new Food(28,"burger",1000,4.8);
Food f3=new Food(payroll);

f1.display();
f2.display();
f3.display();
}}

