/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livescorebound;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author Zucrem
 */

public class LiveScoreBean implements Serializable {
    
    public static final String Score_Line_PROPERTY = "sampleProperty";
    
    private String scoreline;
    
    private PropertyChangeSupport propertySupport;
    
    public LiveScoreBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getScoreline() {
        return scoreline;
    }
    
    public void setScoreLine(String value) {
        String oldValue = scoreline;
        scoreline = value;
        propertySupport.firePropertyChange(Score_Line_PROPERTY, oldValue, scoreline);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
