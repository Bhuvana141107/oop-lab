public class Movie{
int year;
String name;
String director;
public Movie(){
year=2012;
name="Avengers";
director="Anthony Russo";
}
public Movie(String director,int year){
this.director=director;
this.year=year;
}
public Movie(int year,String director,String name){
this.year=year;
this.director=director;
this.name=name;
}
void display(){
System.out.println("Movie name:"+name+",Director:"+director+",Release Year:"+year);
}
public static void main(String args[]){
Movie m1=new Movie();
Movie m2=new Movie("Duffer Brothers",2017);
Movie m3=new Movie(2015,"Rajamouli","Bahubali");
m1.display();
m2.display();
m3.display();
}}
