package org.ivo.testpdfboxrender;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.ivo.testpdfboxrender.TestPdfboxRenderApplication.pdfFileName;

public class DataImport {

    void testPDFboxRender() {
        System.out.println("in PdfRender");


    }

    public String importTestPDF() throws IOException {
        //File file = new File(pdfFileName);
        //Files.readString(Path.of())
        InputStream is = new FileInputStream(pdfFileName);
        StringBuilder sb = new StringBuilder(10000);

        int count = 30;
        while(is.available() > 0) {
            int read = is.read();
            sb.append((char)read);
            count--;
//            if(count == 0) {
//                is.close();
//                break;
//            }
        }
        is.close();
        //for(int i = sb.length(); i > 0; i--){
            System.out.println(sb.toString());
        //}
        return sb.toString();
    }
}
