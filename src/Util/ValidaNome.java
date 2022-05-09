package Util;

public class ValidaNome {
    
    public static boolean nomeIsValid(String nome){

        if(nome.matches("^\\p{L}+[\\p{L}\\p{Z}\\p{P}]{0,}")==true){
            return true;
        }else{
            return false;
        }
    }

}
