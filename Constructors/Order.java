public class Order{
String item;
int quantity;
String address;
String instruction;
public Order(){
item="Veg Combo";
quantity=1;
address="To be updated";
instruction="none";
}
public Order(String item,int quantity){
this.item=item;
this.quantity=quantity;
address="home address on file";
instruction="none";
}
public Order(String item,int quantity,String address,String instruction){
this.item=item;
this.quantity=quantity;
this.address=address;
this.instruction=instruction;
}
public void displayOrder(){
System.out.println("Item:"+item+",Quantity:"+quantity+",Address:"+address+",Instruction:"+instruction);
}
public static void main(String args[]){
Order order1=new Order();
Order order2=new Order("parota",2);
Order order3=new Order("chicken",3,"canada","less spicy");
order1.displayOrder();
order2.displayOrder();
order3.displayOrder();
}}
