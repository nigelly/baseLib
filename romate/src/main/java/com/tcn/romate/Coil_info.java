package com.tcn.romate;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * 描述：
 * 作者：Jiancheng,Song on 2016/6/1 08:51
 * 邮箱：m68013@qq.com
 */
public class Coil_info implements Parcelable {
    private int ID;//自增长id
    private int Coil_id;//货道号
    private String Par_name = "";//商品名
    private int Capacity;//容量
    private int Extant_quantity = 0;//现存数量
    private int Work_status = -1;//工作状态 0正常   255 货道号不存在  0-255之间是故障代码
    private int ray;//电光开关
    private String Content = "";//商品说明
    private String Par_price;//商品单价
    private String Sale_price;//优惠单价
    private String Img_url = "";//商品图片
    private String m_strType = "";//商品类型
    private int iSaleNum;
    private String dSaleAmount = "";
    private String strGoodsCode = "";
    private String sGoodsSpec = "";     //商品规格
    private String sGoodsCapacity = "";    //商品容量
    private int iKeyNum = 0;    //按键号
    private int iSlot_status = 0;    //货道状态
    private int iSlotOrder = 0;   //果浆用量

    private String strOtherParam1 = "";
    private String strOtherParam2 = "";

    private String m_Goods_details_url = "";//商品详情图片地址

    private String m_QrPayUrl = "";
    private String m_AdUrl = "";

    private int m_iHeatTime = -1;   //顶料用量

    private int m_iCloseStatus = -1;  //冰淇淋用量

    private int m_iRow = -1;    //冰淇淋口味 咖啡机出货模式

    private int m_iCol = -1;   //果酱选择

    private int m_iSlt_hvgs = -1;

    private int m_iBack = 0;  // 1：取回    顶料选择

    private String strKeys = null;

    private int iExpireTimeStamp = -1;   //商品过期时间，盒饭机中存储的为时间戳，单位为秒

    private int discountRate;//折扣率(1 - 100)

    private int EnableDiscount = -1;   //1表示开启，0表示禁止
    private int EnableHot = -1;   //1表示开启，0表示禁止
    private int EnableExpire = -1;   //1表示开启，0表示禁止

    private int LockGoodsCount = -1;    //锁定货道售卖的商品个数

    private int iVerifyAge = -1;  //年龄验证

    private boolean isInventory = false; //蛇形机库存容量开关


    public boolean isInventory() {
        return isInventory;
    }

    public void setInventory(boolean inventory) {
        isInventory = inventory;
    }

    public Coil_info() {
        super();
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public int getCoil_id() {
        return Coil_id;
    }

    public void setCoil_id(int coil_id) {
        Coil_id = coil_id;
    }

    public String getPar_name() {
        if (null == Par_name) {
            Par_name = "";
        }
        return Par_name;
    }

    public void setPar_name(String par_name) {
        Par_name = par_name;
    }

    public int getExtant_quantity() {
        return Extant_quantity;
    }

    public void setExtant_quantity(int extant_quantity) {
        Extant_quantity = extant_quantity;
    }

    public int getWork_status() {
        return Work_status;
    }

    public void setWork_status(int work_status) {
        Work_status = work_status;
    }

    public int getRay() {
        return ray;
    }

    public void setRay(int ray) {
        this.ray = ray;
    }

    public String getContent() {
        if (null == Content) {
            Content = "";
        }
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getPar_price() {
        if (null == Par_price) {
            Par_price = "";
        }
        return Par_price;
    }

    public void setPar_price(String par_price) {
        Par_price = par_price;
    }

    public String getImg_url() {
        if (null == Img_url) {
            Img_url = "";
        }
        return Img_url;
    }

    public String getSalePrice() {
        return Sale_price;
    }

    public void setSalePrice(String par_price) {
        Sale_price = par_price;
    }

    public void setImg_url(String img_url) {
        Img_url = img_url;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    public void setType(String type) {
        m_strType = type;
    }

    public String getType() {
        if (null == m_strType) {
            m_strType = "";
        }
        return m_strType;
    }

    public int getSaleNum() {
        return iSaleNum;
    }

    public void setSaleNum(int saleNum) {
        iSaleNum = saleNum;
    }

    public void setSaleAmount(String amount) {
        dSaleAmount = amount;
    }

    public String getSaleAmount() {
        if (null == dSaleAmount) {
            dSaleAmount = "";
        }
        return dSaleAmount;
    }

    public String getGoodsCode() {
        if (null == strGoodsCode) {
            strGoodsCode = "";
        }
        return strGoodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        strGoodsCode = goodsCode;
    }

    public void setGoodsSpec(String spec) {
        sGoodsSpec = spec;
    }

    public String getGoodsSpec() {
        if (null == sGoodsSpec) {
            sGoodsSpec = "";
        }
        return sGoodsSpec;
    }

    public void setGoodsCapacity(String capacity) {
        sGoodsCapacity = capacity;
    }

    public String getGoodsCapacity() {
        if (null == sGoodsCapacity) {
            sGoodsCapacity = "";
        }
        return sGoodsCapacity;
    }

    public void setKeyNum(int num) {
        iKeyNum = num;
    }

    public int getKeyNum() {
        return iKeyNum;
    }

    public void setSlotStatus(int status) {
        iSlot_status = status;
    }

    public int getSlotStatus() {
        return iSlot_status;
    }

    public String getGoods_details_url() {
        if (null == m_Goods_details_url) {
            m_Goods_details_url = "";
        }
        return m_Goods_details_url;
    }

    public void setGoods_details_url(String Goods_details_url) {
        m_Goods_details_url = Goods_details_url;
    }

    public void setSlotOrder(int order) {
        iSlotOrder = order;
    }

    public int getSlotOrder() {
        return iSlotOrder;
    }

    public void setOtherParam1(String param) {
        strOtherParam1 = param;
    }

    public String getOtherParam1() {
        if (null == strOtherParam1) {
            strOtherParam1 = "";
        }
        return strOtherParam1;
    }

    public void setOtherParam2(String param) {
        strOtherParam2 = param;
    }

    public String getOtherParam2() {
        if (null == strOtherParam2) {
            strOtherParam2 = "";
        }
        return strOtherParam2;
    }

    public String getQrPayUrl() {
        return m_QrPayUrl;
    }

    public void setQrPayUrl(String url) {
        m_QrPayUrl = url;
    }

    public String getAdUrl() {
        return m_AdUrl;
    }

    public void setAdUrl(String url) {
        m_AdUrl = url;
    }

    public void setHeatTime(int heatTime) {
        m_iHeatTime = heatTime;
    }

    public int getHeatTime() {
        return m_iHeatTime;
    }


    public void setCloseStatus(int status) {
        m_iCloseStatus = status;
    }

    public int getCloseStatus() {
        return m_iCloseStatus;
    }

    public void setRow(int row) {
        m_iRow = row;
    }

    public int getRow() {
        return m_iRow;
    }

    public void setColumn(int col) {
        m_iCol = col;
    }

    public int getColumn() {
        return m_iCol;
    }

    public int getSlt_hvgs() {
        return m_iSlt_hvgs;
    }

    public void setSlt_hvgs(int hvgs) {
        m_iSlt_hvgs = hvgs;
    }

    public int getBack() {
        return m_iBack;
    }

    public void setBack(int back) {
        this.m_iBack = back;
    }

    public String getKeys() {
        return strKeys;
    }

    public void setKeys(String keys) {
        strKeys = keys;
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

    public int getEnableExpire() {
        return EnableExpire;
    }

    public void setEnableExpire(int enableExpire) {
        EnableExpire = enableExpire;
    }

    public int getLockGoodsCount() {
        return LockGoodsCount;
    }

    public void setLockGoodsCount(int lockCount) {
        LockGoodsCount = lockCount;
    }

    public int getVerifyAge() {
        return iVerifyAge;
    }

    public void setVerifyAge(int verifyAge) {
        iVerifyAge = verifyAge;
    }

//    @Override
//    public String toString() {
//        return "Coil_info [ID=" + ID + ", Coil_id=" + Coil_id + ", Par_name="
//                + Par_name + ", Capacity=" + Capacity + ", Extant_quantity="
//                + Extant_quantity + ", Work_status=" + Work_status + ", ray="
//                + ray + ", Content=" + Content + ", Par_price=" + Par_price
//                + ", Img_url=" + Img_url + "]";
//    }


    @Override
    public String toString() {
        return "Coil_info{" +
                "ID=" + ID +
                ", Coil_id=" + Coil_id +
                ", Par_name='" + Par_name + '\'' +
                ", Capacity=" + Capacity +
                ", Extant_quantity=" + Extant_quantity +
                ", Work_status=" + Work_status +
                ", ray=" + ray +
                ", Content='" + Content + '\'' +
                ", Par_price='" + Par_price + '\'' +
                ", Sale_price='" + Sale_price + '\'' +
                ", Img_url='" + Img_url + '\'' +
                ", m_strType='" + m_strType + '\'' +
                ", iSaleNum=" + iSaleNum +
                ", dSaleAmount='" + dSaleAmount + '\'' +
                ", strGoodsCode='" + strGoodsCode + '\'' +
                ", sGoodsSpec='" + sGoodsSpec + '\'' +
                ", sGoodsCapacity='" + sGoodsCapacity + '\'' +
                ", iKeyNum=" + iKeyNum +
                ", iSlot_status=" + iSlot_status +
                ", iSlotOrder=" + iSlotOrder +
                ", strOtherParam1='" + strOtherParam1 + '\'' +
                ", strOtherParam2='" + strOtherParam2 + '\'' +
                ", m_Goods_details_url='" + m_Goods_details_url + '\'' +
                ", m_QrPayUrl='" + m_QrPayUrl + '\'' +
                ", m_AdUrl='" + m_AdUrl + '\'' +
                ", m_iHeatTime=" + m_iHeatTime +
                ", m_iCloseStatus=" + m_iCloseStatus +
                ", m_iRow=" + m_iRow +
                ", m_iCol=" + m_iCol +
                ", m_iSlt_hvgs=" + m_iSlt_hvgs +
                ", m_iBack=" + m_iBack +
                ", strKeys='" + strKeys + '\'' +
                ", discountRate='" + discountRate + '\'' +
                ", EnableDiscount='" + EnableDiscount + '\'' +
                ", EnableHot='" + EnableHot + '\'' +
                ", EnableExpire='" + EnableExpire + '\'' +
                ", LockGoodsCount='" + LockGoodsCount + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ID);
        parcel.writeInt(Coil_id);
        parcel.writeString(Par_name);
        parcel.writeInt(Capacity);
        parcel.writeInt(Extant_quantity);
        parcel.writeInt(Work_status);
        parcel.writeInt(ray);
        parcel.writeString(Content);
        parcel.writeString(Par_price);
        parcel.writeString(Sale_price);
        parcel.writeString(Img_url);
        parcel.writeString(m_strType);
        parcel.writeInt(iSaleNum);
        parcel.writeString(dSaleAmount);
        parcel.writeString(strGoodsCode);
        parcel.writeString(sGoodsSpec);
        parcel.writeString(sGoodsCapacity);
        parcel.writeInt(iKeyNum);
        parcel.writeInt(iSlot_status);
        parcel.writeInt(iSlotOrder);
        parcel.writeString(strOtherParam1);
        parcel.writeString(strOtherParam2);
        parcel.writeString(m_Goods_details_url);
        parcel.writeString(m_QrPayUrl);
        parcel.writeString(m_AdUrl);
        parcel.writeInt(m_iHeatTime);
        parcel.writeInt(m_iCloseStatus);
        parcel.writeInt(m_iRow);
        parcel.writeInt(m_iCol);
        parcel.writeInt(m_iSlt_hvgs);
        parcel.writeInt(m_iBack);
        parcel.writeString(strKeys);
        parcel.writeInt(iExpireTimeStamp);
        parcel.writeInt(discountRate);
        parcel.writeInt(EnableDiscount);
        parcel.writeInt(EnableHot);
        parcel.writeInt(EnableExpire);
        parcel.writeInt(LockGoodsCount);
        parcel.writeInt(iVerifyAge);
    }

    public static final Creator<Coil_info> CREATOR = new Creator<Coil_info>() {
        @Override
        public Coil_info[] newArray(int size) {
            return new Coil_info[size];
        }

        @Override
        public Coil_info createFromParcel(Parcel in) {
            return new Coil_info(in);
        }
    };

    public Coil_info(Parcel in) {
        ID = in.readInt();
        Coil_id = in.readInt();
        Par_name = in.readString();
        Capacity = in.readInt();
        Extant_quantity = in.readInt();
        Work_status = in.readInt();
        ray = in.readInt();
        Content = in.readString();
        Par_price = in.readString();
        Sale_price = in.readString();
        Img_url = in.readString();
        m_strType = in.readString();
        iSaleNum = in.readInt();
        dSaleAmount = in.readString();
        strGoodsCode = in.readString();
        sGoodsSpec = in.readString();
        sGoodsCapacity = in.readString();
        iKeyNum = in.readInt();
        iSlot_status = in.readInt();
        iSlotOrder = in.readInt();
        strOtherParam1 = in.readString();
        strOtherParam2 = in.readString();
        m_Goods_details_url = in.readString();
        m_QrPayUrl = in.readString();
        m_AdUrl = in.readString();
        m_iHeatTime = in.readInt();
        m_iCloseStatus = in.readInt();
        m_iRow = in.readInt();
        m_iCol = in.readInt();
        m_iSlt_hvgs = in.readInt();
        m_iBack = in.readInt();
        strKeys = in.readString();
        iExpireTimeStamp = in.readInt();
        discountRate = in.readInt();
        EnableDiscount = in.readInt();
        EnableHot = in.readInt();
        EnableExpire = in.readInt();
        LockGoodsCount = in.readInt();
        iVerifyAge = in.readInt();
    }


}
