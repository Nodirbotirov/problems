package code.timerAndSocketIO;
import collection.flowbosConverter.client.ModbusClient;

import collection.flowbosConverter.payload.Payload;
import collection.flowbosConverter.types.RegisterOrder;
import com.corundumstudio.socketio.Configuration;
import com.corundumstudio.socketio.SocketIOServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;


import java.io.IOException;
import java.net.ServerSocket;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
@RequestMapping("/api")
public class TimerExample {
    ServerSocket ss = new ServerSocket(6666);
    private static final Logger log = LoggerFactory.getLogger(TimerExample.class);

    public TimerExample() throws IOException {
    }

    public static void main(String[] args) throws Exception {

        ModbusClient client = new ModbusClient("192.168.140.188", 502);
        ModbusClient zevardi = new ModbusClient("192.168.140.184", 502);
        TimerExample timer = new TimerExample();

        Configuration config = new Configuration();
        config.setHostname("localhost");
        config.setPort(9092);

        // Optional: Enable CORS if needed
        config.setOrigin("*");

        // Optional: Specify allowed transports (default supports WebSocket and polling)
        config.setTransports(com.corundumstudio.socketio.Transport.WEBSOCKET, com.corundumstudio.socketio.Transport.POLLING);


        // Initialize the server
        SocketIOServer server = new SocketIOServer(config);

        // Add listeners for events
        server.addConnectListener(cl -> {
            System.out.println("Client connected: " + cl.getSessionId());
        });

        server.addDisconnectListener(cl -> {
            System.out.println("Client disconnected: " + cl.getSessionId());
        });

        server.addEventListener("message", String.class, (cl, data, ackSender) -> {
            System.out.println("Received message: " + data);
            // Broadcast message to all connected cls
            server.getBroadcastOperations().sendEvent("message", data);
        });

        // Start the server
        server.start();
        System.out.println("Socket.IO server started on port " + config.getPort());

        Object execute = timer.execute(client,server);
        Object execute1 = timer.execute(zevardi, server);
        System.out.println(execute+"dasdadasd");
        System.out.println(execute1 +"sevardi");
        // Add a shutdown hook to stop the server gracefully
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            server.stop();
            System.out.println("Socket.IO server stopped.");
        }));





//        timer.execute(cl);
    }

//    @PostMapping("/add")
    public Object execute(ModbusClient client, SocketIOServer server) throws Exception {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
//            ModbusClient client = new ModbusClient("192.168.140.188", 502);
            Map<String, Float> previousResult = new HashMap<>();
            int[] adrs = {631, 633, 635, 637, 639, 641};
            String[] names = { "Flowboss_Chasovoy", "Flowboss_segodnya", "Flowboss_sutochniy", "Flowboss_perepad", "Flowboss_Davlenie", "Flowboss_Temp" };
            @Override
            public void run() {
                try {
                    client.Connect();
                    Map<String, Float> currentResult = new HashMap<>();
                    for (int i = 0; i < adrs.length; i++) {
                        int[] ints=client.ReadHoldingRegisters(adrs[i],2);
                        Float res=ModbusClient.ConvertRegistersToFloat(ints, RegisterOrder.HighLow);
                        currentResult.put(names[i], res);
                    }
                    if (!currentResult.equals(previousResult)){
                        previousResult = new HashMap<>(currentResult);
//                        Payload.ok(currentResult);
                    }
                    Payload.ok(currentResult);
                    server.getBroadcastOperations().sendEvent("signal", currentResult);
                    server.getBroadcastOperations().sendEvent("zevardi", currentResult);
                    System.out.println(currentResult + "ok");
                }catch (Exception e) {
                    log.error(e.toString());

                }
//                catch (SocketException e) {
//                    throw new RuntimeException(e);
//                }
//                catch (UnknownHostException e) {
//                    throw new RuntimeException(e);
//                }
//                catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//                catch (ModbusStormException e) {
//                    throw new RuntimeException(e);
//                }
            }
        };
        timer.schedule(task, 0, 8000);
//         Schedule the task to run after 5 seconds
        return task;
    }

}
