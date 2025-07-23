package holidayWork.miniProject.thirdProject.dto;

import holidayWork.miniProject.firstProject.dto.ResponseDTO;

public class ResponceCompanyDTO <T>{
    private boolean success;
    private String message;
    private Object data;

    public ResponceCompanyDTO(boolean success, Object data, String message) {
        this.success = success;
        this.data = data;
        this.message = message;
    }

    public static <T>ResponceCompanyDTO<T> requestTrue(T data, String message) {
        return new ResponceCompanyDTO<>(true, data, message);
    }

    public static <T> ResponceCompanyDTO<T> requestFalse(T data, String message) {
        return new ResponceCompanyDTO<>(false,data,message);
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }
}
