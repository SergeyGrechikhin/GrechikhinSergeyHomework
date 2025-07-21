package holidayWork.miniProject.firstProject.dto;

public class ResponseDTO <T>{
    private boolean success;
    private String message;
    private T data;

    public ResponseDTO(boolean success, T data, String message) {
        this.success = success;
        this.data = data;
        this.message = message;
    }

    public static <T> ResponseDTO<T> requestTrue(T data, String message) {
        return new ResponseDTO<>(true, data, message);
    }

    public static <T> ResponseDTO<T> requestFalse(T data, String message) {
        return new ResponseDTO<>(false,data,message);
    }

    public boolean isSuccess() {
        return success;
    }

    public T getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }
}
