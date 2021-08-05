package Proyecto;

import Getter_and_Setter.Datos;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author LEANDRO
 */
public class Comprobante {

    String nombre;
    String apellido;
    String fecha;
    String rutaimagen;
    ArrayList<Datos> productos;

    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;

    public Comprobante(String nombre, String apellido, String fecha, ArrayList<Datos> productos, String rutaimagen) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.productos = productos;
        this.rutaimagen = rutaimagen;

        documento = new Document();
        titulo = new Paragraph("Comprobante de Pago Punto de Venta");
    }

    public void crearReporte() {
        try {
            archivo = new FileOutputStream(nombre + apellido + "Comprobante" + ".pdf");
            PdfWriter.getInstance(documento, archivo);

            documento.open();
            titulo.setAlignment(1);

            Image imagen = null;
            try {
                imagen = Image.getInstance("src\\Imagenes\\comprobante.png");
                imagen.scaleAbsolute(140, 100);
                imagen.setAbsolutePosition(415, 750);

            } catch (Exception e) {
            }

            documento.add(imagen);
            documento.add(titulo);
            documento.add(new Paragraph("Nombre Cliente: " + nombre));
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Apellido Cliente: " + apellido));
            documento.add(Chunk.NEWLINE);

            Paragraph texto = new Paragraph("Cliente Frecuente");
            texto.setAlignment(Element.ALIGN_JUSTIFIED);
            documento.add(texto);
            documento.add(Chunk.NEWLINE);

            PdfPTable tabla = new PdfPTable(4);
            tabla.setWidthPercentage(100);

            PdfPCell producto = new PdfPCell(new Phrase("Producto"));
            producto.setBackgroundColor(BaseColor.LIGHT_GRAY);
            PdfPCell cantidad = new PdfPCell(new Phrase("Cantidad"));
            cantidad.setBackgroundColor(BaseColor.LIGHT_GRAY);
            PdfPCell precioUnitario = new PdfPCell(new Phrase("Precio Unitario"));
            precioUnitario.setBackgroundColor(BaseColor.LIGHT_GRAY);
            PdfPCell precioTotal = new PdfPCell(new Phrase("Precio Total"));
            precioTotal.setBackgroundColor(BaseColor.LIGHT_GRAY);

            tabla.addCell(producto);
            tabla.addCell(cantidad);
            tabla.addCell(precioUnitario);
            tabla.addCell(precioTotal);

            for (Datos i : productos) {
                tabla.addCell(i.getProductos());
                tabla.addCell(i.getCantidad() + "");
                tabla.addCell(i.getPreciounitario() + "");
                tabla.addCell(i.getPreciototal() + "");

            }

            documento.add(tabla);
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Fecha" + fecha));

            documento.close();

            JOptionPane.showMessageDialog(null, "Reporte Creado Correctamente");

        } catch (Exception e) {
        }
    }

}
