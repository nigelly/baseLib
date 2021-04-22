package com.tcn.romate;

/**
 * 作者：Jiancheng,Song on 2016/5/28 16:19
 * 邮箱：m68013@qq.com
 */
public class TcnVendEventID {
    public static final int QUERY_ALIVE_COIL = 1;//刷新数据 对应的方法  TcnVendIF.getInstance().getAliveCoil()
    public static final int QUERY_IMAGE_PATHLIST = 2;
    public static final int QUERY_VIDEO_PATHLIST = 3;
    public static final int DELETE_TYPE = 4;
    public static final int MODIFY_TYPE = 6;
    public static final int IMAGE_AD = 7;
    public static final int ACTION_RECEIVE_DATA = 8;
    public static final int SHOW_TOAST = 9;
    public static final int QR_CODE_GENERATED_DANAPAY = 10000;
    public static final int ALL_FILES_PLAY_FAILED = 10;
    public static final int WX_QR_CODE_GENERATED = 11; //只打开了微信
    public static final int ALI_QR_CODE_GENERATED = 12;//只打开了支付宝
    public static final int COMMAND_MCU_RECEIVED = 13;
    public static final int COMMAND_INPUT_MONEY = 14;
    public static final int COMMAND_SHIPPING = 15;//出货中
    public static final int COMMAND_SHIPMENT_SUCCESS = 16;//出货成功
    public static final int COMMAND_SHIPMENT_FAILURE = 17;//出货失败
    public static final int COMMAND_SHIPMENT_FAULT = 18;//出货故障
    public static final int COMMAND_SELECT_GOODS = 19; //选择完商品
    public static final int COMMAND_INVALID_SLOTNO = 20;
    public static final int COMMAND_SOLD_OUT = 21;
    public static final int COMMAND_COIN_REFUND_START = 22;
    public static final int COMMAND_COIN_REFUND_END = 23;
    public static final int COMMAND_CONNECT_SERVER_SUCCESS = 24;
    public static final int COMMAND_CONNECT_SERVER_FAILED = 25;
    public static final int COMMAND_NOTSET_CIPMODE = 26;

    public static final int WX_TRADE_REFUND = 27;
    public static final int WX_TRADE_CLOSE = 28;
    public static final int ALIPAY_SCAN_COLSE = 29;
    public static final int ALIPAY_WAVE_COLSE = 30;
    public static final int PAY_POS_FAILED = 31;
    public static final int NETWORK_NOT_GOOOD = 32;

    public static final int ADJUST_TIME_REQ = 33;

    public static final int UPDATE_PAY_TIME = 34; //更新时间
    public static final int IMAGE_SCREEN = 35;
    public static final int TEXT_AD = 36;
    public static final int SHOW_OR_HIDE_AD_MEDIA = 37;

    public static final int COMMAND_DOOR_SWITCH = 38;

    public static final int COMMAND_TEST = 39;
    public static final int SERIAL_PORT_CONFIG_ERROR = 40;
    public static final int SERIAL_PORT_SECURITY_ERROR = 41;
    public static final int SERIAL_PORT_UNKNOWN_ERROR = 42;

    public static final int CMD_QUERY_USEFUL_SLOTNO = 44;

    public static final int TRK_VIDEO_SIZE_CHANGED = 45;
    public static final int TRK_VIDEO_SIZE_CHANGED_STANDBY = 46;

    public static final int BACK_TO_SHOPPING = 47;

    public static final int COMMAND_CANCEL_PAY = 48;
    public static final int COMMAND_TOSS_PAPER_MONEY = 49;
    public static final int QUERY_IMAGE_SHOW_PATH = 50;

    public static final int COMMAND_FAULT_SLOTNO = 51;

    public static final int COMMAND_CONFIG_OK = 52;

    public static final int TRK_PLAY = 53;
    public static final int TRK_PAUSE = 54;
    public static final int TRK_STOP = 55;
    public static final int PLAY_GIVEN_FOLDER_COMPLETION = 56;
    public static final int TRK_PLAY_COMPLETION = 57;

    public static final int TRK_NEXT_STANDBY = 58;
    public static final int TRK_PLAY_STANDBY = 59;
    public static final int TRK_PAUSE_STANDBY = 60;
    public static final int TRK_STOP_STANDBY = 61;

    public static final int QUERY_ADVERT_PATHLIST = 65;
    public static final int AD_THREAD_STARTED = 66;

    public static final int APP_QR_CODE_GENERATED = 70;
    public static final int CMD_PLAY_IMAGE = 71;//视频封面
    public static final int CMD_PLAY_VIDEO = 72;//播放视频
    public static final int IMAGE_BACKGROUND = 73;
    public static final int NETWORK_CHANGE = 74;//网络状态
    public static final int IMAGE_HELP = 75;
    public static final int BACK_DESKTOP = 76;


    public static final int UPDATE_TIME = 77; //更新时间

    public static final int COMMAND_CHANGEIN_COINS = 78;
    public static final int COMMAND_CHANGEIN_PAPER_MONEY = 79;
    public static final int COMMAND_BALANCE = 80;
    public static final int COMMAND_MACHINE_ID = 81;

    public static final int CMD_SOCKET_HEART_RECONNECTED = 83;

    public static final int COMMAND_FRAME_NUMBER_1 = 90;
    public static final int COMMAND_FRAME_NUMBER_3 = 93;
    public static final int COMMAND_FRAME_NUMBER_4 = 94;
    public static final int COMMAND_GIVE_CHANGE = 95;
    public static final int COMMAND_FRAME_NUMBER_9 = 98;
    public static final int COMMAND_FRAME_NUMBER_10 = 99;
    public static final int COMMAND_FRAME_NUMBER_13 = 100;

    public static final int COMMAND_RESTOCK_WITH_ONE_KEY = 107;
    public static final int COMMAND_TWO_CODE_IN_ONE = 108;//二码合一
    public static final int COMMAND_FRAME_NUMBER_19 = 109;  //App（提货码）取货未启用
    public static final int COMMAND_FRAME_NUMBER_20 = 110;

    public static final int COMMAND_GOTO_REPLENISH = 111;

    public static final int COMMAND_NO_MAPED_SLOTNO = 120;
    public static final int COMMAND_KEY = 121;

    public static final int COMMAND_SHIP_COUNT_INFO = 130;

    public static final int COMMAND_GAME_START = 135;

    public static final int CMD_PLAY_SCREEN_IMAGE = 150;
    public static final int CMD_PLAY_SCREEN_VIDEO = 151;

    public static final int COMMAND_TOTAL_SALES_INFO = 152;

    public static final int COMMAND_CONFIG_INFO = 153;

    public static final int QUERY_ALIVE_GOODS = 154;

    public static final int INSERT_DATA = 155;
    public static final int UPTE_DATA = 156;
    public static final int DELETE_DATA = 157;


    public static final int COMMAND_FAULT_INFORMATION = 158;

    public static final int COMMAND_DOOR_IS_OPEND = 159;

    public static final int QUERY_ALIVE_COIL_EXCEPTIONE = 160;

    public static final int USB_CONFIG_COPY_IMAGEGOODS_START = 170;
    public static final int USB_CONFIG_COPY_IMAGEGOODS_END = 171;
    public static final int USB_CONFIG_COPY_LOG_START = 172;
    public static final int USB_CONFIG_COPY_LOG_END = 173;
    public static final int USB_CONFIG_READINFO_START = 174;
    public static final int USB_CONFIG_READINFO_END = 175;
    public static final int USB_CONFIG_CONFIG_INFO = 176;
    public static final int USB_CONFIG_SYN_DATA_START = 177;
    public static final int USB_CONFIG_SYN_DATA_END = 178;

    public static final int PROMPT_INFO = 190;
    public static final int TEMPERATURE_INFO = 191;
    public static final int REQ_CMD_READ_USB_READ = 192;  //BOARD 模块发送read的usb反扫一数据

    public static final int CMD_SHIP_CMD_COUNT = 194;
    public static final int CMD_SOCKET_DISCONNECTED = 195;
    public static final int CMD_PAY_ONOFF_WXPAY = 198;


    public static final int BACKGROUND_AISLE_MANAGE = 200;
    public static final int BACKGROUND_GOODS_MANAGE = 201;
    public static final int BACKGROUND_INFORMATION_CONFIG = 202;
    public static final int BACKGROUND_PAY_SYSTEM_SETTING = 203;
    public static final int BACKGROUND_MENU_SETTING = 204;

    public static final int BACKGROUND_TO_LOGIN = 205;

    public static final int BACKGROUND_TO_SERIALPORTSSTT = 206;

    public static final int APP_IN = 207;

    public static final int DELETE_ALL_KEY_MAP = 208;
    public static final int DELETE_KEY_MAP = 209;
    public static final int ADD_SHOW_COIL_ID = 210;
    public static final int DELETE_COIL_ID = 211;
    public static final int DELETE_GOODS_ID = 212;

    public static final int ADD_STOCK = 213;
    public static final int SUB_STOCK = 214;

    public static final int CMD_COUNT_TIME = 215;

    public static final int QRCODE_UNION = 220;
    public static final int QRCODE_UNION_APP = 221;

    public static final int ECOMMERCE_QRCODE_GENERATE = 230;

    public static final int RESTART_MAIN_ACTIVITY = 250;
    public static final int FINISH_MAIN_ACTIVITY = 251;

    public static final int SERVER_HEART_CONNECTED = 255;
    public static final int SERVER_HEART_RECONNECTED = 256;

    public static final int THMQH_REQ = 257;
    public static final int THMQH_REQ_CANCEL = 258;

    public static final int REMOUT_ADVERT_TEXT = 260;

    public static final int README_TEXT = 265;

    public static final int PLESE_CLOSE_FOOR = 270;

    public static final int COMMAND_SYSTEM_BUSY = 280;

    public static final int ADD_SLOT_GOODS = 281;
    public static final int UPDATE_SLOTNO_EXTQUANTITY = 282;
    public static final int UPDATE_SLOTNO_CAPACITY = 283;
    public static final int FILL_STOCK_TO_CAPACITY_ALL = 284;
    public static final int FILL_STOCK_TO_CAPACITY = 285;

    public static final int ENABLE_DISCOUNT = 290;
    public static final int ENABLE_HOT = 291;
    public static final int ENABLE_EXPIRE = 292;

    public static final int MDB_BALANCE_EXCEED_MAX = 309; //投币金额大于累计投币最大金额
    public static final int MDB_RECIVE_PAPER_MONEY = 310;
    public static final int MDB_RECIVE_COIN_MONEY = 311;
    public static final int MDB_BALANCE_CHANGE = 312;
    public static final int MDB_BALANCE_TOTAL = 324; //纸硬币器可找零余额总数

    public static final int MDB_PAYOUT_PAPERMONEY = 313;
    public static final int MDB_PAYOUT_COINMONEY = 314;
    public static final int CMD_CASH_PAYOUT_NORSP_CONTIN = 315;
    public static final int CMD_CASH_TO_BUY = 316;
    public static final int CMD_MDB_CARD_PAY_REQ = 317;

    public static final int MDB_SHORT_CHANGE_PAPER = 318;
    public static final int MDB_SHORT_CHANGE_COIN = 319;
    public static final int MDB_SHORT_CHANGE = 320;
    public static final int CMD_COIN_NO_CHANGE = 321;
    public static final int CMD_PAYOUT_AMOUNT = 323;

    public static final int COMMAND_SELECT_FAIL = 337;
    public static final int CMD_TEST_SLOT = 338;

    public static final int CMD_QUERY_SLOT_FAULTS = 340;
    public static final int CMD_CLEAR_SLOT_FAULTS = 341;
    public static final int CMD_QUERY_SLOT_STATUS = 342;
    public static final int CMD_QUERY_ADDRESS = 343;
    public static final int CMD_SELF_CHECK = 344;
    public static final int CMD_RESET = 345;
    public static final int CMD_QUERY_CABINET_STATUS = 346;
    public static final int COMMAND_SHOWKEYBOARD = 347;


    public static final int SET_SLOTNO_SPRING = 350;
    public static final int SET_SLOTNO_BELTS = 351;
    public static final int SET_SLOTNO_ALL_SPRING = 352;
    public static final int SET_SLOTNO_ALL_BELT = 353;
    public static final int SET_SLOTNO_SINGLE = 354;
    public static final int SET_SLOTNO_DOUBLE = 355;
    public static final int SET_SLOTNO_ALL_SINGLE = 356;

    public static final int SET_TEMP_CONTROL_OR_NOT = 360;
    public static final int CMD_SET_COOL = 361;
    public static final int CMD_SET_HEAT = 362;
    public static final int CMD_SET_TEMP = 363;
    public static final int CMD_SET_GLASS_HEAT_OPEN = 364;
    public static final int CMD_SET_GLASS_HEAT_CLOSE = 365;
    public static final int CMD_READ_CURRENT_TEMP = 366;
    public static final int CMD_SET_LIGHT_OPEN = 367;
    public static final int CMD_SET_LIGHT_CLOSE = 368;
    public static final int CMD_SET_BUZZER_OPEN = 369;
    public static final int CMD_SET_BUZZER_CLOSE = 370;
    public static final int CMD_READ_DOOR_STATUS = 371;//门状态
    public static final int CMD_SET_COOL_HEAT_CLOSE = 372;
    public static final int CMD_OPEN_DOOR = 373;
    public static final int CMD_CLOSE_DOOR = 374;
    public static final int CMD_SET_ACTION_PARAMS = 375;
    public static final int CMD_QUERY_ACTION_PARAMS = 376;


    public static final int CMD_LIFTER_MOVE_START = 377;
    public static final int CMD_LIFTER_MOVE_END = 378;
    public static final int CMD_QUERY_STATUS_LIFTER = 380;
    public static final int CMD_TAKE_GOODS_DOOR = 381;
    public static final int CMD_LIFTER_UP = 382;
    public static final int CMD_LIFTER_BACK_HOME = 383;
    public static final int CMD_CLAPBOARD_SWITCH = 384;
    public static final int CMD_OPEN_COOL = 385;
    public static final int CMD_OPEN_HEAT = 386;
    public static final int CMD_CLOSE_COOL_HEAT = 387;
    public static final int CMD_CLEAN_FAULTS = 388;
    public static final int CMD_QUERY_PARAMETERS = 389;
    public static final int CMD_QUERY_DRIVER_CMD = 390;
    public static final int CMD_SET_SWITCH_OUTPUT_STATUS = 391;
    public static final int CMD_SET_ID = 392;
    public static final int CMD_SET_LIGHT_OUT_STEP = 393;
    public static final int CMD_SET_PARAMETERS = 394;
    public static final int CMD_FACTORY_RESET = 395;
    public static final int CMD_DETECT_LIGHT = 396;
    public static final int CMD_DETECT_SHIP = 397;
    public static final int CMD_DETECT_SWITCH_INPUT = 398;

    public static final int COMMAND_QUERY_PARAMETERS = 399;

    public static final int CMD_TAKE_GOODS_FIRST = 400;
    public static final int CMD_SHIP_FAIL_TAKE_GOODS_FIRST = 401;

    public static final int CMD_MICOVEN_HEAT_OPEN = 403;
    public static final int CMD_MICOVEN_HEAT_CLOSE = 404;

    public static final int CMD_DOOR_HAVE_GOODS = 405;

    public static final int CMD_QUERY_DRIVE_VERSION_INFO = 406;

    public static final int CMD_ACTION_DRIVES_STATUS_DOING = 410;
    public static final int CMD_ACTION_DRIVES_STATUS_SUCCESS = 411;
    public static final int CMD_ACTION_DRIVES_STATUS_FAIL = 412;

    public static final int CMD_SCAN_LIGHT_SET = 430;      //扫描灯设置
    public static final int CMD_CABINETNO_SET_VAILD = 431;    //格子设置有效无效
    public static final int CMD_CABINETNO_SET_INVAILD = 432;    //格子设置有效无效
    public static final int CMD_CABINETNO_OFF = 433;


    public static final int PAY_FAIL = 450;

    public static final int CMD_MACHINE_LOCKED = 451;
    public static final int CMD_RCV_SERVER_XT = 452;

    public static final int CMD_SLOTNO_QUERY = 455;

    public static final int CMD_CARD_CONSUM = 460;
    public static final int CMD_CARD_CONSUMING = 461;
    public static final int CMD_CARD_HAS_REQ_CONSUM = 462;
    public static final int CMD_CARD_BALANCE = 463;
    public static final int CMD_CARD_FAULT = 464;
    public static final int CMD_CARD_REFUND = 465;
    public static final int CMD_CARD_CONSUM_INFO = 466;

    public static final int CMD_READ_CARD_ID = 467;
    public static final int CMD_CARD_PAY_ERR = 468;


    public static final int CMD_VERIFY_SHIP = 470;
    public static final int CMD_VERIFY_SHIP_LUCKY = 471;

    public static final int CMD_MACHINE_QRCODE = 475;

    public static final int CMD_QUERY_WATER_TEMP = 500;
    public static final int CMD_QUERY_SHIP_CUP = 501;
    public static final int CMD_QUERY_CLEAN = 502;
    public static final int CMD_QUERY_COFF_STATUS = 503;

    public static final int CMD_QUERY_SNAKE_STATUS = 510;
    public static final int CMD_LED_OFF = 511;
    public static final int CMD_LED_ON = 512;
    public static final int CMD_COOL_TEMP_MODE = 513;
    public static final int CMD_HEAT_TEMP_MODE = 514;
    public static final int CMD_COOL_LEFT_TEMP_MODE = 515;
    public static final int CMD_COOL_RIGHT_TEMP_MODE = 516;
    public static final int CMD_HEAT_LEFT_TEMP_MODE = 517;
    public static final int CMD_HEAT_RIGHT_TEMP_MODE = 518;
    public static final int CMD_COOL_LEFT_HEAT_RIGHT_TEMP_MODE = 519;
    public static final int CMD_HEAT_LEFT_COOL_RIGHT_TEMP_MODE = 520;
    public static final int CMD_HEAT_COOL_NONE_MODE = 521;
    public static final int CMD_COOL_HEAT_DETAIL_PARAME = 522;
    public static final int CMD_QUERY_GOODS = 523;
    public static final int CMD_SET_SELL_LASTONE = 524;
    public static final int CMD_SET_NOT_SELL_LASTONE = 525;
    public static final int CMD_SET_BOARD_ADDR = 526;
    public static final int CMD_SHOW_TOAST = 527;


    public static final int CMD_KEY_SET_STATUS = 531;

    public static final int CMD_KEY_VALUE_PRE = 533;

    public static final int CMD_KEY_SET_VALUE = 535;
    public static final int CMD_KEY_SET_PATTERN_MODE = 537;
    public static final int CMD_KEY_EXIT_PATTERN_MODE = 539;
    public static final int CMD_KEY_EXIT_FLICKER_STATUS = 541;
    public static final int CMD_KEY_SET_SOLDOUT_KEY_PATTERN = 543;
    public static final int CMD_KEY_SET_SOLDOUT_KEY = 545;
    public static final int CMD_KEY_SET_ALL_SAME_COLOR = 547;
    public static final int CMD_KEY_KEY_FLICKER = 549;
    public static final int CMD_KEY_VALUE_SET_WAIT = 550;

    public static final int ICBC_QR_CODE_GENERATED = 570;
    public static final int ICBC_PAY_REFUND = 571;

    public static final int UNION_QR_CODE_GENERATED = 572;
    public static final int UNION_PAY_REFUND = 573;

    public static final int QR_CODE_GENERATED_IRIS = 575;
    public static final int QR_CODE_GENERATED_BOOST = 578;
    public static final int QR_CODE_GENERATED_BEEP = 579;
    public static final int QR_CODE_GENERATED_GOPAY = 580;
    public static final int QR_CODE_GENERATED_CUSTOM_BITMAP = 581;
    public static final int QR_CODE_GENERATED_CUSTOM_URL = 582;
    public static final int QR_CODE_GENERATED_CUSTOM_INITDATA = 583;
    public static final int QR_CODE_GENERATED_NEQUI = 585;
    public static final int QR_CODE_GENERATED_CUSTOM_PAYAPP = 586;
    public static final int QR_CODE_GENERATED_CUSTOM_USEKEY = 587;


    public static final int QR_CODE_GENERATEDLINEPAY = 591;
    public static final int LINEPAY_REFUND = 592;

    public static final int QR_CODE_GENERATEDINGENICOPAY = 594;

    public static final int MOMOPAY_QR_CODE_GENERATE = 596;

    public static final int SUNWONPAY_QR_CODE_GENERATE = 598;

    public static final int CMD_REQ_PERMISSION = 600;

    public static final int CMD_FORBID_USE_BUY_MENU = 610;

    public static final int OPEN_GOODSCAR = 701;//打开购物车
    public static final int SET_GOODSNUM = 702;  //设置购物车数目
    public static final int SEND_GOODSCODE = 703;  //设置购物车数目
    public static final int CMD_QRCODE_SHOPCAR = 704;


    public static final int CMD_ClOSE_SHIPCAR_DIALOG = 705;
    public static final int CMD_TEXT_SWITCH = 706;
    public static final int CMD_IMAGE_RIGHT = 707;//设置顶部右边广告图，一般为红包之类的, TcnVendIF.getInstance().getRightBitmap()
    public static final int CMD_IMAGE_ADVERT_PAY = 708;//设置支付图 TcnVendIF.getInstance().getPayBitmap()
    public static final int CMD_IMAGE_GOUWU = 709;//设置购物帮助等 TcnVendIF.getInstance().getBitmapGouwu()

    public static final int CMD_ADVERT_XZ = 710;
    public static final int CMD_ADVERT_PLAY_LOOP = 711;
    public static final int CMD_SET_NOT_PLAY_LOOP = 712;

    public static final int CMD_REFSH_ADVERT_MAIN_LIST = 713;
    public static final int CMD_REFSH_ADVERT_STANDBY_LIST = 714;

    public static final int CMD_COL_MOVE = 715;
    public static final int FACE_RESULT = 721;  //人脸支付
    public static final int FACE_RESULT_FAIL = 722;  //人脸支付失败
    public static final int FACE_RESULT_SUCCESS = 723;  //人脸支付成功

    public static final int KEY_TYPE_INPUT_END = 725;
    public static final int KEY_TYPE_PRESS_UP = 726;
    public static final int KEY_TYPE_CANCEL = 727;
    public static final int KEY_TYPE_ENTER = 728;
    public static final int KEY_TYPE_BACK = 729;
    public static final int CMD_QUERY_KEY_NUMBER = 735;
    public static final int CMD_QUERY_KEY_ENTER = 736;
    public static final int CMD_QUERY_KEY_NUMBER_ALL = 737;
    public static final int CMD_QUERY_KEY_PICKUP_GOODS = 738;


    public static final int CMD_REQ_UPDATA = 750;
    public static final int CMD_UPDATA_DATA = 751;
    public static final int CMD_UPDATA_END = 752;
    public static final int CMD_CHECK_SERIPORT = 753;

    public static final int VEND_REFRESH_BOTTOMDATA = 800;//更新底部图片
    public static final int VEND_REFRESH_DATA = 801;

    public static final int VEND_VOL_SET = 805;

    public static final int CMD_ANIM_START = 810;

    public static final int CMD_ANIM_SHIP_DIALOG_DISMISS = 815;

    public static final int REQ_LUCKY_NUM = 850;
    public static final int REQ_TIME_COUNT = 851;

    public static final int CMD_RESETING = 900;   //复位中
    public static final int CMD_MAKING_POPCORN = 901;    //制作爆米花中
    public static final int CMD_MAKE_POPCORN_END = 902;    //制作爆米花完成
    public static final int CMD_TAKE_OUT = 903;    //取走爆米花

    public static final int CMD_SBRZ = 950;

    public static final int CMD_QUERY_STATUS_ICEC = 1000;
    public static final int CMD_QUERY_STATUS_GOODS_TAKE = 1001;
    public static final int CMD_SET_WORK_MODE = 1002;
    public static final int CMD_PARAM_ICE_MAKE_SET = 1003;
    public static final int CMD_PARAM_ICE_MAKE_QUERY = 1004;
    public static final int CMD_PARAM_QUERY = 1005;
    public static final int CMD_PARAM_SET = 1006;
    public static final int CMD_POSITION_MOVE = 1007;
    public static final int CMD_QUERY_STATUS_AND_JUDGE = 1008;
    public static final int CMD_SELF_INSPECTION = 1009;
    public static final int CMD_SELF_INSPECTION_STATUS = 1010;//自检状态
    public static final int CMD_UPDATE_ICESHOW = 1011;//更新冰淇淋的显示界面
    public static final int CMD_UPDATE_ICESLOGOUT = 1012;//更新冰淇淋的显示界面
    public static final int AD_BAIDU_ICON = 1100;  //百度广告icon路径播放


    public static final int CMD_COMMUNICATIONS_FAILURE = 1120;
    public static final int CMD_BILLESCROW = 1121;
    public static final int CMD_BILLREJECT = 1122;
    public static final int CMD_BARCODE_TICKETESCROW = 1123;
    public static final int CMD_CASHPAIDOUT = 1124;
    public static final int CMD_CASH_LEVELS_CHANGED = 1125;
    public static final int CMD_CASH_STORE_INPAYOUT = 1126;
    public static final int CMD_PAYOUTSTARTED = 1127;
    public static final int CMD_PAYOUTENDED = 1128;
    public static final int CMD_PAYINSTARTED = 1129;
    public static final int CMD_PAYINENDED = 1130;
    public static final int CMD_EMPTYSTARTED = 1131;
    public static final int CMD_EMPTYENDED = 1132;
    public static final int CMD_PAYOUTAMOUNTINVALID = 1133;
    public static final int CMD_ROUTE_CHANGED = 1134;
    public static final int CMD_PAYOUT_DEVICE_NOTCONNECTED = 1135;
    public static final int CMD_PAYOUT_DEVICE_EMPTY = 1136;
    public static final int CMD_PAYOUT_DEVICE_DISABLED = 1137;
    public static final int CMD_DISPLAYEVENTS = 1138;
    public static final int CMD_DISPLAYSETUP = 1139;

    public static final int COMMAND_RECOVERYING = 1200;
    public static final int COMMAND_RECOVERY_SUCCESS = 1201;
    public static final int COMMAND_RECOVERY_FAILURE = 1202;


    public static final int CMD_OPEN_CABINET_DOOR = 1304;       //开箱体柜门
    public static final int CMD_CLOSE_CABINET_DOOR = 1306;       //关箱体柜门
    public static final int CMD_SUPPLY_WATER = 1308;       //中转水箱加水
    public static final int CMD_HIGH_PRE_EFFLUENT = 1310;       //高压出水 High pressure effluent
    public static final int CMD_LOW_PRE_EFFLUENT = 1312;       //低压出水
    public static final int CMD_TEST_BEAN_GRINDING = 1314;       //磨豆测试  Bean grinding test
    public static final int CMD_TEST_BOILER_HEATING = 1316;       //测试锅炉加热  Test Boiler Heating
    public static final int CMD_GLAND = 1318;       //压盖  Gland
    public static final int CMD_OPEN_TAKEGOODS_DOOR = 1320;       //打开小门  打开取货门
    public static final int CMD_CLOSE_TAKEGOODS_DOOR = 1322;       //关闭小门  关闭取货门
    public static final int CMD_OPEN_MANIPULATOR = 1324;       //机械手打开  Manipulator open
    public static final int CMD_CLOSE_MANIPULATOR = 1326;       //机械手关闭  Manipulator close
    public static final int CMD_REVERSAL_HOPPER = 1328;       //翻转料斗  Reversal hopper
    public static final int CMD_POSITION_OF_EXTRACTOR_PUL = 1330;       //萃取器接粉位置  Pulverized position of extractor
    public static final int CMD_POSITION_OF_EXTRACTOR_BRE = 1332;       //萃取器冲泡位置  Brewing position of extractor
    public static final int CMD_DOOR_ASCENDING = 1334;       //上升门  Ascending door
    public static final int CMD_DOOR_DESCENT = 1336;       //下降门  Descent door
    public static final int CMD_ROTARY_AGITATOR = 1338;       //旋转搅拌器  Rotary agitator
    public static final int CMD_CARTRIDGE_DISCHARGE = 1340;       //料盒出料  Cartridge discharge
    public static final int CMD_MOVE_TO_MAT_BOX = 1342;       //移动到物料盒位  Move to Material Box
    public static final int CMD_MOVE_TO_DROPPER = 1344;       //移动到落杯器  Move to Dropper
    public static final int CMD_DROP_SINGLE = 1346;       //单次落杯  Single drop
    public static final int CMD_MOVE_TO_OUTLET = 1347;       //移动到出水口 Move to the outlet
    public static final int CMD_MOVE_TO_TAKE_CUP = 1348;       //移动到用户取杯口 Move to the user's cup mouth
    public static final int CMD_MOVE_TO_MIXER = 1349;       //移动到搅拌处 Move to the mixer
    public static final int CMD_MOVE_TO_CLEAN = 1350;       //移动到清洗处 Move to the cleaning area
    public static final int CMD_MOVE_TO_ZAXIS_TOP = 1351;       //移动Z轴顶部 Moving Z-axis top
    public static final int CMD_MOVE_RESULT = 1352;     // 运动控制板复位
    public static final int CMD_OUT_COFFEE_SINGLE = 1353;     // 单出咖啡
    public static final int CMD_MOVE_OTHER = 1354;// 其它动作命令
    public static final int CMD_QUERY_REAL_TIME_DATA = 1355;
    public static final int CMD_SET_ACTION_PARAMETERS = 1356;         //设置动作参数
    public static final int CMD_QUERY_ACTION_PARAMETERS = 1357;          //查询动作参数

    public static final int COMMAND_SLOTNO_INFO_MLZ = 1360; // 寻址机货道查询结果

    public static final int CMD_INITED = 1370;
    public static final int CMD_QUERY_BOARD_INFO_UPDATE = 1371;
    public static final int CMD_QUERY_WORK_STATUS = 1372;

    public static final int CMD_CLEAN_DROP_STATUS = 1385;
    public static final int CMD_READ_DROP_STATUS = 1386;
    public static final int CMD_SET_DROP_SENSOR = 1387;
    public static final int CMD_READ_DROP_SENSOR = 1388;
    public static final int CMD_READ_REAL_DATA = 1389;

    public static final int CMD_SET_DEFROST_TIME = 1390;
    public static final int CMD_SET_COMPRESSOR_WORKING_TIME = 1391;

    public static final int CLEAN_SHOPING_CAR = 1340;// 清空购物车列表

    public static final int COMMAND_SLOTNO_QUERY = 1400; // 购物车选货

    public static final int COMMAND_SELECT_NOTQUERY_DRIVE_STATUS = 1401;

    public static final int CMD_GET_DISTANCE = 1402;

    public static final int CMD_GET_SENSOR = 1403;// GPIO感应器


    public static final int CMD_SET_VIEW_SYSTEM_BACK = 1410;// 显示悬浮的系统返回按钮

    public static final int CMD_SEND_TO_UI_STRING = 1440; // 用于向UI界面发送字符串

    public static final int CMD_SWITCH_OUT_INPUT_DOOR_OPEN = 1450;
    public static final int CMD_SWITCH_OUT_INPUT_DOOR_CLOSE = 1451;

    public static final int CMD_VISUAL_SHIP = 1501;//视觉柜开门完成，用户进行取货
    public static final int CMD_VISUAL_CLOSEDOOR = 1502;//视觉柜关门完成指令,进入结算界面
    public static final int CMD_VISUAL_PAY_CODE = 1503;//视觉柜关门结算完成，回到扫码界面
    public static final int CMD_VISUAL_ERROR_CARME = 1530;//视觉柜摄像头错误  lParam1  为摄像头可以使用的数量
    public static final int CMD_VISUAL_UP_TEL = 1540; // 更新下发电话
    public static final int CMD_OPERATIONAL_HOURS = 1550; // 运营时间 lParam1 是否为运营时间


    public static final int CMD_ALARM_OFF = 1602;
    public static final int CMD_ALARM_PARAM_QUERY = 1603;
    public static final int CMD_ALARM_PARAM_SET = 1604;

    public static final int CMD_UPDATE_QUERY_SUCCESS = 1605;//更新查询成功的命令

    public static final int CMD_BLJ_DOOR = 1606;//板栗机门的状态
    public static final int CMD_BLJ_STATS = 1607;//板栗机冷仓预警状态
    public static final int CMD_BLJ_SCAN = 1608;//板栗机压盖扫码
    public static final int CMD_BLJ_SHIP = 1609;//板栗机出货
    public static final int CMD_BLJ_BAKE = 1610;//板栗机烤制数量状态上传
    public static final int CMD_BLJ_ICE_BAKE = 1611;//板栗机冷藏到烤箱数量上传
    public static final int CMD_BLJ_ERROR_UPLOAD = 1612;//板栗机故障上传
    public static final int FLUSH_FACE_ID_CLEAN = 1613;//清除购物车


    //美团页面
    public static final int CMD_MEITUAN_TAKE_GOODS = 1620;//取货
    public static final int CMD_MEITUAN_UNLOAD_TO_TEMP_STORE = 1621;//卸货到暂存仓
    public static final int CMD_MEITUAN_UNLOAD_TO_AVG = 1622;//卸货到AVG
    public static final int CMD_MEITUAN_CURRENT_LOG = 1623;//日志
    public static final int CMD_MEITUAN_CURRENT_SERVER_STATE = 1624;//在线状态
    public static final int CMD_MEITUAN_TIP = 1625;

    public static final int CMD_QUERY_SWIPE_STATUS = 1630;


    public static final int CMD_QUERY_PARAMETERCARGODRIVE = 1650;// 参数查询
    public static final int CMD_SET_JITTER_AFTER_DELIVERY = 1651;//设置抖动

    public static final int RESULT_CMD_SET_JITTER_NUM = 1653;// 返回抖动次数设置结果
    public static final int RESULT_CMD_SET_JITTER_WAITE_TIME = 1654;// 返回设置等待时间

    public static final int CMD_READ_DEHUMIDIFIER = 1655;//读取湿度

    public static final int JD_SHIP_RESULT = 1656;//出货结果
 	public static final int CMD_QUERY_AGE_STATUS_TO_UI = 1657;//年龄验证结果
     public static final int IPCAMER_STATUS = 1700;// IP摄像头状态
    public static final int IPCAMER_START_VIDEO       = 1701;// 开启录像结果返回
    public static final int IPCAMER_STOP_VIDEO         = 1702;// 结束录像结果返回
    public static final int IPCAMER_SCREENSHOTS        = 1703;// 截图返回
    public static final int IPCAMER_VIDEO_DATA         = 1710;// 数据流返回
    public static final int IPCAMER_SET_TIME           = 1715;// 设置时间
    public static final int WXFACE_ERROR_INFO  = 1716;//微信刷脸错误信息

    public static final int VENDING_APP_GET_MACHINE_ID  = 1717;//售卖程序获取机器号
    public static final int CONTROL_TO_VEND_SHOP_GOODS  = 2104;//按商品编码展示

}
