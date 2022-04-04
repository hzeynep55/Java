public class Harf {
    public static void main(String[] args){
        String[][] str=new String[7][4];
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

            for(String[] row:str){
               for(String col:row){
                   System.out.print(col);
               }
                System.out.println();
            }
        }
    }
}
