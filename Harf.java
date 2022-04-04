public class Harf {
    public static void main(String[] args){
        String[][] str=new String[7][4];//b harfi
        for(int i=0; i<str.length; i++){
            for(int j=0; j<str[i].length;j++){
                if(i==0|| i==3|| i==6){
                    str[i][j]=(j==0||j==1||j==2)?"*":" ";

                }
                else if(i==1||i==2||i==4||i==5){
                    str[i][j]=(j==3||j==0)?"*":" ";
                }
                else{
                    str[i][j]=" ";
                }





            }
            
             String[][] z=new String[6][4]; //z harfi
            for(int k=0; k<z.length; k++){
                for(int m=0; m<z[k].length; m++){
                    if(k==1 || k==5){
                        z[k][m]="*";
                    }
                    else if(k==1){
                        z[k][m]=(m==3)?"*":" ";

                    }
                    else if(k==2){
                        z[k][m]=(m==2)?"*":" ";

                    }
                    else if(k==3){
                        z[k][m]=(m==1)?"*":" ";

                    }
                    else if(k==4){
                        z[k][m]=(m==0)?"*":" ";

                    }
                    else{
                        z[k][m]=" ";
                    }
                }
            }

            for(String[] row:str){
               for(String col:row){
                   System.out.print(col);
               }
                System.out.println();
            }
            
            for(String[] row:z){
                for(String col:row){
                    System.out.print(col);
                }
                System.out.println();
            }
        }
    }
}
