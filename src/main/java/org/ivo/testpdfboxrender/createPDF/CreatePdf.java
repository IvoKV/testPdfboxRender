package main.java.org.ivo.testpdfboxrender.createPDF;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

import java.io.IOException;

public class CreatePdf {

    public void CreatePdf() throws IOException {
        PDDocument document = new PDDocument();
        PDPage firstPage = new PDPage();
        document.addPage(firstPage);

        document.save("out\\mypdf.pdf");
        System.out.println("PDF Created");
        document.close();

    }

}
