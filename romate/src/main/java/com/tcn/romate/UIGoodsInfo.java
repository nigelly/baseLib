package com.tcn.romate;

/**
 * Created by Administrator on 2016/12/21.
 */
public class UIGoodsInfo {
    private int m_ID = 0;//自增长id
    private int Coil_id = 0;//货道号
    private String m_Goods_id = "0";//商品编码
    private String m_Goods_name = "";//商品名
    private String m_Goods_price = "";//商品单价
    private String m_Goods_type = "";//商品类型
    private int m_Goods_stock = 0;//商品库存
    private String m_Goods_spec = "";     //商品规格
    private String m_Goods_capacity = "";//商品容量
    private String m_Goods_introduce = "";//商品说明
    private String m_Goods_details_url = "";//商品详情图片地址
    private int m_Goods_status = 0;//工作状态
    private int iKeyNum = 0;    //按键号
    private String m_Goods_url = "";//商品图片地址
    private String Goods_Slot_Map = "";

    private int discountRate = 0;//折扣率(1 - 100)

    private String Sale_price = "";//优惠单价

    private int iExpireTimeStamp = -1;   //商品过期时间，盒饭机中存储的为时间戳，单位为秒

    private int iEnableQualityPeriod = -1;    //1:允许使用保质期（开启），其他：关闭
    private int EnableDiscount = -1;   //1表示开启，0表示禁止
    private int EnableHot = -1;   //1表示开启，0表示禁止

    private String m_QrPayUrl = "";

    public int getID() {
        return m_ID;
    }

    public void setID(int iD) {
        m_ID = iD;
    }

    public int getCoil_id() {
        return Coil_id;
    }

    public void setCoil_id(int coil_id) {
        Coil_id = coil_id;
    }

    public String getGoods_id() {
        return m_Goods_id;
    }

    public void setGoods_id(String Goods_id) {
        m_Goods_id = Goods_id;
    }

    public void setKeyNum(int num) {
        iKeyNum = num;
    }

    public int getKeyNum() {
        return iKeyNum;
    }

    public void setGoodsSlotMap(String map) {
        Goods_Slot_Map = map;
    }

    public String getGoodsSlotMap() {
        return Goods_Slot_Map;
    }

    public String getGoods_name() {
        return m_Goods_name;
    }

    public void setGoods_name(String Goods_name) {
        m_Goods_name = Goods_name;
    }

    public String getGoods_price() {
        return m_Goods_price;
    }

    public void setGoods_price(String Goods_price) {
        m_Goods_price = Goods_price;
    }

    public String getGoods_type() {
        return m_Goods_type;
    }

    public void setGoods_type(String Goods_type) {
        m_Goods_type = Goods_type;
    }

    public int getGoods_stock() {
        return m_Goods_stock;
    }

    public void setGoods_stock(int Goods_stock) {
        m_Goods_stock = Goods_stock;
    }

    public String getGoods_spec() {
        return m_Goods_spec;
    }

    public void setGoods_spec(String Goods_spec) {
        m_Goods_spec = Goods_spec;
    }

    public String getGoods_capacity() {
        return m_Goods_capacity;
    }

    public void setGoods_capacity(String Goods_capacity) {
        m_Goods_capacity = Goods_capacity;
    }

    public String getGoods_introduce() {
        return m_Goods_introduce;
    }

    public void setGoods_introduce(String Goods_introduce) {
        m_Goods_introduce = Goods_introduce;
    }

    public String getGoods_details_url() {
        return m_Goods_details_url;
    }

    public void setGoods_details_url(String Goods_details_url) {
        m_Goods_details_url = Goods_details_url;
    }

    public int getGoods_status() {
        return m_Goods_status;
    }

    public void setGoods_status(int Goods_status) {
        m_Goods_status = Goods_status;
    }

    public String getGoods_url() {
        return m_Goods_url;
    }

    public void setGoods_url(String url) {
        m_Goods_url = url;
    }

    public String getSalePrice() {
        return Sale_price;
    }

    public void setSalePrice(String par_price) {
        Sale_price = par_price;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int rate) {
        discountRate = rate;
    }

    //单位小时
    public void setExpireTimeStamp(int expireTimeStamp) {
        iExpireTimeStamp = expireTimeStamp;
    }

    public int getExpireTimeStamp() {
        return iExpireTimeStamp;
    }

    public String getM_QrPayUrl() {
        return m_QrPayUrl;
    }

    public void setM_QrPayUrl(String m_QrPayUrl) {
        this.m_QrPayUrl = m_QrPayUrl;
    }

    public int getiEnableQualityPeriod() {
        return iEnableQualityPeriod;
    }

    public void setiEnableQualityPeriod(int iEnableQualityPeriod) {
        this.iEnableQualityPeriod = iEnableQualityPeriod;
    }

    public int getEnableDiscount() {
        return EnableDiscount;
    }

    public void setEnableDiscount(int enableDiscount) {
        EnableDiscount = enableDiscount;
    }

    public int getEnableHot() {
        return EnableHot;
    }

    public void setEnableHot(int enableHot) {
        EnableHot = enableHot;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof UIGoodsInfo) {
            UIGoodsInfo uiGoodsInfo = (UIGoodsInfo) obj;
            return   m_Goods_id.equals(uiGoodsInfo.getGoods_id())

                    && m_Goods_name.equals(uiGoodsInfo.getGoods_name())
                    && m_Goods_price.equals(uiGoodsInfo.getGoods_price())
                    && m_Goods_url.equals(uiGoodsInfo.getGoods_url())
                    && m_Goods_stock == uiGoodsInfo.getGoods_stock();
        }
        return false;
    }

    @Override
    public String toString() {
        return "UIGoodsInfo{" +
                "m_ID=" + m_ID +
                ", Coil_id=" + Coil_id +
                ", m_Goods_id='" + m_Goods_id + '\'' +
                ", m_Goods_name='" + m_Goods_name + '\'' +
                ", m_Goods_price='" + m_Goods_price + '\'' +
                ", m_Goods_type='" + m_Goods_type + '\'' +
                ", m_Goods_stock=" + m_Goods_stock +
                ", m_Goods_spec='" + m_Goods_spec + '\'' +
                ", m_Goods_capacity='" + m_Goods_capacity + '\'' +
                ", m_Goods_introduce='" + m_Goods_introduce + '\'' +
                ", m_Goods_details_url='" + m_Goods_details_url + '\'' +
                ", m_Goods_status=" + m_Goods_status +
                ", iKeyNum=" + iKeyNum +
                ", m_Goods_url='" + m_Goods_url + '\'' +
                ", Goods_Slot_Map='" + Goods_Slot_Map + '\'' +
                ", discountRate=" + discountRate +
                ", Sale_price='" + Sale_price + '\'' +
                ", iExpireTimeStamp=" + iExpireTimeStamp +
                ", iEnableQualityPeriod=" + iEnableQualityPeriod +
                ", EnableDiscount=" + EnableDiscount +
                ", EnableHot=" + EnableHot +
                ", m_QrPayUrl='" + m_QrPayUrl + '\'' +
                '}';
    }
}
