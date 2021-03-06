package com.practice.interfaceexample.composite;

import java.util.List;

/**
 * Created by dell on 2/19/2018.
 */

public class Project implements TodoList {
    String title;
    List<TodoList> todoLists;

    public Project(String title, List<TodoList> todoLists) {
        this.title = title;
        this.todoLists = todoLists;
    }

    public void add(Project p) {
        this.todoLists.add(p);
    }

    public void remove(Project p)
    {
        this.todoLists.remove(p);
    }

    @Override
    public String getHtml() {
        String html = "\n<h>";
        html += this.title +"</h>";
        html += "\n<ul>";
        for (TodoList tl : this.todoLists ) {
            html += "\n<li>";
            html += tl.getHtml();
            html += "</li>";
        }
        html += "\n</ul>";
        return html;
    }
}
