package com.bulletinboard;

import net.jini.core.entry.*;

public class Topic implements Entry
{
    public String title;
    public String contents;

    public String owner;


    /*
     * Topic - no arg constructor
     * required for functionality
     */
    public Topic() {}

    public Topic(String title, String content, String owner)
    {
        this.title = title;
        this.contents = content;
        this.owner = owner;
    }

}
