package com.design.patterns.composite;

/**
 * Created by SDS on 2015-10-19.
 */
public class LLabel extends Component {
    public LLabel(String name, String value) {
        super(name, value);
    }

    public void addChildren(Component component) {
        throw new IllegalStateException("Leaf�� �ڽİ�ü�� ������ ����.");
    }

}
