/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author SHREYA
 */
class Config
{
    private Config(){}
    public static Config obj = new Config();
    
    public static Config getInstance(){
        return obj;
    }
}
public class SingletonDp {
    public static void main(String[] args) 
    {
        Config obj = Config.getInstance();
        System.out.println("Obj: "+obj);
        Config obj1 = Config.getInstance();
        System.out.println("Obj1: "+obj1);
    }
}
