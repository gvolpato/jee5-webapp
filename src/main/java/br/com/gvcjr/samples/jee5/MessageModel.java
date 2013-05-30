package br.com.gvcjr.samples.jee5;
 
import javax.faces.event.ValueChangeEvent;
 
public class MessageModel {
    public void printMessage(ValueChangeEvent e) {
        System.out.println("old value was: " + e.getOldValue());
        System.out.println("new value is: " + e.getNewValue());
    }
}