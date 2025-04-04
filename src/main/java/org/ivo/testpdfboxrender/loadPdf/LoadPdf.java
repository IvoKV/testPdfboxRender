package main.java.org.ivo.testpdfboxrender.loadPdf;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

import java.io.File;
import java.io.IOException;

public class LoadPdf {

    public void LoadPdf(String pathname, String outputfilename) throws IOException {
        File file = new File(pathname);
        PDDocument document = PDDocument.load(file);
        document.addPage(new PDPage());

        document.save(outputfilename);
        System.out.println("PDF Created");
        document.close();
    }
}
