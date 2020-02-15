package ir.org.acm.session31.dataBinding;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class AccountChangeListener implements PropertyChangeListener {

    public void propertyChange(PropertyChangeEvent evt) {

        System.out.println( evt.getPropertyName() + " Changed!");
        System.out.println( "Old value: " + evt.getOldValue() );
        System.out.println( "New Value: " + evt.getNewValue() );

    }

}
