package com.base.interview;

import com.base.interview.Enclosingone.InsideOne;

//import EnclosingOne.InsideOne 
public class InnerClassTest
{
    public static void main(String[]args)
    {
        Enclosingone eo = new Enclosingone();
        //insert code here
        InsideOne ei = eo.new InsideOne();
        //eo.InsideOne ei = eo.new InsideOne();
        //InsideOne ei = EnclosingOne.new InsideOne();
        Enclosingone.InsideOne ei2 = eo.new InsideOne();
     
    }
}