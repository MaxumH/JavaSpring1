package org.springframework;

public class ClasicMusic implements Music{
    public void MyInit()
    {
        System.out.println("Doing initalization");
    }
    public void MyDestroy()
    {
        System.out.println("Destroying metod");
    }
    @Override
    public String getSong() {
        return "Hungarian Rapsody";
    }
}
