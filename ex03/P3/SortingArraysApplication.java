class SortingArraysApplication{
public static void main(String[] args){
    
int[][] arrays = {
{3, 2, 1},
{9, 7, 10, 4, 8, 2, 5, 3, 1, 6},
{7, 2, 3, 2, 2, 1, 1, 1},
{2, 1},
{100},
{888888888, -888888888}
};

for(int k=0; k < 6 ; k++){
for (int i = 0; i < arrays[k].length - 1; i++) {
            for (int j = arrays[k].length - 1; j > i; j--) {
                if (arrays[k][j - 1] > arrays[k][j]) {
                    int tmp = arrays[k][j - 1];
                    arrays[k][j - 1] = arrays[k][j];
                    arrays[k][j] = tmp;
                }
             }
        }
        }

for ( int i = 0; i < arrays.length; i++ ){
for ( int j = 0; j < arrays[i].length; j++ ){
System.out.print(" " + arrays[i][j]);
}
System.out.println();
}
}
}
