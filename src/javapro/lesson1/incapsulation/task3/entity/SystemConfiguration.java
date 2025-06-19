package javapro.lesson1.incapsulation.task3.entity;

public class SystemConfiguration {
    private String loglevel;
    private String logFilePath;

    public String getLoglevel() {
        return loglevel;
    }

    public String getLogFilePath() {
        return logFilePath;
    }

    public void setLoglevel(String loglevel) {
        this.loglevel = loglevel;
    }

    public void setLogFilePath(String logFilePath) {
        this.logFilePath = logFilePath;
    }
}
