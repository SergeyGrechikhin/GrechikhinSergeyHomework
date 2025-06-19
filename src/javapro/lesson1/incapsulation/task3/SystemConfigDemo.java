package javapro.lesson1.incapsulation.task3;

import javapro.lesson1.incapsulation.task3.entity.SystemConfiguration;
import javapro.lesson1.incapsulation.task3.service.SystemService;

public class SystemConfigDemo {
    public static void main(String[] args) {

        SystemConfiguration systemConfiguration = new SystemConfiguration();
        SystemService systemService = new SystemService();
        systemService.infologLevel(systemConfiguration,"INFO");
        systemService.LogFilePatch(systemConfiguration,"logs/app.mylog");
        systemService.printSystemConfiguration(systemConfiguration);

    }
}
