package com.tcn.romate;

import java.util.List;

public interface TcnDataListener {
    void VendEvent(String s);
    void VendEventCoilInfo(List<Coil_info> data);//获取所有货道信息
}
