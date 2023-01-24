/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author SHREYA
 */
class Gadget{
    private String name;
    private String status;
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

class SmartPhone extends Gadget{
}

class DigitalWatch extends Gadget{
}

interface RepairGadget{
    void repair(Gadget gadget);
}

class SmartPhoneRepairer implements RepairGadget
{
    @Override
    public void repair(Gadget gadget){
        SmartPhone smartphone = (SmartPhone)gadget;
        System.out.println("Repairing your "+smartphone.getClass().getName());
        smartphone.setStatus("Working");
        System.out.println("Your "+smartphone.getClass().getName() +"now working");
    }
}

class DigitalWatchRepairer implements RepairGadget
{    
    @Override
    public void repair(Gadget gadget){
        DigitalWatch digitalWatch = (DigitalWatch)gadget;
        System.out.println("Repairing your "+digitalWatch.getClass().getName());
       digitalWatch.setStatus("Working");
        System.out.println("Your "+digitalWatch.getClass().getName() +"now working");
    }
}

class RepairShop{
    private RepairGadget smartPhoneRepairer;
    private RepairGadget digitalWatchRepairer;
    
    public RepairShop(){
        smartPhoneRepairer = new SmartPhoneRepairer();
        digitalWatchRepairer = new DigitalWatchRepairer();
    }
    
    public void repairSmartPhone(SmartPhone smartPhone){
        smartPhoneRepairer.repair(smartPhone);
    }
    
    public void repairDigitalWatch(DigitalWatch digitalWatch){
        digitalWatchRepairer.repair(digitalWatch);
    }
}


public class test {
    public static void main(String[] args) {
        RepairShop repairShop = new RepairShop();

        SmartPhone sp1 = new SmartPhone();
        sp1.setName("Samsung Note 3");
        sp1.setStatus("Working");
        
        DigitalWatch dw1 = new DigitalWatch();
        dw1.setName("Sony SpeedX");
        dw1.setStatus("Working");
        
        System.out.println("Using devices");
        System.out.println("Devices' status: ");
        System.out.println(sp1.getName()+" is "+sp1.getStatus());
        System.out.println(dw1.getName()+" is "+dw1.getStatus());
        
        System.out.println("Devices got problem");
        sp1.setStatus("Not Working");
        dw1.setStatus("Not Working");
        
        System.out.println("Devices' status: ");
        System.out.println(sp1.getName()+" is "+sp1.getStatus());
        System.out.println(dw1.getName()+" is "+dw1.getStatus());
        
        System.out.println("Devices sent for repairing");
        repairShop.repairSmartPhone(sp1);
        repairShop.repairDigitalWatch(dw1);
        
        System.out.println("Devices' Status after repairing");
        System.out.println(sp1.getName()+" is "+sp1.getStatus());
        System.out.println(dw1.getName()+" is "+dw1.getStatus());
    }
}
