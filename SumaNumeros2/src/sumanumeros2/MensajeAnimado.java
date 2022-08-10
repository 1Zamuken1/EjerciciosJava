package sumanumeros2;

public class MensajeAnimado {

public static void main(String[] args) throws InterruptedException{
    char mensaje1[]={'+','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','+','\n'};
    char mensaje[]={'|',' ','P','R','O','G','R','A','M','A','C','I','O','N',' ','D','E',' ','S','O','F','T','W','A','R','E',' ','|','\n'};
    char mensaje2[]={'+','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','+','\n'};
    //System.out.print("\n\n\n\t\t\t\t");
    
    for (int i = 0; i < mensaje1.length; i++){
        try{
                if(i==28){
                    System.out.println();
                }
                System.out.print(mensaje1[i]);
                Thread.sleep(250);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
    }
    
    for (int i = 0; i < mensaje.length; i++){
        try{
                if(i==28){
                    System.out.println();
                }
                System.out.print(mensaje[i]);
                Thread.sleep(250);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
    }
      
    
    for (int i = 0; i < mensaje2.length; i++){
        try{
                if(i==28){
                    System.out.println();
                }
                System.out.print(mensaje2[i]);
                Thread.sleep(250);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
    }
    System.out.println("");
}
}