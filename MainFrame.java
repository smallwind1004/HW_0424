import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame {
    private JPanel jpnN = new JPanel(new BorderLayout(3, 3));
    private JPanel jpn2 = new JPanel(new GridLayout(15, 5, 3, 3));
    private JPanel jpn3 = new JPanel(new GridLayout(1, 3, 3, 3));
    private Container cp;
    private JTextArea jta = new JTextArea("Your order list as follows: \n");
    private JScrollPane jsp = new JScrollPane(jta);
    private JButton jbtnCheck = new JButton("OK");
    private JButton jbtnClear = new JButton("Clear");
    private JButton jbtnExit = new JButton("Exit");
    // private JLabel jlb1 = new JLabel("白麵");
    // private JLabel jlb2 = new JLabel("湯類");

    private JCheckBox jcb0 = new JCheckBox("牛肉蛋花麵\t$110");
    private JComboBox jcbox0 = new JComboBox();
    private JRadioButton jrb01 = new JRadioButton("小辣");
    private JRadioButton jrb02 = new JRadioButton("中辣");
    private JRadioButton jrb03 = new JRadioButton("大辣");
    private ButtonGroup bg0 = new ButtonGroup();

    private JCheckBox jcb1 = new JCheckBox("牛肉麵\t$100");
    private JComboBox jcbox1 = new JComboBox();
    private JRadioButton jrb11 = new JRadioButton("小辣");
    private JRadioButton jrb12 = new JRadioButton("中辣");
    private JRadioButton jrb13 = new JRadioButton("大辣");
    private ButtonGroup bg1 = new ButtonGroup();
    
    private JCheckBox jcb2 = new JCheckBox("牛肉湯麵\t$55");
    private JComboBox jcbox2 = new JComboBox();
    private JRadioButton jrb21 = new JRadioButton("小辣");
    private JRadioButton jrb22 = new JRadioButton("中辣");
    private JRadioButton jrb23 = new JRadioButton("大辣");
    private ButtonGroup bg2 = new ButtonGroup();

    private JCheckBox jcb3 = new JCheckBox("牛肉湯蛋花麵\t$65");
    private JComboBox jcbox3 = new JComboBox();
    private JRadioButton jrb31 = new JRadioButton("小辣");
    private JRadioButton jrb32 = new JRadioButton("中辣");
    private JRadioButton jrb33 = new JRadioButton("大辣");
    private ButtonGroup bg3 = new ButtonGroup();

    private JCheckBox jcb4 = new JCheckBox("榨菜雞絲麵\t$55");
    private JComboBox jcbox4 = new JComboBox();
    private JRadioButton jrb41 = new JRadioButton("小辣");
    private JRadioButton jrb42 = new JRadioButton("中辣");
    private JRadioButton jrb43 = new JRadioButton("大辣");
    private ButtonGroup bg4 = new ButtonGroup();

    private JCheckBox jcb5 = new JCheckBox("餛飩麵\t$55");
    private JComboBox jcbox5 = new JComboBox();
    private JRadioButton jrb51 = new JRadioButton("小辣");
    private JRadioButton jrb52 = new JRadioButton("中辣");
    private JRadioButton jrb53 = new JRadioButton("大辣");
    private ButtonGroup bg5 = new ButtonGroup();

    private JCheckBox jcb6 = new JCheckBox("貢丸麵\t$55");
    private JComboBox jcbox6 = new JComboBox();
    private JRadioButton jrb61 = new JRadioButton("小辣");
    private JRadioButton jrb62 = new JRadioButton("中辣");
    private JRadioButton jrb63 = new JRadioButton("大辣");
    private ButtonGroup bg6 = new ButtonGroup();

    private JCheckBox jcb7 = new JCheckBox("陽春湯麵\t$35");
    private JComboBox jcbox7 = new JComboBox();
    private JRadioButton jrb71 = new JRadioButton("小辣");
    private JRadioButton jrb72 = new JRadioButton("中辣");
    private JRadioButton jrb73 = new JRadioButton("大辣");
    private ButtonGroup bg7 = new ButtonGroup();

    private JCheckBox jcb8 = new JCheckBox("牛肉蛋花湯\t$100");
    private JComboBox jcbox8 = new JComboBox();
    private JRadioButton jrb81 = new JRadioButton("小辣");
    private JRadioButton jrb82 = new JRadioButton("中辣");
    private JRadioButton jrb83 = new JRadioButton("大辣");
    private ButtonGroup bg8 = new ButtonGroup();

    private JCheckBox jcb9 = new JCheckBox("牛肉湯\t$90");
    private JComboBox jcbox9 = new JComboBox();
    private JRadioButton jrb91 = new JRadioButton("小辣");
    private JRadioButton jrb92 = new JRadioButton("中辣");
    private JRadioButton jrb93 = new JRadioButton("大辣");
    private ButtonGroup bg9 = new ButtonGroup();

    private JCheckBox jcb10 = new JCheckBox("牛肉清湯加蛋花\t$35");
    private JComboBox jcbox10 = new JComboBox();
    private JRadioButton jrb101 = new JRadioButton("小辣");
    private JRadioButton jrb102 = new JRadioButton("中辣");
    private JRadioButton jrb103 = new JRadioButton("大辣");
    private ButtonGroup bg10 = new ButtonGroup();

    private JCheckBox jcb11 = new JCheckBox("餛飩湯\t$40");
    private JComboBox jcbox11 = new JComboBox();
    private JRadioButton jrb111 = new JRadioButton("小辣");
    private JRadioButton jrb112 = new JRadioButton("中辣");
    private JRadioButton jrb113 = new JRadioButton("大辣");
    private ButtonGroup bg11 = new ButtonGroup();

    private JCheckBox jcb12 = new JCheckBox("貢丸湯\t$35");
    private JComboBox jcbox12 = new JComboBox();
    private JRadioButton jrb121 = new JRadioButton("小辣");
    private JRadioButton jrb122 = new JRadioButton("中辣");
    private JRadioButton jrb123 = new JRadioButton("大辣");
    private ButtonGroup bg12 = new ButtonGroup();

    private JCheckBox jcb13 = new JCheckBox("蛋花湯\t$30");
    private JComboBox jcbox13 = new JComboBox();
    private JRadioButton jrb131 = new JRadioButton("小辣");
    private JRadioButton jrb132 = new JRadioButton("中辣");
    private JRadioButton jrb133 = new JRadioButton("大辣");
    private ButtonGroup bg13 = new ButtonGroup();

    private JCheckBox jcb14 = new JCheckBox("青菜湯\t$25");
    private JComboBox jcbox14 = new JComboBox();
    private JRadioButton jrb141 = new JRadioButton("小辣");
    private JRadioButton jrb142 = new JRadioButton("中辣");
    private JRadioButton jrb143 = new JRadioButton("大辣");
    private ButtonGroup bg14 = new ButtonGroup();

    public MainFrame() {
        init();
    }

    private void init() {
        cp = this.getContentPane();
        this.setBounds(200, 100, 1000, 800);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jpnN.add(jpn2, BorderLayout.CENTER);
        jpnN.add(jpn3, BorderLayout.SOUTH);
        jpn2.add(jcb0);
        jpn2.add(jcbox0);
        jcbox0.addItem("1");
        jcbox0.addItem("2");
        jcbox0.addItem("3");
        jcbox0.addItem("4");
        jcbox0.addItem("5");
        jcbox0.addItem("6");
        jpn2.add(jrb01);
        jpn2.add(jrb02);
        jpn2.add(jrb03);
        bg0.add(jrb01);
        bg0.add(jrb02);
        bg0.add(jrb03);
        jrb01.setSelected(true);
        
        jpn2.add(jcb1);
        jpn2.add(jcbox1);
        jcbox1.addItem("1");
        jcbox1.addItem("2");
        jcbox1.addItem("3");
        jcbox1.addItem("4");
        jcbox1.addItem("5");
        jcbox1.addItem("6");
        jpn2.add(jrb11);
        jpn2.add(jrb12);
        jpn2.add(jrb13);
        bg1.add(jrb11);
        bg1.add(jrb12);
        bg1.add(jrb13);

        jpn2.add(jcb2);
        jpn2.add(jcbox2);
        jcbox2.addItem("1");
        jcbox2.addItem("2");
        jcbox2.addItem("3");
        jcbox2.addItem("4");
        jcbox2.addItem("5");
        jcbox2.addItem("6");
        jpn2.add(jrb21);
        jpn2.add(jrb22);
        jpn2.add(jrb23);
        bg2.add(jrb21);
        bg2.add(jrb22);
        bg2.add(jrb23);

        jpn2.add(jcb3);
        jpn2.add(jcbox3);
        jcbox3.addItem("1");
        jcbox3.addItem("2");
        jcbox3.addItem("3");
        jcbox3.addItem("4");
        jcbox3.addItem("5");
        jcbox3.addItem("6");
        jpn2.add(jrb31);
        jpn2.add(jrb32);
        jpn2.add(jrb33);
        bg3.add(jrb31);
        bg3.add(jrb32);
        bg3.add(jrb33);

        jpn2.add(jcb4);
        jpn2.add(jcbox4);
        jcbox4.addItem("1");
        jcbox4.addItem("2");
        jcbox4.addItem("3");
        jcbox4.addItem("4");
        jcbox4.addItem("5");
        jcbox4.addItem("6");
        jpn2.add(jrb41);
        jpn2.add(jrb42);
        jpn2.add(jrb43);
        bg4.add(jrb41);
        bg4.add(jrb42);
        bg4.add(jrb43);

        jpn2.add(jcb5);
        jpn2.add(jcbox5);
        jcbox5.addItem("1");
        jcbox5.addItem("2");
        jcbox5.addItem("3");
        jcbox5.addItem("4");
        jcbox5.addItem("5");
        jcbox5.addItem("6");
        jpn2.add(jrb51);
        jpn2.add(jrb52);
        jpn2.add(jrb53);
        bg5.add(jrb51);
        bg5.add(jrb52);
        bg5.add(jrb53);

        jpn2.add(jcb6);
        jpn2.add(jcbox6);
        jcbox6.addItem("1");
        jcbox6.addItem("2");
        jcbox6.addItem("3");
        jcbox6.addItem("4");
        jcbox6.addItem("5");
        jcbox6.addItem("6");
        jpn2.add(jrb61);
        jpn2.add(jrb62);
        jpn2.add(jrb63);
        bg6.add(jrb61);
        bg6.add(jrb62);
        bg6.add(jrb63);

        jpn2.add(jcb7);
        jpn2.add(jcbox7);
        jcbox7.addItem("1");
        jcbox7.addItem("2");
        jcbox7.addItem("3");
        jcbox7.addItem("4");
        jcbox7.addItem("5");
        jcbox7.addItem("6");
        jpn2.add(jrb71);
        jpn2.add(jrb72);
        jpn2.add(jrb73);
        bg7.add(jrb71);
        bg7.add(jrb72);
        bg7.add(jrb73);

        jpn2.add(jcb8);
        jpn2.add(jcbox8);
        jcbox8.addItem("1");
        jcbox8.addItem("2");
        jcbox8.addItem("3");
        jcbox8.addItem("4");
        jcbox8.addItem("5");
        jcbox8.addItem("6");
        jpn2.add(jrb81);
        jpn2.add(jrb82);
        jpn2.add(jrb83);
        bg8.add(jrb81);
        bg8.add(jrb82);
        bg8.add(jrb83);

        jpn2.add(jcb9);
        jpn2.add(jcbox9);
        jcbox9.addItem("1");
        jcbox9.addItem("2");
        jcbox9.addItem("3");
        jcbox9.addItem("4");
        jcbox9.addItem("5");
        jcbox9.addItem("6");
        jpn2.add(jrb91);
        jpn2.add(jrb92);
        jpn2.add(jrb93);
        bg9.add(jrb91);
        bg9.add(jrb92);
        bg9.add(jrb93);

        jpn2.add(jcb10);
        jpn2.add(jcbox10);
        jcbox10.addItem("1");
        jcbox10.addItem("2");
        jcbox10.addItem("3");
        jcbox10.addItem("4");
        jcbox10.addItem("5");
        jcbox10.addItem("6");
        jpn2.add(jrb101);
        jpn2.add(jrb102);
        jpn2.add(jrb103);
        bg10.add(jrb101);
        bg10.add(jrb102);
        bg10.add(jrb103);

        jpn2.add(jcb11);
        jpn2.add(jcbox11);
        jcbox11.addItem("1");
        jcbox11.addItem("2");
        jcbox11.addItem("3");
        jcbox11.addItem("4");
        jcbox11.addItem("5");
        jcbox11.addItem("6");
        jpn2.add(jrb111);
        jpn2.add(jrb112);
        jpn2.add(jrb113);
        bg11.add(jrb111);
        bg11.add(jrb112);
        bg11.add(jrb113);

        jpn2.add(jcb12);
        jpn2.add(jcbox12);
        jcbox12.addItem("1");
        jcbox12.addItem("2");
        jcbox12.addItem("3");
        jcbox12.addItem("4");
        jcbox12.addItem("5");
        jcbox12.addItem("6");
        jpn2.add(jrb121);
        jpn2.add(jrb122);
        jpn2.add(jrb123);
        bg12.add(jrb121);
        bg12.add(jrb122);
        bg12.add(jrb123);

        jpn2.add(jcb14);
        jpn2.add(jcbox14);
        jcbox14.addItem("1");
        jcbox14.addItem("2");
        jcbox14.addItem("3");
        jcbox14.addItem("4");
        jcbox14.addItem("5");
        jcbox14.addItem("6");
        jpn2.add(jrb141);
        jpn2.add(jrb142);
        jpn2.add(jrb143);
        bg14.add(jrb141);
        bg14.add(jrb142);
        bg14.add(jrb143);

        jpn3.add(jbtnCheck);
        jpn3.add(jbtnClear);
        jpn3.add(jbtnExit);

        jta.setEditable(false);

        cp.add(jpnN, BorderLayout.NORTH);
        cp.add(jsp, BorderLayout.CENTER);
        jbtnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        jbtnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jta.setText("Your order list as follows: \n");
            }
        });
        jbtnCheck.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int val0 = 0, val1 = 0, val2 = 0;
                int val3 = 0, val4 = 0, val5 = 0;
                int val6 = 0, val7 = 0, val8 = 0;
                int val9 = 0, val10 = 0, val11 = 0;
                int val12 = 0, val13 = 0, val14 = 0;
                int total = 0;
                if (jcb0.isSelected()) {
                    jta.append(jcb0.getText() + ",\t");
                    if (jrb01.isSelected()) {
                        jta.append(jrb01.getText() + ",\t");
                    } else if (jrb02.isSelected()) {
                        jta.append(jrb02.getText() + ",\t");
                    } else if (jrb03.isSelected()) {
                        jta.append(jrb03.getText() + ",\t");
                    } else {
                        jta.append("不加辣,\t");
                    }
                    jta.append(jcbox0.getSelectedIndex() + 1 + "份\t");
                    val0 = 110 * (jcbox0.getSelectedIndex() + 1);//000000000000000000000000000
                    jta.append("小計: " + Integer.toString(val0) + "\n");
                }
                if (jcb1.isSelected()) {
                    jta.append(jcb1.getText() + ",\t");
                    if (jrb11.isSelected()) {
                        jta.append(jrb11.getText() + ",\t");
                    } else if (jrb12.isSelected()) {
                        jta.append(jrb12.getText() + ",\t");
                    } else if (jrb13.isSelected()) {
                        jta.append(jrb13.getText() + ",\t");
                    } else {
                        jta.append("不加辣,\t");
                    }
                    jta.append(jcbox1.getSelectedIndex() + 1 + "份\t");
                    val1 = 100 * (jcbox1.getSelectedIndex() + 1);//000000000000000000000000000
                    jta.append("小計: " + Integer.toString(val1) + "\n");
                }
                if (jcb2.isSelected()) {
                    jta.append(jcb2.getText() + ",\t");
                    if (jrb21.isSelected()) {
                        jta.append(jrb21.getText() + ",\t");
                    } else if (jrb22.isSelected()) {
                        jta.append(jrb22.getText() + ",\t");
                    } else if (jrb23.isSelected()) {
                        jta.append(jrb23.getText() + ",\t");
                    } else {
                        jta.append("不加辣,\t");
                    }
                    jta.append(jcbox2.getSelectedIndex() + 1 + "份\t");
                    val2 = 55 * (jcbox2.getSelectedIndex() + 1);//000000000000000000000000000
                    jta.append("小計: " + Integer.toString(val2) + "\n");
                }
                if (jcb3.isSelected()) {
                    jta.append(jcb3.getText() + ",\t");
                    if (jrb31.isSelected()) {
                        jta.append(jrb31.getText() + ",\t");
                    } else if (jrb32.isSelected()) {
                        jta.append(jrb32.getText() + ",\t");
                    } else if (jrb33.isSelected()) {
                        jta.append(jrb33.getText() + ",\t");
                    } else {
                        jta.append("不加辣,\t");
                    }
                    jta.append(jcbox3.getSelectedIndex() + 1 + "份\t");
                    val3 = 65 * (jcbox3.getSelectedIndex() + 1);//000000000000000000000000000
                    jta.append("小計: " + Integer.toString(val3) + "\n");
                }
                if (jcb4.isSelected()) {
                    jta.append(jcb4.getText() + ",\t");
                    if (jrb41.isSelected()) {
                        jta.append(jrb41.getText() + ",\t");
                    } else if (jrb42.isSelected()) {
                        jta.append(jrb42.getText() + ",\t");
                    } else if (jrb43.isSelected()) {
                        jta.append(jrb43.getText() + ",\t");
                    } else {
                        jta.append("不加辣,\t");
                    }
                    jta.append(jcbox4.getSelectedIndex() + 1 + "份\t");
                    val4 = 55 * (jcbox4.getSelectedIndex() + 1);//000000000000000000000000000
                    jta.append("小計: " + Integer.toString(val4) + "\n");
                }
                if (jcb5.isSelected()) {
                    jta.append(jcb5.getText() + ",\t");
                    if (jrb51.isSelected()) {
                        jta.append(jrb51.getText() + ",\t");
                    } else if (jrb52.isSelected()) {
                        jta.append(jrb52.getText() + ",\t");
                    } else if (jrb53.isSelected()) {
                        jta.append(jrb53.getText() + ",\t");
                    } else {
                        jta.append("不加辣,\t");
                    }
                    jta.append(jcbox5.getSelectedIndex() + 1 + "份\t");
                    val5 = 55 * (jcbox5.getSelectedIndex() + 1);//000000000000000000000000000
                    jta.append("小計: " + Integer.toString(val5) + "\n");
                }
                if (jcb6.isSelected()) {
                    jta.append(jcb6.getText() + ",\t");
                    if (jrb61.isSelected()) {
                        jta.append(jrb61.getText() + ",\t");
                    } else if (jrb62.isSelected()) {
                        jta.append(jrb62.getText() + ",\t");
                    } else if (jrb63.isSelected()) {
                        jta.append(jrb63.getText() + ",\t");
                    } else {
                        jta.append("不加辣,\t");
                    }
                    jta.append(jcbox6.getSelectedIndex() + 1 + "份\t");
                    val6 = 55 * (jcbox6.getSelectedIndex() + 1);//000000000000000000000000000
                    jta.append("小計: " + Integer.toString(val6) + "\n");
                }
                if (jcb7.isSelected()) {
                    jta.append(jcb7.getText() + ",\t");
                    if (jrb71.isSelected()) {
                        jta.append(jrb71.getText() + ",\t");
                    } else if (jrb72.isSelected()) {
                        jta.append(jrb72.getText() + ",\t");
                    } else if (jrb73.isSelected()) {
                        jta.append(jrb73.getText() + ",\t");
                    } else {
                        jta.append("不加辣,\t");
                    }
                    jta.append(jcbox7.getSelectedIndex() + 1 + "份\t");
                    val7 = 35 * (jcbox7.getSelectedIndex() + 1);//000000000000000000000000000
                    jta.append("小計: " + Integer.toString(val7) + "\n");
                }
                if (jcb8.isSelected()) {
                    jta.append(jcb8.getText() + ",\t");
                    if (jrb81.isSelected()) {
                        jta.append(jrb81.getText() + ",\t");
                    } else if (jrb82.isSelected()) {
                        jta.append(jrb82.getText() + ",\t");
                    } else if (jrb83.isSelected()) {
                        jta.append(jrb83.getText() + ",\t");
                    } else {
                        jta.append("不加辣,\t");
                    }
                    jta.append(jcbox8.getSelectedIndex() + 1 + "份\t");
                    val8 = 100 * (jcbox8.getSelectedIndex() + 1);//000000000000000000000000000
                    jta.append("小計: " + Integer.toString(val8) + "\n");
                }
                if (jcb9.isSelected()) {
                    jta.append(jcb9.getText() + ",\t");
                    if (jrb91.isSelected()) {
                        jta.append(jrb91.getText() + ",\t");
                    } else if (jrb92.isSelected()) {
                        jta.append(jrb92.getText() + ",\t");
                    } else if (jrb93.isSelected()) {
                        jta.append(jrb93.getText() + ",\t");
                    } else {
                        jta.append("不加辣,\t");
                    }
                    jta.append(jcbox9.getSelectedIndex() + 1 + "份\t");
                    val9 = 90 * (jcbox9.getSelectedIndex() + 1);//000000000000000000000000000
                    jta.append("小計: " + Integer.toString(val9) + "\n");
                }
                if (jcb10.isSelected()) {
                    jta.append(jcb10.getText() + ",\t");
                    if (jrb101.isSelected()) {
                        jta.append(jrb101.getText() + ",\t");
                    } else if (jrb102.isSelected()) {
                        jta.append(jrb102.getText() + ",\t");
                    } else if (jrb103.isSelected()) {
                        jta.append(jrb103.getText() + ",\t");
                    } else {
                        jta.append("不加辣,\t");
                    }
                    jta.append(jcbox10.getSelectedIndex() + 1 + "份\t");
                    val10 = 35 * (jcbox10.getSelectedIndex() + 1);//000000000000000000000000000
                    jta.append("小計: " + Integer.toString(val10) + "\n");
                }
                if (jcb11.isSelected()) {
                    jta.append(jcb11.getText() + ",\t");
                    if (jrb111.isSelected()) {
                        jta.append(jrb111.getText() + ",\t");
                    } else if (jrb112.isSelected()) {
                        jta.append(jrb112.getText() + ",\t");
                    } else if (jrb113.isSelected()) {
                        jta.append(jrb113.getText() + ",\t");
                    } else {
                        jta.append("不加辣,\t");
                    }
                    jta.append(jcbox11.getSelectedIndex() + 1 + "份\t");
                    val11 = 40 * (jcbox11.getSelectedIndex() + 1);//000000000000000000000000000
                    jta.append("小計: " + Integer.toString(val11) + "\n");
                }
                if (jcb12.isSelected()) {
                    jta.append(jcb12.getText() + ",\t");
                    if (jrb121.isSelected()) {
                        jta.append(jrb121.getText() + ",\t");
                    } else if (jrb122.isSelected()) {
                        jta.append(jrb122.getText() + ",\t");
                    } else if (jrb123.isSelected()) {
                        jta.append(jrb123.getText() + ",\t");
                    } else {
                        jta.append("不加辣,\t");
                    }
                    jta.append(jcbox12.getSelectedIndex() + 1 + "份\t");
                    val12 = 35 * (jcbox12.getSelectedIndex() + 1);//000000000000000000000000000
                    jta.append("小計: " + Integer.toString(val12) + "\n");
                }
                if (jcb13.isSelected()) {
                    jta.append(jcb13.getText() + ",\t");
                    if (jrb131.isSelected()) {
                        jta.append(jrb131.getText() + ",\t");
                    } else if (jrb132.isSelected()) {
                        jta.append(jrb132.getText() + ",\t");
                    } else if (jrb133.isSelected()) {
                        jta.append(jrb133.getText() + ",\t");
                    } else {
                        jta.append("不加辣,\t");
                    }
                    jta.append(jcbox13.getSelectedIndex() + 1 + "份\t");
                    val13 = 30 * (jcbox13.getSelectedIndex() + 1);//000000000000000000000000000
                    jta.append("小計: " + Integer.toString(val13) + "\n");
                }
                if (jcb14.isSelected()) {
                    jta.append(jcb14.getText() + ",\t");
                    if (jrb141.isSelected()) {
                        jta.append(jrb141.getText() + ",\t");
                    } else if (jrb142.isSelected()) {
                        jta.append(jrb142.getText() + ",\t");
                    } else if (jrb143.isSelected()) {
                        jta.append(jrb143.getText() + ",\t");
                    } else {
                        jta.append("不加辣,\t");
                    }
                    jta.append(jcbox14.getSelectedIndex() + 1 + "份\t");
                    val14 = 25 * (jcbox14.getSelectedIndex() + 1);//000000000000000000000000000
                    jta.append("小計: " + Integer.toString(val14) + "\n");
                }
                total = val0 + val1 + val2 + val3 + val4 + val5 + val6 + val7 + val8 + val9 + val10 + val11 + val12 + val13 + val14;
                jta.append("總計: " + Integer.toString(total) + "\n");
            }
        });
    }
}