package collection.flowbosConverter;

import collection.flowbosConverter.client.ModbusClient;

import java.io.IOException;
import java.util.*;

import collection.flowbosConverter.payload.Payload;
import collection.flowbosConverter.types.RegisterOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;

public class Script1 {
    public static void main(String[] args) {
    }

    private static final Logger log = LoggerFactory.getLogger(Script1.class);

    private Map<String, ModbusObj> modbusClients = new HashMap();

    public Script1() {

    }

    // {
    //   "ip":"192.168.123.41",
    //   "port":502,
    // }
    public static Object execute(LinkedHashMap<String, Object> args) {
        try {
            ModbusClient client=new ModbusClient("192.168.140.180", 502);
            Map<String, Float> result=new HashMap<>();
            int[] adrs = {631, 633, 635, 637, 639, 641};
            String[] names = { "Flowboss_Chasovoy", "Flowboss_segodnya", "Flowboss_sutochniy", "Flowboss_perepad", "Flowboss_Davlenie", "Flowboss_Temp" };
            client.Connect();
            for(int i = 0; i < adrs.length; i++){
                int[] ints=client.ReadHoldingRegisters(adrs[i],2);
                Float res=ModbusClient.ConvertRegistersToFloat(ints, RegisterOrder.HighLow);
                result.put(names[i], res);
            }
            // int[] ints=client.ReadHoldingRegisters(631,2);
            // Float res=ModbusClient.ConvertRegistersToFloat(ints, RegisterOrder.HighLow);
            System.out.println(result);
            // System.out.println(Arrays.toString(ints));

            // ModbusObj modbusObj = convert(args, ModbusObj.class);
            // System.out.println(modbusObj);
            // System.out.println(modbusObj.ip);

            // return Payload.ok(res);
            return Payload.ok("asa");
        } catch (Exception e) {
            log.error(e.toString());
            return Payload.conflict();
        }
    }



    public static Object execute1(LinkedHashMap<String, Object> args) throws IOException {
        ModbusClient client =new ModbusClient("192.168.140.180", 502);
        Map<String, Float> previousResult = new HashMap<>();
        int[] adrs = {631, 633, 635, 637, 639, 641};
        String[] names = { "Flowboss_Chasovoy", "Flowboss_segodnya", "Flowboss_sutochniy", "Flowboss_perepad", "Flowboss_Davlenie", "Flowboss_Temp" };

        client.Connect();
        log.info("Connected to modbus server. ");

        while (true) {
            try {
                Map<String, Float> currentResult = new HashMap<>();

                for (int i = 0; i < adrs.length; i++){
                    int[] ints = client.ReadHoldingRegisters(adrs[1], 2);
                    Float res = ModbusClient.ConvertRegistersToFloat(ints, RegisterOrder.HighLow);
                    currentResult.put(names[i], res);
                }

                if (!currentResult.equals(previousResult)){
                    log.info("New data detected: " + currentResult);
                    previousResult = new HashMap<>(currentResult);
                    Payload.ok(currentResult);
                }

                Thread.sleep(5000);
            }catch (Exception e) {
                log.error("Connecting failed: " + e.toString());
                return Payload.conflict();
            }
        }
    }


    public static <T> T convert(LinkedHashMap<String, Object> map, Class<T> clazz) throws Exception {
        T obj = clazz.getDeclaredConstructor().newInstance();
        for (String key : map.keySet()) {
            try {
                Field field = clazz.getDeclaredField(key);
                // Allow access to private fields
                field.setAccessible(true);
                // Set the field value directly
                field.set(obj, map.get(key));
            } catch (NoSuchFieldException e) {
                System.out.println("Field not found: " + key);
            }
        }
        return obj;
    }

    public static class ModbusObj {

        String ip;

        int port;

        ModbusClient client;

        public ModbusObj() {
        }

        @Override
        public String toString() {
            return "ModbusObj{ip='" + ip + "', port=" + port + ", city='" + 1 + "'}";
        }
    }

    // 01: Read coils
    // 02: Read discrete inputs
    // 03: Read holding registers
    // 04: Read input registers
    // 05: Write single coil
    // 06: Write single register
    // 08: Diagnostics
    // 11: Get comm event counter
    // 15: Write multiple coils
    // 16: Write multiple registers
    // 23: Read/write multiple registers
    public static enum ModbusActionType {

        READ_COILS("01"), READ_DISCRETE_INPUTS("02"), READ_HOLDING_REGISTERS("03");

        private String code;

        private ModbusActionType(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
    }
}
