package br.com.bradseg.coti.libmanager.net;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.commons.net.PrintCommandListener;
import org.apache.commons.net.ftp.FTPClient;

/**
 * FTPTest
 */
public class FTPTest {
    public static void main(String[] args) {
        FTPClient ftp = new FTPClient();
        String filepath = "c:/dev/java/";
        String filename = "BSAD-PdfBox-1.2.jar";
        String username = "wsoubar";
        String password = "futuro30";
        int timeout = 60000;
        String destFolder = "/home/wsoubar/lib";
        FileInputStream fis = null;
        // Read the file from resources folder.
        try {

            ftp.addProtocolCommandListener(new PrintCommandListener(new PrintWriter(System.out)));
            System.out.println("le arquivo");
            fis = new FileInputStream(filepath + filename);
            System.out.println("arquivo lido");
            // timeout em millisegundos
            ftp.setConnectTimeout(timeout);
            ftp.setDataTimeout(timeout);
            ftp.setDefaultTimeout(timeout);
            System.out.println("antes de conectar ao servidor ftp");
            ftp.connect("192.168.56.101");
            System.out.println("depois de conectar ao servidor ftp");
            if (!ftp.login(username, password)) {
                throw new IOException("Supplied wrong credentials to FTP Server");
            }
            ftp.setFileType(FTPClient.BINARY_FILE_TYPE);
            ftp.changeWorkingDirectory(destFolder); // Store file to server
            ftp.storeFile(filename, fis);
            ftp.logout();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                ftp.disconnect();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}