package com.design.patterns.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

/**
 * Created by SDS on 2015-10-19.
 */
@ToString
//@AllArgsConstructor()
@Getter
@Setter
public abstract class Component {
    private String name;
    private String value;
    protected ArrayList<Component> children = new ArrayList<>();

    public Component(String name, String value) {
        this.name = name;
        this.value = value;
    }

    protected void addChildren(Component component) {
        children.add(component);
    }

    public String getString(){
        return getString(0);
    }

    private String getString(int depth){
        StringBuffer sb = new StringBuffer();
        if (this instanceof CDiv) {
            for (int i = 0; i < depth; i++) {
                sb.append("  ");
            }
            sb.append("+"+getName() +"\n");
            for (Component comp: children) {
                sb.append(comp.getString(depth+1));
            }
        }else{
            for (int i = 0; i < depth; i++) {
                sb.append("  ");
            }
            sb.append("-"+getName()+"\n");
        }
        return sb.toString();
    }
}
