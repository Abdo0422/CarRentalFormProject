package com.servlet;

import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

@WebServlet("/CarRentalServlet")
public class CarRentalServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String carModel = request.getParameter("carModel");
        String rentalDays = request.getParameter("rentalDays");

        // Set up the response for a PDF file
        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "attachment; filename=CarRentalConfirmation.pdf");

        try (OutputStream out = response.getOutputStream()) {
            // Create a new PDF document
            Document document = new Document();
            PdfWriter.getInstance(document, out);

            // Open the document and add content
            document.open();

            // Title Section
            document.add(new Paragraph("Car Rental Confirmation", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18)));
            document.add(new Paragraph("--------------------------------------------------"));
            document.add(Chunk.NEWLINE);

            // Customer Information Section
            document.add(new Paragraph("Customer Information:", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14)));
            document.add(new Paragraph("Name: " + name));
            document.add(new Paragraph("Email: " + email));
            document.add(Chunk.NEWLINE);

            // Rental Details Section
            document.add(new Paragraph("Rental Details:", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14)));
            document.add(new Paragraph("Car Model: " + carModel));
            document.add(new Paragraph("Rental Duration: " + rentalDays + " days"));
            document.add(Chunk.NEWLINE);

            // Summary Section
            document.add(new Paragraph("Summary:", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14)));
            document.add(new Paragraph("Thank you for choosing our car rental service. Your reservation has been confirmed."));
            document.add(Chunk.NEWLINE);

            // Footer
            document.add(new Paragraph("--------------------------------------------------"));
            document.add(new Paragraph("For any inquiries, please contact us at support@carrental.com"));
            document.add(new Paragraph("Phone: 123-456-7890"));

            // Close the document
            document.close();
        } catch (DocumentException e) {
            e.printStackTrace();
            response.getWriter().println("Error generating PDF: " + e.getMessage());
        }
    }
}
