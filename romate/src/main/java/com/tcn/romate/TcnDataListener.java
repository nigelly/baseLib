package com.tcn.romate;

import java.util.List;

public interface TcnDataListener {
    /**
     * 暂未定义 保留
     *
     * @param s
     */
    void VendEvent(String s);

    /**
     * 所有货道信息
     *
     * @param data
     */
    void VendEventCoilInfo(List<Coil_info> data);//获取所有货道信息

    /**
     * 类似原主APP的各种
     *
     * @param vendEventInfo
     */
    void VendEventInfo(VendEventInfo vendEventInfo);

    /**
     * 返回机器号
     *
     * @param id
     */
    void VendEventMachineId(String id);//
}
