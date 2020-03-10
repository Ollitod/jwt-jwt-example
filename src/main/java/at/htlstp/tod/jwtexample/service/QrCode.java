package at.htlstp.tod.jwtexample.service;

import at.htlstp.tod.jwtexample.exception.QrCodeNotPossibleException;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class QrCode {

    public static byte[] getQRCodeImage(String text, int width, int height) throws QrCodeNotPossibleException {
        try {
            QRCodeWriter qrCodeWriter = new QRCodeWriter();
            BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            MatrixToImageWriter.writeToStream(bitMatrix, "png", byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (WriterException e) {
            throw new QrCodeNotPossibleException("Aus den übergebenen Text konnte kein QRCode erstellt werden");
        } catch (IOException e) {
            throw new QrCodeNotPossibleException(e.getMessage());
        }

    }
}
