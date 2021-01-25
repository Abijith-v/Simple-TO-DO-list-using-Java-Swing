/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import com.sun.java.swing.plaf.motif.MotifScrollBarUI;
import com.sun.java.swing.plaf.windows.WindowsScrollBarUI;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.RoundRectangle2D;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.AbstractBorder;
import javax.swing.plaf.ScrollBarUI;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.plaf.basic.BasicListUI;
import javax.swing.plaf.multi.MultiScrollBarUI;
import javax.swing.plaf.synth.SynthScrollBarUI;

/**
 *
 * @author AV
 */
public class homepage extends javax.swing.JFrame {
    
    public ArrayList<String> tasksList = new ArrayList<String>();
    public int count=0;
    DefaultListModel dlm = new DefaultListModel();
    
    public homepage() {
        initComponents();
   
    TasksPanel.setVisible(false);
    
   
    Add.setUI(new BasicButtonUI());    
    Add.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
                Add.setBackground(new Color(0,0,124));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
                Add.setBackground(new Color(0,0,155));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Add.setBackground(new Color(0,0,155));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
                Add.setBackground(new Color(0,129,213));
                
            }
        });
    
    viewTasks.setUI(new BasicButtonUI());
    viewTasks.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                viewTasks.setBackground(new Color(0,0,124));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewTasks.setBackground(new Color(0,0,155));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewTasks.setBackground(new Color(0,0,155));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                 viewTasks.setBackground(new Color(0,129,213));
            }
        });
    
    backButton.setUI(new BasicButtonUI());
    backButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                backButton.setBackground(new Color(0,0,124));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                backButton.setBackground(new Color(0,0,155));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                backButton.setBackground(new Color(0,0,155));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                 backButton.setBackground(new Color(0,129,213));
            }
        });
    
    scrollPane.getVerticalScrollBar().setUI(new MotifScrollBarUI());
    scrollPane.getHorizontalScrollBar().setUI(new MotifScrollBarUI());
    
    //Task page :
    
    
    
    DeleteTask.setUI(new BasicButtonUI());
    clearAll.setUI(new BasicButtonUI());
    
    DeleteTask.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                DeleteTask.setBackground(new Color(0,0,124));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                DeleteTask.setBackground(new Color(0,0,155));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                DeleteTask.setBackground(new Color(0,0,155));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                 DeleteTask.setBackground(new Color(0,129,213));
            }
        });
    
    clearAll.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                clearAll.setBackground(new Color(0,0,124));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                clearAll.setBackground(new Color(0,0,155));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                clearAll.setBackground(new Color(0,0,155));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                 clearAll.setBackground(new Color(0,129,213));
            }
        });
    }
    
   

    public static void setUIFont (javax.swing.plaf.FontUIResource f){
    //
    // sets the default font for all Swing components.
    // ex.
    
    java.util.Enumeration keys = UIManager.getDefaults().keys();
    while (keys.hasMoreElements()) {
      Object key = keys.nextElement();
      Object value = UIManager.get (key);
      if (value instanceof javax.swing.plaf.FontUIResource)
        UIManager.put (key, f);
      }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        TasksPanel = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        listView = new javax.swing.JList<>();
        taskHeading = new javax.swing.JLabel();
        DeleteTask = new javax.swing.JButton();
        clearAll = new javax.swing.JButton();
        ErrorMsg2 = new javax.swing.JLabel();
        homePanel = new javax.swing.JPanel();
        bgPanel = new keeptoo.KGradientPanel();
        Heading = new javax.swing.JLabel();
        taskTextfield = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        label2 = new javax.swing.JLabel();
        viewTasks = new javax.swing.JButton();
        ErrorMsg = new javax.swing.JLabel();

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(610, 375));
        setResizable(false);

        TasksPanel.setBackground(new java.awt.Color(0, 129, 213));

        backButton.setBackground(new java.awt.Color(0, 129, 213));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_back_32px.png"))); // NOI18N
        backButton.setBorderPainted(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        scrollPane.setBorder(null);

        listView.setBackground(new java.awt.Color(0, 129, 213));
        listView.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        listView.setForeground(new java.awt.Color(255, 255, 255));
        listView.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listView.setFixedCellHeight(30);
        listView.setSelectionBackground(new java.awt.Color(255, 255, 255));
        scrollPane.setViewportView(listView);

        taskHeading.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        taskHeading.setForeground(new java.awt.Color(255, 255, 255));
        taskHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        taskHeading.setText("YOUR TASKS :");

        DeleteTask.setBackground(new java.awt.Color(0, 129, 213));
        DeleteTask.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_trash_can_32px.png"))); // NOI18N
        DeleteTask.setBorderPainted(false);
        DeleteTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteTaskActionPerformed(evt);
            }
        });

        clearAll.setBackground(new java.awt.Color(0, 129, 213));
        clearAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_broom_24px.png"))); // NOI18N
        clearAll.setBorderPainted(false);
        clearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAllActionPerformed(evt);
            }
        });

        ErrorMsg2.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        ErrorMsg2.setForeground(new java.awt.Color(255, 255, 255));
        ErrorMsg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout TasksPanelLayout = new javax.swing.GroupLayout(TasksPanel);
        TasksPanel.setLayout(TasksPanelLayout);
        TasksPanelLayout.setHorizontalGroup(
            TasksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TasksPanelLayout.createSequentialGroup()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(taskHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TasksPanelLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(TasksPanelLayout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(DeleteTask, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(ErrorMsg2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TasksPanelLayout.setVerticalGroup(
            TasksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TasksPanelLayout.createSequentialGroup()
                .addGroup(TasksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taskHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TasksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteTask, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(ErrorMsg2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        homePanel.setPreferredSize(new java.awt.Dimension(610, 375));

        bgPanel.setkBorderRadius(0);
        bgPanel.setkEndColor(new java.awt.Color(0, 129, 213));
        bgPanel.setkGradientFocus(600);
        bgPanel.setkStartColor(new java.awt.Color(0, 129, 213));

        Heading.setFont(new java.awt.Font("Malgun Gothic", 1, 36)); // NOI18N
        Heading.setForeground(new java.awt.Color(255, 255, 255));
        Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading.setText("TO DO LIST");
        Heading.setToolTipText("");
        Heading.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        taskTextfield.setBackground(new java.awt.Color(0, 0, 0));
        taskTextfield.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        taskTextfield.setForeground(new java.awt.Color(255, 255, 255));
        taskTextfield.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        taskTextfield.setToolTipText("");
        taskTextfield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        taskTextfield.setOpaque(false);
        taskTextfield.setSelectionColor(new java.awt.Color(0, 0, 124));
        taskTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskTextfieldActionPerformed(evt);
            }
        });

        Add.setBackground(new java.awt.Color(0, 129, 213));
        Add.setForeground(new java.awt.Color(0, 0, 124));
        Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_plus_math_32px.png"))); // NOI18N
        Add.setToolTipText("");
        Add.setBorderPainted(false);
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Enter your task here :");

        viewTasks.setBackground(new java.awt.Color(0, 129, 213));
        viewTasks.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        viewTasks.setForeground(new java.awt.Color(255, 255, 255));
        viewTasks.setText("View tasks");
        viewTasks.setToolTipText("");
        viewTasks.setBorderPainted(false);
        viewTasks.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        viewTasks.setIconTextGap(10);
        viewTasks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTasksActionPerformed(evt);
            }
        });

        ErrorMsg.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        ErrorMsg.setForeground(new java.awt.Color(255, 255, 255));
        ErrorMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Heading, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPanelLayout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ErrorMsg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewTasks, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                            .addComponent(taskTextfield, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(99, 99, 99))
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Heading)
                .addGap(67, 67, 67)
                .addComponent(label2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(taskTextfield))
                .addGap(30, 30, 30)
                .addComponent(viewTasks, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ErrorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(TasksPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(TasksPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        homePanel.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewTasksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTasksActionPerformed
        
        homePanel.setVisible(false);
        TasksPanel.setVisible(true);
        ErrorMsg.setText("");
        if(count==0)
        {
            taskHeading.setText("NO TASKS YET !");
            DeleteTask.setVisible(false);
            clearAll.setVisible(false);
        }
        else
        {
            taskHeading.setText("TASKS LEFT : "+ count);
            DeleteTask.setVisible(true);
            clearAll.setVisible(true);
        }
        
    }//GEN-LAST:event_viewTasksActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        homePanel.setVisible(true);
        TasksPanel.setVisible(false);
        ErrorMsg2.setText("");
    }//GEN-LAST:event_backButtonActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed

        if(!taskTextfield.getText().isEmpty())
        {
        String s=taskTextfield.getText();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");  
        LocalDateTime timeRN = LocalDateTime.now();  
          
        taskTextfield.setText("");
        //Add data to list
        listView.setModel(dlm);
        count++;
        dlm.addElement(dtf.format(timeRN) +" : "+s);
    
        ErrorMsg.setText("Task added !");
        }
        else
        ErrorMsg.setText("Please enter a task !");
     
    }//GEN-LAST:event_AddActionPerformed

    private void taskTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskTextfieldActionPerformed
        
    }//GEN-LAST:event_taskTextfieldActionPerformed

    private void DeleteTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteTaskActionPerformed
        int i=-1;
        i=listView.getSelectedIndex();
        if(i!=-1)
        {
            dlm.removeElementAt(i);
            
            if(--count>0)
            taskHeading.setText("TASKS LEFT : "+ count);
            else
            taskHeading.setText("NO TASKS LEFT !");
            
            ErrorMsg2.setText("");
        }
        else
        ErrorMsg2.setText("Plese Select the item you wanna delete");
    }//GEN-LAST:event_DeleteTaskActionPerformed

    private void clearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAllActionPerformed
        dlm.clear();
        listView.setModel(dlm);
        count=0;
        taskHeading.setText("NO TASKS LEFT !");
        
    }//GEN-LAST:event_clearAllActionPerformed

 
    public static void main(String args[]) {
       
        //setUIFont (new javax.swing.plaf.FontUIResource("Malgun Gothic",Font.BOLD,16));
        
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton DeleteTask;
    private javax.swing.JLabel ErrorMsg;
    private javax.swing.JLabel ErrorMsg2;
    private javax.swing.JLabel Heading;
    private javax.swing.JPanel TasksPanel;
    private javax.swing.JButton backButton;
    private keeptoo.KGradientPanel bgPanel;
    private javax.swing.JButton clearAll;
    private javax.swing.JPanel homePanel;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel label2;
    private javax.swing.JList<String> listView;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JLabel taskHeading;
    private javax.swing.JTextField taskTextfield;
    private javax.swing.JButton viewTasks;
    // End of variables declaration//GEN-END:variables
}
