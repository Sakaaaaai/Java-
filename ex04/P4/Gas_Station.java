import java.util.Scanner;

class Gas_Station {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int[][] Lane = new int[10000][10];
        int N_second;
        int flag = 0;
        int N = sc.nextInt();
        int M = sc.nextInt();

        for(int i = 0;i < M;i++){

        int N_first = sc.nextInt();

        if(N_first == 1){
        for(int k = 1;k < 10001;k++){
            for(int j = 1;j < N+1;j++){
            if(Lane[j][k]==0){
                Lane[j][k] = sc.nextInt();
                flag = 1;
                break; 
            }
            }
            if(flag == 1){
                flag = 0;
                break;
            }
            }
        }
        else if(N_first == 0) {
            N_second = sc.nextInt();
            for(int l=1;l<10001;l++){ 
            if(Lane[N_second][l] != 0){
            System.out.println(Lane[N_second][l]);
            Lane[N_second][l] = 0;
            break;
            }
            }
        }
        
    }
    
        }
}

