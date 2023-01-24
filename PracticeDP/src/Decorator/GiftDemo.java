package Decorator;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHREYA
 */
interface Gift{
    int costOfGift();
}

class PhotoFrame implements Gift{
    @Override
    public int costOfGift(){
        return 20;
    }
}

class Watch implements Gift{
    @Override
    public int costOfGift(){
        return 40;
    }
}

class GiftDecoration implements Gift{
    protected Gift gift;
    public GiftDecoration(Gift gift){
        this.gift = gift;
    }
    
    @Override
    public int costOfGift(){
        return gift.costOfGift();
    }
}

class GiftCard extends GiftDecoration{
    public GiftCard(Gift gift){
        super(gift);
    }
    
        //price of gift wrap is 5 Rs
    public int costOfGift(){
        return gift.costOfGift() + 5;
    }
}

class GiftWrap extends GiftDecoration{
    public GiftWrap(Gift gift){
        super(gift);
    }
    
    //price of gift wrap is 10 Rs
    public int costOfGift(){
        return gift.costOfGift() + 10;
    }
}
public class GiftDemo 
{
    public static void main(String[] args) 
    {
        System.out.println("----Welcome to Gift Shop----");
        System.out.println("Price of Photoframe: "+new PhotoFrame().costOfGift());
        System.out.println("Price of Watch: "+new Watch().costOfGift());
        
        //Photoframe with gift wrap
        System.out.println("PhotoFrame with Gift Wrap: "+new GiftWrap(new PhotoFrame()).costOfGift());
        
        //Watch with giftwrap and giftcard
        Gift watch = new Watch();
        GiftDecoration watchWithWrap = new GiftWrap(watch);
        GiftDecoration watchWithWrapAndCard = new GiftCard(watchWithWrap);
        System.out.println("Watch with Gift wrap and Gift Card :" + watchWithWrapAndCard.costOfGift());
    }
}
