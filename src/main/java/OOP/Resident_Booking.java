/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package OOP;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.JOptionPane;

/**
 *
 * @author Justin Yong
 */
public class Resident_Booking extends javax.swing.JFrame {

    /**
     * Creates new form Booking_New
     */
    public Resident_Booking() {
        initComponents();
        addFocusListenerToCheckInDateTextField();
        setLocationRelativeTo(null);
    }

    private void addFocusListenerToCheckInDateTextField() {
        CheckInDateTextField.setText("YYYY-MM-DD");
        CheckInDateTextField.setForeground(Color.GRAY);

        CheckInDateTextField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (CheckInDateTextField.getText().equals("YYYY-MM-DD")) {
                    CheckInDateTextField.setText("");
                    CheckInDateTextField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (CheckInDateTextField.getText().isEmpty()) {
                    CheckInDateTextField.setText("YYYY-MM-DD");
                    CheckInDateTextField.setForeground(Color.GRAY);
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Description = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DaysTextField = new javax.swing.JTextField();
        CheckInDateTextField = new javax.swing.JTextField();
        PersonTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CleaningServiceCheckBox = new javax.swing.JCheckBox();
        FoodAndDrinkServiceCheckBox = new javax.swing.JCheckBox();
        LaundryServiceCheckBox = new javax.swing.JCheckBox();
        Book = new javax.swing.JButton();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Room Booking Menu");

        Description.setText("Description");
        Description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescriptionActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Days: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Check in date:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Person:");

        DaysTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DaysTextFieldActionPerformed(evt);
            }
        });

        CheckInDateTextField.setToolTipText("");
        CheckInDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckInDateTextFieldActionPerformed(evt);
            }
        });

        PersonTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Additional Service:");

        CleaningServiceCheckBox.setText("Cleaning Service");
        CleaningServiceCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleaningServiceCheckBoxActionPerformed(evt);
            }
        });

        FoodAndDrinkServiceCheckBox.setText("Food and Drink Service");
        FoodAndDrinkServiceCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodAndDrinkServiceCheckBoxActionPerformed(evt);
            }
        });

        LaundryServiceCheckBox.setText("Laundry Service");
        LaundryServiceCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaundryServiceCheckBoxActionPerformed(evt);
            }
        });

        Book.setText("Book");
        Book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(Description))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(CleaningServiceCheckBox)
                            .addComponent(FoodAndDrinkServiceCheckBox)
                            .addComponent(LaundryServiceCheckBox)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(116, 116, 116)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CheckInDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DaysTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                    .addGap(28, 28, 28)
                                    .addComponent(PersonTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(Book)
                                    .addGap(18, 18, 18)
                                    .addComponent(Exit))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(132, 132, 132))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Description)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(DaysTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CheckInDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(PersonTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(CleaningServiceCheckBox)
                .addGap(23, 23, 23)
                .addComponent(FoodAndDrinkServiceCheckBox)
                .addGap(26, 26, 26)
                .addComponent(LaundryServiceCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Book)
                    .addComponent(Exit))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LaundryServiceCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaundryServiceCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LaundryServiceCheckBoxActionPerformed

    private void DaysTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DaysTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DaysTextFieldActionPerformed

    private void CheckInDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckInDateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckInDateTextFieldActionPerformed

    private void PersonTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PersonTextFieldActionPerformed

    private void DescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescriptionActionPerformed
        // TODO add your handling code here:
        javax.swing.JOptionPane.showMessageDialog(this,
            "Note:\n" +
            "1) Every room only has enough capacity to hold 1 person.\n" +
            "2) The price for a single room is RM 50 per day.\n" +
            "3) Check in and chek out time is 2PM.\n" +
            "4) Every resident is required to check in in\n" +
            "   APU hostel within 1 hour \n" +
            "   if not will cancel your booking.\n" +
            "Additional services:\n" +
            "1) Cleaning Service\n" +
            "2) Food and Drink Service\n" +
            "3) Laundry Service"
        );
    }//GEN-LAST:event_DescriptionActionPerformed

    private void CleaningServiceCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleaningServiceCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CleaningServiceCheckBoxActionPerformed

    private void FoodAndDrinkServiceCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodAndDrinkServiceCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FoodAndDrinkServiceCheckBoxActionPerformed

    private void BookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookActionPerformed
        // TODO add your handling code here:
        try {
            // Read rates from rates.txt
            Map<String, Double> rates = new HashMap<>();
            try (BufferedReader ratesReader = new BufferedReader(new FileReader("src/main/java/OOP/rates.txt"))) {
                String line;
                while ((line = ratesReader.readLine()) != null) {
                    String[] parts = line.split(", ");
                    if (parts.length == 2) {
                        rates.put(parts[0].trim(), Double.parseDouble(parts[1].trim()));
                    }
                }
            } catch (IOException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error reading rates file", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
        
            double basePrice = rates.get("Room per Day");
            double cleaningServiceRate = rates.get("Cleaning Service");
            double foodAndDrinkServiceRate = rates.get("Food and Drink Service");
            double laundryServiceRate = rates.get("Laundry Service");
            double taxRate = rates.get("Service Tax");
        
            int daysValue = Integer.parseInt(DaysTextField.getText());
            if (daysValue <= 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Days cannot be 0 or less", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            int personValue = Integer.parseInt(PersonTextField.getText());
            if (personValue <= 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Person cannot be 0 or less", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }else if (personValue > 20){
                javax.swing.JOptionPane.showMessageDialog(this, "Person cannot more than 20", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
            
        
            UserSession session = UserSession.getInstance();
            String userID = session.getUserID();
            String checkInDate = CheckInDateTextField.getText();

            // Validate check-in date
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate checkInLocalDate;
            try {
                checkInLocalDate = LocalDate.parse(checkInDate, formatter);
            } catch (DateTimeParseException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Invalid date format. Please use yyyy-MM-dd.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Check if the date is valid
            if (!checkInDate.equals(checkInLocalDate.format(formatter))) {
                javax.swing.JOptionPane.showMessageDialog(this, "Invalid date. Please enter a valid date.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
    
            if (checkInLocalDate.isBefore(LocalDate.now())) {
                javax.swing.JOptionPane.showMessageDialog(this, "Check-in date cannot be in the past.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            boolean cleaningService = CleaningServiceCheckBox.isSelected();
            boolean foodAndDrinkService = FoodAndDrinkServiceCheckBox.isSelected();
            boolean laundryService = LaundryServiceCheckBox.isSelected();
            double price = basePrice * daysValue * personValue;
        
            if (cleaningService) {
                price += cleaningServiceRate * daysValue * personValue;
            }
            if (foodAndDrinkService) {
                price += foodAndDrinkServiceRate  * daysValue * personValue;
            }
            if (laundryService) {
                price += laundryServiceRate * daysValue * personValue;
            }
            
            double total = price *  (1 + taxRate);

            
        
            String bookingId;
            try {
                bookingId = generateBookingId();
            } catch (IOException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error generating booking ID", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            // Read available rooms from room.txt
            List<String> availableRooms = new ArrayList<>();
            try (BufferedReader roomReader = new BufferedReader(new FileReader("src/main/java/OOP/room.txt"))) {
                String line;
                while ((line = roomReader.readLine()) != null) {
                    String[] parts = line.split(", ");
                    if (parts.length == 2 && "available".equalsIgnoreCase(parts[1].trim())) {
                        availableRooms.add(parts[0].trim());
                    }
                }
            } catch (IOException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error reading room file", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
    
            if (availableRooms.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "No rooms available.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
    
            // Check room availability for the entire stay duration
            Map<LocalDate, Set<Integer>> roomAvailability = new HashMap<>();
            for (int i = 0; i < daysValue; i++) {
                LocalDate date = checkInLocalDate.plusDays(i);
                roomAvailability.put(date, new HashSet<>());
            }
    
            try (BufferedReader roomAvailabilityReader = new BufferedReader(new FileReader("src/main/java/OOP/room_availability.txt"))) {
                String line;
                while ((line = roomAvailabilityReader.readLine()) != null) {
                    String[] parts = line.split(", ");
                    LocalDate date = LocalDate.parse(parts[0], formatter);
                    int roomNumber = Integer.parseInt(parts[1]);
                    if (roomAvailability.containsKey(date)) {
                        roomAvailability.get(date).add(roomNumber);
                    }
                }
            } catch (IOException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error reading room availability file", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
    
            // Check if there are enough rooms available for each day
            StringBuilder errorMessage = new StringBuilder();
            boolean roomsAvailable = true;
            for (Map.Entry<LocalDate, Set<Integer>> entry : roomAvailability.entrySet()) {
                Set<Integer> bookedRooms = entry.getValue();
                int availableRoomsCount = availableRooms.size() - bookedRooms.size();
                if (availableRoomsCount < personValue) {
                    roomsAvailable = false;
                    errorMessage.append(entry.getKey().toString()).append(" only has ").append(availableRoomsCount).append(" rooms available.\n");
                }
            }
    
            if (!roomsAvailable) {
                JOptionPane.showMessageDialog(this, errorMessage.toString(), "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
    
            // Randomly choose the available rooms based on the number of persons
            List<String> chosenRooms = new ArrayList<>();
            for (int i = 0; i < personValue; i++) {
                boolean roomAssigned = false;
                for (String room : availableRooms) {
                    boolean isRoomAvailable = true;
                    for (int j = 0; j < daysValue; j++) {
                        LocalDate date = checkInLocalDate.plusDays(j);
                        Set<Integer> bookedRooms = roomAvailability.get(date);
                        if (bookedRooms.contains(Integer.parseInt(room))) {
                            isRoomAvailable = false;
                            break;
                        }
                    }
                    if (isRoomAvailable) {
                        chosenRooms.add(room);
                        availableRooms.remove(room);
                        roomAssigned = true;
                        break;
                    }
                }
                if (!roomAssigned) {
                    JOptionPane.showMessageDialog(this, "Not enough rooms available.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            LocalDateTime bookingDate = LocalDateTime.now(); // Replace with actual booking date
            String datebook = bookingDate.toLocalDate().toString();
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String time = bookingDate.toLocalTime().format(timeFormatter);
            String data = bookingId + ", " + datebook + ", " + time + ", " + userID + ", " + checkInDate + ", " + daysValue + ", " + personValue + ", " + cleaningService + ", " + foodAndDrinkService + ", " + laundryService + ", " + total + ", " + "false" + ", " + "confirmed" + ", " + "unpaid" + ", " + chosenRooms;

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/java/OOP/booking.txt", true))) {
                writer.write(data + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Write to room_availability.txt for the entire stay duration
            try (BufferedWriter roomWriter = new BufferedWriter(new FileWriter("src/main/java/OOP/room_availability.txt", true))) {
                for (String chosenRoom : chosenRooms) {
                    for (int i = 0; i < daysValue; i++) {
                        LocalDate date = checkInLocalDate.plusDays(i);
                        roomWriter.write(date + ", " + chosenRoom + ", " + bookingId + "\n");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            JOptionPane.showMessageDialog(this, "Booking successful!\r\nYour Room Number is: " + chosenRooms);
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Invalid number format", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_BookActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        Resident re = new Resident();
        re.setVisible(true);
        this. dispose();
    }//GEN-LAST:event_ExitActionPerformed

    public static String generateBookingId() throws IOException {
        String filePath = "src/main/java/OOP/booking.txt";
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
    
        int count = 0;
        while (reader.readLine() != null) {
            count++;
        }
        reader.close();
    
        String prefix = "B";
        String newBookingId = prefix + String.format("%02d", count + 1);
    
        return newBookingId;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Resident_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resident_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resident_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resident_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resident_Booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Book;
    private javax.swing.JTextField CheckInDateTextField;
    private javax.swing.JCheckBox CleaningServiceCheckBox;
    private javax.swing.JTextField DaysTextField;
    private javax.swing.JButton Description;
    private javax.swing.JButton Exit;
    private javax.swing.JCheckBox FoodAndDrinkServiceCheckBox;
    private javax.swing.JCheckBox LaundryServiceCheckBox;
    private javax.swing.JTextField PersonTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
