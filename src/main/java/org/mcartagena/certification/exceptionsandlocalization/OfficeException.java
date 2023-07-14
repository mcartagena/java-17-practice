package org.mcartagena.certification.exceptionsandlocalization;

import java.io.IOException;

public class OfficeException extends RuntimeException {
    public OfficeException(Exception e) {
        super(e);
    }

    public static void main(String[] args) throws Exception {
        try {
            throw new OfficeException(new IOException());
        } catch (RuntimeException e) {
            System.out.println(e.getCause());  // IOException
        }
    }
}
