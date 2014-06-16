/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bola.bean;

import bola.ui.RegistrationForm;

/**
 *
 * @author nunomelo
 */
public class RegistrationBean {
    
    private RegistrationForm registrationForm=null;
    private String user;
    
    
    public String register(){
        System.out.println("Registering....");
        
        return "registerSuccess";
        
    }
    
    public RegistrationForm getRegistrationForm(){
        if(this.registrationForm==null){
            this.registrationForm=new RegistrationForm();
        }
        return registrationForm;
    }
    
    public void setRegistrationForm(RegistrationForm registrationForm){
        this.registrationForm=registrationForm;
    }
    
    
}
