import java.io.*;
import java.util.ArrayList;
import java.nio.file.Files;
import org.apache.commons.io.*;
import ch.swaechter.smbjwrapper.*;
import com.hierynomus.msdfsc.*;
import com.hierynomus.smbj.auth.AuthenticationContext;
import ch.swaechter.smbjwrapper.SharedConnection;

import java.awt.CardLayout;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ltvo6
 */
public class Gorilla extends javax.swing.JFrame {

    
    public Gorilla() {
        initComponents();
        softwareAdded.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboOne = new javax.swing.JComboBox<>();
        mainPanel = new javax.swing.JPanel();
        Add = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        name_field = new javax.swing.JTextField();
        display_name = new javax.swing.JLabel();
        display_name_field = new javax.swing.JTextField();
        hash = new javax.swing.JLabel();
        hash_field = new javax.swing.JTextField();
        package_filename = new javax.swing.JLabel();
        package_filename_field = new javax.swing.JTextField();
        installer_type = new javax.swing.JLabel();
        installer_type_field = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        softwareAdded = new javax.swing.JLabel();
        clearbutton = new javax.swing.JButton();
        Edit = new javax.swing.JPanel();
        EDIT_info_type = new javax.swing.JComboBox<>();
        EDIT_change_text_field = new javax.swing.JTextField();
        EDIT_save = new javax.swing.JButton();
        EDIT_softwarename = new javax.swing.JLabel();
        EDIT_change_info = new javax.swing.JTextField();
        Delete = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SoftwareList = new javax.swing.JList<>();
        ShowSoftwareList = new javax.swing.JButton();
        DeleteSoftware = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("GorillaGUI");

        comboOne.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        comboOne.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADD", "EDIT", "DELETE" }));
        comboOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOneActionPerformed(evt);
            }
        });

        mainPanel.setLayout(new java.awt.CardLayout());

        name.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        name.setText("Name");

        name_field.setToolTipText("EX: AdobeAcrobat");
        name_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_fieldActionPerformed(evt);
            }
        });

        display_name.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        display_name.setText("Display Name");

        display_name_field.setToolTipText("EX: Adobe Acrobat");

        hash.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        hash.setText("Hash");

        hash_field.setToolTipText("EX: 8804FA55A67E7DA6924A633BCC7316CA83FFC8E66C3821B6BC8114B854853C79");

        package_filename.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        package_filename.setText("Package Filename");

        package_filename_field.setToolTipText("EX: Acrobat_DC_Web_WWMUI.exe");

        installer_type.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        installer_type.setText("Installer Type");

        installer_type_field.setToolTipText("EX: exe");

        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jButton1.setText("Save");
        jButton1.setToolTipText("Add software to Gorrilla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        softwareAdded.setText("Software added to the catalog!");

        clearbutton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        clearbutton.setText("Clear");
        clearbutton.setToolTipText("Clear the text boxes above to add more applications to Gorrilla");
        clearbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddLayout = new javax.swing.GroupLayout(Add);
        Add.setLayout(AddLayout);
        AddLayout.setHorizontalGroup(
            AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(installer_type)
                    .addComponent(package_filename))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(package_filename_field, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(installer_type_field, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddLayout.createSequentialGroup()
                        .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(display_name)
                            .addComponent(name)
                            .addComponent(hash))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(display_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hash_field, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddLayout.createSequentialGroup()
                        .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(softwareAdded)
                            .addGroup(AddLayout.createSequentialGroup()
                                .addComponent(clearbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37))))
        );
        AddLayout.setVerticalGroup(
            AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(display_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(display_name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hash_field, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hash))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(package_filename_field, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(package_filename))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(installer_type, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(installer_type_field, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(clearbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(softwareAdded)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        mainPanel.add(Add, "ADDpanel");

        EDIT_info_type.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        EDIT_info_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Version", "Hash", "Location", "Type" }));

        EDIT_change_text_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDIT_change_text_fieldActionPerformed(evt);
            }
        });

        EDIT_save.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        EDIT_save.setText("Save");
        EDIT_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDIT_saveActionPerformed(evt);
            }
        });

        EDIT_softwarename.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        EDIT_softwarename.setText("Software Name");

        EDIT_change_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDIT_change_infoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EditLayout = new javax.swing.GroupLayout(Edit);
        Edit.setLayout(EditLayout);
        EditLayout.setHorizontalGroup(
            EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditLayout.createSequentialGroup()
                .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(EditLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EDIT_save, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, EditLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EDIT_info_type, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EDIT_softwarename))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EDIT_change_text_field, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                            .addComponent(EDIT_change_info))))
                .addGap(43, 43, 43))
        );
        EditLayout.setVerticalGroup(
            EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EDIT_change_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EDIT_softwarename))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EDIT_change_info, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EDIT_info_type, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(EDIT_save, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        mainPanel.add(Edit, "EDITpanel");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Select a software to delete:");

        SoftwareList.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        SoftwareList.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                SoftwareListAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(SoftwareList);

        ShowSoftwareList.setText("Show Software List");
        ShowSoftwareList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowSoftwareListActionPerformed(evt);
            }
        });

        DeleteSoftware.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        DeleteSoftware.setText("Delete Software");
        DeleteSoftware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteSoftwareActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DeleteLayout = new javax.swing.GroupLayout(Delete);
        Delete.setLayout(DeleteLayout);
        DeleteLayout.setHorizontalGroup(
            DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeleteLayout.createSequentialGroup()
                .addGroup(DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DeleteLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ShowSoftwareList)
                            .addGroup(DeleteLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(DeleteSoftware, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(DeleteLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel2)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        DeleteLayout.setVerticalGroup(
            DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeleteLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(ShowSoftwareList, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DeleteLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(DeleteSoftware, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DeleteLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(Delete, "DELETEpanel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboOne, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(comboOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOneActionPerformed
        /*
        
        
        This function is for the combo box that you can switch freely between
        ADD, EDIT, and DELETE
        
        ADD: add a new software into the list of Munki
        EDIT: edit any information about a software EX: version number for updates, etc.
        DELETE: delete a software
        
        
        
        */
        CardLayout card = (CardLayout)mainPanel.getLayout();
        
        if ( comboOne.getItemAt(comboOne.getSelectedIndex()).equals("ADD") ) {
            card.show(mainPanel, "ADDpanel");
        }
        else if ( comboOne.getItemAt(comboOne.getSelectedIndex()).equals("EDIT") ) {
            card.show(mainPanel, "EDITpanel");
        }
        else if ( comboOne.getItemAt(comboOne.getSelectedIndex()).equals("DELETE") ) {
            card.show(mainPanel, "DELETEpanel");
        }
    }//GEN-LAST:event_comboOneActionPerformed

    private void name_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_fieldActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_name_fieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*
        
        this function is for the ADD functionality. It gets all the information you put in the
        text blanks in the ADD window, format it in the style of the gorilla yaml file, and add 
        the formatted software information into the catalog file. The catalog file, which was downloaded 
        from hc-storage, will then be uploaded right back to hc-storage.
       
        */
                
  // Formatting the texts for yaml format
        
        String username = System.getProperty("user.name");
        String tempFilePath = "/Users/%s/Desktop/temp.yaml".replace("%s",username);
        String nameField = "\n" + name_field.getText() + "\n";
        String displayName = "  display_name: " + display_name_field.getText() + '\n';
        String hashField = "  installer:\n    hash: " + hash_field.getText() + '\n';
        String filename = "    location: packages/" + package_filename_field.getText() + '\n';
        String type = "    type: " + installer_type_field.getText() +"\n\n";


        
        try {
            
  // Connecting to hc-storage and then download the catalog file 
            
    AuthenticationContext authenticationContext = new AuthenticationContext("/*username*/", "/*password*/".toCharArray(), "");
try (SharedConnection sharedConnection = new SharedConnection("/*domain*/", "/*directory*/" , authenticationContext)) {
    
        SharedFile sharedFile = new SharedFile(sharedConnection, "gorilla/catalogs/testing.yaml");
        
        InputStream in = sharedFile.getInputStream();
        
        OutputStream out = new FileOutputStream(tempFilePath);
        IOUtils.copy(in, out);
        in.close();
        out.close();
        
        File tempfile = new File(tempFilePath);
        
        
 // write to downloaded catalog file the formatted software addition
        
        try (FileWriter fw = new FileWriter(tempfile, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
        bw.write("\n\n");
        bw.write(nameField);
        bw.write(displayName);
        bw.write("  check:\n    script: |\n      exit 0\n");
        bw.write(hashField);
        bw.write(filename);
        bw.write(type);
        bw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
                
// upload the updated catalog file back into hc-storage 
                
        InputStream in2 = new FileInputStream(tempFilePath); 
        OutputStream out2 = sharedFile.getOutputStream();
        IOUtils.copy(in2,out2);
        in2.close();
        out2.close();

}
        
        } catch (Exception e) {
            System.out.println(e);
            }
           
        softwareAdded.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void clearbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbuttonActionPerformed
        
// Button that clears the text boxes in the ADD panel 
        
        softwareAdded.setVisible(false);
        
        name_field.setText("");
        display_name_field.setText("");
        hash_field.setText("");
        package_filename_field.setText("");
        installer_type_field.setText("");
        
    }//GEN-LAST:event_clearbuttonActionPerformed

    private void EDIT_change_text_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDIT_change_text_fieldActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_EDIT_change_text_fieldActionPerformed

    private void EDIT_change_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDIT_change_infoActionPerformed
        // TODO add your handling code here:


         
         
    }//GEN-LAST:event_EDIT_change_infoActionPerformed

    private void EDIT_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDIT_saveActionPerformed


        String softwareName = EDIT_softwarename.getText(); /* Firefox */
        
        String username = System.getProperty("user.name"); /* username of current computer, to use their desktop as a 
                                                             place to hold the temp script file */
        
        String tempFilePath = "/Users/%s/Desktop/tempEDIT.yaml".replace("%s",username); /* address of current user
                                                                                           desktop to hold temp file */
        
        Path ptempFilePath = Paths.get("/Users/%s/Desktop/".replace("%s", username),"tempEDIT.yaml");
                                                                                        /* same thing as above */
        
        String infoToChange = EDIT_info_type.getItemAt(EDIT_info_type.getSelectedIndex());
                                                                                    /* type of info to change
                                                                                      EX: version number or install file name */
        
        String softwareNametoFind = EDIT_change_text_field.getText(); 
       
        String componentLinetoReplace = ""; /* based on what software need to be changed */
        
        
        /* Connect to hc-storage to get the file down */
        
        AuthenticationContext authenticationContext = new AuthenticationContext("/*username*/", "/*password*/".toCharArray(), "");
try (SharedConnection sharedConnection = new SharedConnection("/*domain*/", "/*directory*/" , authenticationContext)) {
    
        SharedFile sharedFile = new SharedFile(sharedConnection, "gorilla/catalogs/testing.yaml");
        
        InputStream in = sharedFile.getInputStream();
        
        OutputStream out = new FileOutputStream(tempFilePath);
        IOUtils.copy(in, out);
        in.close();
        out.close();
        
            
    
    try {
        
            switch (infoToChange) { /* depending on which is in the combo box
                                       change infoToChange to whatever type of info we're trying to change */
                                       
               /* format the line we need to change */ 
                case "Version":
                    componentLinetoReplace = "  version: " + EDIT_change_info.getText();
                    break;
                case "Type":
                    componentLinetoReplace = "    type: " + EDIT_change_info.getText();
                    break;
                case "Location":
                    componentLinetoReplace = "    location: packages/" + EDIT_change_info.getText();
                    break;
                case "Hash":
                    componentLinetoReplace = "    hash: " + EDIT_change_info.getText();
                    break;
                default:
                    break;
            }
                
            
            
        int softwareNameIndex = 0; /* to use to find the correct line for software name ; see for loop #1 below */
        int softwareIndex = 0; /* to use to find correct line for info type ; see for loop #2 below  */
        
        ArrayList<String> fileContent = new ArrayList<String>(Files.readAllLines(ptempFilePath, StandardCharsets.UTF_8));

            
/* from start of the file, find where the software name is */
                    System.out.println(softwareNametoFind);

    for (int i = 0; i < fileContent.size(); i++) {
        System.out.println(fileContent.get(i));
        if (fileContent.get(i).toLowerCase().contains(softwareNametoFind.toLowerCase())) {
            softwareNameIndex = i;
            break;
        }
    }
    
/* from the start of the software whose info we want to change, find the type of info we want to change */

    for (int i = softwareNameIndex; i < fileContent.size();i++) {
        
/* find the line where the targeted line is */
        
        if (fileContent.get(i).toLowerCase().contains(infoToChange.toLowerCase())) {
            
/* switch it to the new changed info */
            
            fileContent.set(i,componentLinetoReplace);
            break;
        }
    }

/* write the updated file to the local desktop file */

    Files.write(ptempFilePath, fileContent, StandardCharsets.UTF_8);
    
/* upload the file back to hc-storage */

        InputStream in2 = new FileInputStream(tempFilePath); 
        OutputStream out2 = sharedFile.getOutputStream();
        IOUtils.copy(in2,out2);
        in2.close();
        out2.close();

        
    } catch (Exception e) {
        System.out.println(e);
        } 
    
        
    
    } catch (Exception e) {
            System.out.println(e);
            }
    


        
    }//GEN-LAST:event_EDIT_saveActionPerformed

    private void SoftwareListAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_SoftwareListAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_SoftwareListAncestorAdded

    private void ShowSoftwareListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowSoftwareListActionPerformed
            
        String username = System.getProperty("user.name"); /* username of current computer, to use their desktop as a 
                                                             place to hold the temp script file */
        String tempFilePath = "/Users/%s/Desktop/tempEDIT.yaml".replace("%s",username); /* address of current user
                                                                                           desktop to hold temp file */
        Path ptempFilePath = Paths.get("/Users/%s/Desktop/".replace("%s", username),"tempEDIT.yaml");
        
        

        
          
/* Download temp file */

    AuthenticationContext authenticationContext = new AuthenticationContext("/*username*/", "/*password*/".toCharArray(), "");
try (SharedConnection sharedConnection = new SharedConnection("/*domain*/", "/*directory*/", authenticationContext)) {
    
        SharedFile sharedFile = new SharedFile(sharedConnection, "gorilla/catalogs/testing.yaml");
        
        InputStream in = sharedFile.getInputStream();
        
        OutputStream out = new FileOutputStream(tempFilePath);
        IOUtils.copy(in, out);
        in.close();
        out.close();
        
        ArrayList<String> fileContent = new ArrayList<String>(Files.readAllLines(ptempFilePath, StandardCharsets.UTF_8));

/* tally up the amount of softwares */

        String softwareDetectLine = "display_name";
        
        int softwareNameCount = 0;

        for (int i = 0; i < fileContent.size(); i++) {
            
            if (fileContent.get(i).toLowerCase().contains(softwareDetectLine.toLowerCase())) {

                softwareNameCount++;
        }
    }
        
    String[] items = new String[softwareNameCount]; /* String array to display on list */
    int itemIterateCounter = 0; /* to insert in the list of softwares */
    
    for (int i = 0; i < fileContent.size(); i++) {
            
            if (fileContent.get(i).toLowerCase().contains(softwareDetectLine.toLowerCase())) {

                items[itemIterateCounter] = fileContent.get(i).substring(16);
                itemIterateCounter++;
        }
    }
    
    DefaultListModel model = new DefaultListModel();
    
    for (int i = 0; i < items.length;i++) {
        model.addElement(items[i]);
    }
    
    SoftwareList.setModel(model);
    
        
        
} catch (Exception e) {
            System.out.println(e);
            }
          
          
          
    }//GEN-LAST:event_ShowSoftwareListActionPerformed

    private void DeleteSoftwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteSoftwareActionPerformed

        String username = System.getProperty("user.name"); /* username of current computer, to use their desktop as a 
                                                             place to hold the temp script file */
        String tempFilePath = "/Users/%s/Desktop/tempEDIT.yaml".replace("%s",username); /* address of current user
                                                                                           desktop to hold temp file */
        Path ptempFilePath = Paths.get("/Users/%s/Desktop/".replace("%s", username),"tempEDIT.yaml");
        
        AuthenticationContext authenticationContext = new AuthenticationContext("/*username*/", "/*password*/".toCharArray(), "");
try (SharedConnection sharedConnection = new SharedConnection("/*domain*/", "/*directory*/" , authenticationContext)) {
    
        SharedFile sharedFile = new SharedFile(sharedConnection, "gorilla/catalogs/testing.yaml");
        
        InputStream in = sharedFile.getInputStream();
        
        OutputStream out = new FileOutputStream(tempFilePath);
        IOUtils.copy(in, out);
        in.close();
        out.close();
        
        ArrayList<String> fileContent = new ArrayList<String>(Files.readAllLines(ptempFilePath, StandardCharsets.UTF_8));

/* tally up the amount of softwares */

        String softwareDetectLine = SoftwareList.getSelectedValue().toString();
        

        for (int i = 0; i < fileContent.size(); i++) {
            
            if (fileContent.get(i).toLowerCase().contains(softwareDetectLine.toLowerCase())) {
                fileContent.remove(i-1);
                i--;
                while (!fileContent.get(i).equals("")) {
                    System.out.println("string: " + fileContent.get(i));
                   fileContent.remove(i);
                }
                break;
        }
    }
        
    Files.write(ptempFilePath, fileContent, StandardCharsets.UTF_8);

    try {
        InputStream in2 = new FileInputStream(tempFilePath); 
        OutputStream out2 = sharedFile.getOutputStream();
        IOUtils.copy(in2,out2);
        in2.close();
        out2.close();  
        
        
    } catch (Exception e) {
        System.out.println(e);
    }
        
} catch (Exception e) {
            System.out.println(e);
            }
        

        
        
        
    }//GEN-LAST:event_DeleteSoftwareActionPerformed

  
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
            java.util.logging.Logger.getLogger(Gorilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gorilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gorilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gorilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gorilla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Add;
    private javax.swing.JPanel Delete;
    private javax.swing.JButton DeleteSoftware;
    private javax.swing.JTextField EDIT_change_info;
    private javax.swing.JTextField EDIT_change_text_field;
    private javax.swing.JComboBox<String> EDIT_info_type;
    private javax.swing.JButton EDIT_save;
    private javax.swing.JLabel EDIT_softwarename;
    private javax.swing.JPanel Edit;
    private javax.swing.JButton ShowSoftwareList;
    private javax.swing.JList<String> SoftwareList;
    private javax.swing.JButton clearbutton;
    public static javax.swing.JComboBox<String> comboOne;
    private javax.swing.JLabel display_name;
    private javax.swing.JTextField display_name_field;
    private javax.swing.JLabel hash;
    private javax.swing.JTextField hash_field;
    private javax.swing.JLabel installer_type;
    private javax.swing.JTextField installer_type_field;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel name;
    private javax.swing.JTextField name_field;
    private javax.swing.JLabel package_filename;
    private javax.swing.JTextField package_filename_field;
    private javax.swing.JLabel softwareAdded;
    // End of variables declaration//GEN-END:variables

}
