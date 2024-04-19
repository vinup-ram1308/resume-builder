package com.company;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.util.List;
import java.util.ArrayList;
public class CV {
private JPanel cvPanel;
private JTextField name;
private JTextField address;
private JTextField contact;
private JTextField email;
private List<JCheckBox> technicalSkills;
private List<JCheckBox> softSkills;
private JTextField otherSkills;
private JComboBox work;
private JComboBox workExp;
private JTextField college;
private JTextField school;
private JTextField university;
private JButton SELECTIMAGEButton;
private JLabel img;
private JButton GENERATERESUMEButton;
private JTextField schoolQualification;
private JTextField collegeQualification;
private JTextField universityQualification;
private JTextField location = new JTextField();
JFrame frame = new JFrame();
public CV() {
	   cvPanel = new JPanel();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setContentPane(cvPanel);
frame.getContentPane().setBackground(new Color(238,238,238));
frame.setPreferredSize(new Dimension(850, 650));
cvPanel.setSize(new Dimension(1000, 700));
frame.setLocationRelativeTo(null);
frame.setVisible(true);
frame.setTitle("CV Form");

   cvPanel.setLayout(new GridLayout(0, 2));
   Font font = new Font("Cambria",Font.BOLD,15);

   JLabel nameLabel = new JLabel("Name:");
   nameLabel.setHorizontalAlignment(JLabel.CENTER);
   cvPanel.add(nameLabel);
   nameLabel.setFont(font);
   name = new JTextField();
//   name.setPreferredSize(new Dimension(200, 30));
   cvPanel.add(name);

   JLabel addressLabel = new JLabel("Address:");
   addressLabel.setHorizontalAlignment(JLabel.CENTER);
   cvPanel.add(addressLabel);
   addressLabel.setFont(font);
   address = new JTextField();
//   address.setPreferredSize(new Dimension(200, 30));
   cvPanel.add(address);

   JLabel contactLabel = new JLabel("Contact:");
   contactLabel.setHorizontalAlignment(JLabel.CENTER);
   cvPanel.add(contactLabel);
   contactLabel.setFont(font);
   contact = new JTextField();
   cvPanel.add(contact);

   JLabel emailLabel = new JLabel("Email:");
   emailLabel.setHorizontalAlignment(JLabel.CENTER);
   cvPanel.add(emailLabel);
   emailLabel.setFont(font);
   email = new JTextField();
   cvPanel.add(email);
   
   JPanel educationPanel = new JPanel(new GridLayout(3, 2));
   educationPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

   JLabel educationLabel = new JLabel("Education:");
   educationLabel.setHorizontalAlignment(JLabel.CENTER);
   cvPanel.add(educationLabel);
   educationLabel.setFont(font);
   
   JLabel schoolLabel = new JLabel("School:");
   schoolLabel.setHorizontalAlignment(JLabel.CENTER);
   educationPanel.add(schoolLabel);
   schoolLabel.setFont(font);
   school = new JTextField();
   educationPanel.add(school);

   JLabel schoolQualificationLabel = new JLabel("10th Grade Marks:");
   schoolQualificationLabel.setHorizontalAlignment(JLabel.CENTER);
   educationPanel.add(schoolQualificationLabel);
   schoolQualificationLabel.setFont(font);
   schoolQualification = new JTextField();
   educationPanel.add(schoolQualification);

   JLabel collegeLabel = new JLabel("College:");
   collegeLabel.setHorizontalAlignment(JLabel.CENTER);
   educationPanel.add(collegeLabel);
   collegeLabel.setFont(font);
   college = new JTextField();
   educationPanel.add(college);

   JLabel collegeQualificationLabel = new JLabel("12th Grade Marks:");
   collegeQualificationLabel.setHorizontalAlignment(JLabel.CENTER);
   educationPanel.add(collegeQualificationLabel);
   collegeQualificationLabel.setFont(font);
   collegeQualification = new JTextField();
   educationPanel.add(collegeQualification);
   
   JLabel universityLabel = new JLabel("University:");
   universityLabel.setHorizontalAlignment(JLabel.CENTER);
   educationPanel.add(universityLabel);
   universityLabel.setFont(font);
   university = new JTextField();
   educationPanel.add(university);

   JLabel universityQualificationLabel = new JLabel("Qualification:");
   universityQualificationLabel.setHorizontalAlignment(JLabel.CENTER);
   educationPanel.add(universityQualificationLabel);
   universityQualificationLabel.setFont(font);
   universityQualification = new JTextField();
   educationPanel.add(universityQualification);

   cvPanel.add(educationPanel);

   JLabel technicalSkillsLabel = new JLabel("Technical Skills:");
   technicalSkillsLabel.setHorizontalAlignment(JLabel.CENTER);
   cvPanel.add(technicalSkillsLabel);
   technicalSkillsLabel.setFont(font);
   JPanel technicalSkillsPanel = new JPanel(new GridLayout(2,3));
   technicalSkillsPanel.setBorder(BorderFactory.createTitledBorder("You can select multiple technical skills"));
   technicalSkills = new ArrayList<>();
   String[] technicalSkillsArray = {"Java", "Python", "C++", "JavaScript", "React", "Angular"};
   for (String skill : technicalSkillsArray) {
       JCheckBox checkBox = new JCheckBox(skill);
       technicalSkillsPanel.add(checkBox);
       technicalSkills.add(checkBox); 
   }
   cvPanel.add(technicalSkillsPanel);

   JLabel softSkillsLabel = new JLabel("Soft Skills:");
   softSkillsLabel.setHorizontalAlignment(JLabel.CENTER);
   cvPanel.add(softSkillsLabel);
   softSkillsLabel.setFont(font);
   JPanel softSkillsPanel = new JPanel(new GridLayout(2,3));
   softSkillsPanel.setBorder(BorderFactory.createTitledBorder("You can select multiple soft skills"));
   softSkills = new ArrayList<>();
   String[] softSkillsArray = {"Communication", "Leadership", "Teamwork", "Problem Solving", "Adaptability", "Time Management"};
   for (String skill : softSkillsArray) {
       JCheckBox checkBox = new JCheckBox(skill);
       softSkillsPanel.add(checkBox);
       softSkills.add(checkBox);
   }
   cvPanel.add(softSkillsPanel);

   JLabel otherSkillsLabel = new JLabel("Other Skills:");
   otherSkillsLabel.setHorizontalAlignment(JLabel.CENTER);
   cvPanel.add(otherSkillsLabel);
   otherSkillsLabel.setFont(font);
   otherSkills = new JTextField();
   cvPanel.add(otherSkills);
   
   JLabel workexpLabel = new JLabel("Work Experience:");
   workexpLabel.setHorizontalAlignment(JLabel.CENTER);
   cvPanel.add(workexpLabel);
   workexpLabel.setFont(font);
   workExp = new JComboBox();
   workExp.addItem("<1 years");
   workExp.addItem("1-5 years");
   workExp.addItem(">5 years");
   workExp.addItem("Fresher");
   cvPanel.add(workExp);

   JLabel workLabel = new JLabel("Work:");
   workLabel.setHorizontalAlignment(JLabel.CENTER);
   cvPanel.add(workLabel);
   workLabel.setFont(font);
   work = new JComboBox();
   work.addItem("Full-time");
   work.addItem("Part-time");
   work.addItem("Freelance");
   cvPanel.add(work);
   
   SELECTIMAGEButton = new JButton("SELECT IMAGE");
   cvPanel.add(SELECTIMAGEButton);
   SELECTIMAGEButton.setPreferredSize(new Dimension(200, 30));
   frame.pack();
SELECTIMAGEButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
JFileChooser fileChooser = new JFileChooser();
FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE","jpg","png");
fileChooser.addChoosableFileFilter(filter);
int rs = fileChooser.showSaveDialog(null);
if(rs==JFileChooser.APPROVE_OPTION){
File selectedImage = fileChooser.getSelectedFile();
location.setText(selectedImage.getAbsolutePath());
ImageIcon icon = new ImageIcon(selectedImage.getAbsolutePath());
img.setIcon(icon);
img.setIcon(resize(location.getText()));
}
}
});
img = new JLabel();
   cvPanel.add(img);
   GENERATERESUMEButton = new JButton("GENERATE RESUME");
   cvPanel.add(GENERATERESUMEButton);
   frame.pack();
GENERATERESUMEButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
	if(name.getText()==null||contact.getText()==null||address.getText()==null||email.getText()==null){
//  System.out.println("One or more required fields are empty.");
  JOptionPane.showMessageDialog(null,"PLEASE ENTER ALL DETAILS TO GENERATE CV");
}else{
try {
String nameOfFile = "C:\\Users\\savin\\OneDrive\\Documents\\Resume.pdf";
Document myDocument = new Document();
PdfWriter.getInstance(myDocument, new FileOutputStream(nameOfFile));
myDocument.open();
com.itextpdf.text.Image img = com.itextpdf.text.Image.getInstance(location.getText());
img.setAbsolutePosition(473f, 750f);
img.scaleAbsolute(80f,70f);
PdfPTable table = new PdfPTable(2);
myDocument.add(img);
myDocument.add(new Paragraph(name.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,32, com.itextpdf.text.Font.BOLD,BaseColor.DARK_GRAY )));
myDocument.add(new Paragraph("",FontFactory.getFont(FontFactory.TIMES_BOLD,9,BaseColor.DARK_GRAY)));
myDocument.add(new Paragraph("",FontFactory.getFont(FontFactory.TIMES_BOLD,9, BaseColor.DARK_GRAY)));
myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
myDocument.add(new Paragraph("CONTACT DETAILS",FontFactory.getFont(FontFactory.TIMES_BOLD,9, com.itextpdf.text.Font.BOLD,BaseColor.DARK_GRAY )));
myDocument.add(new Paragraph(email.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,8,BaseColor.DARK_GRAY )));
myDocument.add(new Paragraph(contact.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,8,BaseColor.DARK_GRAY )));
myDocument.add(new Paragraph(address.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,8, BaseColor.DARK_GRAY )));
myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
PdfPTable educationTable = new PdfPTable(2);
educationTable.setWidthPercentage(100);

myDocument.add(new Paragraph("EDUCATION",FontFactory.getFont(FontFactory.TIMES_BOLD,10, com.itextpdf.text.Font.BOLD,BaseColor.DARK_GRAY )));
PdfPCell schoolCell = new PdfPCell(new Phrase("School: " + school.getText(), FontFactory.getFont(FontFactory.TIMES, 9, BaseColor.BLACK)));
schoolCell.setBorder(Rectangle.NO_BORDER);
educationTable.addCell(schoolCell);

PdfPCell schoolQualificationCell = new PdfPCell(new Phrase("10th Grade Marks(in %): " + schoolQualification.getText(), FontFactory.getFont(FontFactory.TIMES, 9, BaseColor.BLACK)));
schoolQualificationCell.setBorder(Rectangle.NO_BORDER);
educationTable.addCell(schoolQualificationCell);

PdfPCell collegeCell = new PdfPCell(new Phrase("College: " + college.getText(), FontFactory.getFont(FontFactory.TIMES, 9, BaseColor.BLACK)));
collegeCell.setBorder(Rectangle.NO_BORDER);
educationTable.addCell(collegeCell);

PdfPCell collegeQualificationCell = new PdfPCell(new Phrase("12th Grade Marks(in %): " + collegeQualification.getText(), FontFactory.getFont(FontFactory.TIMES, 9, BaseColor.BLACK)));
collegeQualificationCell.setBorder(Rectangle.NO_BORDER);
educationTable.addCell(collegeQualificationCell);

PdfPCell degreeCell = new PdfPCell(new Phrase("University: " + university.getText(), FontFactory.getFont(FontFactory.TIMES, 9, BaseColor.BLACK)));
degreeCell.setBorder(Rectangle.NO_BORDER);
educationTable.addCell(degreeCell);

PdfPCell degreeQualificationCell = new PdfPCell(new Phrase("Qualification: " + universityQualification.getText(), FontFactory.getFont(FontFactory.TIMES, 9, BaseColor.BLACK)));
degreeQualificationCell.setBorder(Rectangle.NO_BORDER);
educationTable.addCell(degreeQualificationCell);

myDocument.add(educationTable);

myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
myDocument.add(new Paragraph("SKILLS",FontFactory.getFont(FontFactory.TIMES_BOLD,9, com.itextpdf.text.Font.BOLD,BaseColor.DARK_GRAY )));
PdfPTable skillsTable = new PdfPTable(1);
skillsTable.setWidthPercentage(100);
PdfPCell technicalCell = new PdfPCell(new Phrase("Technical Skills", FontFactory.getFont(FontFactory.TIMES_BOLD, 9, BaseColor.BLACK)));
technicalCell.setBorder(Rectangle.NO_BORDER);
skillsTable.addCell(technicalCell);

PdfPTable skillsTable1 = new PdfPTable(1);
skillsTable1.setWidthPercentage(100);

PdfPCell technicalCell1 = new PdfPCell(new Phrase("Technical Skills", FontFactory.getFont(FontFactory.TIMES_BOLD, 9, BaseColor.BLACK)));
technicalCell1.setBorder(Rectangle.NO_BORDER);
skillsTable1.addCell(technicalCell1);

PdfPTable technicalSkillsTable = new PdfPTable(1);
technicalSkillsTable.setWidthPercentage(100);
for (JCheckBox checkBox : technicalSkills) {
    if (checkBox.isSelected()) {
        PdfPCell cell = new PdfPCell(new Phrase(checkBox.getText(), FontFactory.getFont(FontFactory.TIMES, 8, BaseColor.BLACK)));
        cell.setBorder(Rectangle.NO_BORDER);
        technicalSkillsTable.addCell(cell);
    }
}

skillsTable1.addCell(technicalSkillsTable);

PdfPCell softCell = new PdfPCell(new Phrase("Soft Skills", FontFactory.getFont(FontFactory.TIMES_BOLD, 9, BaseColor.BLACK)));
softCell.setBorder(Rectangle.NO_BORDER);
skillsTable1.addCell(softCell);

PdfPTable softSkillsTable = new PdfPTable(1);
softSkillsTable.setWidthPercentage(100);
for (JCheckBox checkBox : softSkills) {
    if (checkBox.isSelected()) {
        PdfPCell cell = new PdfPCell(new Phrase(checkBox.getText(), FontFactory.getFont(FontFactory.TIMES, 8, BaseColor.BLACK)));
        cell.setBorder(Rectangle.NO_BORDER);
        softSkillsTable.addCell(cell);
    }
}

skillsTable1.addCell(softSkillsTable);

myDocument.add(skillsTable1);

if (!otherSkills.getText().isEmpty()) {
    myDocument.add(new Paragraph("Other Skills: " + otherSkills.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 9, BaseColor.BLACK)));
}
myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
PdfPTable workExpTable = new PdfPTable(1);
workExpTable.setWidthPercentage(100);

//PdfPCell workExpCell = new PdfPCell(new Phrase("WORK EXPERIENCE: " + workExp.getSelectedItem().toString(), FontFactory.getFont(FontFactory.TIMES_BOLD, 9, BaseColor.BLACK)));
myDocument.add(new Paragraph("WORK EXPERIENCE",FontFactory.getFont(FontFactory.TIMES_BOLD,9, com.itextpdf.text.Font.BOLD,BaseColor.DARK_GRAY )));
myDocument.add(new Paragraph(""+workExp.getSelectedItem(),FontFactory.getFont(FontFactory.TIMES_BOLD,8,BaseColor.DARK_GRAY)));
//workExpCell.setBorder(Rectangle.NO_BORDER);
//workExpTable.addCell(workExpCell);
myDocument.add(workExpTable);
myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
myDocument.add(new Paragraph("PREFERRED WORK",FontFactory.getFont(FontFactory.TIMES_BOLD,10, com.itextpdf.text.Font.BOLD,BaseColor.DARK_GRAY )));
myDocument.add(new Paragraph(""+work.getSelectedItem(),FontFactory.getFont(FontFactory.TIMES_BOLD,8,BaseColor.DARK_GRAY)));
myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
myDocument.add(new Paragraph("REFERENCES",FontFactory.getFont(FontFactory.TIMES_BOLD,9, com.itextpdf.text.Font.BOLD,BaseColor.DARK_GRAY )));
myDocument.add(new Paragraph("Available upon request",FontFactory.getFont(FontFactory.TIMES_BOLD,8,BaseColor.DARK_GRAY )));
myDocument.close();
JOptionPane.showMessageDialog(null,"CV was successfully generated");
}
catch(Exception ex){
JOptionPane.showMessageDialog(null,ex);
}
}
}
});
}
public ImageIcon resize(String path){
ImageIcon myImg = new ImageIcon(path);
Image image = myImg.getImage();
Image newImage = image.getScaledInstance(200,200,Image.SCALE_SMOOTH);
ImageIcon finalImage = new ImageIcon(newImage);
return finalImage;
}
}