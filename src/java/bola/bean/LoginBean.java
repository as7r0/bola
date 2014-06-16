/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bola.bean;

/**
 *
 * @author nunomelo
 */
public class LoginBean {

    private String login;
    private String password;
    private String error;

    /**
     * Getter method for login
     * @return 
     */
    public String getLogin() {        
        return login;
    }
    
    /**
     * Setter method for login
     * @param login
     */
    public void setLogin(final String login) {        
         this.login=login;
    }
    
    /**
     * Getter method for password
     * @return 
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * Setter method for password
     * @param password
     * 
     */
    public void setPassword(final String password) {        
         this.password=password;
    }
    
    public String validadeLogin()
    {
        if(!login.equals("astro"))
            return ("loginError");
        else
            return ("loginSuccess");
    }       
    
}
