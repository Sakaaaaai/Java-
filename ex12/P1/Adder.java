public class Adder{
public static void main(String[] args){
int ans=0;
int N; 
for(int i=0;i<4;i++){
N = Integer.parseInt(args[i]);
ans += N;
}
System.out.println(ans);
}
}