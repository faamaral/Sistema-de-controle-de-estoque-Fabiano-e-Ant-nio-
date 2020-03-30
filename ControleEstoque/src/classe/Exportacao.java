/**
 * Classe para exportação em CSV
 */
package classe;

import java.io.*;
import javax.swing.*;
import javax.swing.table.TableModel;

/**
 *
 * @author Antônio Carlos, Fabiano
 */
public class Exportacao{
   
    public Exportacao(){
       
    }
   
    public void exportacaoTabela(JTable tblProdutos, File file) throws IOException{
   
        TableModel model = tblProdutos.getModel();
        FileWriter excel = new FileWriter(file);

        for (int i = 0; i < model.getColumnCount(); i++) {
            excel.write(model.getColumnName(i) + "\t");
        }

        excel.write("\n");

        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                excel.write(model.getValueAt(i, j).toString() + "\t");
            }
            excel.write("\n");
        }

        excel.close();
    }
   
}
