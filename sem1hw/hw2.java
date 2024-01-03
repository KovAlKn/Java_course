package sem1hw;

public class hw2 {
    public static void main(String[] args) {
            System.out.println(2);
                for(int i=3; i<=1000; i=i+2){ 
                    double minDel=Math.sqrt(i);
                    boolean status = true;
                    for(int j=2;j<=minDel;j++){
                        if(i%j==0){status = false;}     
                }
                 if(status==true){System.out.println(i);}   
            }
        } 
    }
        
