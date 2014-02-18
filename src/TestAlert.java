/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextBox;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.*;

/**
 * @author Amina
 */
public class TestAlert extends MIDlet implements CommandListener{
     Display display = Display.getDisplay(this);

TextBox T2 = new TextBox("T2", null,50, TextField.ANY);
TextBox T3 = new TextBox("T3", null,50, TextField.ANY);
Command cmdTimed=new Command("Timed",Command.OK,0);
Command cmdModal =new Command("Modal",Command.OK,0);
Alert AlTimed= new Alert("Timed","Alert Timed",null,AlertType.CONFIRMATION);
Alert AlModal= new Alert("Modal","Alert Timed",null,AlertType.INFO);
Form f= new Form("Form1");

    public void startApp() {

        display.setCurrent(T2);
        T2.addCommand(cmdTimed);
        T2.addCommand(cmdModal);
        T2.setCommandListener(this);
       AlTimed.setTimeout(Alert.FOREVER);
        AlModal.setTimeout(Alert.FOREVER);

        



    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }


    public void commandAction(Command c, Displayable d){

        if(c==cmdModal)
            display.setCurrent(AlTimed,f);
        if(c==cmdTimed)
            display.setCurrent(AlModal,f);

        if(c==cmdModal)display.setCurrent(AlTimed);
         if(c==cmdTimed)display.setCurrent(AlModal);


    
}
}
