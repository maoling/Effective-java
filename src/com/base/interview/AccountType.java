package com.base.interview;
/**
 * 
 * @author maoling
 * 
��������д��override����ͬ��Сһ��ԭ��
��������ͬ������������ͬ
���෵������С�ڵ��ڸ��෽���������ͣ�
�����׳��쳣С�ڵ��ڸ��෽���׳��쳣��
�������Ȩ�޴��ڵ��ڸ��෽������Ȩ�ޡ�
 */
enum AccountType
{
    SAVING, FIXED, CURRENT;
    private AccountType()
    {
        System.out.println("It is a account type");
    }
}
