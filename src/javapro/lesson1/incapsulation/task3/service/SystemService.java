package javapro.lesson1.incapsulation.task3.service;

import javapro.lesson1.incapsulation.task3.entity.SystemConfiguration;

public class SystemService {
    private SystemConfiguration systemConfiguration;



    public void infologLevel(SystemConfiguration config, String logLevel){
if (logLevel.equals("INFO") || logLevel.equals("ERROR") || logLevel.equals("WARNING")){
    config.setLoglevel(logLevel);
}else {
    System.out.println("Log Level not valid . Use : INFO , WARNING or ERROR.");
}
    }
    public void LogFilePatch(SystemConfiguration config, String path){
        if(path != null && !path.isEmpty()){
            config.setLogFilePath(path);
        }else {
            System.out.println("The path cannot be empty.");
        }
    }
    public void printSystemConfiguration(SystemConfiguration config){
        System.out.println("Log Level : "+config.getLoglevel());
        System.out.println("Log File Path : "+config.getLogFilePath());
    }
}
