/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bola.ui;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author nunomelo
 */
@Named(value = "registrationForm")
@Dependent
public class RegistrationForm {
    
    private String username;
    
    public String getuserName(){
        return username;
    }
    
    public void setuserName(String username){
        this.username=username;
    }

}
