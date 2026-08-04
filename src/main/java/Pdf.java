/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
/**
 *
 * @author SUPERTRONICA
 */
public class Pdf {
    public void btnPDFActionPerformed(String contenido) {//GEN-FIRST:event_btnPDFActionPerformed
         //PostulanteModelo p = llenarModelo();
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream("Listado de Paises"+".pdf"));
            document.open();
            // Establecer márgenes
            document.setMargins(50, 50, 50, 50);

            // Establecer tamaño de página
            document.setPageSize(PageSize.A4);
            // Crear una fuente con estilo y tamaño específicos
            Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14, BaseColor.BLUE);

            // Crear un párrafo con la fuente especificada
            Paragraph paragraph = new Paragraph("LISTA DE PAISES", font);
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);
            Font font1 = FontFactory.getFont(FontFactory.HELVETICA, 12, BaseColor.DARK_GRAY);
            // Añadir espaciado antes del párrafo
            Paragraph paragraph1 = new Paragraph(contenido, font1);
            paragraph1.setSpacingBefore(10);
            paragraph1.setAlignment(Element.ALIGN_LEFT);
            //AÑADO AL DOCUMENTO
            document.add(paragraph1);

            document.close();
            JOptionPane.showMessageDialog(null, "PDF generado correctamente.");
        } catch (DocumentException | IOException e) {
            JOptionPane.showMessageDialog(null, "Error al generar el PDF: " + e.getMessage());
        }
    }
    
    
    public void generarPDFDirecciones(String contenido) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("Listado de Direcciones.pdf"));
            document.open();
            document.setMargins(50, 50, 50, 50);
            document.setPageSize(PageSize.A4);

            Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14, BaseColor.BLUE);
            Paragraph paragraph = new Paragraph("LISTA DE DIRECCIONES", font);
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);

            Font font1 = FontFactory.getFont(FontFactory.HELVETICA, 12, BaseColor.DARK_GRAY);
            Paragraph paragraph1 = new Paragraph(contenido, font1);
            paragraph1.setSpacingBefore(10);
            paragraph1.setAlignment(Element.ALIGN_LEFT);
            document.add(paragraph1);

            document.close();
            JOptionPane.showMessageDialog(null, "PDF generado correctamente.");
        } catch (DocumentException | IOException e) {
            JOptionPane.showMessageDialog(null, "Error al generar el PDF: " + e.getMessage());
        }
    }
}

