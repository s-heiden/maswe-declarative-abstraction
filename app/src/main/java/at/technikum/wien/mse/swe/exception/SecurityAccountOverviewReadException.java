package at.technikum.wien.mse.swe.exception;

public class SecurityAccountOverviewReadException extends RuntimeException {

    public SecurityAccountOverviewReadException(Exception e) {
        super(e);
    }
}
