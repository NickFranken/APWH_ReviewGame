/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicholas
 */
public class Data 
{
    private int nc;
       
    public void setData(int n)
    {
        this.nc = n;
    }
    
    public Data(int n)
    {
        this.nc = n;
    }
    
    public String getData()
    {
        String s = String.valueOf(nc);
        return s;
    }
}
