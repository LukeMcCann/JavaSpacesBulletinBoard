package com.bulletinboard;

import net.jini.space.*;
import net.jini.core.lease.*;
import java.awt.*;
import javax.swing.*;

public class TopicAdder {

    private JavaSpace space;

    public TopicAdder()
    {

    }

    /*
     * getSpace
     * checks for a JavaSpace on LAN
     */
    private void getSpace()
    {
        space = SpaceUtils.getSpace();
        if(space == null)
        {
            System.err.println("Error: Failed to find JavaSpace");
            System.exit(1);
        }
    }

    public void addTopic(java.awt.event.ActionEvent evt)
    {
        try
        {

        }
        catch(Exception e)
        {

        }
    }


}
