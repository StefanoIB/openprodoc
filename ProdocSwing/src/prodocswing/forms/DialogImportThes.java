/*
 * OpenProdoc
 * 
 * See the help doc files distributed with
 * this work for additional information regarding copyright ownership.
 * Joaquin Hierro licenses this file to You under:
 * 
 * License GNU Affero GPL v3 http://www.gnu.org/licenses/agpl.html
 * 
 * you may not use this file except in compliance with the License.  
 * Unless agreed to in writing, software is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * author: Joaquin Hierro      2011
 * 
 */

/*
 * DialogEditFold.java
 *
 * Created on 28-mar-2010, 20:14:35
 */

package prodocswing.forms;

import java.io.File;
import javax.swing.JDialog;
import javax.swing.JFileChooser;

/**
 *
 * @author jhierrot
 */
public class DialogImportThes extends javax.swing.JDialog
{

private boolean Cancel;

/**
 * 
 */
public File SelFolder=null;

/** Creates new form DialogEditFold
 * @param parent
 * @param modal 
 */
public DialogImportThes(JDialog parent, boolean modal)
{
super(parent, modal);
initComponents();
}

/** This method is called from within the constructor to
 * initialize the form.
 * WARNING: Do NOT modify this code. The content of this method is
 * always regenerated by the Form Editor.
 */
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        LabelOperation = new javax.swing.JLabel();
        TheNumLabel = new javax.swing.JLabel();
        ThesNumText = new javax.swing.JFormattedTextField();
        NameLabel = new javax.swing.JLabel();
        NameText = new javax.swing.JTextField();
        RootLabel = new javax.swing.JLabel();
        RootText = new javax.swing.JTextField();
        LangLabel = new javax.swing.JLabel();
        MainLangText = new javax.swing.JTextField();
        FilePathLabel = new javax.swing.JLabel();
        FilePathTextField = new javax.swing.JTextField();
        ButtonSelFile = new javax.swing.JButton();
        SubThesLabel = new javax.swing.JLabel();
        SubThesCB = new javax.swing.JCheckBox();
        TransactLabel = new javax.swing.JLabel();
        TransactCB = new javax.swing.JCheckBox();
        RetainCodeLabel = new javax.swing.JLabel();
        RetainCodeCB = new javax.swing.JCheckBox();
        ButtonCancel = new javax.swing.JButton();
        ButtonAcept = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(MainWin.TT("Import_Thesaurus"));
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });

        LabelOperation.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        LabelOperation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelOperation.setText(MainWin.TT("Import_Thesaurus"));

        TheNumLabel.setFont(MainWin.getFontDialog());
        TheNumLabel.setText(MainWin.TT("Thesaurus_Number"));

        ThesNumText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("########0"))));

        NameLabel.setFont(MainWin.getFontDialog());
        NameLabel.setText(MainWin.TT("Thesaurus_Name"));

        NameText.setFont(MainWin.getFontDialog());
        NameText.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                NameTextActionPerformed(evt);
            }
        });

        RootLabel.setFont(MainWin.getFontDialog());
        RootLabel.setText(MainWin.TT("Root_Text"));

        RootText.setFont(MainWin.getFontDialog());
        RootText.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                RootTextActionPerformed(evt);
            }
        });

        LangLabel.setFont(MainWin.getFontDialog());
        LangLabel.setText(MainWin.TT("Main_Language"));

        MainLangText.setFont(MainWin.getFontDialog());

        FilePathLabel.setFont(MainWin.getFontDialog());
        FilePathLabel.setText(MainWin.TT("Import_Doc"));

        FilePathTextField.setFont(MainWin.getFontDialog());

        ButtonSelFile.setFont(MainWin.getFontDialog());
        ButtonSelFile.setText("Sel");
        ButtonSelFile.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonSelFileActionPerformed(evt);
            }
        });

        SubThesLabel.setFont(MainWin.getFontDialog());
        SubThesLabel.setText(MainWin.TT("Create_SubThes_by_Lang"));

        TransactLabel.setFont(MainWin.getFontDialog());
        TransactLabel.setText(MainWin.TT("Transactional_Import"));

        TransactCB.setSelected(true);

        RetainCodeLabel.setFont(MainWin.getFontDialog());
        RetainCodeLabel.setText(MainWin.TT("Retain_Codes"));

        ButtonCancel.setFont(MainWin.getFontDialog());
        ButtonCancel.setText(MainWin.TT("Cancel"));
        ButtonCancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonCancelActionPerformed(evt);
            }
        });

        ButtonAcept.setFont(MainWin.getFontDialog());
        ButtonAcept.setText(MainWin.TT("Ok"));
        ButtonAcept.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonAceptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelOperation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TheNumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(NameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                    .addComponent(TransactLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                    .addComponent(RootLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                    .addComponent(FilePathLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LangLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SubThesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(RetainCodeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TransactCB)
                            .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RootText, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ThesNumText, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MainLangText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RetainCodeCB)
                            .addComponent(SubThesCB)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ButtonAcept)
                                    .addGap(18, 18, 18)
                                    .addComponent(ButtonCancel))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(FilePathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ButtonSelFile, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelOperation)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TheNumLabel)
                    .addComponent(ThesNumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel)
                    .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RootLabel)
                    .addComponent(RootText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LangLabel)
                    .addComponent(MainLangText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FilePathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FilePathLabel)
                    .addComponent(ButtonSelFile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubThesCB)
                    .addComponent(SubThesLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TransactCB)
                    .addComponent(TransactLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RetainCodeLabel)
                    .addComponent(RetainCodeCB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonAcept)
                    .addComponent(ButtonCancel))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonCancelActionPerformed
    {//GEN-HEADEREND:event_ButtonCancelActionPerformed
Cancel=true;
this.dispose();
}//GEN-LAST:event_ButtonCancelActionPerformed

    private void ButtonAceptActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonAceptActionPerformed
    {//GEN-HEADEREND:event_ButtonAceptActionPerformed
if (SelFolder==null)
    {
    SelFolder=new File(FilePathTextField.getText());
    }
Cancel = false;
this.dispose();
}//GEN-LAST:event_ButtonAceptActionPerformed

    private void ButtonSelFileActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonSelFileActionPerformed
    {//GEN-HEADEREND:event_ButtonSelFileActionPerformed
JFileChooser fc = new JFileChooser();
fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
int returnVal = fc.showOpenDialog(this);
if (returnVal == JFileChooser.APPROVE_OPTION)
    {
    SelFolder = fc.getSelectedFile();
    FilePathTextField.setText(SelFolder.getAbsolutePath());
    }
    }//GEN-LAST:event_ButtonSelFileActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
Cancel=true;
    }//GEN-LAST:event_formWindowClosing

    private void RootTextActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_RootTextActionPerformed
    {//GEN-HEADEREND:event_RootTextActionPerformed
    }//GEN-LAST:event_RootTextActionPerformed

    private void NameTextActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_NameTextActionPerformed
    {//GEN-HEADEREND:event_NameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAcept;
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JButton ButtonSelFile;
    private javax.swing.JLabel FilePathLabel;
    private javax.swing.JTextField FilePathTextField;
    private javax.swing.JLabel LabelOperation;
    private javax.swing.JLabel LangLabel;
    private javax.swing.JTextField MainLangText;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameText;
    private javax.swing.JCheckBox RetainCodeCB;
    private javax.swing.JLabel RetainCodeLabel;
    private javax.swing.JLabel RootLabel;
    private javax.swing.JTextField RootText;
    private javax.swing.JCheckBox SubThesCB;
    private javax.swing.JLabel SubThesLabel;
    private javax.swing.JLabel TheNumLabel;
    private javax.swing.JFormattedTextField ThesNumText;
    private javax.swing.JCheckBox TransactCB;
    private javax.swing.JLabel TransactLabel;
    // End of variables declaration//GEN-END:variables

//----------------------------------------------------------------
/**
* @return the Root text
*/
public String getRoot()
{
String Root=RootText.getText().trim();    
if (!Root.endsWith("/"))
    Root+="/";
return Root;
}
//----------------------------------------------------------------
/**
* @return the Root text
*/
public String getMainLang()
{
return MainLangText.getText().trim();
}
//----------------------------------------------------------------
/**
* @return the Root text
*/
public String getThesName()
{
return NameText.getText().trim();
}
//----------------------------------------------------------------
/**
* @return the Cancel
*/
public boolean isCancel()
{
return Cancel;
}
//----------------------------------------------------------------
/**
* @return true if selected creating  sub thes by Lang.
*/
public boolean isSubThesLang()
{
return SubThesCB.isSelected();
}
//----------------------------------------------------------------
/**
* @return the Cancel
*/
public String getThesNum()
{
return this.ThesNumText.getText();
}
//----------------------------------------------------------------
/**
* @return true if selected importing in  a trasanction.
*/
public boolean isTransac()
{
return this.TransactCB.isSelected();
}
//----------------------------------------------------------------
/**
* @return true if selected creating  sub thes by Lang.
*/
public boolean isRetainCodes()
{
return RetainCodeCB.isSelected();
}
//----------------------------------------------------------------

}
