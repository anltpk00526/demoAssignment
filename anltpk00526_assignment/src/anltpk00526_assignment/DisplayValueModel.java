/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anltpk00526_assignment;

/**
 *
 * @author AnLT
 */
public class DisplayValueModel {
    Object DisplayMember;
    Object DisplayValue;
    
    public DisplayValueModel(Object displayMember, Object displayValue){
        DisplayMember = displayMember;
        DisplayValue = displayValue;
    }
    
    @Override
    public String toString(){
        return DisplayMember.toString();
    }
    
}
