package com.base.designpattern;
public class StateClient
{
    public static void main(final String[] args)
    {
        // YTODO Auto-generated method stub
        final Context context = new Context();
        context.setState(new ConcreteStateA());
        System.out.println("PUSH:");
        context.push();
        System.out.println("\nPULL:");
        context.pull();
    }
}