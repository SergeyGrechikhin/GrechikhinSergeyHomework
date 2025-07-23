package holidayWork.miniProject.secondProject.dto;

public class ResponceCarDTO {
    private boolean success;
    private String message;
    private Object data;



    public ResponceCarDTO(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public Object getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
