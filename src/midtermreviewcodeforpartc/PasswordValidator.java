/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermreviewcodeforpartc;

import java.util.Scanner;

/**
 *
 * @author leo
 */
public class PasswordValidator {
    Scanner sc1 = new Scanner (System.in);
    
    public String newPass(){
    
    boolean validPassword=false;
    String password="";
    
        while(!validPassword){
                System.out.println("Passwords must have at least 8 characters");
                System.out.println("Passwords must have at least one special character");
                System.out.println("Please enter your desired password:"); 

                password = sc1.nextLine();
                int specialCharCount=0;
                //iterate over each character to see if it is a special character
                for(int i=0;i<password.length(); i++)
                {
                    if(!(Character.isLetterOrDigit(password.charAt(i))))
                    {
                        //now we know there is at least one special character
                        specialCharCount++;
                    }
                }
                if(specialCharCount>0 &&password.length()>7)
                {
                    validPassword=true;
                }
            }//loop only ends when password is valid so now we create the User
        return password;
    }
}
