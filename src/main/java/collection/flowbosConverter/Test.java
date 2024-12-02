package collection.flowbosConverter;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {


        Map<String, Float> result=new HashMap<>();
        int ard;
        String name = "";
        Float add;
        int[] adrs = {631, 633, 635, 637, 639, 641};
        String[] names = { "mgnovenniy", "RasxodZaPreChas", "RasxodZaPreSut", "RasxodSNachSut", "RasxodZaVcher", "PeredadDP", "DavleniyaP", "TemperaturaT" };
        for (int i = 0; i < adrs.length; i++){
            result.put(names[i], (float)adrs[i]);
        }
        System.out.println(result);




//        public Object execute(LinkedHashMap<String, Object> args) {
//            try {
//                ModbusClient client=new ModbusClient("192.168.140.180", 502);
//                Map<String, Float> result=new HashMap<>();
//                int[] adrs = {631, 633, 635, 637, 639, 641};
//                String[] names = { "Flowboss_Chasovoy", "Flowboss_segodnya", "Flowboss_sutochniy", "Flowboss_perepad", "Flowboss_Davlenie", "Flowboss_Temp" };
//                client.Connect();
//                for(int i = 0; i < adrs.length; i++){
//                    int[] ints=client.ReadHoldingRegisters(adrs[i],2);
//                    Float res=ModbusClient.ConvertRegistersToFloat(ints, RegisterOrder.HighLow);
//                    result.put(names[i], res);
//                }
//                // int[] ints=client.ReadHoldingRegisters(631,2);
//                // Float res=ModbusClient.ConvertRegistersToFloat(ints, RegisterOrder.HighLow);
//                System.out.println(result);
//                // System.out.println(Arrays.toString(ints));
//
//                // ModbusObj modbusObj = convert(args, ModbusObj.class);
//                // System.out.println(modbusObj);
//                // System.out.println(modbusObj.ip);
//
//                // return Payload.ok(res);
//                return Payload.ok("asa");
//            } catch (Exception e) {
//                log.error(e.toString());
//                return Payload.conflict();
//            }
//        }


    }
}
