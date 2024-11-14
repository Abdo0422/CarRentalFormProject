# Car Rental Form Project

## Overview

This project allows users to submit car rental details through a web form. After submission, a PDF with the rental information is generated using a Java Servlet and the **iText** library.

## Features

- **User Input**: Collects name, email, car model, and rental duration.
- **PDF Generation**: Generates a PDF with the user's details upon form submission.
- **Responsive Design**: Clean and modern form with smooth CSS.

## Technologies

- **Java** (backend)
- **Apache Tomcat** (web server)
- **iText** (PDF generation)
- **HTML/CSS** (frontend)

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/Abdo0422/CarRentalFormProject.git
2. Set up Apache Tomcat and deploy the web app.
3. Add iText library to your project.

## Running the App

1. Start Apache Tomcat.
2. Visit http://localhost:8008/CarRentalPDFProject/ in your browser.

## Usage

1. Fill out the car rental form.
2. Submit to generate and download the PDF with your rental details.

## Project Structure

- **index.jsp** : HTML form.
- **CarRentalServlet.java** : Processes form and generates PDF.
- **WEB-INF/** : Servlet configuration.

## License

MIT License. See LICENSE file for details.

## Contributing

Feel free to fork and submit pull requests!

## Acknowledgments

Thanks to iText for PDF generation.
This version is more concise but retains all the essential information.

