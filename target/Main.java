package co.tests.main.POI.PollutantLineWasteWaterAttachedTable;


public class Main {

    public static void main(String[] args) {
        CreateScheduleOne createScheduleOne = new CreateScheduleOne();
        //必须首先生成表头 否则下面在想表中填充数据拿不到sheet
        createScheduleOne.createFirstRowValue();
//        //生成表中数据
//        createScheduleOne.createWasteWaterExcelDatas();
        createScheduleOne.createProductLineExcelDatas();
//        createScheduleOne.createTextHeadLine();
        createScheduleOne.WriteOut("C:\\Users\\Administrator\\Desktop\\test6.xlsx");
    }
}
