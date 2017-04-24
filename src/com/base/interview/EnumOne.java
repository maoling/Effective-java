package com.base.interview;
//https://www.nowcoder.com/questionTerminal/1aac0e529bdf442c9034ee00f9aa0689
public class EnumOne
{
    public static void main(String[]args)
    {
        System.out.println(AccountType.FIXED);
        //https://www.nowcoder.com/questionTerminal/e35f449be29548c68352ef302965a44e
        Integer i01=59;
        int i02=59;
        Integer i03=Integer.valueOf(59);
        Integer i04=new Integer(59);
        Integer i05=new Integer(59);
        
        System.out.println(i01==i02);//正确
        System.out.println(i01==i03);//正确，都指向IntegerCache[59-(-128)]对象
        System.out.println(i03==i04);//错误，引用指向的对象地址不同
        System.out.println(i02==i04);//正确
        System.out.println(i04 == i05);
    }
}