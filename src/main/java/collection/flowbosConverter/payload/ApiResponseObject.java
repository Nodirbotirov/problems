package collection.flowbosConverter.payload;


//import org.springframework.data.domain.Page;
//import org.springframework.http.CacheControl;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.ResponseEntity;

import org.springframework.data.domain.Page;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;

import java.util.concurrent.TimeUnit;

public class ApiResponseObject extends ApiResponse {
    private Object object;

    public ApiResponseObject(String message, boolean success, Object object) {
        super(message, success);
        if (object instanceof Page<?> objects) {
            setPage(objects.getNumber());
            setTotalElements(objects.getTotalElements());
            setTotalPages(objects.getTotalPages());
            this.object = objects.getContent();
        } else this.object = object;
    }

    public ApiResponseObject(HttpStatus status, Object object) {
        super(status);
        if (object instanceof Page<?> objects) {
            setPage(objects.getNumber());
            setTotalElements(objects.getTotalElements());
            setTotalPages(objects.getTotalPages());
            this.object = objects.getContent();
        } else this.object = object;
    }


    public ApiResponseObject(String message, HttpStatus status, Object object) {
        super(message, status);
        if (object instanceof Page<?> objects) {
            setPage(objects.getNumber());
            setTotalElements(objects.getTotalElements());
            setTotalPages(objects.getTotalPages());
            this.object = objects.getContent();
        } else this.object = object;
    }

    public ApiResponseObject(String message, boolean success, HttpStatus status, Object object) {
        super(message, success, status);
        if (object instanceof Page<?> objects) {
            setPage(objects.getNumber());
            setTotalElements(objects.getTotalElements());
            setTotalPages(objects.getTotalPages());
            this.object = objects.getContent();
        } else this.object = object;
    }

    public ApiResponseObject(String message, boolean success, HttpStatus status, long totalElements, long totalPages, long page, Object object) {
        super(message, success, status, totalElements, totalPages, page);
        if (object instanceof Page<?> objects) {
            setPage(objects.getNumber());
            setTotalElements(objects.getTotalElements());
            setTotalPages(objects.getTotalPages());
            this.object = objects.getContent();
        } else this.object = object;
    }

    public ApiResponseObject(HttpStatus status, long totalElements, long totalPages, long page, Object object) {
        super(status, totalElements, totalPages, page);
        if (object instanceof Page<?> objects) {
            setStatus(status);
            setPage(objects.getNumber());
            setTotalElements(objects.getTotalElements());
            setTotalPages(objects.getTotalPages());
            this.object = objects.getContent();
        } else this.object = object;
    }

    public ApiResponseObject(HttpStatus status, long totalElements, long totalPages, long page, Object object, boolean success) {
        super(status, totalElements, totalPages, page, success);
        if (object instanceof Page<?> objects) {
            setStatus(status);
            setPage(objects.getNumber());
            setTotalElements(objects.getTotalElements());
            setTotalPages(objects.getTotalPages());
            this.object = objects.getContent();
        } else this.object = object;
    }

    public ApiResponseObject(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public HttpEntity<?> response() {
        return ResponseEntity
                .status(org.springframework.http.HttpStatus.valueOf(getStatus().getCode()))
                .cacheControl(CacheControl.maxAge(1, TimeUnit.MINUTES).cachePublic())
                .body(this);
    }

    @Override
    public ApiResponseObject get() {
        return this;
    }
}
