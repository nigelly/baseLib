package com.tcn.romate;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TcnVendIF {
    private static TcnVendIF m_Instance = null;


    public static synchronized TcnVendIF getInstance() {
        if (null == m_Instance) {
            m_Instance = new TcnVendIF();
        }
        return m_Instance;
    }

    private final CopyOnWriteArrayList<TcnDataListener> m_Callbacks = new CopyOnWriteArrayList<TcnDataListener>();

    public void registerListener(TcnDataListener callback) {
        synchronized (m_Callbacks) {
            if (null == callback) {
                return;
            }

            if (!(m_Callbacks.contains(callback))) {
                m_Callbacks.add(callback);
            }
        }
    }

    public void unregisterListener(TcnDataListener callback) {
        synchronized (m_Callbacks) {
            if (null == callback) {
                return;
            }
            if (m_Callbacks.contains(callback)) {
                m_Callbacks.remove(callback);
            }

        }
    }

    public void sendVendEventInfo(VendEventInfo cEventInfo) {
        synchronized (m_Callbacks) {
            for (TcnDataListener c : m_Callbacks) {
                c.VendEventInfo(cEventInfo);
            }
        }
    }

    public void sendVendCoilInfo(List<Coil_info> cEventInfo) {
        synchronized (m_Callbacks) {
            for (TcnDataListener c : m_Callbacks) {
                c.VendEventCoilInfo(cEventInfo);
            }
        }
    }

    public void sendVendGoodsInfo(List<UIGoodsInfo> cEventInfo) {
        synchronized (m_Callbacks) {
            for (TcnDataListener c : m_Callbacks) {
                c.VendEventGoodsInfo(cEventInfo);
            }
        }
    }

    public void sendVendDataID(String cEventInfo) {
        synchronized (m_Callbacks) {
            for (TcnDataListener c : m_Callbacks) {
                c.VendEventMachineId(cEventInfo);
            }
        }
    }


}
