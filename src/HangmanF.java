
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Date;
import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.SwingConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elshadayassefa
 */
public class HangmanF extends javax.swing.JFrame {

    /** Creates new form HangmanF */
    
    private int correct;
    private int incorrect;
    private int[] correctLetter;
    private String word;
    protected static int score = 100;
    private boolean present = false;
    private int count = 0;
  
    
    public HangmanF() {
        //
        initComponents();
        setSize(600,400);
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.BLACK);
        score = 100;
        hangPic1.setVisible(false);
        hangPic2.setVisible(false);
        hangPic3.setVisible(false);
        hangPic4.setVisible(false);
        hangPic5.setVisible(false);
        hangPic6.setVisible(false);

        //Set for clock
        ActionListener timeListener = new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                Date date = new Date();
                DateFormat timeFormat = new SimpleDateFormat("MM/dd/yy HH:mm:ss");
                String time = timeFormat.format(date);
                timeLabel.setText(time);
            }
        };
        
        Timer timer = new Timer(1000, timeListener);
        timer.setInitialDelay(0);
        timer.start();
    
        hangPic1.setOpaque(true);
        jLabel2.setOpaque(true);
        jLabel3.setOpaque(true);
        jLabel4.setOpaque(true);
        jLabel5.setOpaque(true);
        jLabel6.setOpaque(true);
        jLabel7.setOpaque(true);
        jLabel8.setOpaque(true);
        jLabel9.setOpaque(true);
        word = getWord();
    }
    
    String[] words = {"abstract","cemetary","nurse","pharmacy","climbing"};
    String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    //JButton[] letters = new JButton[8];
    javax.swing.JLabel[] letters = new javax.swing.JLabel[8];
    javax.swing.JLabel[] tiles = new javax.swing.JLabel[8];
    Random rand = new Random();
    int num = rand.nextInt(5);
    String choice = words[num];
    int length = choice.length();
    ArrayList<Integer> used = new ArrayList(8);
    boolean found = false;
    
    private String getWord() {
        
        int num = rand.nextInt(5);
        while(found = false){
            if(used.contains(num)) {
                num = rand.nextInt(5);
                
            } else {
                found = true;
            }
        }
        String choice = words[num];
        used.add(num);
        
        int length = choice.length();
        String[] text = choice.split("");
        letters[0] = Letter1;
        letters[1] = Letter2;
        letters[2] = Letter3;
        letters[3] = Letter4;
        letters[4] = Letter5;
        letters[5] = Letter6;
        letters[6] = Letter7;
        letters[7] = Letter8;
        
        tiles[0] = jLabel2;
        tiles[1] = jLabel3;
        tiles[2] = jLabel4;
        tiles[3] = jLabel5;
        tiles[4] = jLabel6;
        tiles[5] = jLabel7;
        tiles[6] = jLabel8;
        tiles[7] = jLabel9;
              
            
        for(int i = 0; i < choice.length(); i++) {
            tiles[i].setBackground(Color.WHITE);
            letters[i].setText("<html><div style='text-align: center;'>" + text[i]+ "</div></html>");
            System.out.println(text[i]);
            //letters[i].setOpaque(true);
        }
        
        return choice;
    }
    
    private void skipWord() {
        word = getWord();
        
    }
    
    public static int getScore() {
        return score;
    }
    
    private void checkGameOver() {
            if(present != true) {
            score = score -10;
            Score.setText(score + " pts");
            if (score == 90) {
                hangPic1.setVisible(true);
            }
            if (score == 80) {
                hangPic2.setVisible(true);
            }
            if (score == 70) {
                hangPic3.setVisible(true);
            }
            if (score == 60) {
                hangPic4.setVisible(true);
            }
            if (score == 50) {
                hangPic5.setVisible(true);
            }
            if (score == 40) {
                hangPic6.setVisible(true);
            }
        }
        
        if(score <= 40) {
            ButtonGame bg = new ButtonGame();
            bg.setVisible(true);
            this.setVisible(false);
        }
        present = false;
    }
    
   // String choice = words[rand];
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
            // {AButton, BButton, CButton,DButton, EButton, FButton,GButton, HButton, IButton, JButton, KButton, LButton, MButton, NButton, OButton, PButton, QButton, RButton, SButton, TButton, UButton, VButton, WButton, XButton, YButton, ZButton};

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        panel1 = new java.awt.Panel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        AButton = new javax.swing.JButton();
        BButton = new javax.swing.JButton();
        CButton = new javax.swing.JButton();
        DButton = new javax.swing.JButton();
        EButton = new javax.swing.JButton();
        FButton = new javax.swing.JButton();
        GButton = new javax.swing.JButton();
        HButton = new javax.swing.JButton();
        IButton = new javax.swing.JButton();
        JButton = new javax.swing.JButton();
        KButton = new javax.swing.JButton();
        LButton = new javax.swing.JButton();
        MButton = new javax.swing.JButton();
        NButton = new javax.swing.JButton();
        OButton = new javax.swing.JButton();
        PButton = new javax.swing.JButton();
        QButton = new javax.swing.JButton();
        RButton = new javax.swing.JButton();
        SButton = new javax.swing.JButton();
        TButton = new javax.swing.JButton();
        UButton = new javax.swing.JButton();
        VButton = new javax.swing.JButton();
        WButton = new javax.swing.JButton();
        XButton = new javax.swing.JButton();
        YButton = new javax.swing.JButton();
        ZButton = new javax.swing.JButton();
        SkipH = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Letter1 = new javax.swing.JLabel();
        Letter2 = new javax.swing.JLabel();
        Letter3 = new javax.swing.JLabel();
        Letter4 = new javax.swing.JLabel();
        Letter5 = new javax.swing.JLabel();
        Letter6 = new javax.swing.JLabel();
        Letter7 = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        Letter8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Score = new javax.swing.JLabel();
        hangLayered = new javax.swing.JLayeredPane();
        hangPic1 = new javax.swing.JLabel();
        hangPic2 = new javax.swing.JLabel();
        hangPic3 = new javax.swing.JLabel();
        hangPic4 = new javax.swing.JLabel();
        hangPic5 = new javax.swing.JLabel();
        hangPic6 = new javax.swing.JLabel();

        label1.setText("label1");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AButton.setText("A");
        AButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AButtonActionPerformed(evt);
            }
        });

        BButton.setText("B");
        BButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BButtonActionPerformed(evt);
            }
        });

        CButton.setText("C");
        CButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CButtonActionPerformed(evt);
            }
        });

        DButton.setText("D");
        DButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DButtonActionPerformed(evt);
            }
        });

        EButton.setText("E");
        EButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EButtonActionPerformed(evt);
            }
        });

        FButton.setText("F");
        FButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FButtonActionPerformed(evt);
            }
        });

        GButton.setText("G");
        GButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GButtonActionPerformed(evt);
            }
        });

        HButton.setText("H");
        HButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HButtonActionPerformed(evt);
            }
        });

        IButton.setText("I");
        IButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IButtonActionPerformed(evt);
            }
        });

        JButton.setText("J");
        JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonActionPerformed(evt);
            }
        });

        KButton.setText("K");
        KButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KButtonActionPerformed(evt);
            }
        });

        LButton.setText("L");
        LButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LButtonActionPerformed(evt);
            }
        });

        MButton.setText("M");
        MButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MButtonActionPerformed(evt);
            }
        });

        NButton.setText("N");
        NButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NButtonActionPerformed(evt);
            }
        });

        OButton.setText("O");
        OButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OButtonActionPerformed(evt);
            }
        });

        PButton.setText("P");
        PButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PButtonActionPerformed(evt);
            }
        });

        QButton.setText("Q");
        QButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QButtonActionPerformed(evt);
            }
        });

        RButton.setText("R");
        RButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RButtonActionPerformed(evt);
            }
        });

        SButton.setText("S");
        SButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SButtonActionPerformed(evt);
            }
        });

        TButton.setText("T");
        TButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButtonActionPerformed(evt);
            }
        });

        UButton.setText("U");
        UButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UButtonActionPerformed(evt);
            }
        });

        VButton.setText("V");
        VButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VButtonActionPerformed(evt);
            }
        });

        WButton.setText("W");
        WButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WButtonActionPerformed(evt);
            }
        });

        XButton.setText("X");
        XButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XButtonActionPerformed(evt);
            }
        });

        YButton.setText("Y");
        YButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YButtonActionPerformed(evt);
            }
        });

        ZButton.setText("Z");
        ZButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZButtonActionPerformed(evt);
            }
        });

        SkipH.setText("SKIP");
        SkipH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkipHActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));

        Letter1.setBackground(new java.awt.Color(0, 0, 0));
        Letter1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        Letter2.setBackground(new java.awt.Color(0, 0, 0));
        Letter2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        Letter3.setBackground(new java.awt.Color(0, 0, 0));
        Letter3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        Letter4.setBackground(new java.awt.Color(0, 0, 0));
        Letter4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        Letter5.setBackground(new java.awt.Color(0, 0, 0));
        Letter5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        Letter6.setBackground(new java.awt.Color(0, 0, 0));
        Letter6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        Letter7.setBackground(new java.awt.Color(0, 0, 0));
        Letter7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        timeLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel.setText("jLabel16");

        Letter8.setBackground(new java.awt.Color(0, 0, 0));
        Letter8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Current Score:");

        Score.setBackground(new java.awt.Color(0, 0, 0));
        Score.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Score.setForeground(new java.awt.Color(255, 255, 255));
        Score.setText("100 pts");

        hangPic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FeelsHangMan.png"))); // NOI18N

        hangPic2.setBackground(new java.awt.Color(0, 51, 255));
        hangPic2.setForeground(new java.awt.Color(0, 51, 255));
        hangPic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pepekms2.PNG"))); // NOI18N

        hangPic3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pepekms3.PNG"))); // NOI18N
        hangPic3.setText("jLabel10");

        hangPic4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pepekms4.PNG"))); // NOI18N

        hangPic5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hangPic5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pepekms5.PNG"))); // NOI18N
        hangPic5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hangPic5.setIconTextGap(0);

        hangPic6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hangPic6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pepekms6.PNG"))); // NOI18N

        hangLayered.setLayer(hangPic1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        hangLayered.setLayer(hangPic2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        hangLayered.setLayer(hangPic3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        hangLayered.setLayer(hangPic4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        hangLayered.setLayer(hangPic5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        hangLayered.setLayer(hangPic6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout hangLayeredLayout = new javax.swing.GroupLayout(hangLayered);
        hangLayered.setLayout(hangLayeredLayout);
        hangLayeredLayout.setHorizontalGroup(
            hangLayeredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hangLayeredLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hangPic3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(hangPic2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hangPic4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(hangLayeredLayout.createSequentialGroup()
                .addGroup(hangLayeredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hangLayeredLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(hangPic5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hangPic6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(hangLayeredLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(hangPic1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        hangLayeredLayout.setVerticalGroup(
            hangLayeredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hangLayeredLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hangPic1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(hangLayeredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hangLayeredLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hangPic4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(hangLayeredLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(hangLayeredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hangPic3)
                            .addComponent(hangPic2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(hangLayeredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hangPic6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hangPic5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Letter1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Letter2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Letter3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Letter4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Letter5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Letter6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SkipH)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Score)))
                        .addGap(10, 10, 10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Letter7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Letter8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(hangLayered, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(QButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(IButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(XButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(YButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ZButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(KButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SkipH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Score)))
                    .addComponent(hangLayered, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Letter8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Letter1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Letter2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Letter3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Letter4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Letter5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Letter6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Letter7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NButton)
                    .addComponent(OButton)
                    .addComponent(PButton)
                    .addComponent(QButton)
                    .addComponent(RButton)
                    .addComponent(SButton)
                    .addComponent(TButton)
                    .addComponent(UButton)
                    .addComponent(VButton)
                    .addComponent(WButton)
                    .addComponent(XButton)
                    .addComponent(YButton)
                    .addComponent(ZButton))
                .addContainerGap())
        );

        Letter1.setHorizontalAlignment(SwingConstants.CENTER);
        Letter1.setOpaque(false);
        Letter2.setHorizontalAlignment(SwingConstants.CENTER);
        Letter2.setOpaque(false);
        Letter3.setHorizontalAlignment(SwingConstants.CENTER);
        Letter3.setOpaque(false);
        Letter4.setHorizontalAlignment(SwingConstants.CENTER);
        Letter4.setOpaque(false);
        Letter5.setHorizontalAlignment(SwingConstants.CENTER);
        Letter5.setOpaque(false);
        Letter6.setHorizontalAlignment(SwingConstants.CENTER);
        Letter6.setOpaque(false);
        Letter7.setHorizontalAlignment(SwingConstants.CENTER);
        Letter7.setOpaque(false);
        Letter8.setHorizontalAlignment(SwingConstants.CENTER);
        Letter8.setOpaque(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void FButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FButtonActionPerformed
        FButton.setEnabled(false);
        System.out.println("F Button was pressed.");
        String JBtext = FButton.getText();
        String[] tokens = word.split("");
        for(int i = 0; i < word.length(); i++) {
            if(JBtext.equalsIgnoreCase(tokens[i]) ) {
               letters[i].setForeground(Color.WHITE);
               System.out.println("Word:"+ word);
               letters[i].setOpaque(true);
               present = true;
                
            } 
        }
        checkGameOver();
        
    }//GEN-LAST:event_FButtonActionPerformed

    private void IButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IButtonActionPerformed
        IButton.setEnabled(false);
        System.out.println("I Button was pressed.");
        String JBtext = IButton.getText();
        //String word = getWord();
        String[] tokens = word.split("");
        for(int i = 0; i < word.length(); i++) {
            if(JBtext.equalsIgnoreCase(tokens[i]) ) {
                letters[i].setForeground(Color.WHITE);
                letters[i].setOpaque(true);
                present = true;
                
            }
        }
        checkGameOver();
        
    }//GEN-LAST:event_IButtonActionPerformed

    private void LButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LButtonActionPerformed
        LButton.setEnabled(false);
        System.out.println("L Button was pressed.");
        String JBtext = LButton.getText();
        //String word = getWord();
        String[] tokens = word.split("");
        for(int i = 0; i < word.length(); i++) {
            if(JBtext.equalsIgnoreCase(tokens[i]) ) {
                letters[i].setForeground(Color.WHITE);
                letters[i].setOpaque(true);
                present = true;
                
            }
        }
        
        checkGameOver();
        
    }//GEN-LAST:event_LButtonActionPerformed

    private void KButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KButtonActionPerformed
        KButton.setEnabled(false);
        System.out.println("K Button was pressed.");
        String JBtext = KButton.getText();
        
        String[] tokens = word.split("");
        for(int i = 0; i < word.length(); i++) {
            if(JBtext.equalsIgnoreCase(tokens[i]) ) {
                letters[i].setForeground(Color.WHITE);
                letters[i].setOpaque(true);
                present = true;
                
            }
        }
        
        checkGameOver();
        
    }//GEN-LAST:event_KButtonActionPerformed

    private void XButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XButtonActionPerformed
        XButton.setEnabled(false);
        System.out.println("X Button was pressed.");
        String JBtext = XButton.getText();
       
        String[] tokens = word.split("");
        for(int i = 0; i < word.length(); i++) {
            if(JBtext.equalsIgnoreCase(tokens[i]) ) {
                letters[i].setForeground(Color.WHITE);
                letters[i].setOpaque(true);
                present = true;
                
            }
        }
        
        checkGameOver();
        
    }//GEN-LAST:event_XButtonActionPerformed

    private void AButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AButtonActionPerformed
        AButton.setEnabled(false);
        System.out.println("A Button was pressed.");
        String JBtext = AButton.getText();
     
        String[] tokens = word.split("");
        for(int i = 0; i < word.length(); i++) {
            if(JBtext.equalsIgnoreCase(tokens[i]) ) {
                letters[i].setForeground(Color.WHITE);
                letters[i].setOpaque(true);
                present = true;
                
            }
        }
        
        checkGameOver();
        
    }//GEN-LAST:event_AButtonActionPerformed

    private void BButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BButtonActionPerformed
        BButton.setEnabled(false);
        System.out.println("B Button was pressed.");
        String JBtext = BButton.getText();
       
        String[] tokens = word.split("");
        for(int i = 0; i < word.length(); i++) {
            if(JBtext.equalsIgnoreCase(tokens[i]) ) {
                letters[i].setForeground(Color.WHITE);
                letters[i].setOpaque(true);
                present = true;
                
            }
        }
        
        checkGameOver();
    }//GEN-LAST:event_BButtonActionPerformed

    private void CButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CButtonActionPerformed
        CButton.setEnabled(false);
        System.out.println("C Button was pressed.");
        String JBtext = CButton.getText();
        //String word = getWord();
        String[] tokens = word.split("");
        for(int i = 0; i < word.length(); i++) {
            if(JBtext.equalsIgnoreCase(tokens[i]) ) {
                letters[i].setForeground(Color.WHITE);
                letters[i].setOpaque(true);
                present = true;
                
            }
        }
        
        checkGameOver();
        
    }//GEN-LAST:event_CButtonActionPerformed

    private void DButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DButtonActionPerformed
        DButton.setEnabled(false);
        System.out.println("D Button was pressed.");
        String JBtext = DButton.getText();

        String[] tokens = word.split("");
        for(int i = 0; i < word.length(); i++) {
            if(JBtext.equalsIgnoreCase(tokens[i]) ) {
                letters[i].setForeground(Color.WHITE);
                letters[i].setOpaque(true);
                present = true;
                
            }
        }
        
        checkGameOver();
        
    }//GEN-LAST:event_DButtonActionPerformed

    private void EButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EButtonActionPerformed
        EButton.setEnabled(false);
        System.out.println("E Button was pressed.");
        String JBtext = EButton.getText();
        //String word = getWord();
        String[] tokens = word.split("");
        for(int i = 0; i < word.length(); i++) {
            if(JBtext.equalsIgnoreCase(tokens[i]) ) {
                letters[i].setForeground(Color.WHITE);
                letters[i].setOpaque(true);
                present = true;
                
            }
        }
        
        checkGameOver();
       
    }//GEN-LAST:event_EButtonActionPerformed

    private void GButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GButtonActionPerformed
        GButton.setEnabled(false);
        System.out.println("G Button was pressed.");
        String JBtext = GButton.getText();
        //String word = getWord();
        String[] tokens = word.split("");
        for(int i = 0; i < word.length(); i++) {
            if(JBtext.equalsIgnoreCase(tokens[i]) ) {
                letters[i].setForeground(Color.WHITE);
                letters[i].setOpaque(true);
                present = true;
                
            }
        }
        
        checkGameOver();
        
    }//GEN-LAST:event_GButtonActionPerformed

    private void HButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HButtonActionPerformed
        HButton.setEnabled(false);
        System.out.println("H Button was pressed.");
        String JBtext = HButton.getText();
        //String word = getWord();
        String[] tokens = word.split("");
        for(int i = 0; i < word.length(); i++) {
            if(JBtext.equalsIgnoreCase(tokens[i]) ) {
                letters[i].setForeground(Color.WHITE);
                letters[i].setOpaque(true);
                present = true;
                
            }
        }
        
        checkGameOver();
        
    }//GEN-LAST:event_HButtonActionPerformed

    private void JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonActionPerformed
        JButton.setEnabled(false);
        System.out.println("J Button was pressed.");
        String JBtext = JButton.getText();
        //String word = getWord();
        String[] tokens = word.split("");
        for(int i = 0; i < word.length(); i++) {
            if(JBtext.equalsIgnoreCase(tokens[i]) ) {
                letters[i].setForeground(Color.WHITE);
                letters[i].setOpaque(true);
                present = true;
                
            }
        }
        
        checkGameOver();
        
    }//GEN-LAST:event_JButtonActionPerformed

    private void MButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MButtonActionPerformed
        MButton.setEnabled(false);
        System.out.println("M Button was pressed.");
        String JBtext = MButton.getText();
        //String word = getWord();
        String[] tokens = word.split("");
        for(int i = 0; i < word.length(); i++) {
            if(JBtext.equalsIgnoreCase(tokens[i]) ) {
                letters[i].setForeground(Color.WHITE);
                letters[i].setOpaque(true);
                present = true;
                
            }
        }
        
        checkGameOver();
        
    }//GEN-LAST:event_MButtonActionPerformed

    private void NButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NButtonActionPerformed
        NButton.setEnabled(false);
        System.out.println("N Button was pressed.");
        String JBtext = NButton.getText();
        //String word = getWord();
        String[] tokens = word.split("");
        for(int i = 0; i < word.length(); i++) {
            if(JBtext.equalsIgnoreCase(tokens[i]) ) {
                letters[i].setForeground(Color.WHITE);
                letters[i].setOpaque(true);
                present = true;
                
            }
        }
        
        checkGameOver();
        
    }//GEN-LAST:event_NButtonActionPerformed

    private void OButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OButtonActionPerformed
        OButton.setEnabled(false);
        System.out.println("O Button was pressed.");
        String JBtext = OButton.getText();
        //String word = getWord();
        String[] tokens = word.split("");
        for(int i = 0; i < word.length(); i++) {
            if(JBtext.equalsIgnoreCase(tokens[i]) ) {
                letters[i].setForeground(Color.WHITE);
                letters[i].setOpaque(true);
                present = true;
                
            }
        }
        
        checkGameOver();
        
    }//GEN-LAST:event_OButtonActionPerformed

    private void PButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PButtonActionPerformed
        PButton.setEnabled(false);
        System.out.println("P Button was pressed.");
        String JBtext = PButton.getText();
        
        String[] tokens = word.split("");
        for(int i = 0; i < word.length(); i++) {
            if(JBtext.equalsIgnoreCase(tokens[i]) ) {
                letters[i].setForeground(Color.WHITE);
                letters[i].setOpaque(true);
                present = true;
                
            }
        }
        
        checkGameOver();
    }//GEN-LAST:event_PButtonActionPerformed

    private void QButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QButtonActionPerformed
        QButton.setEnabled(false);
        System.out.println("Q Button was pressed.");
        String JBtext = QButton.getText();
        String[] tokens = word.split("");
        for(int i = 0; i < word.length(); i++) {
            if(JBtext.equalsIgnoreCase(tokens[i]) ) {
                letters[i].setForeground(Color.WHITE);
                letters[i].setOpaque(true);
                present = true;
                
            }
            
        }
        
        checkGameOver();
        
    }//GEN-LAST:event_QButtonActionPerformed

    private void RButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RButtonActionPerformed
        RButton.setEnabled(false);
        System.out.println("R Button was pressed.");
        String JBtext = RButton.getText();
        //String word = getWord();
        String[] tokens = word.split("");
        for(int i = 0; i < word.length(); i++) {
            if(JBtext.equalsIgnoreCase(tokens[i]) ) {
                letters[i].setForeground(Color.WHITE);
                letters[i].setOpaque(true);
                present = true;
                
            }
        }
        
        checkGameOver();
        
    }//GEN-LAST:event_RButtonActionPerformed

    private void SButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SButtonActionPerformed
        SButton.setEnabled(false);
        System.out.println("S Button was pressed.");
        String JBtext = SButton.getText();
        //String word = getWord();
        String[] tokens = word.split("");
        for(int i = 0; i < word.length(); i++) {
            if(JBtext.equalsIgnoreCase(tokens[i]) ) {
                letters[i].setForeground(Color.WHITE);
                letters[i].setOpaque(true);
                present = true;
                
            }
        }
        
        checkGameOver();
        
    }//GEN-LAST:event_SButtonActionPerformed

    private void TButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButtonActionPerformed
        TButton.setEnabled(false);
        System.out.println("T Button was pressed.");
        String JBtext = TButton.getText();
        //String word = getWord();
        String[] tokens = word.split("");
        for(int i = 0; i < word.length(); i++) {
            if(JBtext.equalsIgnoreCase(tokens[i]) ) {
                letters[i].setForeground(Color.WHITE);
                letters[i].setOpaque(true);
                present = true;
                
            }
        }
        
        checkGameOver();
        
    }//GEN-LAST:event_TButtonActionPerformed

    private void UButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UButtonActionPerformed
        UButton.setEnabled(false);
        System.out.println("U Button was pressed.");
        String JBtext = UButton.getText();
        //String word = getWord();
        String[] tokens = word.split("");
        for(int i = 0; i < word.length(); i++) {
            if(JBtext.equalsIgnoreCase(tokens[i]) ) {
                letters[i].setForeground(Color.WHITE);
                letters[i].setOpaque(true);
                present = true;
                
            }
        }
        
        checkGameOver();
        
    }//GEN-LAST:event_UButtonActionPerformed

    private void VButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VButtonActionPerformed
        VButton.setEnabled(false);
        System.out.println("V Button was pressed.");
        String JBtext = VButton.getText();
        //String word = getWord();
        String[] tokens = word.split("");
        for(int i = 0; i < word.length(); i++) {
            if(JBtext.equalsIgnoreCase(tokens[i]) ) {
                letters[i].setForeground(Color.WHITE);
                letters[i].setOpaque(true);
                present = true;
                
            }
        }
        
        checkGameOver();
        
    }//GEN-LAST:event_VButtonActionPerformed

    private void WButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WButtonActionPerformed
        WButton.setEnabled(false);
        System.out.println("W Button was pressed.");
        String JBtext = WButton.getText();
        //String word = getWord();
        String[] tokens = word.split("");
        for(int i = 0; i < word.length(); i++) {
            if(JBtext.equalsIgnoreCase(tokens[i]) ) {
                letters[i].setForeground(Color.WHITE);
                letters[i].setOpaque(true);
                present = true;
                
            }
        }
        
        checkGameOver();
        
    }//GEN-LAST:event_WButtonActionPerformed

    private void YButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YButtonActionPerformed
        YButton.setEnabled(false);
        System.out.println("Y Button was pressed.");
        String JBtext = YButton.getText();
        //String word = getWord();
        String[] tokens = word.split("");
        for(int i = 0; i < word.length(); i++) {
            if(JBtext.equalsIgnoreCase(tokens[i]) ) {
                letters[i].setForeground(Color.WHITE);
                letters[i].setOpaque(true);
                present = true;
                
            }
        }
        
        checkGameOver();
        
    }//GEN-LAST:event_YButtonActionPerformed

    private void ZButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZButtonActionPerformed
        ZButton.setEnabled(false);
        System.out.println("Z Button was pressed.");
        String JBtext = ZButton.getText();
        //String word = getWord();
        String[] tokens = word.split("");
        for(int i = 0; i < word.length(); i++) {
            if(JBtext.equalsIgnoreCase(tokens[i]) ) {
                letters[i].setForeground(Color.WHITE);
                letters[i].setOpaque(true);
                present = true;
                
            }
        }
        
        checkGameOver();
    }//GEN-LAST:event_ZButtonActionPerformed

    private void SkipHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkipHActionPerformed

        SkipH.setEnabled(true);
        score = 0;
        
        for(int i = 0; i < letters.length; i ++) {
            letters[i].setForeground(Color.BLACK);
            tiles[i].setBackground(Color.BLACK);
        }
        skipWord();
        ButtonGame bg = new ButtonGame();
        bg.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_SkipHActionPerformed

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
            java.util.logging.Logger.getLogger(HangmanF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HangmanF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HangmanF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HangmanF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HangmanF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AButton;
    private javax.swing.JButton BButton;
    private javax.swing.JButton CButton;
    private javax.swing.JButton DButton;
    private javax.swing.JButton EButton;
    private javax.swing.JButton FButton;
    private javax.swing.JButton GButton;
    private javax.swing.JButton HButton;
    private javax.swing.JButton IButton;
    private javax.swing.JButton JButton;
    private javax.swing.JButton KButton;
    private javax.swing.JButton LButton;
    private javax.swing.JLabel Letter1;
    private javax.swing.JLabel Letter2;
    private javax.swing.JLabel Letter3;
    private javax.swing.JLabel Letter4;
    private javax.swing.JLabel Letter5;
    private javax.swing.JLabel Letter6;
    private javax.swing.JLabel Letter7;
    private javax.swing.JLabel Letter8;
    private javax.swing.JButton MButton;
    private javax.swing.JButton NButton;
    private javax.swing.JButton OButton;
    private javax.swing.JButton PButton;
    private javax.swing.JButton QButton;
    private javax.swing.JButton RButton;
    private javax.swing.JButton SButton;
    private javax.swing.JLabel Score;
    private javax.swing.JButton SkipH;
    private javax.swing.JButton TButton;
    private javax.swing.JButton UButton;
    private javax.swing.JButton VButton;
    private javax.swing.JButton WButton;
    private javax.swing.JButton XButton;
    private javax.swing.JButton YButton;
    private javax.swing.JButton ZButton;
    private javax.swing.JLayeredPane hangLayered;
    private javax.swing.JLabel hangPic1;
    private javax.swing.JLabel hangPic2;
    private javax.swing.JLabel hangPic3;
    private javax.swing.JLabel hangPic4;
    private javax.swing.JLabel hangPic5;
    private javax.swing.JLabel hangPic6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private java.awt.Label label1;
    private java.awt.Panel panel1;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables

}
