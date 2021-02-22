package com.tcn.romate;

/**
 * 描述：
 * 作者：Jiancheng,Song on 2016/5/28 16:28
 * 邮箱：m68013@qq.com
 */
public class VendEventInfo {
    public int  	m_iEventID;
    public int 	m_lParam1;
    public int 	m_lParam2;
    public long 	m_lParam3;
    public String m_lParam4;
    public String m_lParam5;
    public String m_lParam6;
    public String m_lParam7;
    public Object m_lParam8;

    public void SetEventID(int iEventID){m_iEventID = iEventID;};
    public void SetlParam1(int lParam1){m_lParam1 = lParam1;};
    public void SetlParam2(int lParam2){m_lParam2 = lParam2;};
    public void SetlParam3(long lParam3){m_lParam3 = lParam3;};
    public void SetlParam4(String lParam4){m_lParam4 = lParam4;};
    public void SetlParam5(String lParam5){m_lParam5 = lParam5;};
    public void SetlParam6(String lParam6){m_lParam6 = lParam6;};
    public void SetlParam7(String lParam7){m_lParam7 = lParam7;};
    public void SetlParam8(Object lParam8){m_lParam8 = lParam8;};

    public int  GetEventID(){return m_iEventID;};
    public int  GetlParam1(){return m_lParam1;};
    public int  GetlParam2(){return m_lParam2;};
    public long GetlParam3(){return m_lParam3;};
    public String GetlParam4(){return m_lParam4;};
    public String GetlParam5(){return m_lParam5;};
    public String GetlParam6(){return m_lParam6;};
    public String GetlParam7(){return m_lParam7;};
    public Object GetlParam8(){return m_lParam8;};

    @Override
    public String toString() {
        return "VendEventInfo{" +
                "m_iEventID=" + m_iEventID +
                ", m_lParam1=" + m_lParam1 +
                ", m_lParam2=" + m_lParam2 +
                ", m_lParam3=" + m_lParam3 +
                ", m_lParam4='" + m_lParam4 + '\'' +
                ", m_lParam5='" + m_lParam5 + '\'' +
                ", m_lParam6='" + m_lParam6 + '\'' +
                ", m_lParam7='" + m_lParam7 + '\'' +
                ", m_lParam8=" + m_lParam8 +
                '}';
    }
}
