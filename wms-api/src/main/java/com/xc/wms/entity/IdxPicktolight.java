package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class IdxPicktolight implements Serializable {

private static final long serialVersionUID=1L;

    @TableField("OrderId")
    private String OrderId;

    @TableField("Sub_OrderId")
    private String subOrderid;

    @TableField("Order_Bar")
    private String orderBar;

    @TableField("Terminal_No")
    private String terminalNo;

    @TableField("Lab_Type")
    private String labType;

    @TableField("Light_Color")
    private String lightColor;

    @TableField("Task_Type")
    private String taskType;

    @TableField("Priority")
    private String Priority;

    @TableField("FM_Location")
    private String fmLocation;

    @TableField("Line")
    private String Line;

    @TableField("Location_Group")
    private String locationGroup;

    @TableField("Row_x")
    private String rowX;

    @TableField("Layer_y")
    private String layerY;

    @TableField("Pick_To_Location")
    private String pickToLocation;

    @TableField("WMS_Trace_ID")
    private String wmsTraceId;

    @TableField("OffLine_Trace_ID")
    private String offlineTraceId;

    @TableField("Online_Trace_ID")
    private String onlineTraceId;

    @TableField("Lot_Att04")
    private String lotAtt04;

    @TableField("Customer_ID")
    private String customerId;

    @TableField("SKU")
    private String sku;

    @TableField("Uom_Flag")
    private String uomFlag;

    @TableField("Notes")
    private String Notes;

    @TableField("Release_Flag")
    private String releaseFlag;

    @TableField("Pick_Num")
    private String pickNum;

    @TableField("Sort_Location")
    private String sortLocation;

    @TableField("FMQty_Each")
    private String fmqtyEach;

    @TableField("FMQty_Each_1")
    private String fmqtyEach1;

    @TableField("FMQty_Each_2")
    private String fmqtyEach2;

    @TableField("FMQty_Each_3")
    private String fmqtyEach3;

    @TableField("FMQty_Each_4")
    private String fmqtyEach4;

    @TableField("TOQty_Each")
    private String toqtyEach;

    @TableField("TOQty_Each_1")
    private String toqtyEach1;

    @TableField("TOQty_Each_2")
    private String toqtyEach2;

    @TableField("TOQty_Each_3")
    private String toqtyEach3;

    @TableField("TOQty_Each_4")
    private String toqtyEach4;

    @TableField("Task_Process")
    private String taskProcess;

    @TableField("Scan_Code")
    private String scanCode;

    @TableField("Lab_ID")
    private String labId;

    @TableField("Create_Date")
    private String createDate;

    @TableField("Edit_Time03")
    private String editTime03;

    @TableField("Edit_Time70")
    private String editTime70;

    @TableField("Edit_Time80")
    private String editTime80;

    @TableField("Time_1")
    private String time1;

    @TableField("Time_2")
    private String time2;

    @TableField("Label_ID")
    private String labelId;

    @TableField("Way_Lig")
    private String wayLig;

    @TableField("WBeg_1")
    private String wbeg1;

    @TableField("WBeg_1_attri")
    private String wbeg1Attri;

    @TableField("WBeg_1_State")
    private String wbeg1State;

    @TableField("WBeg_2")
    private String wbeg2;

    @TableField("WBeg_2_attri")
    private String wbeg2Attri;

    @TableField("WBeg_2_State")
    private String wbeg2State;

    @TableField("WBeg_3")
    private String wbeg3;

    @TableField("WEnd_1")
    private String wend1;

    @TableField("Location_Beg")
    private String locationBeg;

    @TableField("Location_End")
    private String locationEnd;

    @TableField("T1")
    private String t1;

    @TableField("T2")
    private String t2;

    @TableField("T3")
    private String t3;

    @TableField("T4")
    private String t4;

    @TableField("T5")
    private String t5;

    @TableField("T6")
    private String t6;

    @TableField("T7")
    private String t7;

    @TableField("T8")
    private String t8;

    @TableField("T9")
    private String t9;

    @TableId(value = "T10", type = IdType.UUID)
    private String t10;

    @TableField("T11")
    private String t11;

    @TableField("T12")
    private String t12;

    @TableField("T13")
    private String t13;

    @TableField("T14")
    private String t14;

    @TableField("T15")
    private String t15;


}
