package main.java.org.ivo.testpdfboxrender.main;

import main.java.org.ivo.testpdfboxrender.createPDF.CreatePdf;
import main.java.org.ivo.testpdfboxrender.loadPdf.LoadPdf;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

import java.io.IOException;

public class MainClass {
    public static void main(String[] args) throws IOException {
        CreatePdf createPdf = new CreatePdf();
        createPdf.CreatePdf();

        String loadFilename = "";
        String outPutFilename = "";
        if(args.length > 0) {
            loadFilename = args[0];
            outPutFilename = args[1];
        }
        else loadFilename = null;

        System.out.println("loadFilename: " + loadFilename + " outPutFilename: " + outPutFilename);

        if(loadFilename != null) {
            LoadPdf loadPdf = new LoadPdf();
            loadPdf.LoadPdf(loadFilename, outPutFilename);
        }

    }
}
