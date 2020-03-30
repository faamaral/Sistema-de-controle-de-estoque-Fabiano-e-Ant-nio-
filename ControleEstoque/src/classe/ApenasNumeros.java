/*
 * Clasee para setar apenas numeros no textField
 */
package classe;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Fabiano, Antonio
 */
public class ApenasNumeros extends PlainDocument
{

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        super.insertString(offs, str.replaceAll("[^0-9]", ""), a); //To change body of generated methods, choose Tools | Templates.
    }
    
}
