package org.apache.struts.register.action;

import org.apache.struts.register.model.Person;

import com.opensymphony.xwork2.ActionSupport;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import org.apache.struts.register.model.usr;

/**
 * Acts as a controller to handle actions
 * related to registering a user.
 * @author team Best
 *
 */
public class Login extends ActionSupport {
        
        private static final long serialVersionUID = 1L;
        
        private usr personBean;
        private ArrayList<usr> users = new ArrayList<usr>();
        @Override
        public String execute() throws Exception {
                
                //call Service class to store personBean's state in database
             boolean pass, name;
             
             pass = false; name = false;
             
             try{
                Scanner fileScan = new Scanner(new File("userProfiles.txt"));
                Scanner infoScan;
                while(fileScan.hasNext())
                {
                  infoScan = new Scanner(fileScan.nextLine());
                  infoScan.useDelimiter(";");
                  usr newGuy;
                  while(infoScan.hasNext())
                  {
                    newGuy = new usr();
                    
                    newGuy.setUsername(infoScan.next());
                    newGuy.setPassword(infoScan.next());
                    newGuy.setFname(infoScan.next());
                    newGuy.setLname(infoScan.next());
                    newGuy.setEmail(infoScan.next());
                    newGuy.setMajor(infoScan.next());
                    newGuy.setNightowl(infoScan.nextBoolean());
                    newGuy.setJob(infoScan.nextBoolean());
                    newGuy.setSmoke(infoScan.nextBoolean());
                    newGuy.setPets(infoScan.nextBoolean());
                    newGuy.setAge(infoScan.nextShort());
                    newGuy.setOutgoing(infoScan.nextShort());
                    newGuy.setNoise(infoScan.nextShort());
                    newGuy.setCompany(infoScan.nextShort());
                    newGuy.setStudytime(infoScan.nextShort());
                    newGuy.setClean(infoScan.nextShort());
                    
                    users.add(newGuy);
                  }//end inner while
                }//end while
                }//end try
                catch(Exception e){usr newGuy = new usr("Eric", "Bourdreau", "ebourdreau@dyn.com", "ebourdreau", "123", "Engineering", true, true, false, true, 6, 4, 21, 6, 3, 8);
                users.add(newGuy);
                newGuy = new usr("Andrew", "Corey", "acorey@nowhere.com", "acorey", "abc", "Computer Science", true, true, false, true, 7, 6, 21, 8, 3, 2);
                users.add(newGuy);}
                     
                
                for(int i=0; i<users.size(); i++)
                  if ( personBean.getUsername().compareTo(users.get(i).getUsername()) == 0 )
                  { 
                    name = true;
                    if ( personBean.getPassword().compareTo(users.get(i).getPassword()) == 0 )
                         pass = true;
                  }//end if
                  
             if( pass && name)   
                return SUCCESS;
             else
                return ERROR;
                
        }//end execute
        
public void validate(){
                
                try{
                Scanner fileScan = new Scanner(new File("../model/userProfiles.txt"));
                Scanner infoScan;
                while(fileScan.hasNext())
                {
                  infoScan = new Scanner(fileScan.nextLine());
                  infoScan.useDelimiter(";");
                  usr newGuy;
                  while(infoScan.hasNext())
                  {
                    newGuy = new usr();
                    
                    newGuy.setUsername(infoScan.next());
                    newGuy.setPassword(infoScan.next());
                    newGuy.setFname(infoScan.next());
                    newGuy.setLname(infoScan.next());
                    newGuy.setEmail(infoScan.next());
                    newGuy.setMajor(infoScan.next());
                    newGuy.setNightowl(infoScan.nextBoolean());
                    newGuy.setJob(infoScan.nextBoolean());
                    newGuy.setSmoke(infoScan.nextBoolean());
                    newGuy.setPets(infoScan.nextBoolean());
                    newGuy.setAge(infoScan.nextShort());
                    newGuy.setOutgoing(infoScan.nextShort());
                    newGuy.setNoise(infoScan.nextShort());
                    newGuy.setCompany(infoScan.nextShort());
                    newGuy.setStudytime(infoScan.nextShort());
                    newGuy.setClean(infoScan.nextShort());
                    
                    users.add(newGuy);
                  }//end inner while
                }//end while
                }//end try
                catch(Exception e){}
        }//end validate

        
        public usr getPersonBean() {
                
                return personBean;
        }
        
        public void setPersonBean(usr person) {
                
                personBean = person;    
        }
}//end login