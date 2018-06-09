package org.hightail.ui;

import java.awt.Cursor;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JFrame;

public class AboutJDialog extends javax.swing.JDialog {

    public AboutJDialog(JFrame parent) {
        super(parent, true); // makes it modal
        initComponents();
        setLocationRelativeTo(parent);
        linkLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jTextArea1.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        linkLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        linkLabelCompetitiveCompanion = new javax.swing.JLabel();
        linkLabelCompetitiveCompanionChrome = new javax.swing.JLabel();
        linkLabelCompetitiveCompanionFirefox = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About Hightail");

        linkLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        linkLabel.setText("<html><a href=\"https://github.com/dj3500/hightail\">Hightail's website</a></html>");
        linkLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkLabelMouseClicked(evt);
            }
        });

        jScrollPane1.setBorder(null);

        jTextArea1.setBackground(linkLabel.getBackground());
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextArea1.setForeground(linkLabel.getForeground());
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Hightail is an automatic tester for programming contests such as CodeForces rounds. It will parse the problem statement, extract sample test cases (inputs and outputs) from it, and verify the correctness of your program against them. It is built to provide maximum automation and to relieve the contestant as much as possible.\n\nHightail is an open source project maintained by dj3500. More information on Hightail can be found on its website on GitHub.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);
        jTextArea1.setFocusable(false);
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        linkLabelCompetitiveCompanion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        linkLabelCompetitiveCompanion.setText("<html><a href=\"https://github.com/jmerle/competitive-companion\">Website of Competitive Companion</a> (plugin for Chrome/Firefox <br />that parses problems/contests and sends them to Hightail)</html>");
        linkLabelCompetitiveCompanion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkLabelCompetitiveCompanionMouseClicked(evt);
            }
        });

        linkLabelCompetitiveCompanionChrome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        linkLabelCompetitiveCompanionChrome.setText("<html><a href=\"https://chrome.google.com/webstore/detail/chelper-companion/cjnmckjndlpiamhfimnnjmnckgghkjbl\">Chrome plugin</a></html>");
        linkLabelCompetitiveCompanionChrome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkLabelCompetitiveCompanionChromeMouseClicked(evt);
            }
        });

        linkLabelCompetitiveCompanionFirefox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        linkLabelCompetitiveCompanionFirefox.setText("<html><a href=\"https://addons.mozilla.org/en-US/firefox/addon/competitive-companion/\">Firefox plugin</a></html>");
        linkLabelCompetitiveCompanionFirefox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkLabelCompetitiveCompanionFirefoxMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(linkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(linkLabelCompetitiveCompanionChrome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(linkLabelCompetitiveCompanionFirefox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(linkLabelCompetitiveCompanion))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(linkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(linkLabelCompetitiveCompanion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linkLabelCompetitiveCompanionChrome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(linkLabelCompetitiveCompanionFirefox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void linkLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkLabelMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://github.com/dj3500/hightail"));
        } catch (URISyntaxException | IOException ex) {
            // problem?
        }
    }//GEN-LAST:event_linkLabelMouseClicked

    private void linkLabelCompetitiveCompanionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkLabelCompetitiveCompanionMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://github.com/jmerle/competitive-companion"));
        } catch (URISyntaxException | IOException ex) {
            // problem?
        }
    }//GEN-LAST:event_linkLabelCompetitiveCompanionMouseClicked

    private void linkLabelCompetitiveCompanionChromeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkLabelCompetitiveCompanionChromeMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://chrome.google.com/webstore/detail/chelper-companion/cjnmckjndlpiamhfimnnjmnckgghkjbl"));
        } catch (URISyntaxException | IOException ex) {
            // problem?
        }
    }//GEN-LAST:event_linkLabelCompetitiveCompanionChromeMouseClicked

    private void linkLabelCompetitiveCompanionFirefoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkLabelCompetitiveCompanionFirefoxMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://addons.mozilla.org/en-US/firefox/addon/competitive-companion/"));
        } catch (URISyntaxException | IOException ex) {
            // problem?
        }
    }//GEN-LAST:event_linkLabelCompetitiveCompanionFirefoxMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel linkLabel;
    private javax.swing.JLabel linkLabelCompetitiveCompanion;
    private javax.swing.JLabel linkLabelCompetitiveCompanionChrome;
    private javax.swing.JLabel linkLabelCompetitiveCompanionFirefox;
    // End of variables declaration//GEN-END:variables
}
