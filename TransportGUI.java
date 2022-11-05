//improting used pacakage
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.List;

public class TransportGUI {
    // creating instance variable
    private JFrame frame1;
    private JFrame frame2;
    private JFrame frame3;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;

    private JButton embarkBtn, embarkBtn1, addAutoRickshawBtn, bookAutoRickshawBtn, backBtn, displayBtn, clearBtn,
            addElectricScooterBtn, purchaseScooterBtn, sellScooterBtn, back1Btn, displayBtn1, clear1Btn;
    private JLabel title, titleAuto, titleAuto1, titleAuto2, titleElectric, vehicleID, vehicleColor, torque,
            vehicleName, vehicleSpeed, fuelTankCapacity, vehicleWeight, engineDisplacement, groundClearance, vehicleId1,
            noOfSeats, chargeAmount, vehicleID2, vehicleWeight1, vehicleName1, vehicleColor1, vehicleSpeed1,
            batteryCapacity1, vehicleID5, mileage, chargingTime, brand, range, costPrice, vehicleID4, sellingPrice,
            bookDate;
    private JTextField vehicleIDtf, vehicleColortf, torquetf, vehicleNametf, vehicleSpeedtf, fuelTankCapacitytf,
            vehicleWeighttf, engineDisplacementtf, groundClearancetf, vehicleIdtf1, noOfSeatstf, chargeAmounttf,
            vehicleNametf1, vehicleIDtf2, vehicleWeighttf1, vehicleColortf1, vehicleSpeedtf1, batteryCapacitytf1,
            vehicleIDtf5, mileagetf, chargingTimetf, brandtf, rangetf, costPricetf, vehicleIDtf4, sellingPricetf;

    private JComboBox year, month, day;

    ArrayList<Vehicle> list = new ArrayList<Vehicle>();

    // creating constructer
    public TransportGUI() {
        // JFrame for TransportGUI
        frame1 = new JFrame("TransportGUI");// sets title of frame
        frame1.setSize(600, 500); // sets the x-dimension, and y-dimension of frame
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit out of application
        frame1.getContentPane().setBackground(new Color(204, 204, 204)); // change color of background
        frame1.setLayout(null);
        frame1.setLocationRelativeTo(null);

        // Title for frame 1
        Font titleFont = new Font(Font.SANS_SERIF, Font.BOLD, 20);// Creating Object
        title = new JLabel("'Booking system of vehicle'");
        title.setForeground(Color.red);
        title.setFont(titleFont);
        title.setBounds(165, 20, 300, 100);
        frame1.add(title);

        // Title for Auto Rickshaw
        titleAuto = new JLabel("Auto Rickshaw");
        titleAuto.setFont(titleFont);
        titleAuto.setBounds(205, 120, 300, 30);
        frame1.add(titleAuto);

        // Title for Electric Scooter
        titleElectric = new JLabel("Electric Scooter");
        titleElectric.setFont(titleFont);
        titleElectric.setBounds(200, 220, 200, 100);
        frame1.add(titleElectric);

        // Creating Button For Auto Rickshaw
        embarkBtn = new JButton("Embark Me A");
        embarkBtn.setBounds(200, 150, 150, 30);
        embarkBtn.setFocusPainted(false);
        embarkBtn.setBackground(new Color(255, 0, 0));
        embarkBtn.setForeground(new Color(255, 255, 255));// change button text color
        embarkBtn.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        frame1.add(embarkBtn);

        // Creating Button For Electric Scooter
        embarkBtn1 = new JButton("Embark Me E");
        embarkBtn1.setBounds(200, 285, 150, 30);
        embarkBtn1.setFocusPainted(false);
        embarkBtn1.setBackground(new Color(255, 0, 0));
        embarkBtn1.setForeground(new Color(255, 255, 255));// change button text color
        embarkBtn1.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        frame1.add(embarkBtn1);

        frame1.setVisible(true);

        // Creating Frame 2
        frame2 = new JFrame("AutoRickshaw");
        frame2.setBounds(100, 20, 1100, 800);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit out of application
        frame2.getContentPane().setBackground(new Color(204, 204, 204)); // change color of background
        frame2.setLayout(null);
        frame2.setLocationRelativeTo(null);

        // Title for AutoRickshaw
        titleAuto1 = new JLabel("Enter the details of AutoRickshaw");
        titleAuto1.setForeground(Color.red);
        titleAuto1.setFont(titleFont);
        titleAuto1.setBounds(380, 10, 900, 100);
        frame2.add(titleAuto1);

        // Creating Panel 1
        panel1 = new JPanel();
        panel1.setBounds(15, 100, 1060, 235);
        panel1.setBackground(new Color(102, 255, 102));
        TitledBorder addAutoTitle = BorderFactory.createTitledBorder("Add an AutoRickshaw");
        addAutoTitle.setTitleJustification(TitledBorder.CENTER);
        addAutoTitle.setTitleFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
        addAutoTitle.setTitleColor(Color.red);
        addAutoTitle.setBorder(BorderFactory.createLineBorder(Color.RED));
        panel1.setBorder(addAutoTitle);
        frame2.add(panel1);
        panel1.setLayout(null);

        // Adding on Panel 1
        // Jlabel for vehicle
        vehicleName = new JLabel("Vehicle Name");
        panel1.add(vehicleName);
        vehicleName.setBounds(20, 40, 200, 20);

        // Input field of name
        vehicleNametf = new JTextField();
        vehicleNametf.setBounds(150, 40, 100, 30);
        vehicleNametf.setBackground(new Color(221, 255, 255));
        vehicleNametf.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 2, Color.black));
        panel1.add(vehicleNametf);

        // JLabel for vehicle id
        vehicleID = new JLabel("Vehicle Id");
        panel1.add(vehicleID);
        vehicleID.setBounds(20, 80, 200, 20);

        // Input field of vehicle id
        vehicleIDtf = new JTextField();
        vehicleIDtf.setBounds(150, 80, 100, 30);
        vehicleIDtf.setBackground(new Color(221, 255, 255));
        vehicleIDtf.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 2, Color.black));
        panel1.add(vehicleIDtf);

        // JLabel for vehicle weight
        vehicleWeight = new JLabel("Vechile Weight");
        panel1.add(vehicleWeight);
        vehicleWeight.setBounds(20, 120, 200, 20);

        // Input field of vehicle weight
        vehicleWeighttf = new JTextField();
        vehicleWeighttf.setBounds(150, 120, 100, 30);
        vehicleWeighttf.setBackground(new Color(221, 255, 255));
        vehicleWeighttf.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 2, Color.black));
        panel1.add(vehicleWeighttf);

        // JLabel for vehicle Color
        vehicleColor = new JLabel("Vehicle Color");
        panel1.add(vehicleColor);
        vehicleColor.setBounds(800, 40, 200, 20);

        // Input field of vehicle weight
        vehicleColortf = new JTextField();
        vehicleColortf.setBounds(950, 40, 100, 30);
        vehicleColortf.setBackground(new Color(221, 255, 255));
        vehicleColortf.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 2, Color.black));
        panel1.add(vehicleColortf);

        // JLabel for Torque
        torque = new JLabel("Torque");
        panel1.add(torque);
        torque.setBounds(800, 80, 200, 20);

        // Input field of torque
        torquetf = new JTextField();
        torquetf.setBounds(950, 80, 100, 30);
        torquetf.setBackground(new Color(221, 255, 255));
        torquetf.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 2, Color.black));
        panel1.add(torquetf);

        // JLabel for Engine displacement
        engineDisplacement = new JLabel("Engine Displacement");
        panel1.add(engineDisplacement);
        engineDisplacement.setBounds(400, 120, 340, 20);

        // Input field of engine Displscement
        engineDisplacementtf = new JTextField();
        engineDisplacementtf.setBounds(540, 120, 100, 30);
        engineDisplacementtf.setBackground(new Color(221, 255, 255));
        engineDisplacementtf.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 2, Color.black));
        panel1.add(engineDisplacementtf);

        // JLabel for Fuel Tank Capacity
        fuelTankCapacity = new JLabel("Fuel Tank Capacity");
        panel1.add(fuelTankCapacity);
        fuelTankCapacity.setBounds(800, 120, 340, 20);

        // Input field feul tank capacity
        fuelTankCapacitytf = new JTextField();
        fuelTankCapacitytf.setBounds(950, 120, 100, 30);
        fuelTankCapacitytf.setBackground(new Color(221, 255, 255));
        fuelTankCapacitytf.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 2, Color.black));
        panel1.add(fuelTankCapacitytf);

        // JLabel for ground clearance
        groundClearance = new JLabel("Ground Clearane");
        groundClearance.setBounds(400, 40, 340, 20);
        panel1.add(groundClearance);

        // Input field for ground clearance
        groundClearancetf = new JTextField();
        groundClearancetf.setBounds(540, 40, 100, 30);
        groundClearancetf.setBackground(new Color(221, 255, 255));
        groundClearancetf.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 2, Color.black));
        panel1.add(groundClearancetf);

        // JLabel for Fuel vehicle speed
        vehicleSpeed = new JLabel("vehicle Speed");
        vehicleSpeed.setBounds(400, 80, 200, 20);
        panel1.add(vehicleSpeed);

        // Input field for vehicle speed
        vehicleSpeedtf = new JTextField();
        vehicleSpeedtf.setBounds(540, 80, 100, 30);
        vehicleSpeedtf.setBackground(new Color(221, 255, 255));
        vehicleSpeedtf.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 2, Color.black));
        panel1.add(vehicleSpeedtf);

        // Adding Buttons on pane1 of Add Auto Rickshaw
        addAutoRickshawBtn = new JButton("Add AutoRickshaw");
        addAutoRickshawBtn.setBounds(400, 170, 170, 30);
        addAutoRickshawBtn.setFocusPainted(false);
        addAutoRickshawBtn.setBackground(new Color(255, 0, 0));
        addAutoRickshawBtn.setForeground(new Color(255, 255, 255));// change button text color
        addAutoRickshawBtn.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        panel1.add(addAutoRickshawBtn);

        // Adding on Panel 2
        // Creating Panel 2 for AutoRickshaw
        panel2 = new JPanel();
        panel2.setBounds(15, 350, 1060, 260);
        panel2.setBackground(new Color(102, 255, 102));
        TitledBorder addAutoTitle3 = BorderFactory.createTitledBorder("Book an AutoRickshaw");
        addAutoTitle3.setTitleJustification(TitledBorder.CENTER);
        addAutoTitle3.setTitleFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
        addAutoTitle3.setTitleColor(Color.red);
        addAutoTitle3.setTitleJustification(TitledBorder.CENTER);
        addAutoTitle3.setBorder(BorderFactory.createLineBorder(Color.RED));
        panel2.setBorder(addAutoTitle3);
        frame2.add(panel2);
        panel2.setLayout(null);

        // Adding on panel 2 on AutoRickshaw
        // JLabel for vehicle id
        vehicleId1 = new JLabel("Vehicle ID");
        panel2.add(vehicleId1);
        vehicleId1.setBounds(75, 60, 100, 20);

        // Input feild of vehicle id
        vehicleIdtf1 = new JTextField();
        vehicleIdtf1.setBounds(75, 85, 120, 30);
        vehicleIdtf1.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 2, Color.black));
        panel2.add(vehicleIdtf1);

        // JLabel for Number of Seat
        noOfSeats = new JLabel("No of Seats");
        noOfSeats.setBounds(400, 60, 200, 20);
        panel2.add(noOfSeats);

        // Input field of Number of Seat
        noOfSeatstf = new JTextField();
        noOfSeatstf.setBounds(400, 85, 120, 30);
        noOfSeatstf.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 2, Color.black));
        panel2.add(noOfSeatstf);

        // JLabel for Charge Amount
        chargeAmount = new JLabel("Charge Amount");
        chargeAmount.setBounds(800, 60, 100, 20);
        panel2.add(chargeAmount);

        // Input field of Charge Amount
        chargeAmounttf = new JTextField();
        chargeAmounttf.setBounds(800, 85, 120, 30);
        chargeAmounttf.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 2, Color.black));
        panel2.add(chargeAmounttf);

        String years[] = { "YYYY", "2020", "2021", "2022", "2023", "2024", "2025" };
        String Months[] = { "MM", "01", "02", "03", "04", "05", "05", "06", "07", "08", "09", "10", "11", "12" };
        String Days[] = { "DD", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
                "15", "16",
                "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "28", "29", "30", "31" };

        // JLabel for Combobox
        bookDate = new JLabel("Date");
        bookDate.setBounds(80, 130, 50, 30);
        panel2.add(bookDate);

        year = new JComboBox<>(years);
        year.setBounds(80, 160, 60, 30);
        panel2.add(year);

        month = new JComboBox<>(Months);
        month.setBounds(145, 160, 50, 30);
        panel2.add(month);

        day = new JComboBox<>(Days);
        day.setBounds(200, 160, 50, 30);
        panel2.add(day);

        // Creating Buttons for Frame 2
        // Adding Buttons on pane2 of Book an Auto Rickshaw
        bookAutoRickshawBtn = new JButton("Book AutoRickshaw");
        bookAutoRickshawBtn.setBounds(400, 160, 150, 30);
        bookAutoRickshawBtn.setFocusPainted(false);
        bookAutoRickshawBtn.setBackground(new Color(255, 0, 0));
        bookAutoRickshawBtn.setForeground(new Color(255, 255, 255));// change button text color
        bookAutoRickshawBtn.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        panel2.add(bookAutoRickshawBtn);

        // Adding Display button on Frame 2
        displayBtn = new JButton("Display");
        displayBtn.setBounds(60, 620, 150, 30);
        displayBtn.setFocusPainted(false);
        displayBtn.setBackground(new Color(255, 0, 0));
        displayBtn.setForeground(new Color(255, 255, 255));// change button text color
        displayBtn.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        frame2.add(displayBtn);

        // Adding Clear button on Frame 2
        clearBtn = new JButton("Clear");
        clearBtn.setBounds(500, 620, 150, 30);
        clearBtn.setFocusPainted(false);
        clearBtn.setBackground(new Color(255, 0, 0));
        clearBtn.setForeground(new Color(255, 255, 255));// change button text color
        clearBtn.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        frame2.add(clearBtn);

        // Adding Back button on Frame 2
        backBtn = new JButton("Back");
        backBtn.setBounds(910, 620, 150, 30);
        backBtn.setFocusPainted(false);
        backBtn.setBackground(new Color(255, 0, 0));
        backBtn.setForeground(new Color(255, 255, 255));// change button text color
        backBtn.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        frame2.add(backBtn);

        // Creating Frame for Electric Scooter
        frame3 = new JFrame("ElectricScooter");
        frame3.setBounds(100, 20, 780, 650);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit out of application
        frame3.getContentPane().setBackground(new Color(204, 204, 204)); // change color of background
        frame3.setLayout(null);
        frame3.setLocationRelativeTo(null);

        // Title for ElectricScooter
        titleAuto2 = new JLabel("Enter the details of ElectricScooter");
        titleAuto2.setForeground(Color.red);
        titleAuto2.setFont(titleFont);
        titleAuto2.setBounds(200, 10, 900, 100);
        frame3.add(titleAuto2);

        // Creating Panel 3
        panel3 = new JPanel();
        panel3.setBounds(20, 100, 320, 290);
        panel3.setBackground(new Color(102, 255, 102));
        TitledBorder addScooterTitle = BorderFactory.createTitledBorder("Add an Electric Scooter");
        addScooterTitle.setTitleJustification(TitledBorder.CENTER);
        addScooterTitle.setTitleFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
        addScooterTitle.setTitleColor(Color.red);
        addScooterTitle.setTitleJustification(TitledBorder.CENTER);
        addScooterTitle.setBorder(BorderFactory.createLineBorder(Color.RED));
        panel3.setBorder(addScooterTitle);
        panel3.setLayout(null);
        frame3.add(panel3);

        // Adding on Panel 3 on ElectricScooter
        // JLabel for Vehicle Name
        vehicleName1 = new JLabel("Vehicle Name");
        vehicleName1.setBounds(20, 40, 200, 20);
        panel3.add(vehicleName1);

        // Input field of name
        vehicleNametf1 = new JTextField();
        vehicleNametf1.setBounds(20, 60, 100, 25);
        vehicleNametf1.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 2, Color.black));
        panel3.add(vehicleNametf1);

        // JLabel for vehicle id
        vehicleID2 = new JLabel("Vehicle Id");
        vehicleID2.setBounds(20, 100, 200, 20);
        panel3.add(vehicleID2);

        // Input field of vehicle id
        vehicleIDtf2 = new JTextField();
        vehicleIDtf2.setBounds(20, 120, 100, 25);
        vehicleIDtf2.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 2, Color.black));
        panel3.add(vehicleIDtf2);

        // JLabel for vehicle weight
        vehicleWeight1 = new JLabel("Vehicle Weight");
        vehicleWeight1.setBounds(20, 160, 100, 20);
        panel3.add(vehicleWeight1);

        // Input field of vehicle weight
        vehicleWeighttf1 = new JTextField();
        vehicleWeighttf1.setBounds(20, 180, 100, 25);
        vehicleWeighttf1.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 2, Color.black));
        panel3.add(vehicleWeighttf1);

        // JLabel for vehicle color
        vehicleColor1 = new JLabel("Vehicle Color");
        vehicleColor1.setBounds(180, 40, 400, 20);
        panel3.add(vehicleColor1);

        // Input feild of vehicle color
        vehicleColortf1 = new JTextField();
        vehicleColortf1.setBounds(180, 60, 100, 25);
        vehicleColortf1.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 2, Color.black));
        panel3.add(vehicleColortf1);

        // JLabel for Battery capacity
        batteryCapacity1 = new JLabel("Battery Capacity");
        batteryCapacity1.setBounds(180, 100, 340, 20);
        panel3.add(batteryCapacity1);

        // Input field for Battery capacity
        batteryCapacitytf1 = new JTextField();
        batteryCapacitytf1.setBounds(180, 120, 100, 25);
        batteryCapacitytf1.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 2, Color.black));
        panel3.add(batteryCapacitytf1);

        // JLabel for Fuel vehicle speed
        vehicleSpeed1 = new JLabel("vehicle Speed");
        vehicleSpeed1.setBounds(180, 160, 200, 20);
        panel3.add(vehicleSpeed1);

        // Input feild for vehicle speed
        vehicleSpeedtf1 = new JTextField();
        vehicleSpeedtf1.setBounds(180, 180, 100, 25);
        vehicleSpeedtf1.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 2, Color.black));
        panel3.add(vehicleSpeedtf1);

        // Adding Buttons on pane3 of Add ElectricScooter
        addElectricScooterBtn = new JButton("Add ElectricScooter");
        addElectricScooterBtn.setBounds(80, 220, 170, 30);
        addElectricScooterBtn.setFocusPainted(false);
        addElectricScooterBtn.setBackground(new Color(255, 0, 0));
        addElectricScooterBtn.setForeground(new Color(255, 255, 255));// change button text color
        addElectricScooterBtn.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        panel3.add(addElectricScooterBtn);

        // Creating Panel 4
        panel4 = new JPanel();
        panel4.setBounds(20, 400, 320, 200);
        panel4.setBackground(new Color(102, 255, 102));
        TitledBorder addScooterTitle4 = BorderFactory.createTitledBorder("Sell Electric Scooter");
        addScooterTitle4.setTitleJustification(TitledBorder.CENTER);
        addScooterTitle4.setTitleFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
        addScooterTitle4.setTitleColor(Color.red);
        addScooterTitle4.setTitleJustification(TitledBorder.CENTER);
        addScooterTitle4.setBorder(BorderFactory.createLineBorder(Color.RED));
        panel4.setBorder(addScooterTitle4);
        panel4.setLayout(null);
        frame3.add(panel4);

        // Adding on Panel 4 Sell Electric Scooter
        // JLabel for Vehicle ID
        vehicleID4 = new JLabel("Vehicle ID");
        vehicleID4.setBounds(20, 50, 340, 20);
        panel4.add(vehicleID4);

        // Input field for Vehicle ID
        vehicleIDtf4 = new JTextField();
        vehicleIDtf4.setBounds(20, 75, 100, 25);
        vehicleIDtf4.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 2, Color.black));
        panel4.add(vehicleIDtf4);

        // JLabel for Mileage
        sellingPrice = new JLabel("Selling Price");
        sellingPrice.setBounds(175, 50, 340, 20);
        panel4.add(sellingPrice);

        // Input field for Mileage
        sellingPricetf = new JTextField();
        sellingPricetf.setBounds(175, 75, 100, 25);
        sellingPricetf.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 2, Color.black));
        panel4.add(sellingPricetf);

        // Adding Buttons on pane 4 of Sell ElectricScooter
        sellScooterBtn = new JButton("Sell Scooter");
        sellScooterBtn.setBounds(70, 120, 150, 30);
        sellScooterBtn.setFocusPainted(false);
        sellScooterBtn.setBackground(new Color(255, 0, 0));
        sellScooterBtn.setForeground(new Color(255, 255, 255));// change button text color
        sellScooterBtn.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        panel4.add(sellScooterBtn);

        // Creating Panel 5
        panel5 = new JPanel();
        panel5.setBounds(350, 100, 390, 290);
        panel5.setBackground(new Color(102, 255, 102));
        TitledBorder addScooterTitle5 = BorderFactory.createTitledBorder("Purchase Electric Scooter");
        addScooterTitle5.setTitleJustification(TitledBorder.CENTER);
        addScooterTitle5.setTitleFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
        addScooterTitle5.setTitleColor(Color.red);
        addScooterTitle5.setTitleJustification(TitledBorder.CENTER);
        addScooterTitle5.setBorder(BorderFactory.createLineBorder(Color.RED));
        panel5.setBorder(addScooterTitle5);
        panel5.setLayout(null);
        frame3.add(panel5);

        // Adding on Panel 5 of Purchase Electric Scooter
        // JLabel for Vehicle ID
        vehicleID5 = new JLabel("Vehicle ID");
        vehicleID5.setBounds(30, 40, 340, 20);
        panel5.add(vehicleID5);

        // Input field for Vehicle ID
        vehicleIDtf5 = new JTextField();
        vehicleIDtf5.setBounds(30, 60, 100, 25);
        vehicleIDtf5.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 2, Color.black));
        panel5.add(vehicleIDtf5);

        // JLabel for Mileage
        mileage = new JLabel("Mileage");
        mileage.setBounds(30, 100, 340, 20);
        panel5.add(mileage);

        // Input field for Mileage
        mileagetf = new JTextField();
        mileagetf.setBounds(30, 120, 100, 25);
        mileagetf.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 2, Color.black));
        panel5.add(mileagetf);

        // JLabel for Charging Time
        chargingTime = new JLabel("Charging Time");
        chargingTime.setBounds(30, 160, 340, 20);
        panel5.add(chargingTime);

        // Input field for Charging Time
        chargingTimetf = new JTextField();
        chargingTimetf.setBounds(30, 180, 100, 25);
        chargingTimetf.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 2, Color.black));
        panel5.add(chargingTimetf);

        // JLabel for Brand
        brand = new JLabel("Brand");
        brand.setBounds(200, 40, 340, 20);
        panel5.add(brand);

        // Input field for Brand
        brandtf = new JTextField();
        brandtf.setBounds(200, 60, 100, 25);
        brandtf.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 2, Color.black));
        panel5.add(brandtf);

        // JLabel for Range
        range = new JLabel("Range");
        range.setBounds(200, 100, 340, 20);
        panel5.add(range);

        // Input field for Range
        rangetf = new JTextField();
        rangetf.setBounds(200, 120, 100, 25);
        rangetf.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 2, Color.black));
        panel5.add(rangetf);

        // JLabel for Cost Price
        costPrice = new JLabel("Cost Price");
        costPrice.setBounds(200, 160, 340, 20);
        panel5.add(costPrice);

        // Input field for Cost Price
        costPricetf = new JTextField();
        costPricetf.setBounds(200, 180, 100, 25);
        costPricetf.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 2, Color.black));
        panel5.add(costPricetf);

        // Creating Button of Frame 3 and Panel 5
        // Adding button on Purchase Electric Scooter
        purchaseScooterBtn = new JButton("Purchase Scooter");
        purchaseScooterBtn.setBounds(100, 220, 150, 30);
        purchaseScooterBtn.setFocusPainted(false);
        purchaseScooterBtn.setBackground(new Color(255, 0, 0));
        purchaseScooterBtn.setForeground(new Color(255, 255, 255));// change button text color
        purchaseScooterBtn.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        panel5.add(purchaseScooterBtn);

        // Creating Buttons for Frame 3
        // Adding Display 1 button on Frame 3
        displayBtn1 = new JButton("Display");
        displayBtn1.setBounds(450, 520, 150, 25);
        displayBtn1.setFocusPainted(false);
        displayBtn1.setBackground(new Color(255, 0, 0));
        displayBtn1.setForeground(new Color(255, 255, 255));// change button text color
        displayBtn1.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        frame3.add(displayBtn1);

        // Adding Clear 1 button on Frame 3
        clear1Btn = new JButton("Clear");
        clear1Btn.setBounds(400, 480, 100, 25);
        clear1Btn.setFocusPainted(false);
        clear1Btn.setBackground(new Color(255, 0, 0));
        clear1Btn.setForeground(new Color(255, 255, 255));// change button text color
        clear1Btn.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        frame3.add(clear1Btn);

        // Adding Back 1 button on Frame 3
        back1Btn = new JButton("Back");
        back1Btn.setBounds(540, 480, 100, 25);
        back1Btn.setFocusPainted(false);
        back1Btn.setBackground(new Color(255, 0, 0));
        back1Btn.setForeground(new Color(255, 255, 255));// change button text color
        back1Btn.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        frame3.add(back1Btn);

        // ActionListeners For Embark A
        embarkBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame1.setVisible(false);
                frame2.setVisible(true);
            }
        });
        // ActionListeners for Embark E
        embarkBtn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame1.setVisible(false);
                frame3.setVisible(true);
            }
        });
        // ActionListeners for Add AutoRickshaw
        addAutoRickshawBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addAuto();
            }
        });
        // ActionListeners for Back Button
        backBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame1.setVisible(true);
                frame2.setVisible(false);
            }
        });
        // ActionListeners for Back Button 1
        back1Btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame1.setVisible(false);
                frame2.setVisible(true);
            }
        });
        // ActionListeners for Display Button
        displayBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (Vehicle disp : list) {
                    ((AutoRickshaw) disp).display();
                }
            }
        });
        // ActionListeners for Display Button 1
        displayBtn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (Vehicle disp : list) {
                    if (disp instanceof ElectricScooter) {
                        ((ElectricScooter) disp).display();

                    }
                }
            }
        });

        // ActionListeners for Clear Button
        clearBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                vehicleIDtf.setText("");
                vehicleNametf.setText("");
                vehicleWeighttf.setText("");
                groundClearancetf.setText("");
                vehicleSpeedtf.setText("");
                engineDisplacementtf.setText("");
                vehicleColortf.setText("");
                torquetf.setText("");
                fuelTankCapacitytf.setText("");
                vehicleIdtf1.setText("");
                noOfSeatstf.setText("");
                chargeAmounttf.setText("");
                year.setSelectedItem("YYYY");
                month.setSelectedItem("MM");
                day.setSelectedItem("DD");
            }
        });
        // ActionListeners for Clear Button 1
        clear1Btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                vehicleIDtf2.setText("");
                vehicleNametf1.setText("");
                vehicleWeighttf1.setText("");
                vehicleColortf1.setText("");
                batteryCapacitytf1.setText("");
                vehicleSpeedtf1.setText("");

                vehicleIDtf4.setText("");
                brandtf.setText("");
                mileagetf.setText("");
                rangetf.setText("");
                chargingTimetf.setText("");
                costPricetf.setText("");

                vehicleIDtf5.setText("");
                sellingPricetf.setText("");
            }
        });
        // ActionListnear for Book AutoRickshaw
        bookAutoRickshawBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bookAuto();
            }
        });
        // ActionListeners for Add ElectricScooter
        addElectricScooterBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addElectric();
            }
        });
        // ActionListeners for Purchase Scooter
        purchaseScooterBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                purchaseElectric();
            }
        });
        // ActionListeners for Sell Electric Scooter
        sellScooterBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sellElectric();
            }
        });

    }

    // Declearing AutoRickhaw Panel 1
    public final static int INVALID = -1;
    public final static int EMPTY = -2;

    public int getAutoVehicleIdAdd() {
        int vehicleId = INVALID;
        try {
            if (vehicleIDtf.getText().equals("")) {
                vehicleId = EMPTY;
            } else {
                vehicleId = Integer.parseInt(vehicleIDtf.getText());
                if (vehicleId <= 0) {
                    vehicleId = INVALID;
                }
            }
        } catch (NumberFormatException e) {
        }
        return vehicleId;
    }

    // Declearing Vehicle Name
    public String getAutoVehicleName() {
        String vehicleName = vehicleNametf.getText();
        return vehicleName;
    }

    // Declearing Vehicle Weight
    public String getAutoVehicleWeight() {
        String vehicleWeight = vehicleWeighttf.getText();
        return vehicleWeight;
    }

    // Declearing Vehicle Color
    public String getAutoVehicleColor() {
        String vehicleColor = vehicleColortf.getText();
        return vehicleColor;
    }

    // Declearing Vehicle Speed
    public String getAutoVehicleSpeed() {
        String vehicleSpeed = vehicleSpeedtf.getText();
        return vehicleSpeed;
    }

    // Declearing Engine Displacement
    public int getEngineDisplacement() {
        int engineDisplacement = INVALID;
        try {
            if (engineDisplacementtf.getText().equals("")) {
                engineDisplacement = EMPTY;
            } else {
                engineDisplacement = Integer.parseInt(engineDisplacementtf.getText());
                if (engineDisplacement <= 0) {
                    engineDisplacement = INVALID;
                }
            }
        } catch (NumberFormatException e) {
        }
        return engineDisplacement;
    }

    // Declearing Fuel TankCapacity
    public int getAutoFuelTankCapacity() {
        int fuelTankCapacity = INVALID;
        try {
            if (fuelTankCapacitytf.getText().equals("")) {
                fuelTankCapacity = EMPTY;
            } else {
                fuelTankCapacity = Integer.parseInt(fuelTankCapacitytf.getText());
                if (fuelTankCapacity <= 0) {
                    fuelTankCapacity = INVALID;
                }
            }
        } catch (NumberFormatException e) {
        }
        return fuelTankCapacity;
    }

    // Declearing Ground Clearance
    public String getAutoGroundClearance() {
        String GroundClearance = groundClearancetf.getText();
        return GroundClearance;
    }

    // Declearing Torque
    public String getAutoTorque() {
        String torque = torquetf.getText();
        return torque;
    }

    // Declearing For AutoRickhaw in Panel 2
    // Declearing VehicleId1
    public int getAutoVehicleId1Book() {
        int vehicleId1 = INVALID;
        try {
            if (vehicleIdtf1.getText().equals("")) {
                vehicleId1 = EMPTY;
            } else {
                vehicleId1 = Integer.parseInt(vehicleIdtf1.getText());
                if (vehicleId1 <= 0) {
                    vehicleId1 = INVALID;
                }
            }
        } catch (NumberFormatException e) {
        }
        return vehicleId1;
    }

    public int getAutovehicleId1() {
        int vehicleId1 = INVALID;
        try {
            if (vehicleIdtf1.getText().equals("")) {
                vehicleId1 = EMPTY;
            } else {
                vehicleId1 = Integer.parseInt(vehicleIdtf1.getText());
                if (vehicleId1 <= 0) {
                    vehicleId1 = INVALID;
                }
            }
        } catch (NumberFormatException e) {
        }
        return vehicleId1;
    }

    // Declearing No of Seat
    public int getAutoNoOfSeat() {
        int noOfSeats = INVALID;
        try {
            if (noOfSeatstf.getText().equals("")) {
                noOfSeats = EMPTY;
            } else {
                noOfSeats = Integer.parseInt(noOfSeatstf.getText());
                if (noOfSeats <= 0) {
                    noOfSeats = INVALID;
                }
            }
        } catch (NumberFormatException e) {
        }
        return noOfSeats;
    }

    public int getAutonoOfSeats() {
        int noOfSeats = INVALID;
        try {
            if (noOfSeatstf.getText().equals("")) {
                noOfSeats = EMPTY;
            } else {
                noOfSeats = Integer.parseInt(noOfSeatstf.getText());
                if (noOfSeats <= 0) {
                    noOfSeats = INVALID;
                }
            }
        } catch (NumberFormatException e) {
        }
        return noOfSeats;
    }

    // Declearing Charge Amount
    public int getAutoChargeAmount() {
        int ChargeAmount = INVALID;
        try {
            if (chargeAmounttf.getText().equals("")) {
                ChargeAmount = EMPTY;
            } else {
                ChargeAmount = Integer.parseInt(chargeAmounttf.getText());
                if (ChargeAmount <= 0) {
                    ChargeAmount = INVALID;
                }
            }
        } catch (NumberFormatException e) {
        }
        return ChargeAmount;
    }

    public int getAutochargeAmount() {
        int ChargeAmount = INVALID;
        try {
            if (vehicleIdtf1.getText().equals("")) {
                ChargeAmount = EMPTY;
            } else {
                ChargeAmount = Integer.parseInt(chargeAmounttf.getText());
                if (ChargeAmount <= 0) {
                    ChargeAmount = INVALID;
                }
            }
        } catch (NumberFormatException e) {
        }
        return ChargeAmount;
    }

    // Declearing Date
    public String getYear() {
        String y = year.getSelectedItem().toString();
        return y;
    }

    public String getMonth() {
        String m = month.getSelectedItem().toString();
        return m;
    }

    public String getday() {
        String d = day.getSelectedItem().toString();
        return d;
    }

    public String getBookedDate() {
        String bookedDate = getYear() + "-" + getMonth() + "-" + getday();
        return bookedDate;
    }

    // Declearing For Electric Scooter Panel 3
    // Declearing VehicleID 2
    public int getAutoVehicleId2() {
        int vehicleID2 = INVALID;
        try {
            if (vehicleIDtf2.getText().equals("")) {
                vehicleID2 = EMPTY;
            } else {
                vehicleID2 = Integer.parseInt(vehicleIDtf2.getText());
                if (vehicleID2 <= 0) {
                    vehicleID2 = INVALID;
                }
            }
        } catch (NumberFormatException e) {
        }
        return vehicleID2;
    }

    public int getAutovehicleID2() {
        int vehicleID2 = INVALID;
        try {
            if (vehicleIDtf2.getText().equals("")) {
                vehicleID2 = EMPTY;
            } else {
                vehicleID2 = Integer.parseInt(vehicleIDtf2.getText());
                if (vehicleID2 <= 0) {
                    vehicleID2 = INVALID;
                }
            }
        } catch (NumberFormatException e) {
        }
        return vehicleID2;
    }

    // Declearing VehicleName
    public String getAutoVehicleName1() {
        String VehicleName1 = vehicleNametf1.getText();
        return VehicleName1;
    }

    // Declearing Vehicle Color
    public String getAutoVehicleColor1() {
        String vehicleColor1 = vehicleColortf1.getText();
        return vehicleColor1;
    }

    // Declearing Vehicle Weight
    public String getAutoVehicleWeight1() {
        String vehicleWeight1 = vehicleWeighttf1.getText();
        return vehicleWeight1;
    }

    // Declearing Vehicle Speed
    public String getAutoVehicleSpeed1() {
        String vehicleSpeed1 = vehicleSpeedtf1.getText();
        return vehicleSpeed1;
    }

    // Declearing BatteryCapacity
    public int getAutoBatteryCapacity() {
        int batteryCapacity1 = INVALID;
        try {
            if (batteryCapacitytf1.getText().equals("")) {
                batteryCapacity1 = EMPTY;
            } else {
                batteryCapacity1 = Integer.parseInt(batteryCapacitytf1.getText());
                if (batteryCapacity1 <= 0) {
                    batteryCapacity1 = INVALID;
                }
            }
        } catch (NumberFormatException e) {
        }
        return batteryCapacity1;
    }

    public int getAutobatteryCapacity() {
        int batteryCapacity1 = INVALID;
        try {
            if (batteryCapacitytf1.getText().equals("")) {
                batteryCapacity1 = EMPTY;
            } else {
                batteryCapacity1 = Integer.parseInt(batteryCapacitytf1.getText());
                if (batteryCapacity1 <= 0) {
                    batteryCapacity1 = INVALID;
                }
            }
        } catch (NumberFormatException e) {
        }
        return batteryCapacity1;
    }

    // Declearing For Electric Scooter Panel 4
    // Declearing VehicleID 3
    public int getAutoVehicleId3() {
        int vehicleID3 = INVALID;
        try {
            if (vehicleIDtf5.getText().equals("")) {
                vehicleID3 = EMPTY;
            } else {
                vehicleID3 = Integer.parseInt(vehicleIDtf5.getText());
                if (vehicleID3 <= 0) {
                    vehicleID3 = INVALID;
                }
            }
        } catch (NumberFormatException e) {
        }

        return vehicleID3;
    }

    // Declearing Mileage
    public String getAutoMileage() {
        String mileage = mileagetf.getText();
        return mileage;
    }

    // Declearing Brand
    public String getAutoBrand() {
        String brand = brandtf.getText();
        return brand;
    }

    // Declearing Range
    public int getAutoRange() {
        int range = INVALID;
        try {
            if (rangetf.getText().equals("")) {
                range = EMPTY;
            } else {
                range = Integer.parseInt(rangetf.getText());
                if (range <= 0) {
                    range = INVALID;
                }
            }
        } catch (NumberFormatException e) {
        }
        return range;
    }

    public int getAutorange() {
        int range = INVALID;
        try {
            if (rangetf.getText().equals("")) {
                range = EMPTY;
            } else {
                range = Integer.parseInt(rangetf.getText());
                if (range <= 0) {
                    range = INVALID;
                }
            }
        } catch (NumberFormatException e) {
        }
        return range;
    }

    // Declearing CostPrice
    public int getAutoCostPrice() {
        int costPrice = INVALID;
        try {
            if (costPricetf.getText().equals("")) {
                costPrice = EMPTY;
            } else {
                costPrice = Integer.parseInt(costPricetf.getText());
                if (costPrice <= 0) {
                    costPrice = INVALID;
                }
            }
        } catch (NumberFormatException e) {
        }
        return costPrice;
    }

    public int getAutocostPrice() {
        int costPrice = INVALID;
        try {
            if (costPricetf.getText().equals("")) {
                costPrice = EMPTY;
            } else {
                costPrice = Integer.parseInt(costPricetf.getText());
                if (costPrice <= 0) {
                    costPrice = INVALID;
                }
            }
        } catch (NumberFormatException e) {
        }
        return costPrice;
    }

    // Declearing Charging Time
    public String getAutoChargingTime() {
        String chargingTime = chargingTimetf.getText();
        return chargingTime;
    }

    // Declearing For Electric Scooter Panel 5
    // Declearing VehicleID 5
    public int getAutoVehicleID5() {
        int vehicleID5 = INVALID;
        try {
            if (vehicleIDtf4.getText().equals("")) {
                vehicleID5 = EMPTY;
            } else {
                vehicleID5 = Integer.parseInt(vehicleIDtf4.getText());
                if (vehicleID5 <= 0) {
                    vehicleID5 = INVALID;
                }
            }
        } catch (NumberFormatException e) {
        }
        return vehicleID5;
    }

    // Declearing Selling Price
    public int getAutoSellingPrice() {
        int sellingPrice = INVALID;
        try {
            if (sellingPricetf.getText().equals("")) {
                sellingPrice = EMPTY;
            } else {
                sellingPrice = Integer.parseInt(sellingPricetf.getText());
                if (sellingPrice <= 0) {
                    sellingPrice = INVALID;
                }
            }
        } catch (NumberFormatException e) {
        }
        return sellingPrice;
    }

    public int getAutosellingPrice() {
        int sellingPrice = INVALID;
        try {
            if (sellingPricetf.getText().equals("")) {
                sellingPrice = EMPTY;
            } else {
                sellingPrice = Integer.parseInt(sellingPricetf.getText());
                if (sellingPrice <= 0) {
                    sellingPrice = INVALID;
                }
            }
        } catch (NumberFormatException e) {
        }
        return sellingPrice;
    }

    // Creating Unique ID
    public boolean unique(int ID) {
        boolean unique = true;
        for (Vehicle vehicleId : list) {
            if (vehicleId.getvehicleID() == ID) {
                unique = false;
            }
        }
        return unique;
    }

    // Getter method of Auto Rickhaw and Electric Scooter
    // Getter method of Add AutoRickshaw
    public void addAuto() {
        System.out.println(list.size());
        if (getAutoVehicleIdAdd() == EMPTY || getAutoVehicleName().equals("") || getAutoVehicleWeight().equals("")
                || getAutoVehicleColor().equals("") || getAutoVehicleSpeed().equals("")
                || getEngineDisplacement() == EMPTY || getAutoFuelTankCapacity() == EMPTY
                || getAutoGroundClearance().equals("")) {
            JOptionPane.showMessageDialog(frame1, "Fill all the data of Auto Rickshaw", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } else if (getAutoVehicleIdAdd() == INVALID) {
            JOptionPane.showMessageDialog(frame1, "Invalid Integer", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (unique(getAutoVehicleIdAdd())) {
            list.add(new AutoRickshaw(getAutoVehicleIdAdd(), getAutoVehicleName(), getAutoTorque(),
                    getAutoVehicleWeight(), getAutoVehicleColor(), getAutoVehicleSpeed(), getAutoGroundClearance(),
                    getEngineDisplacement(), getAutoFuelTankCapacity()));
            JOptionPane.showMessageDialog(frame1, "Successfully Added your Auto Rickshaw data",
                    "AutoRickshaw Data Added", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(frame1, "Enter Unique Id of Auto Rickshaw data", "Auto Rickshaw Data",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Getter method of Book AutoRickshaw
    public void bookAuto() {
        if (getAutoVehicleId1Book() == EMPTY || getAutoNoOfSeat() == EMPTY || getAutoChargeAmount() == EMPTY
                || getday().equals("DD") || getMonth().equals("MM") || getYear().equals("YYYY")) {
            JOptionPane.showMessageDialog(frame1, "Fill all the data", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (getAutoVehicleId1Book() == INVALID || getAutoNoOfSeat() == INVALID
                || getAutoChargeAmount() == INVALID) {
            JOptionPane.showMessageDialog(frame1, "Invalid Integer", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean book = false;
        boolean found = false;
        for (Vehicle id : list) {
            if (id instanceof AutoRickshaw) {
                if (id.getvehicleID() == getAutoVehicleId1Book()) {
                    found = true;
                    if (((AutoRickshaw) id).getIsBooked() == false) {
                        book = true;
                        ((AutoRickshaw) id).booking(getBookedDate(), getAutoChargeAmount(), getAutoNoOfSeat());
                        JOptionPane.showMessageDialog(frame1, "Your Auto Rickshaw is Booked.", "Succesfull",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else if (((AutoRickshaw) id).getIsBooked() == true) {
                        book = false;
                        JOptionPane.showMessageDialog(frame1, "Your  Auto Rickshaw is already booked.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else if (id.getvehicleID() == getAutoVehicleId1Book()) {
                found = true;
                book = false;
                JOptionPane.showMessageDialog(frame1, "Invalid vehicle Id",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        if (!book && !found) {
            JOptionPane.showMessageDialog(frame1, "Your  vehicle id is not added",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    // Getter method for Frame 2 Add Electric Scooter
    // Add an Electric Scooter
    public void addElectric() {
        if (getAutoVehicleId2() == EMPTY || getAutoVehicleName1().isEmpty() || getAutoVehicleColor1().isEmpty()
                || getAutoVehicleWeight1().isEmpty() || getAutoVehicleSpeed1().isEmpty()
                || getAutoBatteryCapacity() == EMPTY) {
            JOptionPane.showMessageDialog(frame2, "Fill all the data of Electric Scooter", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } else if (getAutoVehicleId2() == EMPTY || getAutoVehicleName1().isEmpty() || getAutoVehicleColor1().isEmpty()
                || getAutoVehicleWeight1().isEmpty() || getAutoVehicleSpeed1().isEmpty()
                || getAutoBatteryCapacity() == EMPTY) {
            JOptionPane.showMessageDialog(frame2, "Invalid Integer", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (unique(getAutoVehicleId2())) {
            list.add(new ElectricScooter(getAutoVehicleId2(),getAutoVehicleName1(),getAutoVehicleSpeed1(),getAutoBatteryCapacity(), getAutoVehicleColor1(),getAutoVehicleWeight1()));
            JOptionPane.showMessageDialog(frame2, "Successfully Added your Electric Scooter data", "Congratulations!",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(frame2, "Enter Unique Id of Electric Scooter data!", "Electric Scooter",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Getter method for Purchase Electric Scooter
    public void purchaseElectric() {
        if (getAutoVehicleId3() == EMPTY || getAutoMileage().isEmpty() || getAutoBrand().isEmpty()
                || getAutoRange() == EMPTY || getAutoCostPrice() == EMPTY || getAutoChargingTime().isEmpty()) {
            JOptionPane.showMessageDialog(frame1, "Fill all the data of Purchase Electric Scooter", "Error!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } else if (getAutoVehicleId3() == INVALID || getAutoRange() == INVALID || getAutoCostPrice() == INVALID) {
            JOptionPane.showMessageDialog(frame2, "Invalid Integer", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean purchase = false;
        boolean found = false;
        for (Vehicle id : list) {
            if (id instanceof ElectricScooter) {
                if (id.getvehicleID() == getAutoVehicleId3()) {
                    found = true;
                    if (((ElectricScooter) id).getHasPurchased() == false) {
                        purchase = true;
                        ((ElectricScooter) id).purchasedScooter(getAutoBrand(),getAutoCostPrice(), getAutoChargingTime(), getAutoMileage(), getAutoRange());
                        JOptionPane.showMessageDialog(frame1, "Your Electric Scooter is Purchased.", "Succesfull",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else if (((ElectricScooter) id).getHasPurchased() == true) {
                        purchase = false;
                        JOptionPane.showMessageDialog(frame1, "Your  ElectricScooter is already Purchased.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
        if (!purchase && !found) {
            JOptionPane.showMessageDialog(frame1, "Your  vehicle id is not added",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    // Getter method for sell Electrric Scooter
    public void sellElectric() {
        if (getAutoVehicleID5() == EMPTY || getAutoSellingPrice() == EMPTY) {
            JOptionPane.showMessageDialog(frame1, "Fill all the data of Sell Electric Scooter", "Error!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } else if (getAutoVehicleID5() == EMPTY || getAutoSellingPrice() == EMPTY) {
            JOptionPane.showMessageDialog(frame2, "Invalid Integer of Sell Electric Scooter", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean sell = false;
        boolean found = false;
        for (Vehicle id : list) {
            if (id instanceof ElectricScooter) {
                if (id.getvehicleID() ==  getAutoVehicleID5()) {
                    found = true;
                    if (((ElectricScooter) id).getHasSold() == false) {
                        sell = true;
                        ((ElectricScooter) id).sell(getAutoSellingPrice());
                        JOptionPane.showMessageDialog(frame1, "Your Electric Scooter is Sold.", "Succesfull",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else if (((ElectricScooter) id).getHasSold() == true) {
                        sell = false;
                        JOptionPane.showMessageDialog(frame1, "Your  ElectricScooter is already Sold.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else if (id.getvehicleID() == getAutoVehicleId1Book()) {
                found = true;
                sell = false;
                JOptionPane.showMessageDialog(frame2, "Invalid vehicle Id",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        if (!sell && !found) {
            JOptionPane.showMessageDialog(frame2, "Your  vehicle id is not added",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Main method
    public static void main(String[] args) {
        new TransportGUI();
    }
}
