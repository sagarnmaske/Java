import java.util.*;
public class ArrayRotation {
public static void main(String[] args) {
System.out.println("Array Rotation");
Scanner sc=new Scanner(System.in);
int n,i,j;
n=sc.nextInt();
int A[];
A=new int[n];
int B[];
B=new int[n];
for(i=0;i<n;i++){
   A[i]=sc.nextInt();
}
System.out.println("How Many Elements Rotation?");
int k=sc.nextInt();
if(k>=n){
   System.out.println("Invalid Input");
}
else{
   j=0;
   for(i=k;i<n;i++){
       B[j++]=A[i];
   }
   for(i=0;i<k;i++){
       B[j++]=A[i];
   }
   System.out.print("Rotated Array-->");
   for(i=0;i<n;i++){
       System.out.print(" "+B[i]);
   }
}

}
}


