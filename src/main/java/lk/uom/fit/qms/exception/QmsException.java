package lk.uom.fit.qms.exception;

import lk.uom.fit.qms.exception.pojo.QmsExceptionCode;
import org.springframework.http.HttpStatus;

public class QmsException extends Exception {

    private static final long serialVersionUID = -1871659178537590831L;

    private final QmsExceptionCode exceptionCode;
    private final HttpStatus httpStatusCode;

    public QmsException(QmsExceptionCode exceptionCode, HttpStatus httpStatusCode, String message) {
        super(message);
        this.exceptionCode = exceptionCode;
        this.httpStatusCode = httpStatusCode;
    }

    public QmsExceptionCode getExceptionCode() {
        return exceptionCode;
    }

    public HttpStatus getHttpStatusCode() {
        return httpStatusCode;
    }
}
