package DSA.Stack;

public class NextGreaterElement {
    public static void next(int a[],int b[]){
      for(int i=0;i<a.length;i++){
          b[i]=-1;
          for(int j=i+1;j<a.length;j++){
              if(a[j]>a[i]) {
                  b[i]=a[j];
              break;
              }
          }

    }}

    public static void main(String args[]){
        int a[]={1,8,0,1,3};
        int b[]=new int[a.length];
        next(a,b);
        for(int i=0;i<a.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
