/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IteratorPattern;

/**
 *
 * @author SHREYA
 */
public class NameRepository implements Container{
    public String names[] = {"Kisan", "Radha", "Ganga", "Narmada"};
    
    @Override
    public Iterator getIterator()
    {
        return new NameIterator();
    }
    private class NameIterator implements Iterator
    {
        int index;
        @Override
        public boolean hasNext()
        {
            if(index < names.length)
            {
                return true;
            }
            return false;
        }

        @Override
        public Object next()
        {
            if(this.hasNext())
            {
                return names[index++];
            }
            return null;
        }
    }
}
