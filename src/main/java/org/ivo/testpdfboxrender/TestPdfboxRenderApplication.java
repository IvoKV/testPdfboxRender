package org.ivo.testpdfboxrender;

import java.io.IOException;

//@SpringBootApplication
public class TestPdfboxRenderApplication {

    static String pdfFileName = "";
    public static void main(String[] args) throws IOException {
        //SpringApplication.run(TestPdfboxRenderApplication.class, args);

        if(args.length > 0) {
            pdfFileName = args[0];
            DataImport pdfrender = new DataImport();
            pdfrender.importTestPDF();
        }
        else {
            pdfFileName = null;
        }





        System.out.println("hello Ivo!!");
    }

}
