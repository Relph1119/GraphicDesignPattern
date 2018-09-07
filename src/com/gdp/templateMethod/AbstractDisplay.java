package com.gdp.templateMethod;

public abstract class AbstractDisplay { // ������AbstractDisplay
    public abstract void open();        // ��������ȥʵ�ֵĳ��󷽷�(1) open
    public abstract void print();       // ��������ȥʵ�ֵĳ��󷽷�(2) print
    public abstract void close();       // ��������ȥʵ�ֵĳ��󷽷�(3) close
    public final void display() {       // ����������ʵ�ֵ�display����
        open();                         // ���ȴ򿪡�
        for (int i = 0; i < 5; i++) {   // ѭ������5��print
            print();                    
        }
        close();                        // �����رա������display������ʵ�ֵĹ���
    }
}
