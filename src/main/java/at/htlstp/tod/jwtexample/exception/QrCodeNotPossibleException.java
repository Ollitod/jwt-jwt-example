/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.htlstp.tod.jwtexample.exception;

/**
 *
 * @author 20150202
 */
public class QrCodeNotPossibleException extends RuntimeException {

    /**
     * Creates a new instance of <code>QrCodeNotPossible</code> without detail
     * message.
     */
    public QrCodeNotPossibleException() {
    }

    /**
     * Constructs an instance of <code>QrCodeNotPossible</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public QrCodeNotPossibleException(String msg) {
        super(msg);
    }
}
