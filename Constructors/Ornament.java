public class Ornament{
String name;
double price;
String type;

public Ornament(){
name="necklace";
price=14000;
type="Gold";
}
public Ornament(String type,double price){
this.type=type;
this.price=price;
}
public Ornament(String name,double price,String type){
this.name=name;
this.price=price;
this.type=type;
}
void display(){
System.out.println("Ornament name:"+name+",Price:"+price+",Ornament type:"+type);
}
public static void main(String args[]){
Ornament o1=new Ornament();
Ornament o2=new Ornament("Silver",20000);
Ornament o3=new Ornament("Bracelet",27000,"platinum");

o1.display();
o2.display();
o3.display();
}}





