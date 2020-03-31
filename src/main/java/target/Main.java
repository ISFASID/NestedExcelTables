package target;


public class Main {

    public static void main(String[] args) {
        CreateScheduleOne createScheduleOne = new CreateScheduleOne();
        //必须首先生成表头 否则下面在想表中填充数据拿不到sheet
        createScheduleOne.createFirstRowValue();
//        //生成表中数据
//        createScheduleOne.createWasteWaterExcelDatas();
        createScheduleOne.createProductLineExcelDatas();
        //请将下面路径换成想存的路径
//        createScheduleOne.WriteOut("C:\\Users\\INC\\Desktop\\test6.xlsx");
    }
}
