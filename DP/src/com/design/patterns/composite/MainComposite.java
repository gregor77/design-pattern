package com.design.patterns.composite;

/**
 * Created by SDS on 2015-10-19.
 */
public class MainComposite {

    public static void main(String[] args) {
        CDiv container = new CDiv("container", "cotainer");
        CDiv div1 = new CDiv("div1", "titleDiv");
        LLabel label = new LLabel("label1", "Á¦¸ñ");
        LButton button1 = new LButton("button1", "OK");

        container.addChildren(div1);
        container.addChildren(button1);
        div1.addChildren(label);

        System.out.println(container.getString());
    }
}
x