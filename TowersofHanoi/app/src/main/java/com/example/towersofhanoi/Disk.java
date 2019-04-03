package com.example.towersofhanoi;

public class Disk
{
    private int size;
    private Disk nextDisk;

    public Disk(int size)
    {
        this.size = size;
        this.nextDisk = null;
    }

    public Disk getNextDisk()
    {
        return this.nextDisk;
    }

    public void setNextDisk(Disk d)
    {
        this.nextDisk = d;
    }

    public int getSize()
    {
        return this.size;
    }

    public void display()
    {
        String answer = "*** ";
        for(int i = 0; i < this.size; i++)
        {
            answer += "=";
        }
        System.out.println(answer);
    }
}
