
public class Loop {
public static void main(String[] args) {
int a, b;
a=1; b=2;
while(a<7) {
a = b+a;  //a=3 a=9
do {
b=a+b; //b=5 b=14
a=a+1; //a=4
} while(b<9);
}
System.out.println(a + " e " + b);
}
}