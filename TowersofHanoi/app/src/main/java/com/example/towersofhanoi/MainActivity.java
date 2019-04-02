package com.example.towersofhanoi;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    private TextView disk0TV, disk1TV, disk2TV;
    private ViewGroup tower0VG, tower1VG, tower2VG, placeholderVG;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.disk0TV = this.findViewById(R.id.disk0);
        this.disk1TV = this.findViewById(R.id.disk1);
        this.disk2TV = this.findViewById(R.id.disk2);

        this.placeholderVG = this.findViewById(R.id.placeHolderVG);
        this.tower0VG = this.findViewById(R.id.tower0VG);
        this.tower1VG = this.findViewById(R.id.tower1VG);
        this.tower2VG = this.findViewById(R.id.tower2VG);

        Stack s = new Stack();
        s.push(8);
        s.push(4);
        s.push(2);
        s.display();
        System.out.println("*** " + s.peek());
    }

    public void tower0ButtonPressed(View v)
    {
        View temp = this.tower0VG.getChildAt(0);
        View temp2 = this.placeholderVG.getChildAt(0);
        if(temp2 == null)
        {
            if(temp != null)
            {
                this.tower0VG.removeViewAt(0);
                this.placeholderVG.addView(temp);
            }
        }
        else
        {
            this.placeholderVG.removeViewAt(0);
            this.tower0VG.addView(temp2, 0);
        }
    }

    public void tower1ButtonPressed(View v)
    {
        View temp = this.tower1VG.getChildAt(0);
        View temp2 = this.placeholderVG.getChildAt(0);
        if(temp2 == null)
        {
            if(temp != null)
            {
                this.tower1VG.removeViewAt(0);
                this.placeholderVG.addView(temp);
            }
        }
        else
        {
            this.placeholderVG.removeViewAt(0);
            this.tower1VG.addView(temp2, 0);
        }
    }

    public void tower2ButtonPressed(View v)
    {
        View temp = this.tower2VG.getChildAt(0);
        View temp2 = this.placeholderVG.getChildAt(0);
        if(temp2 == null)
        {
            if(temp != null)
            {
                this.tower2VG.removeViewAt(0);
                this.placeholderVG.addView(temp);
            }
        }
        else
        {
            this.placeholderVG.removeViewAt(0);
            this.tower2VG.addView(temp2, 0);
        }
    }
}//class