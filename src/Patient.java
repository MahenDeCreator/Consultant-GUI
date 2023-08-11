// Java program to implement
// a Simple Registration Form
// using Java Swing

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Patient extends JFrame implements ActionListener {

    // Components of the Form
    private static Container c;
    private static JLabel title;
    private static JLabel name;
    private static JTextField tname;
    private static JLabel mno;
    private static JTextField tmno;
    private static JLabel gender;
    private static JRadioButton male;
    private static JRadioButton female;
    private static ButtonGroup gengp;
    private static JLabel dob;
    private static JComboBox date;
    private static JComboBox month;
    private static JComboBox year;
    private static JLabel add;
    private static JTextArea tadd;
    private static JLabel doc;
    private static JComboBox doctor;
    private static JLabel appoint;
    private static JComboBox apptime;
    private static JLabel fee;
    private static JComboBox appfee;
    private static JLabel payments;
    private static JComboBox option;
    private static JCheckBox term;
    private static JButton sub;
    private static JButton reset;
    private static JTextArea tout;
    private static JLabel res;
    private static JTextArea resadd;
    private JButton back;

    private static String[] dates
            = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private static String[] months
            = { "Jan", "Feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sep", "Oct", "Nov", "Dec" };
    private static String[] years
            = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" };

    private static String[] doctors
            ={"Dr.Asuna","Dr.Eren","Dr.Forger","Dr.Sasuni","Dr.Yagami"};
    private static String[] apptimes
            ={"Dr.Asuna(9.30a.m)","Dr.Eren(11.00a.m)","Dr.Forger(12.30p.m)","Dr.Sasuni(1.00p.m)","Dr.Yagami(3.0p.m)"};
    private static String[] appfees
            ={"Dr.Asuna(£15 per hour)","Dr.Eren(£25 per hour)","Dr.Forger(£25 per hour)","Dr.Sasuni(£25 per hour)","Dr.Yagami(£25 per hour)"};
    private static String[] options
            ={"Cash","Credit Card","Already Paid"};

    // constructor, to initialize the components
    // with default values.

    public Patient()
    {
        setTitle("Patient Form");
        setBounds(300, 90, 1010, 750);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Patient Form");
        title.setFont(new Font("Times New Roman", Font.BOLD, 30));
        title.setSize(300, 30);
        title.setLocation(370, 30);
        c.add(title);

        name = new JLabel("Patient's Name :");
        name.setFont(new Font("Arial", Font.PLAIN, 16));
        name.setSize(250, 20);
        name.setLocation(100, 100);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(290, 100);
        c.add(tname);

        mno = new JLabel("Mobile Number :");
        mno.setFont(new Font("Arial", Font.PLAIN, 16));
        mno.setSize(250, 20);
        mno.setLocation(100, 150);
        c.add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(150, 20);
        tmno.setLocation(290, 150);
        c.add(tmno);

        gender = new JLabel("Gender :");
        gender.setFont(new Font("Arial", Font.PLAIN, 16));
        gender.setSize(250, 20);
        gender.setLocation(100, 200);
        c.add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(290, 200);
        c.add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(365, 200);
        c.add(female);

        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);

        dob = new JLabel("Date of Birth :");
        dob.setFont(new Font("Arial", Font.PLAIN, 16));
        dob.setSize(250, 20);
        dob.setLocation(100, 250);
        c.add(dob);

        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(290, 250);
        c.add(date);

        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(340, 250);
        c.add(month);

        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(410, 250);
        c.add(year);

        add = new JLabel("Address :");
        add.setFont(new Font("Arial", Font.PLAIN, 16));
        add.setSize(250, 20);
        add.setLocation(100, 300);
        c.add(add);

        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(290, 300);
        tadd.setLineWrap(true);
        c.add(tadd);

        doc = new JLabel("Select Doctor :");
        doc.setFont(new Font("Arial", Font.PLAIN, 16));
        doc.setSize(250, 20);
        doc.setLocation(100, 390);
        c.add(doc);

        doctor = new JComboBox(doctors);
        doctor.setFont(new Font("Arial", Font.PLAIN, 15));
        doctor.setSize(200, 25);
        doctor.setLocation(290, 390);
        c.add(doctor);

        appoint = new JLabel("Doctor Appointment Time :");
        appoint.setFont(new Font("Arial", Font.PLAIN, 16));
        appoint.setSize(250, 20);
        appoint.setLocation(100, 430);
        c.add(appoint);

        apptime = new JComboBox(apptimes);
        apptime.setFont(new Font("Arial", Font.PLAIN, 15));
        apptime.setSize(200, 25);
        apptime.setLocation(290, 430);
        c.add(apptime);

        fee = new JLabel("Doctor Appointment Fee :");
        fee.setFont(new Font("Arial", Font.PLAIN, 16));
        fee.setSize(250, 20);
        fee.setLocation(100, 470);
        c.add(fee);

        appfee = new JComboBox(appfees);
        appfee.setFont(new Font("Arial", Font.PLAIN, 15));
        appfee.setSize(200, 25);
        appfee.setLocation(290, 470);
        c.add(appfee);

        payments = new JLabel("Payment Option :");
        payments.setFont(new Font("Arial", Font.PLAIN, 16));
        payments.setSize(250, 20);
        payments.setLocation(100, 510);
        c.add(payments);

        option = new JComboBox(options);
        option.setFont(new Font("Arial", Font.PLAIN, 15));
        option.setSize(200, 25);
        option.setLocation(290, 510);
        c.add(option);

        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 550);
        c.add(term);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 600);
        sub.addActionListener(this);
        c.add(sub);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 600);
        reset.addActionListener(this);
        c.add(reset);

        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(400, 450);
        tout.setLocation(550, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);

        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(140, 640);
        c.add(res);

        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);


        setVisible(true);
    }

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sub) {
            if (term.isSelected()) {
                    String data1;
                    String data
                            = "Patient's Name : "
                            + tname.getText() + "\n" + "\n"
                            + "Patient's Mobile : "
                            + tmno.getText() + "\n" + "\n";
                    if (male.isSelected())
                        data1 = "Gender : Male"
                                + "\n" + "\n";
                    else
                        data1 = "Gender : Female"
                                + "\n" + "\n";
                    String data2
                            = "DOB : "
                            + (String) date.getSelectedItem()
                            + "/" + (String) month.getSelectedItem()
                            + "/" + (String) year.getSelectedItem()
                            + "\n" + "\n";

                    String data3 = "Address : " + tadd.getText()
                            + "\n" + "\n";
                    String data4 = "Select  Doctor : "
                            + (String) doctor.getSelectedItem()
                            + "\n"+"\n";
                String data5 = "Doctor Appointment Time : "
                        + (String) apptime.getSelectedItem()
                        + "\n"+"\n";
                String data6 = "Appointment Fee : "
                        + (String) appfee.getSelectedItem()
                        + "\n"+"\n";
                String data7 = "Payment Option : "
                        + (String) option.getSelectedItem()
                        + "\n";

                    tout.setText(data + data1 + data2 + data3 + data4 +data5 +data6 +data7);
                    tout.setEditable(false);
                    res.setText("Submitted Successfully..");
                } else {
                    tout.setText("");
                    resadd.setText("");
                    res.setText("Please accept the"
                            + " terms & conditions..");
                }
            } else if (e.getSource() == reset) {
                String def = "";
                tname.setText(def);
                tadd.setText(def);
                tmno.setText(def);
                res.setText(def);
                tout.setText(def);
                term.setSelected(false);
                date.setSelectedIndex(0);
                month.setSelectedIndex(0);
                year.setSelectedIndex(0);
                doctor.setSelectedIndex(0);
                apptime.setSelectedIndex(0);
                appfee.setSelectedIndex(0);
                option.setSelectedIndex(0);
                resadd.setText(def);
            }


        }

    public void showWindow() {
    }
}

// Driver Code

